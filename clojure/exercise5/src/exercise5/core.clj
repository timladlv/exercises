(ns exercise5.core
  (:gen-class))

(defn get-input[prompt]
  (do
    (print prompt)
    (flush)
    (read-string (read-line))))

(defn get-output[x y f]
  (str x f y "=" (f x y)))

(defn -main
  "exercise 5 collect numbers then print ops on them"
  [& args]
  (do
    (let
      [first (get-input "First number: ")
      second (get-input "Second number: ")]
      (println (get-output first second +)))))
