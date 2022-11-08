<div class="contest-head__item contest-head__item_role_title"><a class="link" href="/yacup/contest/42200/enter/?retPage=">Yandex Cup 2022: Алгоритм, марафон (квалификация)</a></div>

<div class="problem__statement text" data-bem="{&quot;problem__statement&quot;:{}}">
<div class="problem-statement">
   <div class="header">
      <h1 class="title">A. Перемещение самокатов</h1>
      <table>
         <tbody><tr class="input-file">
            <td class="property-title">Ввод</td>
            <td colspan="1">inputX.txt</td>
         </tr>
         <tr class="output-file">
            <td class="property-title">Вывод</td>
            <td colspan="1">outputX.txt</td>
         </tr>
      </tbody></table>
   </div>
   <h2></h2>
   <div class="legend"><span style="">
         <p>В одном городе есть <span class="tex-math-text">n</span> самокатов, которые расположены в местах с низким пользовательским спросом. В этом же городе есть <span class="tex-math-text">m</span> парковочных мест, которые находятся в зонах с высоким пользовательским спросом. Мы хотим переместить как можно больше самокатов
            с исходных точек на парковочные места (не более одного самоката на одно парковочное место).
         </p></span><p>Перемещать самокаты мы будем с помощью <span class="tex-math-text">k</span> автомобилей (фургонов). Все они изначально находятся в некоторой заданной точке. Для каждого автомобиля можно выбрать маршрут,
         который будет посещать в некотором порядке самокаты и парковочные места. Для выбранных маршрутов есть следующие ограничения:
         </p><ul>
            <li>Каждый автомобиль имеет некоторое ограничение на максимально допустимую длину маршрута. </li>
            <li>Вместимость <span style="font-weight:bold;">каждого</span> автомобиля — <span class="tex-math-text">25</span> самокатов. Это значит, что <span style="font-weight:bold;">в любой момент времени</span> в автомобиле может находиться не более <span class="tex-math-text">25</span> самокатов. При этом за весь маршрут можно переместить больше <span class="tex-math-text">25</span> самокатов. 
            </li>
         </ul>
      <p></p>
      <p>При этих ограничениях мы хотим переместить как можно больше самокатов с исходных точек на парковочные места (не более одного
         самоката на одно парковочное место).
      </p>
      <p>Для простоты можно считать, что в городе есть <span class="tex-math-text">n + m + 1</span> точек: 
         </p><ul>
            <li>начальная точка с <span class="tex-math-text">k</span> автомобилями (точка с индексом <span class="tex-math-text">0</span>); 
            </li>
            <li><span class="tex-math-text">n</span> самокатов (точки с индексами <span class="tex-math-text">1</span>, <span class="tex-math-text">…</span>, <span class="tex-math-text">n</span>); 
            </li>
            <li><span class="tex-math-text">m</span> парковочных мест (точки с индексами <span class="tex-math-text">n + 1</span>, <span class="tex-math-text">…</span>, <span class="tex-math-text">n + m</span>). 
            </li>
         </ul>
      <p></p>
      <p>Расстояние между точками задано квадратной матрицей <span class="tex-math-text">D</span>, где элемент <span class="tex-math-text">D(i, j)</span> задает расстояние от точки <span class="tex-math-text">i</span> до точки <span class="tex-math-text">j</span> (<span class="tex-math-text">0 ≤ i, j ≤ n + m</span>).
      </p>
      <p>Для заданной матрицы расстояний справедливо «неравенство треугольника»: для любых трех точек <span class="tex-math-text">v<sub>1</sub></span>, <span class="tex-math-text">v<sub>2</sub></span>, <span class="tex-math-text">v<sub>3</sub></span> выполняется неравенство <span class="tex-math-text">D(v<sub>1</sub>, v<sub>3</sub>) ≤ D(v<sub>1</sub>, v<sub>2</sub>) + D(v<sub>2</sub>, v<sub>3</sub>)</span>. Таким образом, автомобилям не имеет смысла посещать некоторую точку в качестве промежуточной (не для того, чтобы забрать
         или оставить там самокат).
      </p>
      <p>Решением будет являться набор из <span class="tex-math-text">k</span> маршрутов (возможно пустых), которые <span style="font-weight:bold;">не пересекаются по посещенным точкам</span> и удовлетворяют заданным ограничениям на длину маршрута и вместимость автомобиля.
      </p>
   </div>
   <h2>Формат ввода</h2>
   <div class="input-specification"><span style="">
         <p>Входные данные находятся в файлах <span style="font-style:italic;">input1.txt</span>, <span style="font-style:italic;">input2.txt</span>, <span class="tex-math-text">…</span>, <span style="font-style:italic;">input30.txt</span>. Вам нужно скачать архив со страницы задачи и распаковать его.
         </p></span><p>Первая строчка входного файла содержит три целых положительных числа <span class="tex-math-text">n</span>, <span class="tex-math-text">m</span> и <span class="tex-math-text">k</span> (<span class="tex-math-text">1 ≤ n, m ≤ 1000</span>, <span class="tex-math-text">2 ≤ k ≤ 5</span>) — количество самокатов, парковок и автомобилей соответственно.
      </p>
      <p>Следующие <span class="tex-math-text">n + m + 1</span> строчек содержат по <span class="tex-math-text">n + m + 1</span> чисел — матрицу расстояний <span class="tex-math-text">D</span> (<span class="tex-math-text">0 ≤ D(i, j) ≤ 10<sup>5</sup></span>, <span class="tex-math-text">0 ≤ i, j ≤ n + m</span>). В <span class="tex-math-text">i</span>-й (<span class="tex-math-text">0 ≤ i ≤ n + m</span>) строчке заданы элементы <span class="tex-math-text">D(i, 0)</span>, <span class="tex-math-text">D(i, 1)</span>, <span class="tex-math-text">…</span>, <span class="tex-math-text">D(i, n + m)</span>.
      </p>
      <p>Другими словами, матрица задана в следующем виде: 
         </p><div class="tex-math-block"><img class="tex-math" src="img.png"></div> Гарантируется, что на главной диагонали матрицы расположены нули. При этом матрица может и не быть симметричной.
      <p></p>
      <p>Последняя строчка входного файла содержит <span class="tex-math-text">k</span> положительных чисел <span class="tex-math-text">d<sub>1</sub></span>, <span class="tex-math-text">d<sub>2</sub></span>, <span class="tex-math-text">…</span>, <span class="tex-math-text">d<sub>k</sub></span> (<span class="tex-math-text">0 ≤ d<sub>i</sub> ≤ 10<sup>5</sup></span>) — ограничения на длину маршрутов автомобилей.
      </p>
   </div>
   <h2>Формат вывода</h2>
   <div class="output-specification"><span style="">
         <p>Вам нужно отправить на проверку <span style="font-weight:bold;">zip</span>-архив с файлами <span style="font-style:italic;">output1.txt</span>, <span style="font-style:italic;">output2.txt</span>, <span class="tex-math-text">…</span>, <span style="font-style:italic;">output30.txt</span>, где выходной файл <span style="font-style:italic;">outputX.txt</span> должен соответствовать входному файлу <span style="font-style:italic;">inputX.txt</span>. Если какой-то из файлов будет отсутствовать в архиве, то этот тест будет проигнорирован при тестировании.
         </p></span><p>Выходной файл должен состоять из <span class="tex-math-text">k</span> строк. В <span class="tex-math-text">i</span>-й строчке должен быть представлен маршрут <span class="tex-math-text">i</span>-го автомобиля.
      </p>
      <p>Первым в <span class="tex-math-text">i</span>-й строке должно идти число <span class="tex-math-text">s<sub>i</sub></span> — количество точек в маршруте <span class="tex-math-text">i</span>-го автомобиля, не считая стартовую точку (с индексом <span class="tex-math-text">0</span>). Далее в этой же строке через пробел должны быть перечислены <span class="tex-math-text">s<sub>i</sub></span> индексов посещенных точек.
      </p>
      <p><span style="font-weight:bold;">Также в отправляемый zip-архив добавьте все исходные коды, которые были написанные вами.</span> Исходные коды <span style="font-weight:bold;">не</span> будут запускаться на сервере, но мы проверим их наличие после окончания соревнования.
      </p>
      <p><span style="font-size:Large;"><span style=""><span style="font-weight:bold;">Оценка</span></span></span></p><p>Определение корректности набора маршрутов:</p>
            <p>
               </p><ul>
                  <li>Выведенные маршруты не должны пересекаться по посещенным точкам и не должны содержать точку <span class="tex-math-text">0</span>.
                     <p></p>
                  </li>
                  <li>Длина маршрута <span class="tex-math-text">i</span>-го автомобиля не должна превышать <span class="tex-math-text">d<sub>i</sub></span>. Длиной маршрута считается сумма расстояний между последовательными точками маршрута. Расстояние от стартовой точки <span class="tex-math-text">0</span> до первой точки маршрута тоже учитывается.
                     <p></p>
                  </li>
                  <li>В любой момент времени в автомобиле может находиться не более <span class="tex-math-text">25</span> самокатов.
                     <p></p>
                  </li>
                  <li><span style="font-weight:bold;">В конце маршрута в автомобиле не должно оставаться самокатов.</span><p></p>
                  </li>
                  <li>При посещении точки с самокатом в автомобиле должно быть строго меньше <span class="tex-math-text">25</span> самокатов, а при посещении парковочного места в автомобиле должен быть хотя бы один самокат. 
                  </li>
               </ul>
            <p></p>
            <p>Если выведенный набор маршрутов является корректным, то количество набранных баллов будет равно количеству перемещенных самокатов.
               Иначе вы получите ноль баллов за этот тест.
            </p>
            <p>Общий результат вашего решения будет равен сумме баллов по всем тестам.</p>
            <p><span style="font-weight:bold;">500 очков за эту задачу равны одному квалификационному баллу. Таким образом, для прохождения в финал направления «Алгоритм» необходимо набрать не менее 10 000 очков.</span></p><p></p>
   </div>
   <h2>Примечания</h2>
   <div class="notes"><span style="">
         <p><span style="font-weight:bold;">Пример</span> <br></p></span><p><span class="tex-monospace">Ввод:</span> <br><span class="tex-monospace">3 4 2</span> <br><span class="tex-monospace">0 1 2 4 3 4 3 1</span> <br><span class="tex-monospace">1 0 1 5 2 3 4 2</span> <br><span class="tex-monospace">2 1 0 6 1 2 5 3</span> <br><span class="tex-monospace">4 5 6 0 7 8 1 3</span> <br><span class="tex-monospace">3 2 1 7 0 1 6 4</span> <br><span class="tex-monospace">4 3 2 8 1 0 7 5</span> <br><span class="tex-monospace">3 4 5 1 6 7 0 2</span> <br><span class="tex-monospace">1 2 3 3 4 5 2 0</span> <br><span class="tex-monospace">5 4</span> <br></p>
      <p><span class="tex-monospace">Вывод:</span> <br><span class="tex-monospace">2 3 6</span> <br><span class="tex-monospace">4 1 2 4 5</span> <br></p>
      <p>Это решение оптимально, так как все три самоката были перевезены. Длина маршрута первого автомобиля равна <span class="tex-math-text">5</span>, а второго — <span class="tex-math-text">4</span>.
      </p>
      <p>В приведенном примере матрица расстояний является симметричной, но для остальных тестов это не обязательно верно.</p>
   </div>
</div><a class="link link_theme_download inline-block" href="/yacup/contest/42200/download/A/" target="_blank">Скачать условие задачи</a></div>