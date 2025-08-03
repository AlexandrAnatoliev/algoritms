;;;; Нахождение наибольшего общего делителя

(defun get-gcd (num1 num2)
  "Функция принимает два числа NUM1 и NUM2 и возвращает наибольший их общий делитель"
  (while (/= num2 0)
    (setq remain (mod num1 num2))
    (setq num1 num2)
    (setq num2 remain))
  num1)

(get-gcd 90 120)
