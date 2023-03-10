<div class="problem__statement text" data-bem="{&quot;problem__statement&quot;:{}}">
<div class="problem-statement">
   <div class="header">
      <h1 class="title">B. Через тернии к клиенту</h1>
      <table>
         <tbody><tr>
            <th>Язык</th>
            <th>Ограничение времени</th>
            <th>Ограничение памяти</th>
            <th>Ввод</th>
            <th>Вывод</th>
         </tr>
         <tr>
            <td width="1%">Все языки</td>
            <td>1&nbsp;секунда</td>
            <td>512Mb</td>
            <td rowspan="7">стандартный ввод или input.txt</td>
            <td rowspan="7">стандартный вывод или output.txt</td>
         </tr>
         <tr>
            <td>
               <nobr>Python 3.7.3</nobr>
            </td>
            <td>4&nbsp;секунды</td>
            <td>512Mb</td>
         </tr>
         <tr>
            <td>
               <nobr>Python 3.7 (PyPy 7.3.3)</nobr>
            </td>
            <td>4&nbsp;секунды</td>
            <td>512Mb</td>
         </tr>
         <tr>
            <td>
               <nobr>Scala 2.13.4</nobr>
            </td>
            <td>5&nbsp;секунд</td>
            <td>512Mb</td>
         </tr>
         <tr>
            <td>
               <nobr>PHP 7.3.5</nobr>
            </td>
            <td>4&nbsp;секунды</td>
            <td>512Mb</td>
         </tr>
         <tr>
            <td>
               <nobr>OpenJDK Java 15</nobr>
            </td>
            <td>5&nbsp;секунд</td>
            <td>512Mb</td>
         </tr>
         <tr>
            <td>
               <nobr>Kotlin 1.5.32 (JRE 11)</nobr>
            </td>
            <td>5&nbsp;секунд</td>
            <td>512Mb</td>
         </tr>
      </tbody></table>
   </div>
   <h2></h2>
   <div class="legend"> Известная компания Тындекс идёт в ногу со временем — с началом активных космических перелётов в компании открылся сервис
      Тындекс.Ракетакси: пользователю необходимо лишь указать координаты начала и конца перелёта, после чего за ним вылетит персональная
      ракета. <!--l. 49-->
      <p style="text-indent: 0em;">По сути любой заказ можно описать в виде событий четырёх типов: </p><ol style="list-style-type:
      decimal;">
      <li><span style="font-weight: bold;">A </span>(accepted) - заказ принят в работу (ракета вылетела за клиентом); </li>
      <li><span style="font-weight: bold;">B </span>(boarding) - клиент сел в ракету; </li>
      <li><span style="font-weight: bold;">S </span>(success) - заказ успешно завершён (клиент вышел на планете назначения); </li>
      <li><span style="font-weight: bold;">C </span>(cancelled) - заказ отменён. </li>
      </ol>
      <!--l. 63-->
      <p style="text-indent: 0em;">Все происходящие с ракетами события отправляются на сервера, где сразу логируются. Вот только
      из-за проблем со связью (метеоритные потоки, вспышки на звездах и т.д.) отправка событий иногда затягивается, из-за чего записи
      в получившемся логе могут идти не по порядку. <!--l. 65-->
      </p><p style="text-indent: 0em;">Гарантируется, что все описанные в логе события задают один из следующих сценариев: </p><ol style="list-style-type: decimal;">
      <li><span style="font-weight: bold;">A </span>- <span style="font-weight: bold;">B </span>- <span style="font-weight: bold;">S</span></li>
      <li><span style="font-weight: bold;">A </span>- <span style="font-weight: bold;">B </span>- <span style="font-weight: bold;">C</span></li>
      <li><span style="font-weight: bold;">A </span>- <span style="font-weight: bold;">C</span></li>
      </ol>
      <!--l. 77-->
      <p style="text-indent: 0em;">Вам, как главному аналитику (и по совместительству главному программисту) ракетопарка, необходимо
      исследовать лог за прошедший год и определить для каждой ракеты суммарное время движения (в минутах) в течение заказов. <!--l.
      79-->
      </p><p style="text-indent: 0em;">В каждый момент времени ракета выполняет только один заказ. Будем считать, что каждая ракета
      в каждый момент времени: </p><ul>
      <li>или стоит на месте в ожидании заказа, </li>
      <li>или перемещается по космосу, выполняя заказ. </li>
      </ul>
      <!--l. 89-->
      <p style="text-indent: 0em;">Движение начинается после принятия заказа и завершается после отмены или завершения заказа. За
      одну минуту не может произойти несколько событий, связанных с одной и той же ракетой. </p>
      <p></p>
      <p></p>
      <p></p>
      <p></p>
      <p></p>

   </div>
   <h2>Формат ввода</h2>
   <div class="input-specification"> В первой строке дано целое число <!--l. 92--><span class="MathJax_Preview" style="color: inherit; display: none;"></span><span id="MathJax-Element-1-Frame" class="mjx-chtml MathJax_CHTML" tabindex="0" style="font-size: 117%;"><span id="MJXc-Node-1" class="mjx-math" style="text-indent: 0em;"><span id="MJXc-Node-2" class="mjx-mrow"><span id="MJXc-Node-3" class="mjx-mi"><span class="mjx-char MJXc-TeX-math-I" style="padding-top: 0.491em; padding-bottom: 0.308em; padding-right: 0.085em;">N</span></span></span></span></span><script type="math/mml" id="MathJax-Element-1"><math display="inline" style="text-indent: 0em;" xmlns="http://www.w3.org/1998/Math/MathML"><mi>N</mi></math></script><!--l.
      92--><span class="MathJax_Preview" style="color: inherit; display: none;"></span><span id="MathJax-Element-2-Frame" class="mjx-chtml MathJax_CHTML" tabindex="0" style="font-size: 117%;"><span id="MJXc-Node-4" class="mjx-math" style="text-indent: 0em;"><span id="MJXc-Node-5" class="mjx-mrow"><span id="MJXc-Node-6" class="mjx-mrow"><span id="MJXc-Node-7" class="mjx-mo"><span class="mjx-char MJXc-TeX-main-R" style="padding-top: 0.491em; padding-bottom: 0.614em;">(</span></span><span id="MJXc-Node-8" class="mjx-mrow"><span id="MJXc-Node-9" class="mjx-mn"><span class="mjx-char MJXc-TeX-main-R" style="padding-top: 0.369em; padding-bottom: 0.369em;">2</span></span><span id="MJXc-Node-10" class="mjx-mo MJXc-space3"><span class="mjx-char MJXc-TeX-main-R" style="padding-top: 0.369em; padding-bottom: 0.491em;">≤</span></span><span id="MJXc-Node-11" class="mjx-mi MJXc-space3"><span class="mjx-char MJXc-TeX-math-I" style="padding-top: 0.491em; padding-bottom: 0.308em; padding-right: 0.085em;">N</span></span><span id="MJXc-Node-12" class="mjx-mo MJXc-space3"><span class="mjx-char MJXc-TeX-main-R" style="padding-top: 0.369em; padding-bottom: 0.491em;">≤</span></span><span id="MJXc-Node-13" class="mjx-mn MJXc-space3"><span class="mjx-char MJXc-TeX-main-R" style="padding-top: 0.369em; padding-bottom: 0.369em;">2</span></span><span id="MJXc-Node-14" class="mjx-mn"><span class="mjx-char MJXc-TeX-main-R" style="padding-top: 0.369em; padding-bottom: 0.369em;">0</span></span><span id="MJXc-Node-15" class="mjx-mn"><span class="mjx-char MJXc-TeX-main-R" style="padding-top: 0.369em; padding-bottom: 0.369em;">0</span></span><span id="MJXc-Node-16" class="mjx-mspace" style="width: 0.3em; height: 0px;"></span><span id="MJXc-Node-17" class="mjx-mn"><span class="mjx-char MJXc-TeX-main-R" style="padding-top: 0.369em; padding-bottom: 0.369em;">0</span></span><span id="MJXc-Node-18" class="mjx-mn"><span class="mjx-char MJXc-TeX-main-R" style="padding-top: 0.369em; padding-bottom: 0.369em;">0</span></span><span id="MJXc-Node-19" class="mjx-mn"><span class="mjx-char MJXc-TeX-main-R" style="padding-top: 0.369em; padding-bottom: 0.369em;">0</span></span></span><span id="MJXc-Node-20" class="mjx-mo"><span class="mjx-char MJXc-TeX-main-R" style="padding-top: 0.491em; padding-bottom: 0.614em;">)</span></span></span></span></span></span><script type="math/mml" id="MathJax-Element-2"><math display="inline" style="text-indent: 0em;" xmlns="http://www.w3.org/1998/Math/MathML"><mrow><mo>(</mo><mrow><mn>2</mn>
      <mo>≤</mo> <mi>N</mi> <mo>≤</mo> <mn>2</mn><mn>0</mn><mn>0</mn><mspace width="0.3em"><mn>0</mn><mn>0</mn><mn>0</mn></mspace></mrow><mo>)</mo></mrow></math></script>
      &nbsp;— количество записей в логе. <!--l. 94-->
      <p style="text-indent: 0em;">Следующие <!--l. 94--><span class="MathJax_Preview" style="color: inherit; display: none;"></span><span id="MathJax-Element-3-Frame" class="mjx-chtml MathJax_CHTML" tabindex="0" style="font-size: 117%;"><span id="MJXc-Node-21" class="mjx-math" style="text-indent: 0em;"><span id="MJXc-Node-22" class="mjx-mrow"><span id="MJXc-Node-23" class="mjx-mi"><span class="mjx-char MJXc-TeX-math-I" style="padding-top: 0.491em; padding-bottom: 0.308em; padding-right: 0.085em;">N</span></span></span></span></span><script type="math/mml" id="MathJax-Element-3"><math display="inline" style="text-indent: 0em;" xmlns="http://www.w3.org/1998/Math/MathML"><mi>N</mi></math></script>
      строк содержат записи в логе в формате <!--l. 94--><span class="MathJax_Preview" style="color: inherit; display: none;"></span><span id="MathJax-Element-4-Frame" class="mjx-chtml MathJax_CHTML" tabindex="0" style="font-size: 117%;"><span id="MJXc-Node-24" class="mjx-math" style="text-indent: 0em;"><span id="MJXc-Node-25" class="mjx-mrow"><span id="MJXc-Node-26" class="mjx-mi"><span class="mjx-char MJXc-TeX-math-I" style="padding-top: 0.491em; padding-bottom: 0.308em; padding-right: 0.003em;">d</span></span><span id="MJXc-Node-27" class="mjx-mi"><span class="mjx-char MJXc-TeX-math-I" style="padding-top: 0.247em; padding-bottom: 0.308em;">a</span></span><span id="MJXc-Node-28" class="mjx-mi"><span class="mjx-char MJXc-TeX-math-I" style="padding-top: 0.247em; padding-bottom: 0.491em; padding-right: 0.006em;">y</span></span><span id="MJXc-Node-29" class="mjx-mspace" style="width: 0.3em; height: 0px;"></span><span id="MJXc-Node-30" class="mjx-mi"><span class="mjx-char MJXc-TeX-math-I" style="padding-top: 0.491em; padding-bottom: 0.308em;">h</span></span><span id="MJXc-Node-31" class="mjx-mi"><span class="mjx-char MJXc-TeX-math-I" style="padding-top: 0.247em; padding-bottom: 0.308em;">o</span></span><span id="MJXc-Node-32" class="mjx-mi"><span class="mjx-char MJXc-TeX-math-I" style="padding-top: 0.247em; padding-bottom: 0.308em;">u</span></span><span id="MJXc-Node-33" class="mjx-mi"><span class="mjx-char MJXc-TeX-math-I" style="padding-top: 0.247em; padding-bottom: 0.308em;">r</span></span><span id="MJXc-Node-34" class="mjx-mspace" style="width: 0.3em; height: 0px;"></span><span id="MJXc-Node-35" class="mjx-mi"><span class="mjx-char MJXc-TeX-math-I" style="padding-top: 0.247em; padding-bottom: 0.308em;">m</span></span><span id="MJXc-Node-36" class="mjx-mi"><span class="mjx-char MJXc-TeX-math-I" style="padding-top: 0.43em; padding-bottom: 0.308em;">i</span></span><span id="MJXc-Node-37" class="mjx-mi"><span class="mjx-char MJXc-TeX-math-I" style="padding-top: 0.247em; padding-bottom: 0.308em;">n</span></span><span id="MJXc-Node-38" class="mjx-mi"><span class="mjx-char MJXc-TeX-math-I" style="padding-top: 0.247em; padding-bottom: 0.308em;">u</span></span><span id="MJXc-Node-39" class="mjx-mi"><span class="mjx-char MJXc-TeX-math-I" style="padding-top: 0.43em; padding-bottom: 0.308em;">t</span></span><span id="MJXc-Node-40" class="mjx-mi"><span class="mjx-char MJXc-TeX-math-I" style="padding-top: 0.247em; padding-bottom: 0.308em;">e</span></span><span id="MJXc-Node-41" class="mjx-mspace" style="width: 0.3em; height: 0px;"></span><span id="MJXc-Node-42" class="mjx-mi"><span class="mjx-char MJXc-TeX-math-I" style="padding-top: 0.43em; padding-bottom: 0.308em;">i</span></span><span id="MJXc-Node-43" class="mjx-mi"><span class="mjx-char MJXc-TeX-math-I" style="padding-top: 0.491em; padding-bottom: 0.308em; padding-right: 0.003em;">d</span></span><span id="MJXc-Node-44" class="mjx-mspace" style="width: 0.3em; height: 0px;"></span><span id="MJXc-Node-45" class="mjx-mi"><span class="mjx-char MJXc-TeX-math-I" style="padding-top: 0.247em; padding-bottom: 0.308em;">s</span></span><span id="MJXc-Node-46" class="mjx-mi"><span class="mjx-char MJXc-TeX-math-I" style="padding-top: 0.43em; padding-bottom: 0.308em;">t</span></span><span id="MJXc-Node-47" class="mjx-mi"><span class="mjx-char MJXc-TeX-math-I" style="padding-top: 0.247em; padding-bottom: 0.308em;">a</span></span><span id="MJXc-Node-48" class="mjx-mi"><span class="mjx-char MJXc-TeX-math-I" style="padding-top: 0.43em; padding-bottom: 0.308em;">t</span></span><span id="MJXc-Node-49" class="mjx-mi"><span class="mjx-char MJXc-TeX-math-I" style="padding-top: 0.247em; padding-bottom: 0.308em;">u</span></span><span id="MJXc-Node-50" class="mjx-mi"><span class="mjx-char MJXc-TeX-math-I" style="padding-top: 0.247em; padding-bottom: 0.308em;">s</span></span></span></span></span><script type="math/mml" id="MathJax-Element-4"><math display="inline" style="text-indent: 0em;" xmlns="http://www.w3.org/1998/Math/MathML"><mi>d</mi><mi>a</mi><mi>y</mi><mspace width="0.3em"><mi>h</mi><mi>o</mi><mi>u</mi><mi>r</mi><mspace width="0.3em"><mi>m</mi><mi>i</mi><mi>n</mi><mi>u</mi><mi>t</mi><mi>e</mi><mspace width="0.3em"><mi>i</mi><mi>d</mi><mspace width="0.3em"><mi>s</mi><mi>t</mi><mi>a</mi><mi>t</mi><mi>u</mi><mi>s</mi></mspace></mspace></mspace></mspace></math></script>:
      </p><ul>
      <li>
      <!--l. 98--><span class="MathJax_Preview" style="color: inherit; display: none;"></span><span id="MathJax-Element-5-Frame" class="mjx-chtml MathJax_CHTML" tabindex="0" style="font-size: 117%;"><span id="MJXc-Node-51" class="mjx-math" style="text-indent: 0em;"><span id="MJXc-Node-52" class="mjx-mrow"><span id="MJXc-Node-53" class="mjx-mi"><span class="mjx-char MJXc-TeX-math-I" style="padding-top: 0.491em; padding-bottom: 0.308em; padding-right: 0.003em;">d</span></span><span id="MJXc-Node-54" class="mjx-mi"><span class="mjx-char MJXc-TeX-math-I" style="padding-top: 0.247em; padding-bottom: 0.308em;">a</span></span><span id="MJXc-Node-55" class="mjx-mi"><span class="mjx-char MJXc-TeX-math-I" style="padding-top: 0.247em; padding-bottom: 0.491em; padding-right: 0.006em;">y</span></span></span></span></span><script type="math/mml" id="MathJax-Element-5"><math display="inline" style="text-indent: 0em;" xmlns="http://www.w3.org/1998/Math/MathML"><mi>d</mi><mi>a</mi><mi>y</mi></math></script><!--l.
      98--><span class="MathJax_Preview" style="color: inherit; display: none;"></span><span id="MathJax-Element-6-Frame" class="mjx-chtml MathJax_CHTML" tabindex="0" style="font-size: 117%;"><span id="MJXc-Node-56" class="mjx-math" style="text-indent: 0em;"><span id="MJXc-Node-57" class="mjx-mrow"><span id="MJXc-Node-58" class="mjx-mrow"><span id="MJXc-Node-59" class="mjx-mo"><span class="mjx-char MJXc-TeX-main-R" style="padding-top: 0.491em; padding-bottom: 0.614em;">(</span></span><span id="MJXc-Node-60" class="mjx-mrow"><span id="MJXc-Node-61" class="mjx-mn"><span class="mjx-char MJXc-TeX-main-R" style="padding-top: 0.369em; padding-bottom: 0.369em;">1</span></span><span id="MJXc-Node-62" class="mjx-mo MJXc-space3"><span class="mjx-char MJXc-TeX-main-R" style="padding-top: 0.369em; padding-bottom: 0.491em;">≤</span></span><span id="MJXc-Node-63" class="mjx-mi MJXc-space3"><span class="mjx-char MJXc-TeX-math-I" style="padding-top: 0.491em; padding-bottom: 0.308em; padding-right: 0.003em;">d</span></span><span id="MJXc-Node-64" class="mjx-mo MJXc-space3"><span class="mjx-char MJXc-TeX-main-R" style="padding-top: 0.369em; padding-bottom: 0.491em;">≤</span></span><span id="MJXc-Node-65" class="mjx-mn MJXc-space3"><span class="mjx-char MJXc-TeX-main-R" style="padding-top: 0.369em; padding-bottom: 0.369em;">3</span></span><span id="MJXc-Node-66" class="mjx-mn"><span class="mjx-char MJXc-TeX-main-R" style="padding-top: 0.369em; padding-bottom: 0.369em;">6</span></span><span id="MJXc-Node-67" class="mjx-mn"><span class="mjx-char MJXc-TeX-main-R" style="padding-top: 0.369em; padding-bottom: 0.369em;">5</span></span></span><span id="MJXc-Node-68" class="mjx-mo"><span class="mjx-char MJXc-TeX-main-R" style="padding-top: 0.491em; padding-bottom: 0.614em;">)</span></span></span></span></span></span><script type="math/mml" id="MathJax-Element-6"><math display="inline" style="text-indent: 0em;" xmlns="http://www.w3.org/1998/Math/MathML"><mrow><mo>(</mo><mrow><mn>1</mn>
      <mo>≤</mo> <mi>d</mi> <mo>≤</mo> <mn>3</mn><mn>6</mn><mn>5</mn></mrow><mo>)</mo></mrow></math></script> &nbsp;— номер дня (сквозная
      нумерация с начала календарного года); </li>
      <li>
      <!--l. 100--><span class="MathJax_Preview" style="color: inherit; display: none;"></span><span id="MathJax-Element-7-Frame" class="mjx-chtml MathJax_CHTML" tabindex="0" style="font-size: 117%;"><span id="MJXc-Node-69" class="mjx-math" style="text-indent: 0em;"><span id="MJXc-Node-70" class="mjx-mrow"><span id="MJXc-Node-71" class="mjx-mi"><span class="mjx-char MJXc-TeX-math-I" style="padding-top: 0.491em; padding-bottom: 0.308em;">h</span></span><span id="MJXc-Node-72" class="mjx-mi"><span class="mjx-char MJXc-TeX-math-I" style="padding-top: 0.247em; padding-bottom: 0.308em;">o</span></span><span id="MJXc-Node-73" class="mjx-mi"><span class="mjx-char MJXc-TeX-math-I" style="padding-top: 0.247em; padding-bottom: 0.308em;">u</span></span><span id="MJXc-Node-74" class="mjx-mi"><span class="mjx-char MJXc-TeX-math-I" style="padding-top: 0.247em; padding-bottom: 0.308em;">r</span></span></span></span></span><script type="math/mml" id="MathJax-Element-7"><math display="inline" style="text-indent: 0em;" xmlns="http://www.w3.org/1998/Math/MathML"><mi>h</mi><mi>o</mi><mi>u</mi><mi>r</mi></math></script><!--l.
      100--><span class="MathJax_Preview" style="color: inherit; display: none;"></span><span id="MathJax-Element-8-Frame" class="mjx-chtml MathJax_CHTML" tabindex="0" style="font-size: 117%;"><span id="MJXc-Node-75" class="mjx-math" style="text-indent: 0em;"><span id="MJXc-Node-76" class="mjx-mrow"><span id="MJXc-Node-77" class="mjx-mrow"><span id="MJXc-Node-78" class="mjx-mo"><span class="mjx-char MJXc-TeX-main-R" style="padding-top: 0.491em; padding-bottom: 0.614em;">(</span></span><span id="MJXc-Node-79" class="mjx-mrow"><span id="MJXc-Node-80" class="mjx-mn"><span class="mjx-char MJXc-TeX-main-R" style="padding-top: 0.369em; padding-bottom: 0.369em;">0</span></span><span id="MJXc-Node-81" class="mjx-mo MJXc-space3"><span class="mjx-char MJXc-TeX-main-R" style="padding-top: 0.369em; padding-bottom: 0.491em;">≤</span></span><span id="MJXc-Node-82" class="mjx-mi MJXc-space3"><span class="mjx-char MJXc-TeX-math-I" style="padding-top: 0.491em; padding-bottom: 0.308em;">h</span></span><span id="MJXc-Node-83" class="mjx-mo MJXc-space3"><span class="mjx-char MJXc-TeX-main-R" style="padding-top: 0.247em; padding-bottom: 0.369em;">&lt;</span></span><span id="MJXc-Node-84" class="mjx-mn MJXc-space3"><span class="mjx-char MJXc-TeX-main-R" style="padding-top: 0.369em; padding-bottom: 0.369em;">2</span></span><span id="MJXc-Node-85" class="mjx-mn"><span class="mjx-char MJXc-TeX-main-R" style="padding-top: 0.369em; padding-bottom: 0.369em;">4</span></span></span><span id="MJXc-Node-86" class="mjx-mo"><span class="mjx-char MJXc-TeX-main-R" style="padding-top: 0.491em; padding-bottom: 0.614em;">)</span></span></span></span></span></span><script type="math/mml" id="MathJax-Element-8"><math display="inline" style="text-indent: 0em;" xmlns="http://www.w3.org/1998/Math/MathML"><mrow><mo>(</mo><mrow><mn>0</mn>
      <mo>≤</mo> <mi>h</mi> <mo>&lt;</mo> <mn>2</mn><mn>4</mn></mrow><mo>)</mo></mrow></math></script> &nbsp;— часы; </li>
      <li>
      <!--l. 102--><span class="MathJax_Preview" style="color: inherit; display: none;"></span><span id="MathJax-Element-9-Frame" class="mjx-chtml MathJax_CHTML" tabindex="0" style="font-size: 117%;"><span id="MJXc-Node-87" class="mjx-math" style="text-indent: 0em;"><span id="MJXc-Node-88" class="mjx-mrow"><span id="MJXc-Node-89" class="mjx-mi"><span class="mjx-char MJXc-TeX-math-I" style="padding-top: 0.247em; padding-bottom: 0.308em;">m</span></span><span id="MJXc-Node-90" class="mjx-mi"><span class="mjx-char MJXc-TeX-math-I" style="padding-top: 0.43em; padding-bottom: 0.308em;">i</span></span><span id="MJXc-Node-91" class="mjx-mi"><span class="mjx-char MJXc-TeX-math-I" style="padding-top: 0.247em; padding-bottom: 0.308em;">n</span></span><span id="MJXc-Node-92" class="mjx-mi"><span class="mjx-char MJXc-TeX-math-I" style="padding-top: 0.247em; padding-bottom: 0.308em;">u</span></span><span id="MJXc-Node-93" class="mjx-mi"><span class="mjx-char MJXc-TeX-math-I" style="padding-top: 0.43em; padding-bottom: 0.308em;">t</span></span><span id="MJXc-Node-94" class="mjx-mi"><span class="mjx-char MJXc-TeX-math-I" style="padding-top: 0.247em; padding-bottom: 0.308em;">e</span></span></span></span></span><script type="math/mml" id="MathJax-Element-9"><math display="inline" style="text-indent: 0em;" xmlns="http://www.w3.org/1998/Math/MathML"><mi>m</mi><mi>i</mi><mi>n</mi><mi>u</mi><mi>t</mi><mi>e</mi></math></script><!--l.
      102--><span class="MathJax_Preview" style="color: inherit; display: none;"></span><span id="MathJax-Element-10-Frame" class="mjx-chtml MathJax_CHTML" tabindex="0" style="font-size: 117%;"><span id="MJXc-Node-95" class="mjx-math" style="text-indent: 0em;"><span id="MJXc-Node-96" class="mjx-mrow"><span id="MJXc-Node-97" class="mjx-mrow"><span id="MJXc-Node-98" class="mjx-mo"><span class="mjx-char MJXc-TeX-main-R" style="padding-top: 0.491em; padding-bottom: 0.614em;">(</span></span><span id="MJXc-Node-99" class="mjx-mrow"><span id="MJXc-Node-100" class="mjx-mn"><span class="mjx-char MJXc-TeX-main-R" style="padding-top: 0.369em; padding-bottom: 0.369em;">0</span></span><span id="MJXc-Node-101" class="mjx-mo MJXc-space3"><span class="mjx-char MJXc-TeX-main-R" style="padding-top: 0.369em; padding-bottom: 0.491em;">≤</span></span><span id="MJXc-Node-102" class="mjx-mi MJXc-space3"><span class="mjx-char MJXc-TeX-math-I" style="padding-top: 0.247em; padding-bottom: 0.308em;">m</span></span><span id="MJXc-Node-103" class="mjx-mo MJXc-space3"><span class="mjx-char MJXc-TeX-main-R" style="padding-top: 0.247em; padding-bottom: 0.369em;">&lt;</span></span><span id="MJXc-Node-104" class="mjx-mn MJXc-space3"><span class="mjx-char MJXc-TeX-main-R" style="padding-top: 0.369em; padding-bottom: 0.369em;">6</span></span><span id="MJXc-Node-105" class="mjx-mn"><span class="mjx-char MJXc-TeX-main-R" style="padding-top: 0.369em; padding-bottom: 0.369em;">0</span></span></span><span id="MJXc-Node-106" class="mjx-mo"><span class="mjx-char MJXc-TeX-main-R" style="padding-top: 0.491em; padding-bottom: 0.614em;">)</span></span></span></span></span></span><script type="math/mml" id="MathJax-Element-10"><math display="inline" style="text-indent: 0em;" xmlns="http://www.w3.org/1998/Math/MathML"><mrow><mo>(</mo><mrow><mn>0</mn>
      <mo>≤</mo> <mi>m</mi> <mo>&lt;</mo> <mn>6</mn><mn>0</mn></mrow><mo>)</mo></mrow></math></script> &nbsp;— минуты; </li>
      <li>
      <!--l. 104--><span class="MathJax_Preview" style="color: inherit; display: none;"></span><span id="MathJax-Element-11-Frame" class="mjx-chtml MathJax_CHTML" tabindex="0" style="font-size: 117%;"><span id="MJXc-Node-107" class="mjx-math" style="text-indent: 0em;"><span id="MJXc-Node-108" class="mjx-mrow"><span id="MJXc-Node-109" class="mjx-mi"><span class="mjx-char MJXc-TeX-math-I" style="padding-top: 0.43em; padding-bottom: 0.308em;">i</span></span><span id="MJXc-Node-110" class="mjx-mi"><span class="mjx-char MJXc-TeX-math-I" style="padding-top: 0.491em; padding-bottom: 0.308em; padding-right: 0.003em;">d</span></span></span></span></span><script type="math/mml" id="MathJax-Element-11"><math display="inline" style="text-indent: 0em;" xmlns="http://www.w3.org/1998/Math/MathML"><mi>i</mi><mi>d</mi></math></script><!--l.
      104--><span class="MathJax_Preview" style="color: inherit; display: none;"></span><span id="MathJax-Element-12-Frame" class="mjx-chtml MathJax_CHTML" tabindex="0" style="font-size: 117%;"><span id="MJXc-Node-111" class="mjx-math" style="text-indent: 0em;"><span id="MJXc-Node-112" class="mjx-mrow"><span id="MJXc-Node-113" class="mjx-mrow"><span id="MJXc-Node-114" class="mjx-mo"><span class="mjx-char MJXc-TeX-size1-R" style="padding-top: 0.614em; padding-bottom: 0.614em;">(</span></span><span id="MJXc-Node-115" class="mjx-mrow"><span id="MJXc-Node-116" class="mjx-mn"><span class="mjx-char MJXc-TeX-main-R" style="padding-top: 0.369em; padding-bottom: 0.369em;">0</span></span><span id="MJXc-Node-117" class="mjx-mo MJXc-space3"><span class="mjx-char MJXc-TeX-main-R" style="padding-top: 0.369em; padding-bottom: 0.491em;">≤</span></span><span id="MJXc-Node-118" class="mjx-mi MJXc-space3"><span class="mjx-char MJXc-TeX-math-I" style="padding-top: 0.43em; padding-bottom: 0.308em;">i</span></span><span id="MJXc-Node-119" class="mjx-mi"><span class="mjx-char MJXc-TeX-math-I" style="padding-top: 0.491em; padding-bottom: 0.308em; padding-right: 0.003em;">d</span></span><span id="MJXc-Node-120" class="mjx-mo MJXc-space3"><span class="mjx-char MJXc-TeX-main-R" style="padding-top: 0.369em; padding-bottom: 0.491em;">≤</span></span><span id="MJXc-Node-121" class="mjx-mn MJXc-space3"><span class="mjx-char MJXc-TeX-main-R" style="padding-top: 0.369em; padding-bottom: 0.369em;">1</span></span><span id="MJXc-Node-122" class="mjx-msup"><span class="mjx-base"><span id="MJXc-Node-123" class="mjx-mrow"><span id="MJXc-Node-124" class="mjx-mn"><span class="mjx-char MJXc-TeX-main-R" style="padding-top: 0.369em; padding-bottom: 0.369em;">0</span></span></span></span><span class="mjx-sup" style="font-size: 70.7%; vertical-align: 0.591em; padding-left: 0px; padding-right: 0.071em;"><span id="MJXc-Node-125" class="mjx-mrow" style=""><span id="MJXc-Node-126" class="mjx-mn"><span class="mjx-char MJXc-TeX-main-R" style="padding-top: 0.369em; padding-bottom: 0.369em;">9</span></span></span></span></span></span><span id="MJXc-Node-127" class="mjx-mo"><span class="mjx-char MJXc-TeX-size1-R" style="padding-top: 0.614em; padding-bottom: 0.614em;">)</span></span></span></span></span></span><script type="math/mml" id="MathJax-Element-12"><math display="inline" style="text-indent: 0em;" xmlns="http://www.w3.org/1998/Math/MathML"><mrow><mo>(</mo><mrow><mn>0</mn>
      <mo>≤</mo> <mi>i</mi><mi>d</mi> <mo>≤</mo> <mn>1</mn><msup><mrow><mn>0</mn></mrow><mrow><mn>9</mn></mrow></msup></mrow><mo>)</mo></mrow></math></script>
      &nbsp;— уникальный идентификатор ракеты; </li>
      <li>
      <!--l. 106--><span class="MathJax_Preview" style="color: inherit; display: none;"></span><span id="MathJax-Element-13-Frame" class="mjx-chtml MathJax_CHTML" tabindex="0" style="font-size: 117%;"><span id="MJXc-Node-128" class="mjx-math" style="text-indent: 0em;"><span id="MJXc-Node-129" class="mjx-mrow"><span id="MJXc-Node-130" class="mjx-mi"><span class="mjx-char MJXc-TeX-math-I" style="padding-top: 0.247em; padding-bottom: 0.308em;">s</span></span><span id="MJXc-Node-131" class="mjx-mi"><span class="mjx-char MJXc-TeX-math-I" style="padding-top: 0.43em; padding-bottom: 0.308em;">t</span></span><span id="MJXc-Node-132" class="mjx-mi"><span class="mjx-char MJXc-TeX-math-I" style="padding-top: 0.247em; padding-bottom: 0.308em;">a</span></span><span id="MJXc-Node-133" class="mjx-mi"><span class="mjx-char MJXc-TeX-math-I" style="padding-top: 0.43em; padding-bottom: 0.308em;">t</span></span><span id="MJXc-Node-134" class="mjx-mi"><span class="mjx-char MJXc-TeX-math-I" style="padding-top: 0.247em; padding-bottom: 0.308em;">u</span></span><span id="MJXc-Node-135" class="mjx-mi"><span class="mjx-char MJXc-TeX-math-I" style="padding-top: 0.247em; padding-bottom: 0.308em;">s</span></span><span id="MJXc-Node-136" class="mjx-mo MJXc-space3"><span class="mjx-char MJXc-TeX-main-R" style="padding-top: 0.247em; padding-bottom: 0.369em;">∈</span></span><span id="MJXc-Node-137" class="mjx-mrow MJXc-space3"><span id="MJXc-Node-138" class="mjx-mo"><span class="mjx-char MJXc-TeX-main-R" style="padding-top: 0.491em; padding-bottom: 0.614em;">{</span></span><span id="MJXc-Node-139" class="mjx-mrow"><span id="MJXc-Node-140" class="mjx-mstyle"><span id="MJXc-Node-141" class="mjx-mrow"><span id="MJXc-Node-142" class="mjx-mtext" style=""><span class="mjx-char MJXc-TeX-main-B" style="padding-top: 0.369em; padding-bottom: 0.369em;">A</span></span></span></span><span id="MJXc-Node-143" class="mjx-mo"><span class="mjx-char MJXc-TeX-main-R" style="margin-top: -0.18em; padding-bottom: 0.553em;">,</span></span><span id="MJXc-Node-144" class="mjx-mstyle MJXc-space1"><span id="MJXc-Node-145" class="mjx-mrow"><span id="MJXc-Node-146" class="mjx-mtext" style=""><span class="mjx-char MJXc-TeX-main-B" style="padding-top: 0.369em; padding-bottom: 0.369em;">B</span></span></span></span><span id="MJXc-Node-147" class="mjx-mo"><span class="mjx-char MJXc-TeX-main-R" style="margin-top: -0.18em; padding-bottom: 0.553em;">,</span></span><span id="MJXc-Node-148" class="mjx-mstyle MJXc-space1"><span id="MJXc-Node-149" class="mjx-mrow"><span id="MJXc-Node-150" class="mjx-mtext" style=""><span class="mjx-char MJXc-TeX-main-B" style="padding-top: 0.369em; padding-bottom: 0.369em;">S</span></span></span></span><span id="MJXc-Node-151" class="mjx-mo"><span class="mjx-char MJXc-TeX-main-R" style="margin-top: -0.18em; padding-bottom: 0.553em;">,</span></span><span id="MJXc-Node-152" class="mjx-mstyle MJXc-space1"><span id="MJXc-Node-153" class="mjx-mrow"><span id="MJXc-Node-154" class="mjx-mtext" style=""><span class="mjx-char MJXc-TeX-main-B" style="padding-top: 0.369em; padding-bottom: 0.369em;">C</span></span></span></span></span><span id="MJXc-Node-155" class="mjx-mo"><span class="mjx-char MJXc-TeX-main-R" style="padding-top: 0.491em; padding-bottom: 0.614em;">}</span></span></span></span></span></span><script type="math/mml" id="MathJax-Element-13"><math display="inline" style="text-indent: 0em;" xmlns="http://www.w3.org/1998/Math/MathML"><mi>s</mi><mi>t</mi><mi>a</mi><mi>t</mi><mi>u</mi><mi>s</mi>
      <mo>∈</mo><mrow><mo>{</mo><mrow><mstyle><mtext mathvariant="bold" style="font-weight: bold;">A</mtext></mstyle><mo>,</mo><mstyle><mtext mathvariant="bold" style="font-weight: bold;">B</mtext></mstyle><mo>,</mo><mstyle><mtext mathvariant="bold" style="font-weight:
      bold;">S</mtext></mstyle><mo>,</mo><mstyle><mtext mathvariant="bold" style="font-weight: bold;">C</mtext></mstyle></mrow><mo>}</mo></mrow></math></script>
      &nbsp;— буква, обозначающая тип события. </li>
      </ul>
      <p></p>

   </div>
   <h2>Формат вывода</h2>
   <div class="output-specification"> В единственной строке выведите через пробел суммарное время движения на заказах для каждой упомянутой в логе ракеты. Данные
      необходимо выводить в порядке возрастания идентификаторов ракет. 
   </div>
   <h2>Пример</h2>
   <table class="sample-tests">
      <thead>
         <tr>
            <th>Ввод<div class="problem__copy-sample"><button class="button button_theme_pseudo button_size_s button_only-icon_yes problem__copy-button problem__copy-button_type_input i-bem" data-bem="{&quot;button&quot;:{}}" role="button" type="button" title="Скопировать ввод"><span class="button__text">&nbsp;<img class="image button__icon button__icon_role_copy" src="//yastatic.net/lego/_/La6qi18Z8LwgnZdsAr1qy1GwCwo.gif" alt="Скопировать ввод"></span></button></div></th>
            <th>Вывод<div class="problem__copy-sample"><button class="button button_theme_pseudo button_size_s button_only-icon_yes problem__copy-button problem__copy-button_type_output i-bem" data-bem="{&quot;button&quot;:{}}" role="button" type="button" title="Скопировать вывод"><span class="button__text">&nbsp;<img class="image button__icon button__icon_role_copy" src="//yastatic.net/lego/_/La6qi18Z8LwgnZdsAr1qy1GwCwo.gif" alt="Скопировать вывод"></span></button></div></th>
         </tr>
      </thead>
      <tbody>
         <tr>
            <td><pre>8
50 7 25 3632 A
14 23 52 212372 S
15 0 5 3632 C
14 21 30 212372 A
50 7 26 3632 C
14 21 30 3632 A
14 21 40 212372 B
14 23 52 3632 B
</pre></td>
            <td><pre>156 142
</pre></td>
         </tr>
      </tbody>
   </table>
   <h2>Примечания</h2>
   <div class="notes"><span style="font-weight: bold;">Ракета №3632</span><ol style="list-style-type: decimal;">
      <li>в 14-й день года в 21:30 получила заказ (шестая запись в логе); </li>
      <li>забрала пассажира в 23:52 того же дня (восьмая запись в логе); </li>
      <li>после чего заказ был отменён в 15-й день года в 00:05 (третья запись в логе); </li>
      <li>в 50-й день года в 7:25 получила заказ (первая запись в логе); </li>
      <li>заказ был отменён уже через минуту (четвёртая запись в логе).</li>
      </ol>
      <!--l. 124-->
      <p style="text-indent: 0em;">Таким образом ракета №3632 провела в движении с 14-го дня 21:30 до 15-го дня 00:05 и с 50-го
      дня 7:25 до 50-го дня 7:26 — всего <!--l. 124--><span class="MathJax_Preview" style="color: inherit; display: none;"></span><span id="MathJax-Element-14-Frame" class="mjx-chtml MathJax_CHTML" tabindex="0" style="font-size: 117%;"><span id="MJXc-Node-156" class="mjx-math" style="text-indent: 0em;"><span id="MJXc-Node-157" class="mjx-mrow"><span id="MJXc-Node-158" class="mjx-mn"><span class="mjx-char MJXc-TeX-main-R" style="padding-top: 0.369em; padding-bottom: 0.369em;">1</span></span><span id="MJXc-Node-159" class="mjx-mn"><span class="mjx-char MJXc-TeX-main-R" style="padding-top: 0.369em; padding-bottom: 0.369em;">5</span></span><span id="MJXc-Node-160" class="mjx-mn"><span class="mjx-char MJXc-TeX-main-R" style="padding-top: 0.369em; padding-bottom: 0.369em;">6</span></span></span></span></span><script type="math/mml" id="MathJax-Element-14"><math display="inline" style="text-indent: 0em;" xmlns="http://www.w3.org/1998/Math/MathML"><mn>1</mn><mn>5</mn><mn>6</mn></math></script>
      минут. <!--l. 126-->
      </p><p style="text-indent: 0em;"><span style="font-weight: bold;">Ракета №212372</span></p><ol style="list-style-type: decimal;">
      <li>в 14-й день года в 21:30 получила заказ (третья запись в логе); </li>
      <li>через 10 минут забрала пассажира (седьмая запись в логе); </li>
      <li>в 23:52 прибыла на место назначения (вторая запись в логе).</li>
      </ol>
      <!--l. 134-->
      <p style="text-indent: 0em;">Всего ракета №212372 провела в движении с 14-го дня 21:30 до 14-го дня 23:52 — <!--l. 134--><span class="MathJax_Preview" style="color: inherit; display: none;"></span><span id="MathJax-Element-15-Frame" class="mjx-chtml MathJax_CHTML" tabindex="0" style="font-size: 117%;"><span id="MJXc-Node-161" class="mjx-math" style="text-indent: 0em;"><span id="MJXc-Node-162" class="mjx-mrow"><span id="MJXc-Node-163" class="mjx-mn"><span class="mjx-char MJXc-TeX-main-R" style="padding-top: 0.369em; padding-bottom: 0.369em;">1</span></span><span id="MJXc-Node-164" class="mjx-mn"><span class="mjx-char MJXc-TeX-main-R" style="padding-top: 0.369em; padding-bottom: 0.369em;">4</span></span><span id="MJXc-Node-165" class="mjx-mn"><span class="mjx-char MJXc-TeX-main-R" style="padding-top: 0.369em; padding-bottom: 0.369em;">2</span></span></span></span></span><script type="math/mml" id="MathJax-Element-15"><math display="inline" style="text-indent: 0em;" xmlns="http://www.w3.org/1998/Math/MathML"><mn>1</mn><mn>4</mn><mn>2</mn></math></script>
      минуты. </p>
      <p></p>
      <p></p>

   </div>
</div></div>