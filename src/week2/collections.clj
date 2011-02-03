(ns week2.collections)

(defn doublificate [m]
  (into m (map #(vector (str "double-" (first %)), (* 2 (second %))) m)))

(defn halve [collection]
  (let [middle (/ (count collection) 2)]
    [(take middle collection), (drop middle collection)]))

(defn first-five-positives [a-seq]
  (take 5 (take-while pos? a-seq)))

(defn snip [a-seq]
  (let [not-snip? #(not (= % :snip))]
    (split-with not-snip? a-seq)))

(defn monotonic? [a-seq]
  ":(")

(defn transpose [matrix]
  ":(")

(defn exterminate [a-map]
  ":(")

(defn take-3 [a-seq]
  ":(")

(defn author-to-string [author]
  ":(")

(defn book-to-string [book]
  ":(")

(defn my-keys [a-map]
  ":(")

(defn who-wrote [books index]
  ":(")

(defn author-birth-years [books]
  ":(")

(defn add-at [matrix a b]
  ":(")

(defn monotonic-prefix [s]
  ":(")

;(
