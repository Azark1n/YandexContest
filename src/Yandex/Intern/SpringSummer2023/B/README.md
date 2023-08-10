# B. Горе от перфекционизма


|                                       | Все языки                                   | GNU C++20 10.2   | Clang14 C++20    |
| ------------------------------------- | --------------------------------------------------- | ---------------- | ---------------- |
| Ограничение времени | 3 секунды                                    | 1 секунда | 1 секунда |
| Ограничение памяти   | 256Mb                                               | 256Mb            | 256Mb            |
| Ввод                              | стандартный ввод или input.txt    |                  |                  |
| Вывод                            | стандартный вывод или output.txt |                  |                  |

К Новому-преновому году работники Тындекса построили **N** ледяных скульптур, **i**-я скульптура состоит из **a**i килограмм льда.

Но они не посоветовались с Кузей! А ведь Кузя знает, что идеальная скульптура состоит из ровно **X** килограмм льда, не больше и не меньше.

Новый-преновый год уже совсем скоро, до него осталось всего **T** минут. За одну минуту Кузя может выбрать одну скульптуру и добавить или удалить ровно **1** килограмм льда из неё.

Вас, как отличника художественной школы, Кузя просит найти максимальное количество идеальных скульптур в момент наступления праздника.

## Формат ввода

В первой строке вводятся три целых числа **N**, **X**, **T**(**1**≤**N**≤**2**⋅**1**0^**5**; **0**≤**X**≤**1**0^**9**; **0**≤**T**≤**3**⋅**1**0^**1**4) — количество скульптур, идеальное количество льда в скульптуре и оставшееся количество минут до наступления праздника.Во второй строке вводятся через пробел **N** целых чисел **a**i(**1**≤**a**i≤**1**0^**9**) — количество килограмм льда в **i**-й скульптуре.

## Формат вывода

В первой строке выведите целое число **K**(**0**≤**K**≤**N**) — максимально возможное количество идеальных скульптур в момент наступления праздника.Во второй строке выведите через пробел **K** различных целых чисел **b**i(**1**≤**b**i≤**N**) — номера скульптур, которые будут идеальными в момент наступления Нового-пренового года.

Скульптуры нумеруются с **1** в порядке ввода.

Если оптимальных ответов несколько, то выведите любой из оптимальных.

### Пример 1


| Ввод![Скопировать ввод](https://yastatic.net/lego/_/La6qi18Z8LwgnZdsAr1qy1GwCwo.gif) | Вывод![Скопировать вывод](https://yastatic.net/lego/_/La6qi18Z8LwgnZdsAr1qy1GwCwo.gif) |
| ------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- |
| 3 5 2                                                                                                   | 2                                                                                                           |
| 5 10 6                                                                                                  | 1 3                                                                                                         |

### Пример 2


| Ввод![Скопировать ввод](https://yastatic.net/lego/_/La6qi18Z8LwgnZdsAr1qy1GwCwo.gif) | Вывод![Скопировать вывод](https://yastatic.net/lego/_/La6qi18Z8LwgnZdsAr1qy1GwCwo.gif) |
| ------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- |
| 5 19 32                                                                                                 | 2                                                                                                           |
| 36 10 72 4 50                                                                                           | 2 4                                                                                                         |

### Пример 3


| Ввод![Скопировать ввод](https://yastatic.net/lego/_/La6qi18Z8LwgnZdsAr1qy1GwCwo.gif) | Вывод![Скопировать вывод](https://yastatic.net/lego/_/La6qi18Z8LwgnZdsAr1qy1GwCwo.gif) |
| ------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- |
| 4 25 10                                                                                                 | 0                                                                                                           |
| 1 10 42 9                                                                                               |                                                                                                             |

## Примечания

Пояснение к первому тестовому примеру.До нового года остаётся **2** минуты, а идеальная скульптура должна содержать ровно **5** килограмм льда.

1. Первая скульптура идеальна сразу, поэтому Кузя не тратит времени на её исправление.
2. Кузя может сделать идеальной третью скульптуру за **|**6**−**5**|**=**1** минуту. После этого у него в запасе останется **2**−**1**=1 минута.
3. Кузя не сможет сделать идеальной вторую скульптуру, так как на её исправление необходимо **|**1**0**−**5**|=5 минут.

Пояснение ко второму тестовому примеру.

До нового года остаётся **3**2 минуты, а идеальная скульптура должна содержать ровно **1**9 килограмм льда.

Рассмотрим, сколько требуется времени на «идеализацию» фигур:

1. **|**1**9**−**3**6|=**1**7 минут;
2. **|**1**9**−**1**0|=**9** минут;
3. **|**1**9**−**7**2|=**5**3 минуты;
4. **|**1**9**−**4**|**=**1**5** минут;
5. **|**1**9**−**5**0|=**3**1 минута.

Итого получаются три возможных сценария с двумя идеальными фигурами:

1. Первая и вторая за **1**7+**9**=**2**6 минут;
2. Первая и четвертая за **1**7+**1**5=**3**2 минуты - обратите внимание, что в данном сценарии Кузя потратит полностью время, оставшееся до события;
3. Вторая и четвертая за **9**+**1**5=**2**4 минуты.

Хотя Кузя может сделать идеальной пятую фигуру, но на неё одну потребуется почти всё время (**3**1 из **3**2 минут), поэтому Кузя не рассматривает такие сценарии.

Пояснение ко третьему тестовому примеру.

До нового года остаётся **1**0 минут, а идеальная скульптура должна содержать ровно **2**5 килограмм льда.

Кузя не успеет сделать ни одну из фигур идеальной, так как на каждую из них требуется больше, чем 10 минут:

1. **|**1**−**2**5**|**=**2**4**>**1**0;
2. **|**1**0**−**2**5|**=**1**5**>**1**0;
3. **|**4**2**−**2**5|**=**1**7**>**1**0;
4. **|**9**−**2**5**|**=**1**4**>**1**0.