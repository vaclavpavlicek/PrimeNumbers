(ns data-security-task.core
  (:gen-class))

(defn is-prime?
  [n]
  (= (count (filter #(= (mod n %1) 0) (range 2 (- n 1)))) 0))

(defn decompose-to-prime-numbers
  [n]
  (if (= n 1)
   '(1)
   (loop [x 2]
    (if (= (mod n x) 0)
      (if (is-prime? (/ n x)) (list x (/ n x)) (concat (list x) (decompose-to-prime-numbers (/ n x))))
      (recur (+ 1 x))))))

; Caesarova a Vernamova a rozdelení čísel na prvočíselné dělitele