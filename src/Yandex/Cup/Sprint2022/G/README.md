# G. Макс и соревнование эрудитов


| Ограничение времени | 2 секунды                                    |
| ------------------------------------- | --------------------------------------------------- |
| Ограничение памяти   | 256Mb                                               |
| Ввод                              | стандартный ввод или input.txt    |
| Вывод                            | стандартный вывод или output.txt |

## 

Решение, корректно работающее в ограничениях **1**≤**n**≤**1**0**0**, будет оценено в 3 балла.

Полное решение будет оценено в 7 баллов (включая 3 балла за подзадачу выше).

Макс везет команду из **n** своих учеников на соревнование эрудитов. Противостоять им будет команда давнего соперника Макса.

Соревнование состоит из **n** раундов, в каждом раунде один участник из команды Макса соревнуется с одним участником из команды соперника. Каждый эрудит в обеих командах принимает участие только в одном из раундов.

У каждого эрудита есть особый числовой рейтинг, отражающий, в каком количестве тем он является экспертом. Именно сравнение рейтингов позволяет выяснить, кто окажется победителем в каждом раунде. При этом назначаются баллы по следующим правилам:

* Команда Макса получает 1 балл в раунде, если рейтинг их эрудита оказался строго больше рейтинга противостоящего ему эрудита из команды соперника;
* Команда Макса теряет 1 балл в раунде, если рейтинг их эрудита оказался строго меньше рейтинга противостоящего ему эрудита из команды соперника;
* Наконец, команда Макса не получает и не теряет баллов в раунде, если оба эрудита имеют одинаковый рейтинг.

Максу удалось заранее узнать рейтинг эрудитов в команде соперника и то, в каких раундах будет участвовать каждый их них. Помогите ему распределить собственных эрудитов по раундам так, чтобы итоговое количество баллов его команды оказалось как можно выше.

## Формат ввода

Первая строка содержит целое число **n** (**1**≤**n**≤**2**⋅**1**0^**5**) — количество эрудитов в команде.

Вторая строка содержит **n** целых чисел **r**i (**1**≤**r**i≤**2**⋅**1**0^5) — рейтинг каждого из эрудитов в команде Макса.

Третья строка содержит **n** целых чисел **q**i (**1**≤**q**i≤**2**⋅**1**0^5) — рейтинг каждого из эрудитов в команде соперника.

## Формат вывода

Выведите одно целое число — наибольшее итоговое количество баллов, которого может достичь Макс, если оптимально распределит своих эрудитов.

### Пример 1


| Ввод![Скопировать ввод](https://yastatic.net/lego/_/La6qi18Z8LwgnZdsAr1qy1GwCwo.gif) | Вывод![Скопировать вывод](https://yastatic.net/lego/_/La6qi18Z8LwgnZdsAr1qy1GwCwo.gif) |
| ------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- |
| 5                                                                                                       | 3                                                                                                           |
| 30 10 30 20 40                                                                                          |                                                                                                             |
| 10 50 30 20 10                                                                                          |                                                                                                             |

### Пример 2


| Ввод![Скопировать ввод](https://yastatic.net/lego/_/La6qi18Z8LwgnZdsAr1qy1GwCwo.gif) | Вывод![Скопировать вывод](https://yastatic.net/lego/_/La6qi18Z8LwgnZdsAr1qy1GwCwo.gif) |
| ------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- |
| 10                                                                                                      | 6                                                                                                           |
| 3 7 2 6 2 4 1 8 3 5                                                                                     |                                                                                                             |
| 5 2 4 7 2 1 8 9 1 6                                                                                     |                                                                                                             |