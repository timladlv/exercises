(defproject foreign-alphabet "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [expectations "2.0.9"]]
  :plugins [[lein-expectations "0.0.7"]]
  :main ^:skip-aot foreign-alphabet.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
