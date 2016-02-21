(ns exercise2.core
  (:gen-class))

(defn -main
  "exercise 2 - report length of input"
  [& args]
  (do
    (print "Please enter input... ")
    (flush)
    (loop []
      (let [input (read-line)
            size (count input)]
        (if (> size 0)
          (println input "has" size "characters")
          (do
            (println "input should not be empty ...")
            (recur)))))))
