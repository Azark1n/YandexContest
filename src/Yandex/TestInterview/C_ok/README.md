<div class="problem__statement text" data-bem="{&quot;problem__statement&quot;:{}}">
<div class="problem-statement">
   <div class="header">
      <h1 class="title">C. Удаление дубликатов</h1>
      <table>
         <tbody><tr>
            <th>
               <t:_ xmlns:t="http://www.yandex.ru/localize">Compiler</t:_>
            </th>
            <th>
               <t:_ xmlns:t="http://www.yandex.ru/localize">Time limit</t:_>
            </th>
            <th>
               <t:_ xmlns:t="http://www.yandex.ru/localize">Memory limit</t:_>
            </th>
            <th>
               <t:_ xmlns:t="http://www.yandex.ru/localize">Input</t:_>
            </th>
            <th>
               <t:_ xmlns:t="http://www.yandex.ru/localize">Output</t:_>
            </th>
         </tr>
         <tr>
            <td width="1%">
               <t:_ xmlns:t="http://www.yandex.ru/localize">All compilers</t:_>
            </td>
            <td>1&nbsp;секунда</td>
            <td>10Mb</td>
            <td rowspan="11">
               <t:_ xmlns:t="http://www.yandex.ru/localize">stdin or </t:_>input.txt
            </td>
            <td rowspan="11">
               <t:_ xmlns:t="http://www.yandex.ru/localize">stdout or </t:_>output.txt
            </td>
         </tr>
         <tr>
            <td>
               <nobr>Node.js 14.15.5</nobr>
            </td>
            <td>1&nbsp;секунда</td>
            <td>20Mb</td>
         </tr>
         <tr>
            <td>
               <nobr>Oracle Java 7</nobr>
            </td>
            <td>1&nbsp;секунда</td>
            <td>40Mb</td>
         </tr>
         <tr>
            <td>
               <nobr>Kotlin 1.4.30 (JRE 11)</nobr>
            </td>
            <td>1.5&nbsp;секунд</td>
            <td>40Mb</td>
         </tr>
         <tr>
            <td>
               <nobr>Oracle Java 8</nobr>
            </td>
            <td>1&nbsp;секунда</td>
            <td>40Mb</td>
         </tr>
         <tr>
            <td>
               <nobr>Scala 2.13.4</nobr>
            </td>
            <td>1&nbsp;секунда</td>
            <td>20Mb</td>
         </tr>
         <tr>
            <td>
               <nobr>OpenJDK Java 15</nobr>
            </td>
            <td>1&nbsp;секунда</td>
            <td>40Mb</td>
         </tr>
         <tr>
            <td>
               <nobr>Kotlin 1.1.50 (JRE 1.8.0)</nobr>
            </td>
            <td>1&nbsp;секунда</td>
            <td>40Mb</td>
         </tr>
         <tr>
            <td>
               <nobr>Kotlin 1.3.50 (JRE 1.8.0)</nobr>
            </td>
            <td>1&nbsp;секунда</td>
            <td>30Mb</td>
         </tr>
         <tr>
            <td>
               <nobr>Kotlin 1.5.32 (JRE 11)</nobr>
            </td>
            <td>1.5&nbsp;секунд</td>
            <td>40Mb</td>
         </tr>
         <tr>
            <td>
               <nobr>Node JS 8.16</nobr>
            </td>
            <td>1&nbsp;секунда</td>
            <td>20Mb</td>
         </tr>
      </tbody></table>
   </div>
   <h2>
      <t:_ xmlns:t="http://www.yandex.ru/localize">Legend</t:_>
   </h2>
   <div class="legend"><span style="">
         <p>Дан упорядоченный по неубыванию массив целых 32-разрядных чисел. Требуется удалить
            из него все повторения. 
         </p></span><p>Желательно получить решение, которое не считывает входной файл целиком в память, т.е.,
         использует лишь константный объем памяти в процессе работы.
      </p>
   </div>
   <h2>
      <t:_ xmlns:t="http://www.yandex.ru/localize">Input format</t:_>
   </h2>
   <div class="input-specification"><span style="">
         <p>Первая строка входного файла содержит единственное число <span class="tex-math-text">n</span>, <span class="tex-math-text">n ≤ 1000000</span>. 
         </p></span><p>На следующих <span class="tex-math-text">n</span> строк расположены числа — элементы массива, по одному на строку. Числа отсортированы
         по неубыванию.
      </p>
   </div>
   <h2>
      <t:_ xmlns:t="http://www.yandex.ru/localize">Output format</t:_>
   </h2>
   <div class="output-specification"><span style="">
         <p>Выходной файл должен содержать следующие в порядке возрастания уникальные элементы
            входного массива.
         </p></span></div>
   <h3>
      <t:_ xmlns:t="http://www.yandex.ru/localize">Sample</t:_> 1
   </h3>
   <table class="sample-tests">
      <thead>
         <tr>
            <th>
               <t:_ xmlns:t="http://www.yandex.ru/localize">Input</t:_>
            <div class="problem__copy-sample"><button class="button button_theme_pseudo button_size_s button_only-icon_yes problem__copy-button problem__copy-button_type_input i-bem" data-bem="{&quot;button&quot;:{}}" role="button" type="button" title="Скопировать ввод"><span class="button__text">&nbsp;<img class="image button__icon button__icon_role_copy" src="//yastatic.net/lego/_/La6qi18Z8LwgnZdsAr1qy1GwCwo.gif" alt="Скопировать ввод"></span></button></div></th>
            <th>
               <t:_ xmlns:t="http://www.yandex.ru/localize">Output</t:_>
            <div class="problem__copy-sample"><button class="button button_theme_pseudo button_size_s button_only-icon_yes problem__copy-button problem__copy-button_type_output i-bem" data-bem="{&quot;button&quot;:{}}" role="button" type="button" title="Скопировать вывод"><span class="button__text">&nbsp;<img class="image button__icon button__icon_role_copy" src="//yastatic.net/lego/_/La6qi18Z8LwgnZdsAr1qy1GwCwo.gif" alt="Скопировать вывод"></span></button></div></th>
         </tr>
      </thead>
      <tbody>
         <tr>
            <td><pre>5
2
4
8
8
8
</pre></td>
            <td><pre>2
4
8
</pre></td>
         </tr>
      </tbody>
   </table>
   <h3>
      <t:_ xmlns:t="http://www.yandex.ru/localize">Sample</t:_> 2
   </h3>
   <table class="sample-tests">
      <thead>
         <tr>
            <th>
               <t:_ xmlns:t="http://www.yandex.ru/localize">Input</t:_>
            <div class="problem__copy-sample"><button class="button button_theme_pseudo button_size_s button_only-icon_yes problem__copy-button problem__copy-button_type_input i-bem" data-bem="{&quot;button&quot;:{}}" role="button" type="button" title="Скопировать ввод"><span class="button__text">&nbsp;<img class="image button__icon button__icon_role_copy" src="//yastatic.net/lego/_/La6qi18Z8LwgnZdsAr1qy1GwCwo.gif" alt="Скопировать ввод"></span></button></div></th>
            <th>
               <t:_ xmlns:t="http://www.yandex.ru/localize">Output</t:_>
            <div class="problem__copy-sample"><button class="button button_theme_pseudo button_size_s button_only-icon_yes problem__copy-button problem__copy-button_type_output i-bem" data-bem="{&quot;button&quot;:{}}" role="button" type="button" title="Скопировать вывод"><span class="button__text">&nbsp;<img class="image button__icon button__icon_role_copy" src="//yastatic.net/lego/_/La6qi18Z8LwgnZdsAr1qy1GwCwo.gif" alt="Скопировать вывод"></span></button></div></th>
         </tr>
      </thead>
      <tbody>
         <tr>
            <td><pre>5
2
2
2
8
8
</pre></td>
            <td><pre>2
8
</pre></td>
         </tr>
      </tbody>
   </table>
</div></div>