# J. Непоправимый граф


| Ограничение времени | 2 секунды                                    |
| ------------------------------------- | --------------------------------------------------- |
| Ограничение памяти   | 512Mb                                               |
| Ввод                              | стандартный ввод или input.txt    |
| Вывод                            | стандартный вывод или output.txt |

Полное решение будет оценено в 9 баллов.

Дан неориентированный граф **G**, содержащий **n** вершин и **m** ребер. Все ребра графа могут быть покрашены в два цвета: черный или белый.

Раскраска графа называется устойчивой, если с помощью операций перекрашивания невозможно получить ситуацию, при которой все ребра окажутся покрашены в один цвет. За одну операцию разрешается выбрать некоторую вершину **u** и изменить цвета всех ребер, которым она инцидентна, на противоположный цвет. Таким образом, для всех ребер **(**u**,**v**)** белый цвет изменится на черный, а черный — на белый.

Вася много упражнялся в перекраске ребер, и для некоторых графов ему всегда удавалось получить одноцветную раскраску.

Определите, можно ли в данный неокрашенный граф**G** добавить несколько ребер и определить начальные цвета ребер так, чтобы предложенная раскраска была устойчивой. Кроме того, минимизируйте количество добавленных в граф ребер.

В итоговом графе не должно быть кратных ребер и петель.

## Формат ввода

Первая строка содержит два целых числа **n** и **m** (**1**≤**n**≤**3**0**0**_0**0**0, **0**≤**m**≤**3**0**0** 0**0**0) — количество вершин и ребер в графе.

Каждая из следующих **m** строк содержит два целых числа **a** и **b** (**1**≤**a**,**b**≤**n**, **a**≠**b**), которые задают ребро между вершинами **a** и **b**.

Гарантируется, что в графе нет кратных ребер и петель.

## Формат вывода

Выведите в единственной строке No, если из графа **G** невозможно получить граф с устойчивой раскраской.

Иначе в первой строке выведите Yes, а в следующей выведите **k** (**0**≤**k**≤**n**(**n**−**1**)**2**−**m**) — количество ребер, которые будут добавлены.

В следующих **m**+**k** строках выведите по одному ребру: **a**i, **b**i, **c**i (0 — ребро черного цвета, 1 — белого).

Начальные и добавленные ребра могут выводиться в произвольном порядке. В итоговом графе не должно быть кратных ребер и петель.

### Пример 1


| Ввод![Скопировать ввод](https://yastatic.net/lego/_/La6qi18Z8LwgnZdsAr1qy1GwCwo.gif) | Вывод![Скопировать вывод](https://yastatic.net/lego/_/La6qi18Z8LwgnZdsAr1qy1GwCwo.gif) |
| ------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- |
| 4 4                                                                                                     | Yes                                                                                                         |
| 1 2                                                                                                     | 0                                                                                                           |
| 2 3                                                                                                     | 1 2 0                                                                                                       |
| 3 4                                                                                                     | 2 3 0                                                                                                       |
| 4 1                                                                                                     | 3 4 0                                                                                                       |
|                                                                                                         | 1 4 1                                                                                                       |

### Пример 2


| Ввод![Скопировать ввод](https://yastatic.net/lego/_/La6qi18Z8LwgnZdsAr1qy1GwCwo.gif) | Вывод![Скопировать вывод](https://yastatic.net/lego/_/La6qi18Z8LwgnZdsAr1qy1GwCwo.gif) |
| ------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- |
| 4 3                                                                                                     | Yes                                                                                                         |
| 1 2                                                                                                     | 1                                                                                                           |
| 2 3                                                                                                     | 1 2 0                                                                                                       |
| 3 4                                                                                                     | 2 3 0                                                                                                       |
|                                                                                                         | 3 4 0                                                                                                       |
|                                                                                                         | 1 4 1                                                                                                       |

### Пример 3


| Ввод![Скопировать ввод](https://yastatic.net/lego/_/La6qi18Z8LwgnZdsAr1qy1GwCwo.gif) | Вывод![Скопировать вывод](https://yastatic.net/lego/_/La6qi18Z8LwgnZdsAr1qy1GwCwo.gif) |
| ------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- |
| 2 0                                                                                                     | No                                                                                                          |
