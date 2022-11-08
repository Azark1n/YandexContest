<div class="problem__statement text" data-bem="{&quot;problem__statement&quot;:{}}">
<div class="problem-statement">
   <div class="header">
      <h1 class="title">E. Камень, ножницы, бумага</h1>
      <table>
         <tbody><tr class="time-limit">
            <td class="property-title">Ограничение времени</td>
            <td>2&nbsp;секунды</td>
         </tr>
         <tr class="memory-limit">
            <td class="property-title">Ограничение памяти</td>
            <td>256Mb</td>
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
   <div class="legend">
      <!--l. 48-->
      <p style="text-indent: 0em;"><span style="font-weight: bold;">Полное решение будет оценено в 10 баллов.</span><!--l. 50-->
      </p><p style="text-indent: 0em;">На факультатив по математике к Васиному папе ходит <!--l. 50--><span class="MathJax_Preview" style="color: inherit; display: none;"></span><span id="MathJax-Element-1-Frame" class="mjx-chtml MathJax_CHTML" tabindex="0" style="font-size: 117%;"><span id="MJXc-Node-1" class="mjx-math" style="text-indent: 0em;"><span id="MJXc-Node-2" class="mjx-mrow"><span id="MJXc-Node-3" class="mjx-mi"><span class="mjx-char MJXc-TeX-math-I" style="padding-top: 0.247em; padding-bottom: 0.308em;">n</span></span></span></span></span><script type="math/mml" id="MathJax-Element-1"><math display="inline" style="text-indent:
      0em;" xmlns="http://www.w3.org/1998/Math/MathML"><mi>n</mi></math></script> человек. На занятии по теории игр ребята должны были сыграть
      много партий в игру «Камень, ножницы, бумага». Играли они, правда, нестандартным образом: каждый из ребят выбрал элемент (камень,
      ножницы или бумагу) и во всех играх показывал именно этот символ. <!--l. 52-->
      </p><p style="text-indent: 0em;">Петр, старший брат Васи, решил узнать, какой элемент выбрал каждый игрок. Для этого он <!--l.
      52--><span class="MathJax_Preview" style="color: inherit; display: none;"></span><span id="MathJax-Element-2-Frame" class="mjx-chtml MathJax_CHTML" tabindex="0" style="font-size: 117%;"><span id="MJXc-Node-4" class="mjx-math" style="text-indent: 0em;"><span id="MJXc-Node-5" class="mjx-mrow"><span id="MJXc-Node-6" class="mjx-mi"><span class="mjx-char MJXc-TeX-math-I" style="padding-top: 0.247em; padding-bottom: 0.491em; padding-right: 0.014em;">q</span></span></span></span></span><script type="math/mml" id="MathJax-Element-2"><math display="inline" style="text-indent: 0em;" xmlns="http://www.w3.org/1998/Math/MathML"><mi>q</mi></math></script> раз подходил
      к одному из ребят (обозначим <!--l. 52--><span class="MathJax_Preview" style="color: inherit; display: none;"></span><span id="MathJax-Element-3-Frame" class="mjx-chtml MathJax_CHTML" tabindex="0" style="font-size: 117%;"><span id="MJXc-Node-7" class="mjx-math" style="text-indent: 0em;"><span id="MJXc-Node-8" class="mjx-mrow"><span id="MJXc-Node-9" class="mjx-mi"><span class="mjx-char MJXc-TeX-math-I" style="padding-top: 0.43em; padding-bottom: 0.308em;">i</span></span></span></span></span><script type="math/mml" id="MathJax-Element-3"><math display="inline" style="text-indent: 0em;" xmlns="http://www.w3.org/1998/Math/MathML"><mi>i</mi></math></script>-го
      из них числом <!--l. 52--><span class="MathJax_Preview" style="color: inherit; display: none;"></span><span id="MathJax-Element-4-Frame" class="mjx-chtml MathJax_CHTML" tabindex="0" style="font-size: 117%;"><span id="MJXc-Node-10" class="mjx-math" style="text-indent: 0em;"><span id="MJXc-Node-11" class="mjx-mrow"><span id="MJXc-Node-12" class="mjx-msub"><span class="mjx-base"><span id="MJXc-Node-13" class="mjx-mrow"><span id="MJXc-Node-14" class="mjx-mi"><span class="mjx-char MJXc-TeX-math-I" style="padding-top: 0.247em; padding-bottom: 0.308em;">u</span></span></span></span><span class="mjx-sub" style="font-size: 70.7%; vertical-align: -0.212em; padding-right: 0.071em;"><span id="MJXc-Node-15" class="mjx-mrow" style=""><span id="MJXc-Node-16" class="mjx-mi"><span class="mjx-char MJXc-TeX-math-I" style="padding-top: 0.43em; padding-bottom: 0.308em;">i</span></span></span></span></span></span></span></span><script type="math/mml" id="MathJax-Element-4"><math display="inline" style="text-indent: 0em;" xmlns="http://www.w3.org/1998/Math/MathML"><msub><mrow><mi>u</mi></mrow><mrow><mi>i</mi></mrow></msub></math></script>)
      и спрашивал: «Когда вы сыграли с человеком <!--l. 52--><span class="MathJax_Preview" style="color: inherit; display: none;"></span><span id="MathJax-Element-5-Frame" class="mjx-chtml MathJax_CHTML" tabindex="0" style="font-size: 117%;"><span id="MJXc-Node-17" class="mjx-math" style="text-indent: 0em;"><span id="MJXc-Node-18" class="mjx-mrow"><span id="MJXc-Node-19" class="mjx-msub"><span class="mjx-base"><span id="MJXc-Node-20" class="mjx-mrow"><span id="MJXc-Node-21" class="mjx-mi"><span class="mjx-char MJXc-TeX-math-I" style="padding-top: 0.247em; padding-bottom: 0.308em;">v</span></span></span></span><span class="mjx-sub" style="font-size: 70.7%; vertical-align: -0.212em; padding-right: 0.071em;"><span id="MJXc-Node-22" class="mjx-mrow" style=""><span id="MJXc-Node-23" class="mjx-mi"><span class="mjx-char MJXc-TeX-math-I" style="padding-top: 0.43em; padding-bottom: 0.308em;">i</span></span></span></span></span></span></span></span><script type="math/mml" id="MathJax-Element-5"><math display="inline" style="text-indent: 0em;" xmlns="http://www.w3.org/1998/Math/MathML"><msub><mrow><mi>v</mi></mrow><mrow><mi>i</mi></mrow></msub></math></script>,
      кто из вас победил?». На это он получал один из трех ответов: победа игрока <!--l. 52--><span class="MathJax_Preview" style="color: inherit; display: none;"></span><span id="MathJax-Element-6-Frame" class="mjx-chtml MathJax_CHTML" tabindex="0" style="font-size: 117%;"><span id="MJXc-Node-24" class="mjx-math" style="text-indent: 0em;"><span id="MJXc-Node-25" class="mjx-mrow"><span id="MJXc-Node-26" class="mjx-msub"><span class="mjx-base"><span id="MJXc-Node-27" class="mjx-mrow"><span id="MJXc-Node-28" class="mjx-mi"><span class="mjx-char MJXc-TeX-math-I" style="padding-top: 0.247em; padding-bottom: 0.308em;">u</span></span></span></span><span class="mjx-sub" style="font-size: 70.7%; vertical-align: -0.212em; padding-right: 0.071em;"><span id="MJXc-Node-29" class="mjx-mrow" style=""><span id="MJXc-Node-30" class="mjx-mi"><span class="mjx-char MJXc-TeX-math-I" style="padding-top: 0.43em; padding-bottom: 0.308em;">i</span></span></span></span></span></span></span></span><script type="math/mml" id="MathJax-Element-6"><math display="inline" style="text-indent:
      0em;" xmlns="http://www.w3.org/1998/Math/MathML"><msub><mrow><mi>u</mi></mrow><mrow><mi>i</mi></mrow></msub></math></script>, ничья,
      поражение (победа игрока <!--l. 52--><span class="MathJax_Preview" style="color: inherit; display: none;"></span><span id="MathJax-Element-7-Frame" class="mjx-chtml MathJax_CHTML" tabindex="0" style="font-size: 117%;"><span id="MJXc-Node-31" class="mjx-math" style="text-indent: 0em;"><span id="MJXc-Node-32" class="mjx-mrow"><span id="MJXc-Node-33" class="mjx-msub"><span class="mjx-base"><span id="MJXc-Node-34" class="mjx-mrow"><span id="MJXc-Node-35" class="mjx-mi"><span class="mjx-char MJXc-TeX-math-I" style="padding-top: 0.247em; padding-bottom: 0.308em;">v</span></span></span></span><span class="mjx-sub" style="font-size: 70.7%; vertical-align: -0.212em; padding-right: 0.071em;"><span id="MJXc-Node-36" class="mjx-mrow" style=""><span id="MJXc-Node-37" class="mjx-mi"><span class="mjx-char MJXc-TeX-math-I" style="padding-top: 0.43em; padding-bottom: 0.308em;">i</span></span></span></span></span></span></span></span><script type="math/mml" id="MathJax-Element-7"><math display="inline" style="text-indent: 0em;" xmlns="http://www.w3.org/1998/Math/MathML"><msub><mrow><mi>v</mi></mrow><mrow><mi>i</mi></mrow></msub></math></script>).
      Затем Петр записывал ответ игрока <!--l. 52--><span class="MathJax_Preview" style="color: inherit; display: none;"></span><span id="MathJax-Element-8-Frame" class="mjx-chtml MathJax_CHTML" tabindex="0" style="font-size: 117%;"><span id="MJXc-Node-38" class="mjx-math" style="text-indent: 0em;"><span id="MJXc-Node-39" class="mjx-mrow"><span id="MJXc-Node-40" class="mjx-msub"><span class="mjx-base"><span id="MJXc-Node-41" class="mjx-mrow"><span id="MJXc-Node-42" class="mjx-mi"><span class="mjx-char MJXc-TeX-math-I" style="padding-top: 0.247em; padding-bottom: 0.308em;">u</span></span></span></span><span class="mjx-sub" style="font-size: 70.7%; vertical-align: -0.212em; padding-right: 0.071em;"><span id="MJXc-Node-43" class="mjx-mrow" style=""><span id="MJXc-Node-44" class="mjx-mi"><span class="mjx-char MJXc-TeX-math-I" style="padding-top: 0.43em; padding-bottom: 0.308em;">i</span></span></span></span></span></span></span></span><script type="math/mml" id="MathJax-Element-8"><math display="inline" style="text-indent: 0em;" xmlns="http://www.w3.org/1998/Math/MathML"><msub><mrow><mi>u</mi></mrow><mrow><mi>i</mi></mrow></msub></math></script>
      в блокнот. <!--l. 54-->
      </p><p style="text-indent: 0em;">Анализируя свои записи, Петр заинтересовался возможными наборами выбранных ребятами символов.
      Для каждой записи в блокнот Петр захотел определить, сколько существует корректных ответов на вопрос: «Какой элемент выбрал
      каждый человек?». Ответ является корректным, если все записи до текущей включительно не противоречат ему. Два ответа являются
      различными тогда и только тогда, когда существует человек, который в этих двух ответах выбрал разные элементы. <!--l. 56-->
      </p><p style="text-indent: 0em;">Основываясь на данных из блокнота, помогите Петру посчитать необходимое количество ответов
      после каждого вопроса. Возможно такое, что данные в блокноте записаны неверно, из-за чего количество корректных ответов равно
      нулю. Ответы могут быть очень большими, поэтому выведите их по модулю <!--l. 56--><span class="MathJax_Preview" style="color: inherit; display: none;"></span><span id="MathJax-Element-9-Frame" class="mjx-chtml MathJax_CHTML" tabindex="0" style="font-size: 117%;"><span id="MJXc-Node-45" class="mjx-math" style="text-indent: 0em;"><span id="MJXc-Node-46" class="mjx-mrow"><span id="MJXc-Node-47" class="mjx-mn"><span class="mjx-char MJXc-TeX-main-R" style="padding-top: 0.369em; padding-bottom: 0.369em;">1</span></span><span id="MJXc-Node-48" class="mjx-mn"><span class="mjx-char MJXc-TeX-main-R" style="padding-top: 0.369em; padding-bottom: 0.369em;">0</span></span><span id="MJXc-Node-49" class="mjx-mn"><span class="mjx-char MJXc-TeX-main-R" style="padding-top: 0.369em; padding-bottom: 0.369em;">0</span></span><span id="MJXc-Node-50" class="mjx-mn"><span class="mjx-char MJXc-TeX-main-R" style="padding-top: 0.369em; padding-bottom: 0.369em;">0</span></span><span id="MJXc-Node-51" class="mjx-mn"><span class="mjx-char MJXc-TeX-main-R" style="padding-top: 0.369em; padding-bottom: 0.369em;">0</span></span><span id="MJXc-Node-52" class="mjx-mn"><span class="mjx-char MJXc-TeX-main-R" style="padding-top: 0.369em; padding-bottom: 0.369em;">0</span></span><span id="MJXc-Node-53" class="mjx-mn"><span class="mjx-char MJXc-TeX-main-R" style="padding-top: 0.369em; padding-bottom: 0.369em;">0</span></span><span id="MJXc-Node-54" class="mjx-mn"><span class="mjx-char MJXc-TeX-main-R" style="padding-top: 0.369em; padding-bottom: 0.369em;">0</span></span><span id="MJXc-Node-55" class="mjx-mn"><span class="mjx-char MJXc-TeX-main-R" style="padding-top: 0.369em; padding-bottom: 0.369em;">0</span></span><span id="MJXc-Node-56" class="mjx-mn"><span class="mjx-char MJXc-TeX-main-R" style="padding-top: 0.369em; padding-bottom: 0.369em;">7</span></span></span></span></span><script type="math/mml" id="MathJax-Element-9"><math display="inline" style="text-indent:
      0em;" xmlns="http://www.w3.org/1998/Math/MathML"><mn>1</mn><mn>0</mn><mn>0</mn><mn>0</mn><mn>0</mn><mn>0</mn><mn>0</mn><mn>0</mn><mn>0</mn><mn>7</mn></math></script><!--l.
      56--><span class="MathJax_Preview" style="color: inherit; display: none;"></span><span id="MathJax-Element-10-Frame" class="mjx-chtml MathJax_CHTML" tabindex="0" style="font-size: 117%;"><span id="MJXc-Node-57" class="mjx-math" style="text-indent: 0em;"><span id="MJXc-Node-58" class="mjx-mrow"><span id="MJXc-Node-59" class="mjx-mrow"><span id="MJXc-Node-60" class="mjx-mo"><span class="mjx-char MJXc-TeX-size1-R" style="padding-top: 0.614em; padding-bottom: 0.614em;">(</span></span><span id="MJXc-Node-61" class="mjx-mrow"><span id="MJXc-Node-62" class="mjx-mn"><span class="mjx-char MJXc-TeX-main-R" style="padding-top: 0.369em; padding-bottom: 0.369em;">1</span></span><span id="MJXc-Node-63" class="mjx-msup"><span class="mjx-base"><span id="MJXc-Node-64" class="mjx-mrow"><span id="MJXc-Node-65" class="mjx-mn"><span class="mjx-char MJXc-TeX-main-R" style="padding-top: 0.369em; padding-bottom: 0.369em;">0</span></span></span></span><span class="mjx-sup" style="font-size: 70.7%; vertical-align: 0.591em; padding-left: 0px; padding-right: 0.071em;"><span id="MJXc-Node-66" class="mjx-mrow" style=""><span id="MJXc-Node-67" class="mjx-mn"><span class="mjx-char MJXc-TeX-main-R" style="padding-top: 0.369em; padding-bottom: 0.369em;">9</span></span></span></span></span><span id="MJXc-Node-68" class="mjx-mo MJXc-space2"><span class="mjx-char MJXc-TeX-main-R" style="padding-top: 0.308em; padding-bottom: 0.43em;">+</span></span><span id="MJXc-Node-69" class="mjx-mn MJXc-space2"><span class="mjx-char MJXc-TeX-main-R" style="padding-top: 0.369em; padding-bottom: 0.369em;">7</span></span></span><span id="MJXc-Node-70" class="mjx-mo"><span class="mjx-char MJXc-TeX-size1-R" style="padding-top: 0.614em; padding-bottom: 0.614em;">)</span></span></span></span></span></span><script type="math/mml" id="MathJax-Element-10"><math display="inline" style="text-indent: 0em;" xmlns="http://www.w3.org/1998/Math/MathML"><mrow><mo>(</mo><mrow><mn>1</mn><msup><mrow><mn>0</mn></mrow><mrow><mn>9</mn></mrow></msup>
      <mo>+</mo> <mn>7</mn></mrow><mo>)</mo></mrow></math></script>. <!--l. 58-->
      </p><p style="text-indent: 0em;">Игрок, который выбрал камень, побеждает игрока, который выбрал ножницы, проигрывает игроку,
      который выбрал бумагу, и играет вничью с игроком, который выбрал камень. <!--l. 60-->
      </p><p style="text-indent: 0em;">Игрок, который выбрал ножницы, побеждает игрока, который выбрал бумагу, проигрывает игроку,
      который выбрал камень, и играет вничью с игроком, который выбрал ножницы. <!--l. 62-->
      </p><p style="text-indent: 0em;">Игрок, который выбрал бумагу, побеждает игрока, который выбрал камень, проигрывает игроку,
      который выбрал ножницы, и играет вничью с игроком, который выбрал бумагу. </p>
      <p></p>
      <p></p>
      <p></p>
      <p></p>
      <p></p>
      <p></p>
      <p></p>

   </div>
   <h2>Формат ввода</h2>
   <div class="input-specification">
      <!--l. 67-->
      <p style="text-indent: 0em;">Первая строка содержит два целых положительных числа <!--l. 67--><span class="MathJax_Preview" style="color: inherit; display: none;"></span><span id="MathJax-Element-11-Frame" class="mjx-chtml MathJax_CHTML" tabindex="0" style="font-size: 117%;"><span id="MJXc-Node-71" class="mjx-math" style="text-indent: 0em;"><span id="MJXc-Node-72" class="mjx-mrow"><span id="MJXc-Node-73" class="mjx-mi"><span class="mjx-char MJXc-TeX-math-I" style="padding-top: 0.247em; padding-bottom: 0.308em;">n</span></span></span></span></span><script type="math/mml" id="MathJax-Element-11"><math display="inline" style="text-indent:
      0em;" xmlns="http://www.w3.org/1998/Math/MathML"><mi>n</mi></math></script> и <!--l. 67--><span class="MathJax_Preview" style="color: inherit; display: none;"></span><span id="MathJax-Element-12-Frame" class="mjx-chtml MathJax_CHTML" tabindex="0" style="font-size: 117%;"><span id="MJXc-Node-74" class="mjx-math" style="text-indent: 0em;"><span id="MJXc-Node-75" class="mjx-mrow"><span id="MJXc-Node-76" class="mjx-mi"><span class="mjx-char MJXc-TeX-math-I" style="padding-top: 0.247em; padding-bottom: 0.491em; padding-right: 0.014em;">q</span></span></span></span></span><script type="math/mml" id="MathJax-Element-12"><math display="inline" style="text-indent:
      0em;" xmlns="http://www.w3.org/1998/Math/MathML"><mi>q</mi></math></script><!--l. 67--><span class="MathJax_Preview" style="color: inherit; display: none;"></span><span id="MathJax-Element-13-Frame" class="mjx-chtml MathJax_CHTML" tabindex="0" style="font-size: 117%;"><span id="MJXc-Node-77" class="mjx-math" style="text-indent: 0em;"><span id="MJXc-Node-78" class="mjx-mrow"><span id="MJXc-Node-79" class="mjx-mrow"><span id="MJXc-Node-80" class="mjx-mo"><span class="mjx-char MJXc-TeX-size1-R" style="padding-top: 0.614em; padding-bottom: 0.614em;">(</span></span><span id="MJXc-Node-81" class="mjx-mrow"><span id="MJXc-Node-82" class="mjx-mn"><span class="mjx-char MJXc-TeX-main-R" style="padding-top: 0.369em; padding-bottom: 0.369em;">1</span></span><span id="MJXc-Node-83" class="mjx-mo MJXc-space3"><span class="mjx-char MJXc-TeX-main-R" style="padding-top: 0.369em; padding-bottom: 0.491em;">≤</span></span><span id="MJXc-Node-84" class="mjx-mi MJXc-space3"><span class="mjx-char MJXc-TeX-math-I" style="padding-top: 0.247em; padding-bottom: 0.308em;">n</span></span><span id="MJXc-Node-85" class="mjx-mo"><span class="mjx-char MJXc-TeX-main-R" style="margin-top: -0.18em; padding-bottom: 0.553em;">,</span></span><span id="MJXc-Node-86" class="mjx-mi MJXc-space1"><span class="mjx-char MJXc-TeX-math-I" style="padding-top: 0.247em; padding-bottom: 0.491em; padding-right: 0.014em;">q</span></span><span id="MJXc-Node-87" class="mjx-mo MJXc-space3"><span class="mjx-char MJXc-TeX-main-R" style="padding-top: 0.369em; padding-bottom: 0.491em;">≤</span></span><span id="MJXc-Node-88" class="mjx-mn MJXc-space3"><span class="mjx-char MJXc-TeX-main-R" style="padding-top: 0.369em; padding-bottom: 0.369em;">1</span></span><span id="MJXc-Node-89" class="mjx-msup"><span class="mjx-base"><span id="MJXc-Node-90" class="mjx-mrow"><span id="MJXc-Node-91" class="mjx-mn"><span class="mjx-char MJXc-TeX-main-R" style="padding-top: 0.369em; padding-bottom: 0.369em;">0</span></span></span></span><span class="mjx-sup" style="font-size: 70.7%; vertical-align: 0.591em; padding-left: 0px; padding-right: 0.071em;"><span id="MJXc-Node-92" class="mjx-mrow" style=""><span id="MJXc-Node-93" class="mjx-mn"><span class="mjx-char MJXc-TeX-main-R" style="padding-top: 0.369em; padding-bottom: 0.369em;">5</span></span></span></span></span></span><span id="MJXc-Node-94" class="mjx-mo"><span class="mjx-char MJXc-TeX-size1-R" style="padding-top: 0.614em; padding-bottom: 0.614em;">)</span></span></span></span></span></span><script type="math/mml" id="MathJax-Element-13"><math display="inline" style="text-indent: 0em;" xmlns="http://www.w3.org/1998/Math/MathML"><mrow><mo>(</mo><mrow><mn>1</mn> <mo>≤</mo> <mi>n</mi><mo>,</mo><mi>q</mi> <mo>≤</mo>
      <mn>1</mn><msup><mrow><mn>0</mn></mrow><mrow><mn>5</mn></mrow></msup></mrow><mo>)</mo></mrow></math></script>. <!--l. 69-->
      </p><p style="text-indent: 0em;">Далее следуют <!--l. 69--><span class="MathJax_Preview" style="color: inherit; display: none;"></span><span id="MathJax-Element-14-Frame" class="mjx-chtml MathJax_CHTML" tabindex="0" style="font-size: 117%;"><span id="MJXc-Node-95" class="mjx-math" style="text-indent: 0em;"><span id="MJXc-Node-96" class="mjx-mrow"><span id="MJXc-Node-97" class="mjx-mi"><span class="mjx-char MJXc-TeX-math-I" style="padding-top: 0.247em; padding-bottom: 0.491em; padding-right: 0.014em;">q</span></span></span></span></span><script type="math/mml" id="MathJax-Element-14"><math display="inline" style="text-indent: 0em;" xmlns="http://www.w3.org/1998/Math/MathML"><mi>q</mi></math></script>
      строк, каждая из которых содержит два целых неотрицательных числа <!--l. 69--><span class="MathJax_Preview" style="color: inherit; display: none;"></span><span id="MathJax-Element-15-Frame" class="mjx-chtml MathJax_CHTML" tabindex="0" style="font-size: 117%;"><span id="MJXc-Node-98" class="mjx-math" style="text-indent: 0em;"><span id="MJXc-Node-99" class="mjx-mrow"><span id="MJXc-Node-100" class="mjx-mi"><span class="mjx-char MJXc-TeX-math-I" style="padding-top: 0.247em; padding-bottom: 0.308em;">u</span></span></span></span></span><script type="math/mml" id="MathJax-Element-15"><math display="inline" style="text-indent: 0em;" xmlns="http://www.w3.org/1998/Math/MathML"><mi>u</mi></math></script>, <!--l. 69--><span class="MathJax_Preview" style="color: inherit; display: none;"></span><span id="MathJax-Element-16-Frame" class="mjx-chtml MathJax_CHTML" tabindex="0" style="font-size: 117%;"><span id="MJXc-Node-101" class="mjx-math" style="text-indent: 0em;"><span id="MJXc-Node-102" class="mjx-mrow"><span id="MJXc-Node-103" class="mjx-mi"><span class="mjx-char MJXc-TeX-math-I" style="padding-top: 0.247em; padding-bottom: 0.308em;">v</span></span></span></span></span><script type="math/mml" id="MathJax-Element-16"><math display="inline" style="text-indent: 0em;" xmlns="http://www.w3.org/1998/Math/MathML"><mi>v</mi></math></script> и символ <!--l. 69--><span class="MathJax_Preview" style="color: inherit; display: none;"></span><span id="MathJax-Element-17-Frame" class="mjx-chtml MathJax_CHTML" tabindex="0" style="font-size: 117%;"><span id="MJXc-Node-104" class="mjx-math" style="text-indent: 0em;"><span id="MJXc-Node-105" class="mjx-mrow"><span id="MJXc-Node-106" class="mjx-mi"><span class="mjx-char MJXc-TeX-math-I" style="padding-top: 0.247em; padding-bottom: 0.308em;">r</span></span></span></span></span><script type="math/mml" id="MathJax-Element-17"><math display="inline" style="text-indent:
      0em;" xmlns="http://www.w3.org/1998/Math/MathML"><mi>r</mi></math></script><!--l. 69--><span class="MathJax_Preview" style="color: inherit; display: none;"></span><span id="MathJax-Element-18-Frame" class="mjx-chtml MathJax_CHTML" tabindex="0" style="font-size: 117%;"><span id="MJXc-Node-107" class="mjx-math" style="text-indent: 0em;"><span id="MJXc-Node-108" class="mjx-mrow"><span id="MJXc-Node-109" class="mjx-mspace" style="width: 1em; height: 0px;"></span><span id="MJXc-Node-110" class="mjx-mrow"><span id="MJXc-Node-111" class="mjx-mo"><span class="mjx-char MJXc-TeX-main-R" style="padding-top: 0.491em; padding-bottom: 0.614em;">(</span></span><span id="MJXc-Node-112" class="mjx-mrow"><span id="MJXc-Node-113" class="mjx-mn"><span class="mjx-char MJXc-TeX-main-R" style="padding-top: 0.369em; padding-bottom: 0.369em;">1</span></span><span id="MJXc-Node-114" class="mjx-mo MJXc-space3"><span class="mjx-char MJXc-TeX-main-R" style="padding-top: 0.369em; padding-bottom: 0.491em;">≤</span></span><span id="MJXc-Node-115" class="mjx-mi MJXc-space3"><span class="mjx-char MJXc-TeX-math-I" style="padding-top: 0.247em; padding-bottom: 0.308em;">u</span></span><span id="MJXc-Node-116" class="mjx-mo"><span class="mjx-char MJXc-TeX-main-R" style="margin-top: -0.18em; padding-bottom: 0.553em;">,</span></span><span id="MJXc-Node-117" class="mjx-mi MJXc-space1"><span class="mjx-char MJXc-TeX-math-I" style="padding-top: 0.247em; padding-bottom: 0.308em;">v</span></span><span id="MJXc-Node-118" class="mjx-mo MJXc-space3"><span class="mjx-char MJXc-TeX-main-R" style="padding-top: 0.369em; padding-bottom: 0.491em;">≤</span></span><span id="MJXc-Node-119" class="mjx-mi MJXc-space3"><span class="mjx-char MJXc-TeX-math-I" style="padding-top: 0.247em; padding-bottom: 0.308em;">n</span></span><span id="MJXc-Node-120" class="mjx-mo"><span class="mjx-char MJXc-TeX-main-R" style="margin-top: -0.18em; padding-bottom: 0.553em;">,</span></span><span id="MJXc-Node-121" class="mjx-mi MJXc-space1"><span class="mjx-char MJXc-TeX-math-I" style="padding-top: 0.247em; padding-bottom: 0.308em;">r</span></span><span id="MJXc-Node-122" class="mjx-mo MJXc-space3"><span class="mjx-char MJXc-TeX-main-R" style="padding-top: 0.247em; padding-bottom: 0.369em;">∈</span></span><span id="MJXc-Node-123" class="mjx-mrow MJXc-space3"><span id="MJXc-Node-124" class="mjx-mo"><span class="mjx-char MJXc-TeX-main-R" style="padding-top: 0.491em; padding-bottom: 0.614em;">{</span></span><span id="MJXc-Node-125" class="mjx-mrow"><span id="MJXc-Node-126" class="mjx-mi"><span class="mjx-char MJXc-TeX-math-I" style="padding-top: 0.491em; padding-bottom: 0.308em; padding-right: 0.104em;">W</span></span><span id="MJXc-Node-127" class="mjx-mo"><span class="mjx-char MJXc-TeX-main-R" style="margin-top: -0.18em; padding-bottom: 0.553em;">,</span></span><span id="MJXc-Node-128" class="mjx-mi MJXc-space1"><span class="mjx-char MJXc-TeX-math-I" style="padding-top: 0.491em; padding-bottom: 0.308em;">L</span></span><span id="MJXc-Node-129" class="mjx-mo"><span class="mjx-char MJXc-TeX-main-R" style="margin-top: -0.18em; padding-bottom: 0.553em;">,</span></span><span id="MJXc-Node-130" class="mjx-mi MJXc-space1"><span class="mjx-char MJXc-TeX-math-I" style="padding-top: 0.491em; padding-bottom: 0.308em;">D</span></span></span><span id="MJXc-Node-131" class="mjx-mo"><span class="mjx-char MJXc-TeX-main-R" style="padding-top: 0.491em; padding-bottom: 0.614em;">}</span></span></span></span><span id="MJXc-Node-132" class="mjx-mo"><span class="mjx-char MJXc-TeX-main-R" style="padding-top: 0.491em; padding-bottom: 0.614em;">)</span></span></span></span></span></span><script type="math/mml" id="MathJax-Element-18"><math display="inline" style="text-indent: 0em;" xmlns="http://www.w3.org/1998/Math/MathML"><mspace width="1em"><mrow><mo>(</mo><mrow><mn>1</mn> <mo>≤</mo> <mi>u</mi><mo>,</mo><mi>v</mi>
      <mo>≤</mo> <mi>n</mi><mo>,</mo><mi>r</mi> <mo>∈</mo><mrow><mo>{</mo><mrow><mi>W</mi><mo>,</mo><mi>L</mi><mo>,</mo><mi>D</mi></mrow><mo>}</mo></mrow></mrow><mo>)</mo></mrow></mspace></math></script>.
      Если <!--l. 69--><span class="MathJax_Preview" style="color: inherit; display: none;"></span><span id="MathJax-Element-19-Frame" class="mjx-chtml MathJax_CHTML" tabindex="0" style="font-size: 117%;"><span id="MJXc-Node-133" class="mjx-math" style="text-indent: 0em;"><span id="MJXc-Node-134" class="mjx-mrow"><span id="MJXc-Node-135" class="mjx-mi"><span class="mjx-char MJXc-TeX-math-I" style="padding-top: 0.247em; padding-bottom: 0.308em;">r</span></span><span id="MJXc-Node-136" class="mjx-mo MJXc-space3"><span class="mjx-char MJXc-TeX-main-R" style="padding-top: 0.064em; padding-bottom: 0.308em;">=</span></span><span id="MJXc-Node-137" class="mjx-mi MJXc-space3"><span class="mjx-char MJXc-TeX-math-I" style="padding-top: 0.491em; padding-bottom: 0.308em; padding-right: 0.104em;">W</span></span></span></span></span><script type="math/mml" id="MathJax-Element-19"><math display="inline" style="text-indent: 0em;" xmlns="http://www.w3.org/1998/Math/MathML"><mi>r</mi> <mo>=</mo>
      <mi>W</mi></math></script>, то <!--l. 69--><span class="MathJax_Preview" style="color: inherit; display: none;"></span><span id="MathJax-Element-20-Frame" class="mjx-chtml MathJax_CHTML" tabindex="0" style="font-size: 117%;"><span id="MJXc-Node-138" class="mjx-math" style="text-indent: 0em;"><span id="MJXc-Node-139" class="mjx-mrow"><span id="MJXc-Node-140" class="mjx-mi"><span class="mjx-char MJXc-TeX-math-I" style="padding-top: 0.247em; padding-bottom: 0.308em;">u</span></span></span></span></span><script type="math/mml" id="MathJax-Element-20"><math display="inline" style="text-indent: 0em;" xmlns="http://www.w3.org/1998/Math/MathML"><mi>u</mi></math></script>
      побеждает <!--l. 69--><span class="MathJax_Preview" style="color: inherit; display: none;"></span><span id="MathJax-Element-21-Frame" class="mjx-chtml MathJax_CHTML" tabindex="0" style="font-size: 117%;"><span id="MJXc-Node-141" class="mjx-math" style="text-indent: 0em;"><span id="MJXc-Node-142" class="mjx-mrow"><span id="MJXc-Node-143" class="mjx-mi"><span class="mjx-char MJXc-TeX-math-I" style="padding-top: 0.247em; padding-bottom: 0.308em;">v</span></span></span></span></span><script type="math/mml" id="MathJax-Element-21"><math display="inline" style="text-indent: 0em;" xmlns="http://www.w3.org/1998/Math/MathML"><mi>v</mi></math></script>,
      если <!--l. 69--><span class="MathJax_Preview" style="color: inherit; display: none;"></span><span id="MathJax-Element-22-Frame" class="mjx-chtml MathJax_CHTML" tabindex="0" style="font-size: 117%;"><span id="MJXc-Node-144" class="mjx-math" style="text-indent: 0em;"><span id="MJXc-Node-145" class="mjx-mrow"><span id="MJXc-Node-146" class="mjx-mi"><span class="mjx-char MJXc-TeX-math-I" style="padding-top: 0.247em; padding-bottom: 0.308em;">r</span></span><span id="MJXc-Node-147" class="mjx-mo MJXc-space3"><span class="mjx-char MJXc-TeX-main-R" style="padding-top: 0.064em; padding-bottom: 0.308em;">=</span></span><span id="MJXc-Node-148" class="mjx-mi MJXc-space3"><span class="mjx-char MJXc-TeX-math-I" style="padding-top: 0.491em; padding-bottom: 0.308em;">L</span></span></span></span></span><script type="math/mml" id="MathJax-Element-22"><math display="inline" style="text-indent: 0em;" xmlns="http://www.w3.org/1998/Math/MathML"><mi>r</mi> <mo>=</mo>
      <mi>L</mi></math></script>, то <!--l. 69--><span class="MathJax_Preview" style="color: inherit; display: none;"></span><span id="MathJax-Element-23-Frame" class="mjx-chtml MathJax_CHTML" tabindex="0" style="font-size: 117%;"><span id="MJXc-Node-149" class="mjx-math" style="text-indent: 0em;"><span id="MJXc-Node-150" class="mjx-mrow"><span id="MJXc-Node-151" class="mjx-mi"><span class="mjx-char MJXc-TeX-math-I" style="padding-top: 0.247em; padding-bottom: 0.308em;">v</span></span></span></span></span><script type="math/mml" id="MathJax-Element-23"><math display="inline" style="text-indent: 0em;" xmlns="http://www.w3.org/1998/Math/MathML"><mi>v</mi></math></script>
      побеждает <!--l. 69--><span class="MathJax_Preview" style="color: inherit; display: none;"></span><span id="MathJax-Element-24-Frame" class="mjx-chtml MathJax_CHTML" tabindex="0" style="font-size: 117%;"><span id="MJXc-Node-152" class="mjx-math" style="text-indent: 0em;"><span id="MJXc-Node-153" class="mjx-mrow"><span id="MJXc-Node-154" class="mjx-mi"><span class="mjx-char MJXc-TeX-math-I" style="padding-top: 0.247em; padding-bottom: 0.308em;">u</span></span></span></span></span><script type="math/mml" id="MathJax-Element-24"><math display="inline" style="text-indent: 0em;" xmlns="http://www.w3.org/1998/Math/MathML"><mi>u</mi></math></script>,
      если <!--l. 69--><span class="MathJax_Preview" style="color: inherit; display: none;"></span><span id="MathJax-Element-25-Frame" class="mjx-chtml MathJax_CHTML" tabindex="0" style="font-size: 117%;"><span id="MJXc-Node-155" class="mjx-math" style="text-indent: 0em;"><span id="MJXc-Node-156" class="mjx-mrow"><span id="MJXc-Node-157" class="mjx-mi"><span class="mjx-char MJXc-TeX-math-I" style="padding-top: 0.247em; padding-bottom: 0.308em;">r</span></span><span id="MJXc-Node-158" class="mjx-mo MJXc-space3"><span class="mjx-char MJXc-TeX-main-R" style="padding-top: 0.064em; padding-bottom: 0.308em;">=</span></span><span id="MJXc-Node-159" class="mjx-mi MJXc-space3"><span class="mjx-char MJXc-TeX-math-I" style="padding-top: 0.491em; padding-bottom: 0.308em;">D</span></span></span></span></span><script type="math/mml" id="MathJax-Element-25"><math display="inline" style="text-indent: 0em;" xmlns="http://www.w3.org/1998/Math/MathML"><mi>r</mi> <mo>=</mo>
      <mi>D</mi></math></script>, то они сыграют вничью. </p>
      <p></p>

   </div>
   <h2>Формат вывода</h2>
   <div class="output-specification">
      <!--l. 74-->
      <p style="text-indent: 0em;">Выведите <!--l. 74--><span class="MathJax_Preview" style="color: inherit; display: none;"></span><span id="MathJax-Element-26-Frame" class="mjx-chtml MathJax_CHTML" tabindex="0" style="font-size: 117%;"><span id="MJXc-Node-160" class="mjx-math" style="text-indent: 0em;"><span id="MJXc-Node-161" class="mjx-mrow"><span id="MJXc-Node-162" class="mjx-mi"><span class="mjx-char MJXc-TeX-math-I" style="padding-top: 0.247em; padding-bottom: 0.491em; padding-right: 0.014em;">q</span></span></span></span></span><script type="math/mml" id="MathJax-Element-26"><math display="inline" style="text-indent: 0em;" xmlns="http://www.w3.org/1998/Math/MathML"><mi>q</mi></math></script>
      строк, каждая из которых содержит одно целое неотрицательное число&nbsp;— ответ на вопрос о количестве корректных ответов
      по модулю <!--l. 74--><span class="MathJax_Preview" style="color: inherit; display: none;"></span><span id="MathJax-Element-27-Frame" class="mjx-chtml MathJax_CHTML" tabindex="0" style="font-size: 117%;"><span id="MJXc-Node-163" class="mjx-math" style="text-indent: 0em;"><span id="MJXc-Node-164" class="mjx-mrow"><span id="MJXc-Node-165" class="mjx-mn"><span class="mjx-char MJXc-TeX-main-R" style="padding-top: 0.369em; padding-bottom: 0.369em;">1</span></span><span id="MJXc-Node-166" class="mjx-msup"><span class="mjx-base"><span id="MJXc-Node-167" class="mjx-mrow"><span id="MJXc-Node-168" class="mjx-mn"><span class="mjx-char MJXc-TeX-main-R" style="padding-top: 0.369em; padding-bottom: 0.369em;">0</span></span></span></span><span class="mjx-sup" style="font-size: 70.7%; vertical-align: 0.591em; padding-left: 0px; padding-right: 0.071em;"><span id="MJXc-Node-169" class="mjx-mrow" style=""><span id="MJXc-Node-170" class="mjx-mn"><span class="mjx-char MJXc-TeX-main-R" style="padding-top: 0.369em; padding-bottom: 0.369em;">9</span></span></span></span></span><span id="MJXc-Node-171" class="mjx-mo MJXc-space2"><span class="mjx-char MJXc-TeX-main-R" style="padding-top: 0.308em; padding-bottom: 0.43em;">+</span></span><span id="MJXc-Node-172" class="mjx-mn MJXc-space2"><span class="mjx-char MJXc-TeX-main-R" style="padding-top: 0.369em; padding-bottom: 0.369em;">7</span></span></span></span></span><script type="math/mml" id="MathJax-Element-27"><math display="inline" style="text-indent: 0em;" xmlns="http://www.w3.org/1998/Math/MathML"><mn>1</mn><msup><mrow><mn>0</mn></mrow><mrow><mn>9</mn></mrow></msup>
      <mo>+</mo> <mn>7</mn></math></script>. </p>

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
            <td><pre>3 3
1 2 D
1 3 W
3 2 L
</pre></td>
            <td><pre>9
3
3
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
            <td><pre>2 2
1 2 W
2 1 W
</pre></td>
            <td><pre>3
0
</pre></td>
         </tr>
      </tbody>
   </table>
</div></div>