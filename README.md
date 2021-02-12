# Data_structures_in_java

Моя реализация некоторых структур данных на языке java.

## Связный список

*Задача:* реализовать на основе односвязного списка контейнер
myList, который бы позволял хранить произвольный тип данных.

Папка содержит два файла:
* `myList.java` — описание класса list, прототипы методов,
реализация методов;
* `test-list.java` — тестирование и проверка возможностей класса;

**Требования к классу mylist:**
- класс mylist должен содержать следующие поля:
1. ссылку на первый элемент списка;
2. ссылку на последний элемент списка;
3. число элементов в списке;
- класс myList должен содержать следующие методы:
1. конструктор;
2. конструктор копирования;
3. добавление элемента в начало списка, в конец списка;
4. удаление элемента из начала списка;
5. удаление элемента по значению;
6. получение числа элементов в списке;
7. очистка списка (удаление всех элементов);
- при невозможности извлечения или удаления элемента должны
генерироваться исключения.

## Динамический массив
*Задача:* реализовать контейнер myVector — динамический массив
для хранения произвольного типа данных.

Папка содержит два основных файла:
* `myVector.java` — описание класса vector, прототипы методов,
реализация методов;
* `test-vector.cpp` — тестирование и проверка возможностей
класса;

**Требования к классу myVector:**
- класс myVector должен быть шаблонным;
- класс myVector должен содержать следующие поля:
1. ссылку на массив;
2. текущее число элементов;
3. максимальное число элементов;
- класс myVector должен содержать следующие методы:
1. конструктор;
2. конструктор копирования;
3. добавление элемента в конец;
4. удаление последнего элемента;
5. удаление элемента по индексу;
6. вставка элемента по индексу;
7. изменение размера массива;
8. очистка массива (удаление всех элементов);
9. получение текущего и максимального размера контейнера;
- пользователь должен иметь возможность задать начальное
число элементов в массиве с помощью конструктора;
- память под массив должна выделяться с запасом. 
- если число элементов за счет добавления новых превышает
максимальное, необходимо заново выделить память, скопировать
существующие элементы
- при невозможности удаления элемента, доступа к элементу и
т. п. должны генерироваться исключения;

## Двоичное дерево поиска
*Задача:* реализовать класс binary_tree, который бы обеспечивал
логарифмическую сложность поиска и добавления нового
элемента.

Папка содержит два основных файла:
* `binary_tree.java` — описание класса binary_tree, прототипы
методов, реализация методов;
* `test-binary_tree.java` — тестирование и проверка возможностей
класса;

**Требования к классу binary_tree:**
- создать вспомогательную шаблонную структуру, содержащую
поле для хранения значения произвольного типа и 2 поля для
хранения ссылок на левого и правого потомков;
- класс binary_tree должен быть шаблонным;
- класс binary_tree должен содержать следующие поля:
1. ссылку на корневой элемент;
2. число элементов в дереве;
- класс binary_tree должен содержать следующие методы:
1. конструктор;
2. конструктор копирования;
3. добавление элемента;
4. поиск элемента;
5. удаление всех элементов;
6. необходимые интерфейсы (в зависимости от реализации);