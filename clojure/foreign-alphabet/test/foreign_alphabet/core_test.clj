(ns foreign-alphabet.core-test
  (:use expectations)
  (:require [foreign-alphabet.core :refer :all]))

(expect [\C, \D] (derive-letter-order "CAT" "DOG"))

(expect [\D, \C] (derive-letter-order "DOG" "CAT"))

(expect [] (derive-letter-order "DOG" "DOG"))

(expect [] (derive-letter-order "D" "DOG"))

(expect [\Z, \Y] (derive-letter-order "ZZXP" "ZYXX"))

(expect [\Z, \Y] (derive-letter-order (first ["ZZXP" "ZYXX"]) (second ["ZZXP" "ZYXX"])))

(expect #{[\A \B] [\B \C]} (remove-matches \C #{[\A \B] [\B \C] [\C \A]}))

(expect [\Z, \Y, \H, \X, \T, \P] (alphabet-from-dictionary ["ZZXP", "ZYXX", "ZHXY", "HXYY", "XTPP", "TZXT", "TZXP"]))
