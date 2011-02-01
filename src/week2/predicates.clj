(ns week2.predicates)

(defn generic-doublificate [arg]
  (cond
    (number? arg) (* 2 arg)
    (and (coll? arg) (empty? arg)) nil
    (vector? arg) (map generic-doublificate arg)
    (list? arg) (map generic-doublificate arg)
    :else true))

(defn whitespace? [character]
  (Character/isWhitespace character))

(defn empty-string? [string]
  (every? whitespace? string))

(defn pred-and [pred1 pred2]
  #(and (pred1 %) (pred2 %)))

(defn every-book-has-a-title? [books]
  (every? :title books))

(defn first-value-for-key [key maps]
  (some key maps))

(defn prime? [number]
  (let [p #(zero? (mod number %))]
    (not (some p (range 2 (inc (Math/sqrt number)))))))
