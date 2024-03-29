# A. Андрей и кислота


| Ограничение времени | 2 секунды                                    |
| ------------------------------------- | --------------------------------------------------- |
| Ограничение памяти   | 512Mb                                               |
| Ввод                              | стандартный ввод или input.txt    |
| Вывод                            | стандартный вывод или output.txt |

## 

Андрей работает в секретной химической лаборатории, в которой производят опасную кислоту с удивительными свойствами. У Андрея есть **n** бесконечно больших резервуаров, расположенных в один ряд. Изначально в каждом резервуаре находится некоторое количество кислоты. Начальство Андрея требует, чтобы во всех резервуарах содержался одинаковый объем кислоты. К сожалению, разливающий аппарат несовершенен. За одну операцию он способен разлить по одному литру кислоты в каждый из первых **k** (**1**≤**k**≤**n**) резервуаров. Обратите внимание, что для разных операций **k** могут быть разными. Поскольку кислота очень дорогая, Андрею не разрешается выливать кислоту из резервуаров. Андрей просит вас узнать, можно ли уравнять объемы кислоты в резервуарах, и, если это возможно, то посчитать минимальное количество операций, которое потребуется, чтобы этого достичь.

## Формат ввода

Первая строка содержит число **n** (**1**≤**n**≤**1**0**0**0**0**0) — количество резервуаров.

Во второй строке содержатся **n** целых чисел **a**i (**1**≤**a**i**≤**1**0**9), где **a**i означает исходный объём кислоты в **i**-м резервуаре в литрах.

## Формат вывода

Если объемы кислоты в резервуарах можно уравнять, выведите минимальное количество операций, необходимых для этого.

Если это невозможно, выведите «-1».

### Пример 1


| Ввод![Скопировать ввод](https://yastatic.net/lego/_/La6qi18Z8LwgnZdsAr1qy1GwCwo.gif) | Вывод![Скопировать вывод](https://yastatic.net/lego/_/La6qi18Z8LwgnZdsAr1qy1GwCwo.gif) |
| ------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- |
| 2                                                                                                       | 1                                                                                                           |
| 1 2                                                                                                     |                                                                                                             |

Пример 2


| Ввод![Скопировать ввод](https://yastatic.net/lego/_/La6qi18Z8LwgnZdsAr1qy1GwCwo.gif) | Вывод![Скопировать вывод](https://yastatic.net/lego/_/La6qi18Z8LwgnZdsAr1qy1GwCwo.gif) |
| ------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- |
| 5                                                                                                       | 4                                                                                                           |
| 1 1 5 5 5                                                                                               |                                                                                                             |

### Пример 3


| Ввод![Скопировать ввод](https://yastatic.net/lego/_/La6qi18Z8LwgnZdsAr1qy1GwCwo.gif) | Вывод![Скопировать вывод](https://yastatic.net/lego/_/La6qi18Z8LwgnZdsAr1qy1GwCwo.gif) |
| ------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- |
| 3                                                                                                       | -1                                                                                                          |
| 3 2 1                                                                                                   |                                                                                                             |

## Примечания

В первом примере достаточно одной операции с **k**, равным 1. Тогда в обоих резервуарах окажется по 2 литра.

Во втором примере достаточно четырех операций с **k**, равным 2. Тогда во всех резервуарах окажется по 5 литров.

В третьем примере объемы уравнять невозможно.
