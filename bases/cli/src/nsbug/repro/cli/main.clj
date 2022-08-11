(ns nsbug.repro.cli.main
  (:require [nsbug.repro.greeter.interface :as greeter])
  (:gen-class))

(defn -main
  "Say Hello!"
  [& args]
  (println (greeter/greeting {:person (first args)})))
