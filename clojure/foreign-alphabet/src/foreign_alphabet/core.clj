(ns foreign-alphabet.core
  (:require
            [clojure.set :as set]
            [clojure.string :as str])
  (:gen-class))

(defn words-to-compare[indexed-words]
  (for [f indexed-words, s indexed-words, :when (< (first f) (first s))]
    [(second f) (second s)]))

(defn derive-letter-order
  "f comes before s foreign-alphabetically, return vector of chars ordered if possible"
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

(defn remove-matches
  "from coll xs remove elements starting with x"
  [x xs]
  (set (filter #(not= x (first %)) xs)))

(defn derive-alphabet
  "given a set of vectors containing ordered pairs return list of elements ordered"
  [ordered-letter-pairs-set]
  (loop [alphabet [] pairs ordered-letter-pairs-set]
    (let [firsts (set (map first pairs))
          seconds (set (map second pairs))
          next-letter (first (seq (set/difference firsts seconds)))]
      (if (< 1 (count pairs))
        (recur (conj alphabet next-letter) (remove-matches next-letter pairs))
        (concat alphabet firsts seconds)))))

(defn alphabet-from-dictionary
  "given a collection of words, compare each word to find letter order pairs then sort"
  [dictionary]
  (let [indexed-dict (map-indexed vector dictionary)
        words-pairs (words-to-compare indexed-dict)
        ordered-letter-pairs-set (set (map derive-letter-order words-pairs))
        alphabet (derive-alphabet ordered-letter-pairs-set)]
  alphabet))

(defn -main
  "Get a dictionary and return the alphabet"
  [& args]
  (do
    (let
      [words (do (print "Please enter dictionary: ") (flush) (read-line))
       dictionary (str/split words #" ")
       alphabet (alphabet-from-dictionary dictionary)
       ]
      (println alphabet))))
