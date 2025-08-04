;;;; Нахождение простых множителей

(defun get-factors (num)
  "Функция возвращает список простых множителей числа NUM"
  (setq factors '())
  (setq fact 2)

  (while (<= fact num)
    (setq fact (get-next-factor fact num))
    (push fact factors)
    (setq num (/ num fact))
    )

  factors)

(get-factors 123456789)

(defun get-next-factor (factor num)
  "Функция возвращает минимальный простой множитель числа NUM, начиная с FACTOR"
  (setq flag 0)
  (setq answer num)
  
  (if (= 0 (mod num 2))
      (setq answer 2
	    flag 1)
    )
    
  (if (and (= flag 0)
	   (= 0 (mod factor 2)))
      (setq factor (+ 1 factor)))

  (setq max (sqrt num))
    
  (while (<= factor max)
    (if (and (= flag 0)
	     (= 0 (mod num factor)))
	(setq answer factor
	      flag 1)
      )
    (setq factor (+ 2 factor))
    )
  
  answer)

(get-next-factor 3 13717421)

