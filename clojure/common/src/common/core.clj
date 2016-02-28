(ns common.core)

(defn get-input[prompt]
  (do
    (print prompt)
    (flush)
    (read-string (read-line))))
