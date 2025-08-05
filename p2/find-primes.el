;;;; Нахождение простых элементов

(defun print-primes (start finish)
  "Функция выводит все простые числа между START и FINISH"
  (setq prime-vector (get-prime-vector (+ 1 finish)))
	
  (while (< start finish)
    (if (= 0 (aref prime-vector start))
	(message "%d" start)
      )
    (setq start (+ 1 start))
    )
  )

(print-primes 2 20)
	  
    

(defun get-prime-vector (length)
  "Возвращает вектор длиной LENGTH, заполненный флагами, флаг=1 - составное число, 0 - простое"

  (setq prime-vector (make-vector length 0))
  (setq composite 4)

  (while (< composite length)
    (aset prime-vector composite 1)
    (setq composite (+ 2 composite))
    )
  
  (setq next-prime 3)
  (setq max (+ 1
	       (sqrt length)))

  (while (<= next-prime max)
    (setq step (* 2 next-prime))

    (while (< step length)
      (aset prime-vector step 1)
      (setq step (+ step next-prime))
      )
    
    (setq next-prime (+ 2 next-prime))

    (while (and (<= next-prime max)
		(= 1 (aref prime-vector next-prime))
		)
      (setq next-prime (+ 2 next-prime))
      )
    )
  
  prime-vector)

(get-prime-vector 100)
