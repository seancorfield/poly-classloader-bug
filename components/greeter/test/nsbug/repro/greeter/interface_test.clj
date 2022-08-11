(ns nsbug.repro.greeter.interface-test
  (:require [clojure.test :refer [deftest testing is]]
            [nsbug.repro.greeter.interface :as sut]))

(deftest greeting-test
  (testing "the default uses World"
    (is (= "Hello, World!" (sut/greeting {}))))
  (testing "the person's name appears"
    (is (= "Hello, Lisa!" (sut/greeting {:person "Lisa"})))))
