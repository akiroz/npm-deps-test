(ns npm-deps-test.core
  (:require [cljs.closure :as cc]
            [clojure.pprint :refer [pprint]]))

(defn -main []
  (let [cljsc-opts (->> "project.clj" slurp read-string rest (apply hash-map) :cljsbuild :builds first :compiler)]
    (pprint (cc/index-node-modules-dir cljsc-opts))))
