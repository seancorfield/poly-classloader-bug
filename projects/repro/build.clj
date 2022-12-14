(ns build
  (:refer-clojure :exclude [test])
  (:require [org.corfield.build :as bb]))

(def lib 'net.clojars.nsbug/repro)
(def version "0.1.0-SNAPSHOT")
(def main 'nsbug.repro.cli.main)

(defn uber "Build the uberjar." [opts]
  (-> opts
      (assoc :lib lib :version version :main main)
      (bb/clean)
      (bb/uber)))
