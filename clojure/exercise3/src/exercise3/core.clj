(ns exercise3.core
  (:gen-class))

(defn -main
  "exercise 3 - cllect author and quote then output"
  [& args]
  (do
    (print "What is the quote? ")
    (flush)
    (let [the-quote (read-line)]
      (print "Who said it? ")
      (flush)
      (let [the-author (read-line)]
        (println
          (str the-author " says, \"" the-quote "\""))))))
