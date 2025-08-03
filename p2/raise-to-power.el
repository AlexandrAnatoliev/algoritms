;;;; Возведение в степень

(defun get-pow (num pow)
  "Функция принимает число NUM и степень POW, в которую его необходимо возвести и возвращает результат"
  (setq pow-list (get-even-pow-list num pow))

  (setq answer 1)
  (setq mask 1)
  (setq index (- (length pow-list) 1))

  (while (<= mask pow)
    (if (= 1 (/ (logand mask pow) mask))
	(setq answer (* answer (nth index list)))
      )

    (setq mask (* 2 mask))

    (if (> index 0)
	(setq index (- index 1))
      )
    )
  answer)

(get-pow 2 7)

(defun get-even-pow-list (num pow)
  "Функция принимает число NUM и степень POW, в которую его нужно возвести. Возвращает список со значениями четных степеней: (2^2 2^4 2^8 2^16 ...)"
  (setq list '())
  (push num list)
  
  (setq even 2)
  (while (<= even pow)
    (setq prev (nth 0 list))
    (setq next (* prev prev))
    (push next list)
    (setq even (* even 2))
    )
    
  list)

(get-even-pow-list 2 4)
