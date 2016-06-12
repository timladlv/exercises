(ns foreign-alphabet.core
  (:gen-class))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))

(defn words-to-compare[indexed-words]
  (for [f indexed-words, s indexed-words, :when (< (first f) (first s))]
    [(second f) (second s)]))

;; f comes before s foreign-alphabetically, return vector of chars ordered
(defn derive-letter-order
  ([[f s]]
   (derive-letter-order f s))
  ([f s]
    (cond
      (= f s)
        []
      (nil? (seq f))
        []
      (not= (first (seq f)) (first (seq s)))
        [(first f), (first s)]
      :else (recur (rest f) (rest s)))))

(defn alphabet-from-dictionary[dictionary]
  (let [indexed-dict (map-indexed vector dictionary)
        words-pairs (words-to-compare indexed-dict)
        alphabet (map derive-letter-order words-pairs)]
  alphabet))
