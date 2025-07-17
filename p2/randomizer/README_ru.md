## Запуск программы

Компиляция исходного кода:
`javac -d bin src/Solution.java`

Запуск скомпилированного кода:
`java -cp bin/ Solution`

## Тестирование

Определить местоположение нужных файлов junit5:
`dpkg -L "junit5"`

Для ноутбука Honor:
```
/usr/share/java/junit-jupiter-api-5.10.1.jar
/usr/share/java/junit-platform-console-standalone-1.9.1.jar
```

Для планшета samsung:
```
/usr/share/java/junit-jupiter-api-5.3.2.jar
/usr/share/java/junit-platform-console-standalone-1.3.2.jar
```

Компиляция тестового класса (honor):
`javac -d bin/ -cp "/usr/share/java/junit-jupiter-api-5.10.1.jar:/usr/share/java/junit-platform-console-standalone-1.9.1.jar:bin" 
src/test/SolutionTest.java`

Запуск тестов (honor):
`java -jar /usr/share/java/junit-platform-console-standalone-1.9.1.jar --classpath bin/ --scan-class-path`

Компиляция тестового класса (samsung):
`javac -d bin/ -cp "/usr/share/java/junit-jupiter-api-5.3.2.jar:/usr/share/java/junit-platform-console-standalone-1.3.2.jar:bin" 
src/test/SolutionTest.java`

Запуск тестов (samsung):
`java -jar /usr/share/java/junit-platform-console-standalone-1.3.2.jar --classpath bin/ --scan-class-path`

## В программе использовал

* Математические функции (Хорстман 3.5.2)
* Приведение типов (Хорстман 3.5.4)
* Пустые и нулевые строки: args.lenght (Хорстман 3.6.5)
* Прикладной програмный интерфейс api класса String (Хорстман 3.6.7)
* Построение символьных строк (Хорстман 3.6.9)
* Оператор прерывания логики программы (Хорстман 3.8.6)
* Объекты и объектные переменные (4.2.1)
* Модифицирующие методы и методы доступа (4.2.3)
* Статические методы (4.4.3)
* Метод main (4.4.5)


