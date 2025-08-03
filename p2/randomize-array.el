;;;; Рандомизация массива

(defun get-random-list (list)
  "Принимает ряд список чисел LIST, перемешивает их, возвращает и печатает"
  (setq count 0)
  
  (dolist (num list)
    (setq index (get-random-num num count
				(- (length list) 1)))

    (setq list (swap-nums list count index))
    (setq count (+ 1 count)))

  (print list)
  list)

(get-random-list '(1 2 3 4 5 6 7 8 9 10))

(defun get-random-num (num min max)
  "Функция принимает начальное число NUM, границы диапазона MIN и MAX, в пределах которых вернется случайное число"
  (round (+ min (* (/ (float (mod (+ 5
				     (* 7 num))
				  max))
		      max)
		   (- max min)))))

(get-random-num 12345 10 200)

(defun replace-num (list index num)
  "Возвращает новый список LIST со значением NUM на позиции INDEX"
  (let ((result (copy-sequence list)))
    (setcar (nthcdr index result) num)
    result))

(replace-num '(1 2 3 4 5) 0 2)
(setq arr '(1 2 3))
arr
(setq arr (replace-num arr 3 2))
arr

(defun swap-nums(list index1 index2)
  "Функция принимает список LIST и меняет местами два числа в нем с индексами INDEX1 и INDEX2"
  (setq temp (nth index2 list))
  (setq list (replace-num list index2
			  (nth index1 list)))
  (setq list (replace-num list index1 temp))
  list)

(swap-nums '(1 2 3 4) 0 3)


