(ns foreign-alphabet.core-test
  (:use expectations)
  (:require [foreign-alphabet.core :refer :all]))

(expect [\C, \D] (derive-letter-order "CAT" "DOG"))

(expect [\D, \C] (derive-letter-order "DOG" "CAT"))

(expect [] (derive-letter-order "DOG" "DOG"))

(expect [] (derive-letter-order "D" "DOG"))

(expect [\Z, \Y] (derive-letter-order "ZZXP" "ZYXX"))
(expect [\Z, \H] (derive-letter-order "ZZXP" "ZHXY"))
(expect [\Z, \H] (derive-letter-order "ZZXP" "HXYY"))
(expect [\Z, \X] (derive-letter-order "ZZXP" "XTPP"))




(expect [\Z, \Y, \H, \X, \T, \P] (alphabet-from-dictionary ["ZZXP", "ZYXX", "ZHXY", "HXYY", "XTPP", "TZXT", "TZXP"]))
