(ns data-security-task.core-test
  (:require [clojure.test :refer :all]
            [data-security-task.core :refer :all]))

(deftest is-prime?-test
  (testing "3 is prime number."
    (is (= true (is-prime? 3))))
  (testing "17 is prime number."
    (is (= true (is-prime? 17))))
  (testing "16 isn't prime number."
    (is (= false (is-prime? 16)))))

(deftest decompose-to-prime-numbers-test
  (testing "Decomposition to prime numbers of 10 is 2 and 5."
    (is (= '(2 5) (decompose-to-prime-numbers 10))))
  (testing "Decomposition to prime numbers of 16 is 2, 2, 2 and 2."
      (is (= '(2 2 2 2) (decompose-to-prime-numbers 16))))
  (testing "Decomposition to prime numbers of 1 is 1."
    (is (= '(1) (decompose-to-prime-numbers 1)))))

(deftest caesar-ci)