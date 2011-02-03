(ns week2.collections)

(defn doublificate [m]
  (into m (map #(vector (str "double-" (first %)), (* 2 (second %))) m)))

(defn halve [collection]
  (let [middle (/ (count collection) 2)]
    (split-at middle collection)))

(defn first-five-positives [a-seq]
  (take 5 (take-while pos? a-seq)))

(defn snip [a-seq]
  (let [not-snip? #(not (= % :snip))]
    (vector (take-while not-snip? a-seq) (rest (drop-while not-snip? a-seq)))))

(defn describe-books [books]
  (str (str "I have " (count books) ".")
    (apply str (map #(str " " (:title %) " was written by " (:author %) " .") books))))

(defn monotonic? [a-seq]
  (or (apply <= a-seq) (apply >= a-seq)))

(defn transpose [matrix]
  ":(")

(defn exterminate [a-map]
  (hash-map (filter #(apply < %) a-map)))

(defn take-3 [a-seq]
 (let [[fst snd trd] a-seq]
   [fst snd trd]))

(defn author-to-string [author]
  (let [{name :name
         birth-year :birth-year
         death-year :death-year} author]
    (str name " (" birth-year "-" death-year ")")))

(defn book-to-string [{author :author, title :title}]
    (str "A book, " title ", written by " (author-to-string author)))

(defn my-keys [a-map]
  (for [[key] a-map]
    key))

(defn who-wrote [books index]
  ":(")

(defn author-birth-years [books]
  ":(")

(defn add-at [matrix a b]
  ":(")

(defn monotonic-prefix [s]
  ":(")
