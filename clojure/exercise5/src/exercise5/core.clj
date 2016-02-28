(ns exercise5.core
  (:require common.core)
  (:gen-class))

(defn get-output[x y f]
  (clojure.string/join " " (vector x f y "=" ((resolve (symbol f)) x y))))

(defn -main
  "exercise 5 collect numbers then print ops on them"
  [& args]
  (do
    (let
      [first (common.core/get-input "First number: ")
      second (common.core/get-input "Second number: ")]
      (println (get-output first second "+"))
      (println (get-output first second "-"))
      (println (get-output first second "*"))
      (println (get-output first second "/")))))
