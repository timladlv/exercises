(ns exercise4.core
  (:gen-class))

(defn get-input[prompt]
  (do
    (print prompt)
    (flush)
    (read-line)))

(defn -main
  "exercise 4 - silly story"
  [& args]
  (do
    (let
      [noun (get-input "Enter a noun: ")
      verb (get-input "Enter a verb: ")
      adjective (get-input "Enter an adjective: ")
      adverb (get-input "Enter an adverb: ")]
      (println "Do you" verb "your" adjective noun (str adverb "? How funny ...")))))
