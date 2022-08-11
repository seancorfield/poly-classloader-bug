(ns nsbug.repro.greeter.interface
  (:require [nsbug.repro.greeter.core :as greeter]))

(defn greeting
  "Return a suitable greeting for the person."
  [{:keys [person] :as data}]
  (greeter/greeting data))
