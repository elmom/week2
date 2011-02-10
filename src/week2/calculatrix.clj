(ns week2.calculatrix)

(defn read-words []
  "Read a line and split it into words. Returns the words as a vector
  of strings. Loops until a line is available."
  (if-let [line (read-line)]
    (vec (.split line "\\s+"))
    (recur)))

(defn string->number [string & variables]
  (try
    (Integer/parseInt string)
    (catch NumberFormatException e 
      (get (first variables) string))))

(def functions
  {"+" +
   "*" *
   "-" -
   "avg" (fn [x y] (/ (+ x y) 2))
   "pow" (fn [b e] (int (Math/pow b e)))})

(def aritys
  {"+" 2
   "*" 2})

(defn compute [command args variables]
  "Takes a command and a sequence of arguments, returns computed value
  or nil if given an unknown command or non-integer operands."
  (let [operands (map #(string->number % variables) args)
        arity (get aritys command 2)
        func (functions command)]
    (if func
      (if (every? identity operands)
        (if (= (count operands) arity)
          (apply func operands) 
          (str "Wrong number of arguments to " command ": expects " arity ", you gave " (count operands) "."))
        (str "Invalid operand: " (get-in (vec (filter (comp not first) (zipmap operands args))) [0 1])))
      (str "Invalid command: " command))))

(defn main
  "This is the driver loop of the calculator. It loops by calling itself recursively."
  ([] (main {}))
  ([variables]
    (let [words (read-words)
          command (first words)
          arguments (rest words)]
      (if (= "store" command)
        (let [name (first arguments)
              val (string->number (second arguments) variables)]
          (println name "->" val) ; to satisfy the test
          (main (assoc variables name val )))
        (when (not (empty? command))
          (let [result (compute command arguments variables)]
            (println "  =>" result)
            (main (assoc variables "_" result))))))))
