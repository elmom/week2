(ns week2.recursion)

(defn product [coll]
  (if (empty? coll)
    1
    (* (first coll) (product (rest coll)))))

(defn last-element [coll]
  (if (empty? (rest coll))
    (first coll)
    (last-element (rest coll))))

(defn sequence-contains? [element a-seq]
  (cond
   (empty? coll)
     false
   (= element (first coll))
     true
   :else
     (sequence-contains? element (rest coll))))

(defn seq=
  [seq-1 seq-2]
    (if (apply = (map count [seq-1 seq-2])) ; same lenght?
      (seq= (map vector seq-1 seq-2))
      false)
  [seq-1-2] (
  (cond
   (empty? coll)
     true
   (apply = (first seq-1-2))
     (seq= element (rest coll)
   :else
     false))))

(defn power [n k]
  (if (zero? k)
    1
    (* n (power (n dec k)))))

(defn fib [n]
  (if (< n 2)
    n
    (+ (fib (- n 1))
      (fib (- n 2)))))

(defn my-range [up-to]
  (when (pos? up-to)
    (cons up-to (my-range (dec up-to)))))

(defn map-1 [f coll]
  (when (not (empty? coll))
    (cons (f first coll (map-1 (rest coll))))))

(defn tails [coll]
  )

(defn inits [coll]
  ":(")

(defn split-into-monotonics [coll]
  ":(")

(defn rotations [a-seq]
  ":(")

(defn frequencies-helper [freqs coll]
  ":(")

(defn my-frequencies [coll]
  (frequencies-helper {} coll))

(defn un-frequencies [a-map]
  ":(")

(defn seq-merge [seq1 seq2]
  ":(")

(defn mergesort [a-seq]
  ":(")

(defn permutations [a-seq]
  ":(")

(defn powerset [coll]
  ":(")

;(
