(ns exercise6.core
  (:require common.core [clj-time.core :as t])
  (:gen-class))

(defn -main
  "exercise 6: retirement year calculate: determine age, and desired retirement age"
  [& args]
    (do
      (let
        [age-in-years (common.core/get-input "What is your age?: ")
        retirement-age-in-years (common.core/get-input "How old at retirement?: ")
        this-year (t/year (t/now))
        retirement-year (+ this-year (- retirement-age-in-years age-in-years))]
        (println "It's" (str this-year ", so you can retire in " retirement-year)))))
