(ns exercise4.core
  (:require common.core)
  (:gen-class))

(defn -main
  "exercise 4 - silly story"
  [& args]
  (do
    (let
      [noun (common.core/get-input "Enter a noun: ")
      verb (common.core/get-input "Enter a verb: ")
      adjective (common.core/get-input "Enter an adjective: ")
      adverb (common.core/get-input "Enter an adverb: ")]
      (println "Do you" verb "your" adjective noun (str adverb "? How funny ...")))))
