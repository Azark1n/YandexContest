<div class="problem__statement text" data-bem="{&quot;problem__statement&quot;:{}}">
<div class="problem-statement">
   <div class="header">
      <h1 class="title">E. Иван и opensource</h1>
      <table>
         <tbody><tr class="time-limit">
            <td class="property-title">Ограничение времени</td>
            <td>5&nbsp;секунд</td>
         </tr>
         <tr class="memory-limit">
            <td class="property-title">Ограничение памяти</td>
            <td>512Mb</td>
         </tr>
         <tr class="input-file">
            <td class="property-title">Ввод</td>
            <td colspan="1">стандартный ввод или input.txt</td>
         </tr>
         <tr class="output-file">
            <td class="property-title">Вывод</td>
            <td colspan="1">стандартный вывод или output.txt</td>
         </tr>
      </tbody></table>
   </div>
   <h2></h2>
   <div class="legend"> В ходе решения рабочей задачи программист Иван написал библиотеку, которая показалась ему полезной и для сообщества. Обсудив
      детали с руководителем и получив согласие, он решил выложить её в opensource. Но рабочий репозиторий содержит файлы, описывающие
      внутреннюю кухню, а их, как известно, нельзя выкладывать за пределы монорепозитория компании. <!--l. 51-->
      <p style="text-indent: 0em;">Иван убедился, что на работу библиотеки эти файлы никак не влияют. Поэтому Иван решил автоматически
      удалить их из библиотеки. У него есть список файлов, относящихся к библиотеке, а также чёрный список, содержащий пути ко внутренним
      файлам репозитория. Далее Иван собирается удалить все файлы библиотеки, которые находятся в директориях из чёрного списка.
      <!--l. 53-->
      </p><p style="text-indent: 0em;">Вам же необходимо написать программу, которая соберёт статистику по удалённым файлам из директорий.
      </p>
      <p></p>

   </div>
   <h2>Формат ввода</h2>
   <div class="input-specification"> В первой строке входных данных записано целое число <!--l. 56--><span class="MathJax_Preview" style="color: inherit; display: none;"></span><span id="MathJax-Element-1-Frame" class="mjx-chtml MathJax_CHTML" tabindex="0" style="font-size: 117%;"><span id="MJXc-Node-1" class="mjx-math" style="text-indent: 0em;"><span id="MJXc-Node-2" class="mjx-mrow"><span id="MJXc-Node-3" class="mjx-mi"><span class="mjx-char MJXc-TeX-math-I" style="padding-top: 0.247em; padding-bottom: 0.308em;">n</span></span></span></span></span><script type="math/mml" id="MathJax-Element-1"><math display="inline" style="text-indent: 0em;" xmlns="http://www.w3.org/1998/Math/MathML"><mi>n</mi></math></script>
      (<!--l. 56--><span class="MathJax_Preview" style="color: inherit; display: none;"></span><span id="MathJax-Element-2-Frame" class="mjx-chtml MathJax_CHTML" tabindex="0" style="font-size: 117%;"><span id="MJXc-Node-4" class="mjx-math" style="text-indent: 0em;"><span id="MJXc-Node-5" class="mjx-mrow"><span id="MJXc-Node-6" class="mjx-mn"><span class="mjx-char MJXc-TeX-main-R" style="padding-top: 0.369em; padding-bottom: 0.369em;">1</span></span><span id="MJXc-Node-7" class="mjx-mo MJXc-space3"><span class="mjx-char MJXc-TeX-main-R" style="padding-top: 0.369em; padding-bottom: 0.491em;">≤</span></span><span id="MJXc-Node-8" class="mjx-mi MJXc-space3"><span class="mjx-char MJXc-TeX-math-I" style="padding-top: 0.247em; padding-bottom: 0.308em;">n</span></span><span id="MJXc-Node-9" class="mjx-mo MJXc-space3"><span class="mjx-char MJXc-TeX-main-R" style="padding-top: 0.369em; padding-bottom: 0.491em;">≤</span></span><span id="MJXc-Node-10" class="mjx-mn MJXc-space3"><span class="mjx-char MJXc-TeX-main-R" style="padding-top: 0.369em; padding-bottom: 0.369em;">1</span></span><span id="MJXc-Node-11" class="mjx-mn"><span class="mjx-char MJXc-TeX-main-R" style="padding-top: 0.369em; padding-bottom: 0.369em;">0</span></span><span id="MJXc-Node-12" class="mjx-mspace" style="width: 0.3em; height: 0px;"></span><span id="MJXc-Node-13" class="mjx-mn"><span class="mjx-char MJXc-TeX-main-R" style="padding-top: 0.369em; padding-bottom: 0.369em;">0</span></span><span id="MJXc-Node-14" class="mjx-mn"><span class="mjx-char MJXc-TeX-main-R" style="padding-top: 0.369em; padding-bottom: 0.369em;">0</span></span><span id="MJXc-Node-15" class="mjx-mn"><span class="mjx-char MJXc-TeX-main-R" style="padding-top: 0.369em; padding-bottom: 0.369em;">0</span></span></span></span></span><script type="math/mml" id="MathJax-Element-2"><math display="inline" style="text-indent: 0em;" xmlns="http://www.w3.org/1998/Math/MathML"><mn>1</mn> <mo>≤</mo>
      <mi>n</mi> <mo>≤</mo> <mn>1</mn><mn>0</mn><mspace width="0.3em"><mn>0</mn><mn>0</mn><mn>0</mn></mspace></math></script>). <!--l. 58-->
      <p style="text-indent: 0em;">В следующих <!--l. 58--><span class="MathJax_Preview" style="color: inherit; display: none;"></span><span id="MathJax-Element-3-Frame" class="mjx-chtml MathJax_CHTML" tabindex="0" style="font-size: 117%;"><span id="MJXc-Node-16" class="mjx-math" style="text-indent: 0em;"><span id="MJXc-Node-17" class="mjx-mrow"><span id="MJXc-Node-18" class="mjx-mi"><span class="mjx-char MJXc-TeX-math-I" style="padding-top: 0.247em; padding-bottom: 0.308em;">n</span></span></span></span></span><script type="math/mml" id="MathJax-Element-3"><math display="inline" style="text-indent: 0em;" xmlns="http://www.w3.org/1998/Math/MathML"><mi>n</mi></math></script>
      строках указаны директории из чёрного списка (могут повторяться). Директорией является или строка <span style="font-family:
      monospace;">/</span>, или строка вида <span style="font-family: monospace;">&lt;dir&gt;&lt;folder&gt;/</span>, где <span style="font-family:
      monospace;">&lt;dir&gt;</span>&nbsp;— это строка, также являющаяся директорией, а <span style="font-family: monospace;">&lt;folder&gt;</span>&nbsp;—
      это непустая строка из строчных латинских букв, цифр или символа <span style="font-family: monospace;">_</span>. Например,
      <span style="font-family: monospace;">/</span>, <span style="font-family: monospace;">/abcd/</span>, <span style="font-family:
      monospace;">/_0kda/sasw/</span>&nbsp;— корректные директории, а <span style="font-family: monospace;">/asds</span>, <span style="font-family: monospace;">/sds/v.c</span>, <span style="font-family: monospace;">/asd//ds/</span>&nbsp;— некорректные
      директории. <!--l. 60-->
      </p><p style="text-indent: 0em;">Затем записано целое число <!--l. 60--><span class="MathJax_Preview" style="color: inherit; display: none;"></span><span id="MathJax-Element-4-Frame" class="mjx-chtml MathJax_CHTML" tabindex="0" style="font-size: 117%;"><span id="MJXc-Node-19" class="mjx-math" style="text-indent: 0em;"><span id="MJXc-Node-20" class="mjx-mrow"><span id="MJXc-Node-21" class="mjx-mi"><span class="mjx-char MJXc-TeX-math-I" style="padding-top: 0.247em; padding-bottom: 0.308em;">m</span></span></span></span></span><script type="math/mml" id="MathJax-Element-4"><math display="inline" style="text-indent: 0em;" xmlns="http://www.w3.org/1998/Math/MathML"><mi>m</mi></math></script>
      (<!--l. 60--><span class="MathJax_Preview" style="color: inherit; display: none;"></span><span id="MathJax-Element-5-Frame" class="mjx-chtml MathJax_CHTML" tabindex="0" style="font-size: 117%;"><span id="MJXc-Node-22" class="mjx-math" style="text-indent: 0em;"><span id="MJXc-Node-23" class="mjx-mrow"><span id="MJXc-Node-24" class="mjx-mn"><span class="mjx-char MJXc-TeX-main-R" style="padding-top: 0.369em; padding-bottom: 0.369em;">1</span></span><span id="MJXc-Node-25" class="mjx-mo MJXc-space3"><span class="mjx-char MJXc-TeX-main-R" style="padding-top: 0.369em; padding-bottom: 0.491em;">≤</span></span><span id="MJXc-Node-26" class="mjx-mi MJXc-space3"><span class="mjx-char MJXc-TeX-math-I" style="padding-top: 0.247em; padding-bottom: 0.308em;">m</span></span><span id="MJXc-Node-27" class="mjx-mo MJXc-space3"><span class="mjx-char MJXc-TeX-main-R" style="padding-top: 0.369em; padding-bottom: 0.491em;">≤</span></span><span id="MJXc-Node-28" class="mjx-mn MJXc-space3"><span class="mjx-char MJXc-TeX-main-R" style="padding-top: 0.369em; padding-bottom: 0.369em;">1</span></span><span id="MJXc-Node-29" class="mjx-mn"><span class="mjx-char MJXc-TeX-main-R" style="padding-top: 0.369em; padding-bottom: 0.369em;">0</span></span><span id="MJXc-Node-30" class="mjx-mspace" style="width: 0.3em; height: 0px;"></span><span id="MJXc-Node-31" class="mjx-mn"><span class="mjx-char MJXc-TeX-main-R" style="padding-top: 0.369em; padding-bottom: 0.369em;">0</span></span><span id="MJXc-Node-32" class="mjx-mn"><span class="mjx-char MJXc-TeX-main-R" style="padding-top: 0.369em; padding-bottom: 0.369em;">0</span></span><span id="MJXc-Node-33" class="mjx-mn"><span class="mjx-char MJXc-TeX-main-R" style="padding-top: 0.369em; padding-bottom: 0.369em;">0</span></span></span></span></span><script type="math/mml" id="MathJax-Element-5"><math display="inline" style="text-indent: 0em;" xmlns="http://www.w3.org/1998/Math/MathML"><mn>1</mn> <mo>≤</mo>
      <mi>m</mi> <mo>≤</mo> <mn>1</mn><mn>0</mn><mspace width="0.3em"><mn>0</mn><mn>0</mn><mn>0</mn></mspace></math></script>). <!--l. 62-->
      </p><p style="text-indent: 0em;">В следующих <!--l. 62--><span class="MathJax_Preview" style="color: inherit; display: none;"></span><span id="MathJax-Element-6-Frame" class="mjx-chtml MathJax_CHTML" tabindex="0" style="font-size: 117%;"><span id="MJXc-Node-34" class="mjx-math" style="text-indent: 0em;"><span id="MJXc-Node-35" class="mjx-mrow"><span id="MJXc-Node-36" class="mjx-mi"><span class="mjx-char MJXc-TeX-math-I" style="padding-top: 0.247em; padding-bottom: 0.308em;">m</span></span></span></span></span><script type="math/mml" id="MathJax-Element-6"><math display="inline" style="text-indent: 0em;" xmlns="http://www.w3.org/1998/Math/MathML"><mi>m</mi></math></script>
      строках указаны пути к файлам библиотеки без повторений. Путь к файлу имеет вид <span style="font-family: monospace;">&lt;dir&gt;&lt;fullName&gt;</span>,
      где <span style="font-family: monospace;">&lt;fullName&gt; </span>является конкатенацией непустых строк <span style="font-family:
      monospace;">&lt;name&gt; </span>и <span style="font-family: monospace;">&lt;ext&gt;</span>. Строка <span style="font-family:
      monospace;">&lt;name&gt; </span>состоит из строчных латинских букв, цифр и символа <span style="font-family: monospace;">_</span>.
      Строка <span style="font-family: monospace;">&lt;ext&gt; </span>начинается с точки, после которой следуют <!--l. 62--><span class="MathJax_Preview" style="color: inherit; display: none;"></span><span id="MathJax-Element-7-Frame" class="mjx-chtml MathJax_CHTML" tabindex="0" style="font-size: 117%;"><span id="MJXc-Node-37" class="mjx-math" style="text-indent: 0em;"><span id="MJXc-Node-38" class="mjx-mrow"><span id="MJXc-Node-39" class="mjx-mi"><span class="mjx-char MJXc-TeX-math-I" style="padding-top: 0.247em; padding-bottom: 0.308em;">c</span></span></span></span></span><script type="math/mml" id="MathJax-Element-7"><math display="inline" style="text-indent: 0em;" xmlns="http://www.w3.org/1998/Math/MathML"><mi>c</mi></math></script> строчных латинских
      букв <!--l. 62--><span class="MathJax_Preview" style="color: inherit; display: none;"></span><span id="MathJax-Element-8-Frame" class="mjx-chtml MathJax_CHTML" tabindex="0" style="font-size: 117%;"><span id="MJXc-Node-40" class="mjx-math" style="text-indent: 0em;"><span id="MJXc-Node-41" class="mjx-mrow"><span id="MJXc-Node-42" class="mjx-mrow"><span id="MJXc-Node-43" class="mjx-mo"><span class="mjx-char MJXc-TeX-main-R" style="padding-top: 0.491em; padding-bottom: 0.614em;">(</span></span><span id="MJXc-Node-44" class="mjx-mrow"><span id="MJXc-Node-45" class="mjx-mn"><span class="mjx-char MJXc-TeX-main-R" style="padding-top: 0.369em; padding-bottom: 0.369em;">1</span></span><span id="MJXc-Node-46" class="mjx-mo MJXc-space3"><span class="mjx-char MJXc-TeX-main-R" style="padding-top: 0.369em; padding-bottom: 0.491em;">≤</span></span><span id="MJXc-Node-47" class="mjx-mi MJXc-space3"><span class="mjx-char MJXc-TeX-math-I" style="padding-top: 0.247em; padding-bottom: 0.308em;">c</span></span><span id="MJXc-Node-48" class="mjx-mo MJXc-space3"><span class="mjx-char MJXc-TeX-main-R" style="padding-top: 0.369em; padding-bottom: 0.491em;">≤</span></span><span id="MJXc-Node-49" class="mjx-mn MJXc-space3"><span class="mjx-char MJXc-TeX-main-R" style="padding-top: 0.369em; padding-bottom: 0.369em;">3</span></span></span><span id="MJXc-Node-50" class="mjx-mo"><span class="mjx-char MJXc-TeX-main-R" style="padding-top: 0.491em; padding-bottom: 0.614em;">)</span></span></span></span></span></span><script type="math/mml" id="MathJax-Element-8"><math display="inline" style="text-indent: 0em;" xmlns="http://www.w3.org/1998/Math/MathML"><mrow><mo>(</mo><mrow><mn>1</mn>
      <mo>≤</mo> <mi>c</mi> <mo>≤</mo> <mn>3</mn></mrow><mo>)</mo></mrow></math></script>. Например, <span style="font-family: monospace;">/asd/d.txt</span>,
      <span style="font-family: monospace;">/a.q</span>, <span style="font-family: monospace;">/a/b/c/d.efg</span>&nbsp;— корректные
      пути к файлам, а <span style="font-family: monospace;">/asd/d</span>, <span style="font-family: monospace;">/a/b/c.d.e</span>&nbsp;—
      некорректные пути к файлам. <!--l. 64-->
      </p><p style="text-indent: 0em;">Далее записано целое число <!--l. 64--><span class="MathJax_Preview" style="color: inherit; display: none;"></span><span id="MathJax-Element-9-Frame" class="mjx-chtml MathJax_CHTML" tabindex="0" style="font-size: 117%;"><span id="MJXc-Node-51" class="mjx-math" style="text-indent: 0em;"><span id="MJXc-Node-52" class="mjx-mrow"><span id="MJXc-Node-53" class="mjx-mi"><span class="mjx-char MJXc-TeX-math-I" style="padding-top: 0.247em; padding-bottom: 0.491em; padding-right: 0.014em;">q</span></span></span></span></span><script type="math/mml" id="MathJax-Element-9"><math display="inline" style="text-indent: 0em;" xmlns="http://www.w3.org/1998/Math/MathML"><mi>q</mi></math></script>
      (<!--l. 64--><span class="MathJax_Preview" style="color: inherit; display: none;"></span><span id="MathJax-Element-10-Frame" class="mjx-chtml MathJax_CHTML" tabindex="0" style="font-size: 117%;"><span id="MJXc-Node-54" class="mjx-math" style="text-indent: 0em;"><span id="MJXc-Node-55" class="mjx-mrow"><span id="MJXc-Node-56" class="mjx-mn"><span class="mjx-char MJXc-TeX-main-R" style="padding-top: 0.369em; padding-bottom: 0.369em;">1</span></span><span id="MJXc-Node-57" class="mjx-mo MJXc-space3"><span class="mjx-char MJXc-TeX-main-R" style="padding-top: 0.369em; padding-bottom: 0.491em;">≤</span></span><span id="MJXc-Node-58" class="mjx-mi MJXc-space3"><span class="mjx-char MJXc-TeX-math-I" style="padding-top: 0.247em; padding-bottom: 0.491em; padding-right: 0.014em;">q</span></span><span id="MJXc-Node-59" class="mjx-mo MJXc-space3"><span class="mjx-char MJXc-TeX-main-R" style="padding-top: 0.369em; padding-bottom: 0.491em;">≤</span></span><span id="MJXc-Node-60" class="mjx-mn MJXc-space3"><span class="mjx-char MJXc-TeX-main-R" style="padding-top: 0.369em; padding-bottom: 0.369em;">1</span></span><span id="MJXc-Node-61" class="mjx-mn"><span class="mjx-char MJXc-TeX-main-R" style="padding-top: 0.369em; padding-bottom: 0.369em;">0</span></span><span id="MJXc-Node-62" class="mjx-mspace" style="width: 0.3em; height: 0px;"></span><span id="MJXc-Node-63" class="mjx-mn"><span class="mjx-char MJXc-TeX-main-R" style="padding-top: 0.369em; padding-bottom: 0.369em;">0</span></span><span id="MJXc-Node-64" class="mjx-mn"><span class="mjx-char MJXc-TeX-main-R" style="padding-top: 0.369em; padding-bottom: 0.369em;">0</span></span><span id="MJXc-Node-65" class="mjx-mn"><span class="mjx-char MJXc-TeX-main-R" style="padding-top: 0.369em; padding-bottom: 0.369em;">0</span></span></span></span></span><script type="math/mml" id="MathJax-Element-10"><math display="inline" style="text-indent: 0em;" xmlns="http://www.w3.org/1998/Math/MathML"><mn>1</mn> <mo>≤</mo>
      <mi>q</mi> <mo>≤</mo> <mn>1</mn><mn>0</mn><mspace width="0.3em"><mn>0</mn><mn>0</mn><mn>0</mn></mspace></math></script>)&nbsp;— количество
      запросов. <!--l. 66-->
      </p><p style="text-indent: 0em;">В следующих <!--l. 66--><span class="MathJax_Preview" style="color: inherit; display: none;"></span><span id="MathJax-Element-11-Frame" class="mjx-chtml MathJax_CHTML" tabindex="0" style="font-size: 117%;"><span id="MJXc-Node-66" class="mjx-math" style="text-indent: 0em;"><span id="MJXc-Node-67" class="mjx-mrow"><span id="MJXc-Node-68" class="mjx-mi"><span class="mjx-char MJXc-TeX-math-I" style="padding-top: 0.247em; padding-bottom: 0.491em; padding-right: 0.014em;">q</span></span></span></span></span><script type="math/mml" id="MathJax-Element-11"><math display="inline" style="text-indent: 0em;" xmlns="http://www.w3.org/1998/Math/MathML"><mi>q</mi></math></script>
      строках указаны директории (могут повторяться), на каждую из которых необходимо в дальнейшем собрать статистику. <!--l. 68-->
      </p><p style="text-indent: 0em;">Суммарно в тестовых данных не более <!--l. 68--><span class="MathJax_Preview" style="color: inherit; display: none;"></span><span id="MathJax-Element-12-Frame" class="mjx-chtml MathJax_CHTML" tabindex="0" style="font-size: 117%;"><span id="MJXc-Node-69" class="mjx-math" style="text-indent: 0em;"><span id="MJXc-Node-70" class="mjx-mrow"><span id="MJXc-Node-71" class="mjx-mn"><span class="mjx-char MJXc-TeX-main-R" style="padding-top: 0.369em; padding-bottom: 0.369em;">5</span></span><span id="MJXc-Node-72" class="mjx-mn"><span class="mjx-char MJXc-TeX-main-R" style="padding-top: 0.369em; padding-bottom: 0.369em;">0</span></span><span id="MJXc-Node-73" class="mjx-mn"><span class="mjx-char MJXc-TeX-main-R" style="padding-top: 0.369em; padding-bottom: 0.369em;">0</span></span><span id="MJXc-Node-74" class="mjx-mspace" style="width: 0.3em; height: 0px;"></span><span id="MJXc-Node-75" class="mjx-mn"><span class="mjx-char MJXc-TeX-main-R" style="padding-top: 0.369em; padding-bottom: 0.369em;">0</span></span><span id="MJXc-Node-76" class="mjx-mn"><span class="mjx-char MJXc-TeX-main-R" style="padding-top: 0.369em; padding-bottom: 0.369em;">0</span></span><span id="MJXc-Node-77" class="mjx-mn"><span class="mjx-char MJXc-TeX-main-R" style="padding-top: 0.369em; padding-bottom: 0.369em;">0</span></span></span></span></span><script type="math/mml" id="MathJax-Element-12"><math display="inline" style="text-indent:
      0em;" xmlns="http://www.w3.org/1998/Math/MathML"><mn>5</mn><mn>0</mn><mn>0</mn><mspace width="0.3em"><mn>0</mn><mn>0</mn><mn>0</mn></mspace></math></script>
      символов. </p>
      <p></p>
      <p></p>
      <p></p>
      <p></p>
      <p></p>

   </div>
   <h2>Формат вывода</h2>
   <div class="output-specification"> Для каждого запроса сначала выведите целое число&nbsp;— количество различных расширений файлов, удалённых по этому запросу.
      Затем для каждого расширения <span style="font-family: monospace;">&lt;ext&gt; </span>укажите количество <span style="font-family:
      monospace;">&lt;count&gt; </span>удалённых файлов данного расширения в формате <span style="font-family: monospace;">&lt;ext&gt;:</span><span style="font-family: monospace;">&nbsp;&lt;count&gt;</span>. Порядок вывода расширений неважен. 
   </div>
   <h3>Пример 1</h3>
   <table class="sample-tests">
      <thead>
         <tr>
            <th>Ввод<div class="problem__copy-sample"><button class="button button_theme_pseudo button_size_s button_only-icon_yes problem__copy-button problem__copy-button_type_input i-bem" data-bem="{&quot;button&quot;:{}}" role="button" type="button" title="Скопировать ввод"><span class="button__text">&nbsp;<img class="image button__icon button__icon_role_copy" src="//yastatic.net/lego/_/La6qi18Z8LwgnZdsAr1qy1GwCwo.gif" alt="Скопировать ввод"></span></button></div></th>
            <th>Вывод<div class="problem__copy-sample"><button class="button button_theme_pseudo button_size_s button_only-icon_yes problem__copy-button problem__copy-button_type_output i-bem" data-bem="{&quot;button&quot;:{}}" role="button" type="button" title="Скопировать вывод"><span class="button__text">&nbsp;<img class="image button__icon button__icon_role_copy" src="//yastatic.net/lego/_/La6qi18Z8LwgnZdsAr1qy1GwCwo.gif" alt="Скопировать вывод"></span></button></div></th>
         </tr>
      </thead>
      <tbody>
         <tr>
            <td><pre>2
/project/internal/
/project/docs/
5
/project/docs/internal.md
/project/lib/header.cpp
/project/lib/header.h
/project/bin/main.cpp
/project/internal/secret.h
3
/
/project/internal/
/project/lib/
</pre></td>
            <td><pre>2
.md: 1
.h: 1
1
.h: 1
0
</pre></td>
         </tr>
      </tbody>
   </table>
   <h3>Пример 2</h3>
   <table class="sample-tests">
      <thead>
         <tr>
            <th>Ввод<div class="problem__copy-sample"><button class="button button_theme_pseudo button_size_s button_only-icon_yes problem__copy-button problem__copy-button_type_input i-bem" data-bem="{&quot;button&quot;:{}}" role="button" type="button" title="Скопировать ввод"><span class="button__text">&nbsp;<img class="image button__icon button__icon_role_copy" src="//yastatic.net/lego/_/La6qi18Z8LwgnZdsAr1qy1GwCwo.gif" alt="Скопировать ввод"></span></button></div></th>
            <th>Вывод<div class="problem__copy-sample"><button class="button button_theme_pseudo button_size_s button_only-icon_yes problem__copy-button problem__copy-button_type_output i-bem" data-bem="{&quot;button&quot;:{}}" role="button" type="button" title="Скопировать вывод"><span class="button__text">&nbsp;<img class="image button__icon button__icon_role_copy" src="//yastatic.net/lego/_/La6qi18Z8LwgnZdsAr1qy1GwCwo.gif" alt="Скопировать вывод"></span></button></div></th>
         </tr>
      </thead>
      <tbody>
         <tr>
            <td><pre>2
/lib/folder_1/
/lib/folder_2/folder_3/
7
/lib/a.cpp
/lib/folder_2/b.cpp
/lib/folder_1/c.cpp
/lib/folder_2/folder_4/d.cpp
/lib/folder_1/folder_5/e.cpp
/lib/folder_2/folder_3/folder_6/f.py
/lib/folder_2/folder_3/g.cpp
3
/lib/
/lib/folder_1/
/lib/folder_2/
</pre></td>
            <td><pre>2
.cpp: 3
.py: 1
1
.cpp: 2
2
.py: 1
.cpp: 1
</pre></td>
         </tr>
      </tbody>
   </table>
</div></div>