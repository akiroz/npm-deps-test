(defproject npm-deps-test "0.0.0"
  :plugins [[lein-cljsbuild "1.1.7"]]
  :dependencies [[org.clojure/clojure "1.9.0"]
                 [org.clojure/clojurescript "1.10.238"]]
  :main npm-deps-test.core
  :cljsbuild
  {:builds
   [{:source-paths ["cljs-src"]
     :compiler {:main npm-deps-test.core
                :install-deps true
                :npm-deps {:grommet   "1.10.1"
                           :react     "16.2.0"
                           :react-dom "16.2.0"
                           }
                }}]})
