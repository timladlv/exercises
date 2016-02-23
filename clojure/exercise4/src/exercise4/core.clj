(ns exercise4.core
  (:gen-class))

(defn -main
  "exercise 4 - silly story"
  [& args]
  (do
    (print "Enter a noun: ")
    (flush)
    (let [noun (read-line)]
      (print "Enter a verb: ")
      (flush)
      (let [verb (read-line)]
        (print "Enter an adjective: ")
        (flush)
        (let [adjective (read-line)]
          (print "Enter an adverb: ")
          (flush)
          (let [adverb (read-line)]
            (println "Do you" verb "your" adjective noun (str adverb "? How funny ..."))))))))
