(ns nsbug.repro.greeter.core)

(defn greeting
  "Implementation of core functionality."
  [{:keys [person]}]
  (str "Hello, " (or person "World") "!"))
