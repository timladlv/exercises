(ns exercise1.core
  (:gen-class))

(defn -main
  "exercise 1 - say hello world based on user input"
  [& args]
  (do
    (print "Who are you? ")
    (flush)
    (let [name (read-line)]
      (println "Hello," name))))
