(ns nsbug.repro.cli.main-test
  (:require [clojure.test :refer [deftest testing is]]
            [nsbug.repro.cli.main :as sut]))

(defn foo []
  (clojure.core.server/repl))

(deftest a-test
  (testing "FIXME, I do nothing."
    (is (= 0 0))))
