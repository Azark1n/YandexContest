# A. Лучше клавиатуры не сыскать?


|                                       | Все языки                                   | GNU C++20 10.2   | Clang14 C++20    |
| ------------------------------------- | --------------------------------------------------- | ---------------- | ---------------- |
| Ограничение времени | 3 секунды                                    | 1 секунда | 1 секунда |
| Ограничение памяти   | 256Mb                                               | 256Mb            | 256Mb            |
| Ввод                              | стандартный ввод или input.txt    |                  |                  |
| Вывод                            | стандартный вывод или output.txt |                  |                  |

Кузя снова не успел сдать реферат по языковым разнообразиям в срок. «Наверное, у меня какая-то неоптимальная клавиатура...» — подумал Кузя и решил изобрести самую оптимальную клавиатуру для набора одним пальцем.

Кузя решил, что его клавиатура будет содержать **N** рядов с клавишами (разные ряды могут содержать разные количества клавиш). Все клавиши на клавиатуре будут уникальными.

Чтобы оценить качество клавиатуры для набора определённого текста, Кузя ввёл понятие «разнорядности»:

* Пусть текст представляет из себя строку **S** длины **K**;
* Назовём переход между соседними в тексте символами **S**i−**1 и **S**i**(**2**≤**i**≤**K**) разнорядным, если данные символы находятся на различных рядах клавиатуры;
* Разнорядность равна количеству разнорядных переходов при наборе текста на заданной клавиатуре.

Например, пусть текст **S** равен **A**B**C**A**D**, а клавиатура содержит два ряда клавиш **A**C и **B**D. В таком случае при наборе текста будет ровно **3** разнорядных перехода:

1. **S**1=A в S2=B (ряд 1 в ряд 2);
2. S2=B в S3=C (ряд 2 в ряд 1);
3. S4=A в S5=D (ряд 1 в ряд 2).

Вас, как лучшего игрока в Тетрис среди знакомых, Кузя просит вычислить разнорядность созданной им клавиатуры на последнем из Кузиных рефератов.

## Формат ввода

Первая строка содержит одно целое число **N**(**1**≤**N**≤**2**⋅**1**0^5) — количество клавиш на клавиатуре.Вторая строка содержит **N** целых чисел **c**i**(**0**≤**c**i≤10^9) — идентификаторы символов на клавишах. Гарантируется, что все значения **c**i различны.

Третья строка содержит **N** целых чисел **r**i(1≤ri≤10^9). Число **r**i задает номер ряда на клавиатуре, в котором расположена клавиша с символом **c**i.

Четвертая строка содержит одно целое число **K**(**1**≤**K**≤**2**⋅**1**0^5) — количество символов в реферате.

Пятая строка содержит **K** целых чисел sj(0≤sj≤10^9) — идентификаторы символов реферата в порядке набора на клавиатуре. Гарантируется, что для любого **s**j существует такой **i**, что sj=ci — любой символ из реферата присутствует на клавиатуре.

## Формат вывода

Выведите единственное целое число — разнорядность заданной во входных данных конструкции клавиатуры на реферате **S**.

### Пример 1


| Ввод![Скопировать ввод](https://yastatic.net/lego/_/La6qi18Z8LwgnZdsAr1qy1GwCwo.gif) | Вывод![Скопировать вывод](https://yastatic.net/lego/_/La6qi18Z8LwgnZdsAr1qy1GwCwo.gif) |
| ------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- |
| 4                                                                                                       | 3                                                                                                           |
| 1 2 3 4                                                                                                 |                                                                                                             |
| 1 2 1 2                                                                                                 |                                                                                                             |
| 5                                                                                                       |                                                                                                             |
| 1 2 3 1 4                                                                                               |                                                                                                             |

### Пример 2


| Ввод![Скопировать ввод](https://yastatic.net/lego/_/La6qi18Z8LwgnZdsAr1qy1GwCwo.gif) | Вывод![Скопировать вывод](https://yastatic.net/lego/_/La6qi18Z8LwgnZdsAr1qy1GwCwo.gif) |
| ------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- |
| 3                                                                                                       | 0                                                                                                           |
| 42 3 14                                                                                                 |                                                                                                             |
| 1 3 3                                                                                                   |                                                                                                             |
| 4                                                                                                       |                                                                                                             |
| 3 14 14 3                                                                                               |                                                                                                             |

## Примечания

Пояснение к первому тестовому примеру. Данный пример соответствует примеру из условия, где каждой букве сопоставлен её номер в латинском алфавите:

* «A» — **1**;
* «B» — **2**;
* «C» — **3**;
* «D» — **4**.

Как и в условии, первый ряд содержит символы **1** и **3**, второй — **2** и **4**.

Ответ **3** получается аналогично условию:

* при переходе от символа **1** к символу **2**;
* при переходе от символа **2** к символу **3**;
* при переходе от символа **1** к символу **4**.

Пояснение ко второму тестовому примеру.

1. Первый ряд содержит клавишу с идентификатором **4**2;
2. Второй ряд пустует;
3. Третий ряд — клавиши с идентификаторами **3** и **1**4.

Все клавиши, используемые при наборе текста реферата, находятся в **3**-м ряду, поэтому разнорядность клавиатуры равна **0**.