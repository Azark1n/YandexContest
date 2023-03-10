<div class="problem__statement text" data-bem="{&quot;problem__statement&quot;:{}}">
<div class="problem-statement">
   <div class="header">
      <h1 class="title">C. Почти квадратные числа</h1>
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
      <p style="text-indent: 0em;"><span style="font-weight: bold;">Полное решение будет оценено в 7 баллов.</span><!--l. 50-->
      </p><p style="text-indent: 0em;">Вася хотел нарисовать на листке бумаги квадрат, но немного ошибся&nbsp;— у него получился
      прямоугольник, стороны которого различались на 1. «Но это же почти квадрат!»&nbsp;— подумал Вася и решил показать его папе.
      <!--l. 52-->
      </p><p style="text-indent: 0em;">Папа Васи посмотрел на прямоугольник, вспомнил теорему о разложении любого натурального числа
      в 4 полных квадрата и задумался о разложении числа 2022 на сумму почти квадратных чисел. <!--l. 54-->
      </p><p style="text-indent: 0em;">Числа вида <!--l. 54--><span class="MathJax_Preview" style="color: inherit; display: none;"></span><span id="MathJax-Element-1-Frame" class="mjx-chtml MathJax_CHTML" tabindex="0" style="font-size: 117%;"><span id="MJXc-Node-1" class="mjx-math" style="text-indent: 0em;"><span id="MJXc-Node-2" class="mjx-mrow"><span id="MJXc-Node-3" class="mjx-mi"><span class="mjx-char MJXc-TeX-math-I" style="padding-top: 0.491em; padding-bottom: 0.308em;">k</span></span><span id="MJXc-Node-4" class="mjx-mo MJXc-space2"><span class="mjx-char MJXc-TeX-main-R" style="padding-top: 0.003em; padding-bottom: 0.308em;">⋅</span></span><span id="MJXc-Node-5" class="mjx-mrow MJXc-space2"><span id="MJXc-Node-6" class="mjx-mo"><span class="mjx-char MJXc-TeX-main-R" style="padding-top: 0.491em; padding-bottom: 0.614em;">(</span></span><span id="MJXc-Node-7" class="mjx-mrow"><span id="MJXc-Node-8" class="mjx-mi"><span class="mjx-char MJXc-TeX-math-I" style="padding-top: 0.491em; padding-bottom: 0.308em;">k</span></span><span id="MJXc-Node-9" class="mjx-mo MJXc-space2"><span class="mjx-char MJXc-TeX-main-R" style="padding-top: 0.308em; padding-bottom: 0.43em;">+</span></span><span id="MJXc-Node-10" class="mjx-mn MJXc-space2"><span class="mjx-char MJXc-TeX-main-R" style="padding-top: 0.369em; padding-bottom: 0.369em;">1</span></span></span><span id="MJXc-Node-11" class="mjx-mo"><span class="mjx-char MJXc-TeX-main-R" style="padding-top: 0.491em; padding-bottom: 0.614em;">)</span></span></span></span></span></span><script type="math/mml" id="MathJax-Element-1"><math display="inline" style="text-indent: 0em;" xmlns="http://www.w3.org/1998/Math/MathML"><mi>k</mi>
      <mo>⋅</mo> <mrow><mo>(</mo><mrow><mi>k</mi> <mo>+</mo> <mn>1</mn></mrow><mo>)</mo></mrow></math></script>, <!--l. 54--><span class="MathJax_Preview" style="color: inherit; display: none;"></span><span id="MathJax-Element-2-Frame" class="mjx-chtml MathJax_CHTML" tabindex="0" style="font-size: 117%;"><span id="MJXc-Node-12" class="mjx-math" style="text-indent: 0em;"><span id="MJXc-Node-13" class="mjx-mrow"><span id="MJXc-Node-14" class="mjx-mi"><span class="mjx-char MJXc-TeX-math-I" style="padding-top: 0.491em; padding-bottom: 0.308em;">k</span></span><span id="MJXc-Node-15" class="mjx-mo MJXc-space3"><span class="mjx-char MJXc-TeX-main-R" style="padding-top: 0.247em; padding-bottom: 0.369em;">∈</span></span><span id="MJXc-Node-16" class="mjx-mi MJXc-space3"><span class="mjx-char MJXc-TeX-ams-R" style="padding-top: 0.43em; padding-bottom: 0.308em;">N</span></span></span></span></span><script type="math/mml" id="MathJax-Element-2"><math display="inline" style="text-indent: 0em;" xmlns="http://www.w3.org/1998/Math/MathML"><mi>k</mi> <mo>∈</mo> <mi>ℕ</mi></math></script>, будем называть
      <span style="font-style: italic;">почти квадратными</span>. На сумму какого минимального числа почти квадратных чисел можно
      разбить данное <span style="font-weight: bold;">четное </span>натуральное число <!--l. 54--><span class="MathJax_Preview" style="color: inherit; display: none;"></span><span id="MathJax-Element-3-Frame" class="mjx-chtml MathJax_CHTML" tabindex="0" style="font-size: 117%;"><span id="MJXc-Node-17" class="mjx-math" style="text-indent: 0em;"><span id="MJXc-Node-18" class="mjx-mrow"><span id="MJXc-Node-19" class="mjx-mi"><span class="mjx-char MJXc-TeX-math-I" style="padding-top: 0.247em; padding-bottom: 0.308em;">n</span></span></span></span></span><script type="math/mml" id="MathJax-Element-3"><math display="inline" style="text-indent:
      0em;" xmlns="http://www.w3.org/1998/Math/MathML"><mi>n</mi></math></script>? </p>
      <p></p>
      <p></p>
      <p></p>

   </div>
   <h2>Формат ввода</h2>
   <div class="input-specification">
      <!--l. 58-->
      <p style="text-indent: 0em;">В единственной строке задано целое четное число <!--l. 58--><span class="MathJax_Preview" style="color: inherit; display: none;"></span><span id="MathJax-Element-4-Frame" class="mjx-chtml MathJax_CHTML" tabindex="0" style="font-size: 117%;"><span id="MJXc-Node-20" class="mjx-math" style="text-indent: 0em;"><span id="MJXc-Node-21" class="mjx-mrow"><span id="MJXc-Node-22" class="mjx-mi"><span class="mjx-char MJXc-TeX-math-I" style="padding-top: 0.247em; padding-bottom: 0.308em;">n</span></span></span></span></span><script type="math/mml" id="MathJax-Element-4"><math display="inline" style="text-indent:
      0em;" xmlns="http://www.w3.org/1998/Math/MathML"><mi>n</mi></math></script> (<!--l. 58--><span class="MathJax_Preview" style="color: inherit; display: none;"></span><span id="MathJax-Element-5-Frame" class="mjx-chtml MathJax_CHTML" tabindex="0" style="font-size: 117%;"><span id="MJXc-Node-23" class="mjx-math" style="text-indent: 0em;"><span id="MJXc-Node-24" class="mjx-mrow"><span id="MJXc-Node-25" class="mjx-mn"><span class="mjx-char MJXc-TeX-main-R" style="padding-top: 0.369em; padding-bottom: 0.369em;">2</span></span><span id="MJXc-Node-26" class="mjx-mo MJXc-space3"><span class="mjx-char MJXc-TeX-main-R" style="padding-top: 0.369em; padding-bottom: 0.491em;">≤</span></span><span id="MJXc-Node-27" class="mjx-mi MJXc-space3"><span class="mjx-char MJXc-TeX-math-I" style="padding-top: 0.247em; padding-bottom: 0.308em;">n</span></span><span id="MJXc-Node-28" class="mjx-mo MJXc-space3"><span class="mjx-char MJXc-TeX-main-R" style="padding-top: 0.369em; padding-bottom: 0.491em;">≤</span></span><span id="MJXc-Node-29" class="mjx-mn MJXc-space3"><span class="mjx-char MJXc-TeX-main-R" style="padding-top: 0.369em; padding-bottom: 0.369em;">1</span></span><span id="MJXc-Node-30" class="mjx-msup"><span class="mjx-base"><span id="MJXc-Node-31" class="mjx-mrow"><span id="MJXc-Node-32" class="mjx-mn"><span class="mjx-char MJXc-TeX-main-R" style="padding-top: 0.369em; padding-bottom: 0.369em;">0</span></span></span></span><span class="mjx-sup" style="font-size: 70.7%; vertical-align: 0.591em; padding-left: 0px; padding-right: 0.071em;"><span id="MJXc-Node-33" class="mjx-mrow" style=""><span id="MJXc-Node-34" class="mjx-mn"><span class="mjx-char MJXc-TeX-main-R" style="padding-top: 0.369em; padding-bottom: 0.369em;">1</span></span><span id="MJXc-Node-35" class="mjx-mn"><span class="mjx-char MJXc-TeX-main-R" style="padding-top: 0.369em; padding-bottom: 0.369em;">2</span></span></span></span></span></span></span></span><script type="math/mml" id="MathJax-Element-5"><math display="inline" style="text-indent:
      0em;" xmlns="http://www.w3.org/1998/Math/MathML"><mn>2</mn> <mo>≤</mo> <mi>n</mi> <mo>≤</mo> <mn>1</mn><msup><mrow><mn>0</mn></mrow><mrow><mn>1</mn><mn>2</mn></mrow></msup></math></script>).
      </p>

   </div>
   <h2>Формат вывода</h2>
   <div class="output-specification">
      <!--l. 63-->
      <p style="text-indent: 0em;">Выведите одно натуральное число&nbsp;— минимальное <!--l. 63--><span class="MathJax_Preview" style="color: inherit; display: none;"></span><span id="MathJax-Element-6-Frame" class="mjx-chtml MathJax_CHTML" tabindex="0" style="font-size: 117%;"><span id="MJXc-Node-36" class="mjx-math" style="text-indent: 0em;"><span id="MJXc-Node-37" class="mjx-mrow"><span id="MJXc-Node-38" class="mjx-mi"><span class="mjx-char MJXc-TeX-math-I" style="padding-top: 0.247em; padding-bottom: 0.308em;">m</span></span></span></span></span><script type="math/mml" id="MathJax-Element-6"><math display="inline" style="text-indent:
      0em;" xmlns="http://www.w3.org/1998/Math/MathML"><mi>m</mi></math></script>&nbsp;— такое, что <!--l. 63--><span class="MathJax_Preview" style="color: inherit; display: none;"></span><span id="MathJax-Element-7-Frame" class="mjx-chtml MathJax_CHTML" tabindex="0" style="font-size: 117%;"><span id="MJXc-Node-39" class="mjx-math" style="text-indent: 0em;"><span id="MJXc-Node-40" class="mjx-mrow"><span id="MJXc-Node-41" class="mjx-mi"><span class="mjx-char MJXc-TeX-math-I" style="padding-top: 0.247em; padding-bottom: 0.308em;">n</span></span></span></span></span><script type="math/mml" id="MathJax-Element-7"><math display="inline" style="text-indent:
      0em;" xmlns="http://www.w3.org/1998/Math/MathML"><mi>n</mi></math></script> разложимо на сумму <!--l. 63--><span class="MathJax_Preview" style="color: inherit; display: none;"></span><span id="MathJax-Element-8-Frame" class="mjx-chtml MathJax_CHTML" tabindex="0" style="font-size: 117%;"><span id="MJXc-Node-42" class="mjx-math" style="text-indent: 0em;"><span id="MJXc-Node-43" class="mjx-mrow"><span id="MJXc-Node-44" class="mjx-mi"><span class="mjx-char MJXc-TeX-math-I" style="padding-top: 0.247em; padding-bottom: 0.308em;">m</span></span></span></span></span><script type="math/mml" id="MathJax-Element-8"><math display="inline" style="text-indent:
      0em;" xmlns="http://www.w3.org/1998/Math/MathML"><mi>m</mi></math></script> почти квадратных. </p>

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
            <td><pre>98
</pre></td>
            <td><pre>2
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
            <td><pre>10
</pre></td>
            <td><pre>3
</pre></td>
         </tr>
      </tbody>
   </table>
   <h3>Пример 3</h3>
   <table class="sample-tests">
      <thead>
         <tr>
            <th>Ввод<div class="problem__copy-sample"><button class="button button_theme_pseudo button_size_s button_only-icon_yes problem__copy-button problem__copy-button_type_input i-bem" data-bem="{&quot;button&quot;:{}}" role="button" type="button" title="Скопировать ввод"><span class="button__text">&nbsp;<img class="image button__icon button__icon_role_copy" src="//yastatic.net/lego/_/La6qi18Z8LwgnZdsAr1qy1GwCwo.gif" alt="Скопировать ввод"></span></button></div></th>
            <th>Вывод<div class="problem__copy-sample"><button class="button button_theme_pseudo button_size_s button_only-icon_yes problem__copy-button problem__copy-button_type_output i-bem" data-bem="{&quot;button&quot;:{}}" role="button" type="button" title="Скопировать вывод"><span class="button__text">&nbsp;<img class="image button__icon button__icon_role_copy" src="//yastatic.net/lego/_/La6qi18Z8LwgnZdsAr1qy1GwCwo.gif" alt="Скопировать вывод"></span></button></div></th>
         </tr>
      </thead>
      <tbody>
         <tr>
            <td><pre>2022
</pre></td>
            <td><pre>2
</pre></td>
         </tr>
      </tbody>
   </table>
</div></div>