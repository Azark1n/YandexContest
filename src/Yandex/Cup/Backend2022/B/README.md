<div class="problem__statement text" data-bem="{&quot;problem__statement&quot;:{}}">
<div class="problem-statement">
   <div class="header">
      <h1 class="title">B. Средняя сетевая задержка</h1>
   </div>
   <h2></h2>
   <div class="legend"> В одном из сервисов организована древовидная структура бэкендов. Запросы в сервис обрабатываются следующим образом: в корневой
      бэкенд (назовем его <span style="font-family: monospace;">balancer.test.yandex.ru</span>) поступает запрос, он формирует подзапросы
      в бэкенды-потомки (не более одного подзапроса в потомок), ожидает от них ответ, формирует свой ответ и отправляет его пользователю.
      Каждый из потомков обрабатывает подзапросы по той же схеме. На всех бэкендах регистрируются события следующей структуры: <ul>
      <li><span style="font-family: monospace;">datetime </span>– время наступления события; </li>
      <li><span style="font-family: monospace;">request_id </span>– id запроса; </li>
      <li><span style="font-family: monospace;">parent_request_id </span>– id родительского запроса (для корневого бэкенда <span style="font-family: monospace;">NULL</span>); </li>
      <li><span style="font-family: monospace;">host </span>– имя бэкенда, на котором возникло событие; </li>
      <li><span style="font-family: monospace;">type </span>– тип события (список указан ниже); </li>
      <li><span style="font-family: monospace;">data </span>– описание события.</li>
      </ul>
      <!--l. 58-->
      <p style="text-indent: 0em;">События бывают следующих типов: </p><ul>
      <li><span style="font-family: monospace;">RequestReceived </span>– на бэкенд поступил новый запрос (поле <span style="font-family:
      monospace;">data</span> пустое); </li>
      <li><span style="font-family: monospace;">RequestSent </span>– на бэкенд-потомок был отправлен подзапрос (в поле <span style="font-family:
      monospace;">data </span>записывается имя бэкенда-потомка); </li>
      <li><span style="font-family: monospace;">ResponseSent </span>– бэкенд отправил ответ родителю (<span style="font-family:
      monospace;">data </span>пустое); </li>
      <li><span style="font-family: monospace;">ResponseReceived </span>– бэкенд получил ответ от потомка (в поле <span style="font-family:
      monospace;">data</span> записываются имя бэкенда-потомка и статус – <span style="font-family: monospace;">OK </span>или <span style="font-family: monospace;">ERROR </span>–, разделенные символом табуляции).</li>
      </ul>
      <!--l. 66-->
      <p style="text-indent: 0em;">Все события собираются в одну таблицу. Очевидно, что на каждом бэкенде имеются сетевые издержки
      на пересылку запросов и ответов. Для одного запроса в корневой бэкенд считаем, что на них тратится сумма разниц <span style="font-family:
      monospace;">datetime</span> между всеми соответствующими парами событий <span style="font-family: monospace;">RequestSent</span>/<span style="font-family: monospace;">RequestReceived</span> и <span style="font-family: monospace;">ResponseSent</span>/<span style="font-family:
      monospace;">ResponseReceived</span>, которые возникли при обработке запроса. Вам нужно посчитать эту величину, усредненную
      по запросам в корневой бэкенд. </p>
      <p></p>

   </div>
   <h2>Формат ввода</h2>
   <div class="input-specification"> Используется БД postgresql 10.6.1 x64. <!--l. 71-->
      <p style="text-indent: 0em;">Система перед проверкой создает таблицу с событиями следующим запросом: </p><div style="clear:
      both; font-family: monospace; text-align: left; white-space: nowrap;"> CREATE&nbsp;TABLE&nbsp;requests&nbsp;( &nbsp;<br>&nbsp;&nbsp;&nbsp;&nbsp;datetime&nbsp;TIMESTAMP,
      &nbsp;<br>&nbsp;&nbsp;&nbsp;&nbsp;request_id&nbsp;UUID, &nbsp;<br>&nbsp;&nbsp;&nbsp;&nbsp;parent_request_id&nbsp;UUID, &nbsp;<br>&nbsp;&nbsp;&nbsp;&nbsp;host&nbsp;TEXT,
      &nbsp;<br>&nbsp;&nbsp;&nbsp;&nbsp;type&nbsp;TEXT, &nbsp;<br>&nbsp;&nbsp;&nbsp;&nbsp;data&nbsp;TEXT &nbsp;<br>);</div>
      <!--l. 82-->
      <p style="text-indent: 0em;">
      <!--l. 84-->
      </p><p style="text-indent: 0em;">После таблица заполняется тестовыми данными. </p>
      <p></p>
      <p></p>

   </div>
   <h2>Формат вывода</h2>
   <div class="output-specification"> Напишите SELECT выражение, которое вернет таблицу из одной строки с колонкой <span style="font-family: monospace;">avg_network_time_ms
      </span>типа <span style="font-family: monospace;">numeric</span>, в которую будет записана средняя сетевая задержка в миллисекундах.
      <!--l. 89-->
      <p style="text-indent: 0em;"><span style="font-weight: bold;">Внимание! </span>Текст выражения подставится в систему как подзапрос,
      поэтому завершать выражение точкой с запятой не надо (в противном случае вы получите ошибку <span style="font-family: monospace;">Presentation
      Error</span>). </p>

   </div>
   <h2>Примечания</h2>
   <div class="notes"> Для таблицы <span style="font-family: monospace;">requests </span>с таким содержимым (здесь для компактности пишем числа
      вместо UUID’а и миллисекунды в datetime, в проверочной таблице будут UUID’ы и timestamp’ы): <!--tex4ht:inline-->
      <div style="margin-bottom: 0.5em; margin-top: 0.5em; text-align: center;">
      <table cellpadding="0" cellspacing="0" rules="groups" style="border-left: solid black 0.4pt; border-right: solid black 0.4pt;
      margin-left: auto; margin-right: auto;">
      <colgroup>
      <col>
      </colgroup>
      <colgroup>
      <col>
      </colgroup>
      <colgroup>
      <col>
      </colgroup>
      <colgroup>
      <col>
      </colgroup>
      <colgroup>
      <col>
      </colgroup>
      <colgroup>
      <col>
      </colgroup>
      <tbody><tr style="vertical-align: baseline;">
      <td style="padding-left: 5pt; padding-right: 5pt; text-align: left; white-space: nowrap;"><span style="font-weight: bold;">datetime</span></td>
      <td style="padding-left: 5pt; padding-right: 5pt; text-align: left; white-space: nowrap;"><span style="font-weight: bold;">request_id</span></td>
      <td style="padding-left: 5pt; padding-right: 5pt; text-align: left; white-space: nowrap;"><span style="font-weight: bold;">parent_request_id</span></td>
      <td style="padding-left: 5pt; padding-right: 5pt; text-align: left; white-space: nowrap;"><span style="font-weight: bold;">host
      </span></td>
      <td style="padding-left: 5pt; padding-right: 5pt; text-align: left; white-space: nowrap;"><span style="font-weight: bold;">type
      </span></td>
      <td style="padding-left: 5pt; padding-right: 5pt; text-align: left; white-space: nowrap;"><span style="font-weight: bold;">data
      </span></td>
      </tr>
      <tr style="vertical-align: baseline;">
      <td style="padding-left: 5pt; padding-right: 5pt; text-align: left; white-space: nowrap;"><span style="font-family: monospace;">.000
      </span></td>
      <td style="padding-left: 5pt; padding-right: 5pt; text-align: left; white-space: nowrap;"><span style="font-family: monospace;">0
      </span></td>
      <td style="padding-left: 5pt; padding-right: 5pt; text-align: left; white-space: nowrap;"><span style="font-family: monospace;">NULL
      </span></td>
      <td style="padding-left: 5pt; padding-right: 5pt; text-align: left; white-space: nowrap;"><span style="font-family: monospace;">balancer.test.yandex.ru</span></td>
      <td style="padding-left: 5pt; padding-right: 5pt; text-align: left; white-space: nowrap;"><span style="font-family: monospace;">RequestReceived
      </span></td>
      <td style="padding-left: 5pt; padding-right: 5pt; text-align: left; white-space: nowrap;">
      </td>
      </tr>
      <tr style="vertical-align: baseline;">
      <td style="padding-left: 5pt; padding-right: 5pt; text-align: left; white-space: nowrap;"><span style="font-family: monospace;">.100
      </span></td>
      <td style="padding-left: 5pt; padding-right: 5pt; text-align: left; white-space: nowrap;"><span style="font-family: monospace;">0
      </span></td>
      <td style="padding-left: 5pt; padding-right: 5pt; text-align: left; white-space: nowrap;"><span style="font-family: monospace;">NULL
      </span></td>
      <td style="padding-left: 5pt; padding-right: 5pt; text-align: left; white-space: nowrap;"><span style="font-family: monospace;">balancer.test.yandex.ru</span></td>
      <td style="padding-left: 5pt; padding-right: 5pt; text-align: left; white-space: nowrap;"><span style="font-family: monospace;">RequestSent
      </span></td>
      <td style="padding-left: 5pt; padding-right: 5pt; text-align: left; white-space: nowrap;"><span style="font-family: monospace;">backend1.ru
      </span></td>
      </tr>
      <tr style="vertical-align: baseline;">
      <td style="padding-left: 5pt; padding-right: 5pt; text-align: left; white-space: nowrap;"><span style="font-family: monospace;">.101
      </span></td>
      <td style="padding-left: 5pt; padding-right: 5pt; text-align: left; white-space: nowrap;"><span style="font-family: monospace;">0
      </span></td>
      <td style="padding-left: 5pt; padding-right: 5pt; text-align: left; white-space: nowrap;"><span style="font-family: monospace;">NULL
      </span></td>
      <td style="padding-left: 5pt; padding-right: 5pt; text-align: left; white-space: nowrap;"><span style="font-family: monospace;">balancer.test.yandex.ru</span></td>
      <td style="padding-left: 5pt; padding-right: 5pt; text-align: left; white-space: nowrap;"><span style="font-family: monospace;">RequestSent
      </span></td>
      <td style="padding-left: 5pt; padding-right: 5pt; text-align: left; white-space: nowrap;"><span style="font-family: monospace;">backend2.ru
      </span></td>
      </tr>
      <tr style="vertical-align: baseline;">
      <td style="padding-left: 5pt; padding-right: 5pt; text-align: left; white-space: nowrap;"><span style="font-family: monospace;">.150
      </span></td>
      <td style="padding-left: 5pt; padding-right: 5pt; text-align: left; white-space: nowrap;"><span style="font-family: monospace;">1
      </span></td>
      <td style="padding-left: 5pt; padding-right: 5pt; text-align: left; white-space: nowrap;"><span style="font-family: monospace;">0
      </span></td>
      <td style="padding-left: 5pt; padding-right: 5pt; text-align: left; white-space: nowrap;"><span style="font-family: monospace;">backend1.ru
      </span></td>
      <td style="padding-left: 5pt; padding-right: 5pt; text-align: left; white-space: nowrap;"><span style="font-family: monospace;">RequestReceived
      </span></td>
      <td style="padding-left: 5pt; padding-right: 5pt; text-align: left; white-space: nowrap;">
      </td>
      </tr>
      <tr style="vertical-align: baseline;">
      <td style="padding-left: 5pt; padding-right: 5pt; text-align: left; white-space: nowrap;"><span style="font-family: monospace;">.200
      </span></td>
      <td style="padding-left: 5pt; padding-right: 5pt; text-align: left; white-space: nowrap;"><span style="font-family: monospace;">2
      </span></td>
      <td style="padding-left: 5pt; padding-right: 5pt; text-align: left; white-space: nowrap;"><span style="font-family: monospace;">0
      </span></td>
      <td style="padding-left: 5pt; padding-right: 5pt; text-align: left; white-space: nowrap;"><span style="font-family: monospace;">backend2.ru
      </span></td>
      <td style="padding-left: 5pt; padding-right: 5pt; text-align: left; white-space: nowrap;"><span style="font-family: monospace;">RequestReceived
      </span></td>
      <td style="padding-left: 5pt; padding-right: 5pt; text-align: left; white-space: nowrap;">
      </td>
      </tr>
      <tr style="vertical-align: baseline;">
      <td style="padding-left: 5pt; padding-right: 5pt; text-align: left; white-space: nowrap;"><span style="font-family: monospace;">.155
      </span></td>
      <td style="padding-left: 5pt; padding-right: 5pt; text-align: left; white-space: nowrap;"><span style="font-family: monospace;">1
      </span></td>
      <td style="padding-left: 5pt; padding-right: 5pt; text-align: left; white-space: nowrap;"><span style="font-family: monospace;">0
      </span></td>
      <td style="padding-left: 5pt; padding-right: 5pt; text-align: left; white-space: nowrap;"><span style="font-family: monospace;">backend1.ru
      </span></td>
      <td style="padding-left: 5pt; padding-right: 5pt; text-align: left; white-space: nowrap;"><span style="font-family: monospace;">RequestSent
      </span></td>
      <td style="padding-left: 5pt; padding-right: 5pt; text-align: left; white-space: nowrap;"><span style="font-family: monospace;">backend3.ru
      </span></td>
      </tr>
      <tr style="vertical-align: baseline;">
      <td style="padding-left: 5pt; padding-right: 5pt; text-align: left; white-space: nowrap;"><span style="font-family: monospace;">.210
      </span></td>
      <td style="padding-left: 5pt; padding-right: 5pt; text-align: left; white-space: nowrap;"><span style="font-family: monospace;">2
      </span></td>
      <td style="padding-left: 5pt; padding-right: 5pt; text-align: left; white-space: nowrap;"><span style="font-family: monospace;">0
      </span></td>
      <td style="padding-left: 5pt; padding-right: 5pt; text-align: left; white-space: nowrap;"><span style="font-family: monospace;">backend2.ru
      </span></td>
      <td style="padding-left: 5pt; padding-right: 5pt; text-align: left; white-space: nowrap;"><span style="font-family: monospace;">ResponseSent
      </span></td>
      <td style="padding-left: 5pt; padding-right: 5pt; text-align: left; white-space: nowrap;">
      </td>
      </tr>
      <tr style="vertical-align: baseline;">
      <td style="padding-left: 5pt; padding-right: 5pt; text-align: left; white-space: nowrap;"><span style="font-family: monospace;">.200
      </span></td>
      <td style="padding-left: 5pt; padding-right: 5pt; text-align: left; white-space: nowrap;"><span style="font-family: monospace;">3
      </span></td>
      <td style="padding-left: 5pt; padding-right: 5pt; text-align: left; white-space: nowrap;"><span style="font-family: monospace;">1
      </span></td>
      <td style="padding-left: 5pt; padding-right: 5pt; text-align: left; white-space: nowrap;"><span style="font-family: monospace;">backend3.ru
      </span></td>
      <td style="padding-left: 5pt; padding-right: 5pt; text-align: left; white-space: nowrap;"><span style="font-family: monospace;">RequestReceived
      </span></td>
      <td style="padding-left: 5pt; padding-right: 5pt; text-align: left; white-space: nowrap;">
      </td>
      </tr>
      <tr style="vertical-align: baseline;">
      <td style="padding-left: 5pt; padding-right: 5pt; text-align: left; white-space: nowrap;"><span style="font-family: monospace;">.220
      </span></td>
      <td style="padding-left: 5pt; padding-right: 5pt; text-align: left; white-space: nowrap;"><span style="font-family: monospace;">3
      </span></td>
      <td style="padding-left: 5pt; padding-right: 5pt; text-align: left; white-space: nowrap;"><span style="font-family: monospace;">1
      </span></td>
      <td style="padding-left: 5pt; padding-right: 5pt; text-align: left; white-space: nowrap;"><span style="font-family: monospace;">backend3.ru
      </span></td>
      <td style="padding-left: 5pt; padding-right: 5pt; text-align: left; white-space: nowrap;"><span style="font-family: monospace;">ResponseSent
      </span></td>
      <td style="padding-left: 5pt; padding-right: 5pt; text-align: left; white-space: nowrap;">
      </td>
      </tr>
      <tr style="vertical-align: baseline;">
      <td style="padding-left: 5pt; padding-right: 5pt; text-align: left; white-space: nowrap;"><span style="font-family: monospace;">.260
      </span></td>
      <td style="padding-left: 5pt; padding-right: 5pt; text-align: left; white-space: nowrap;"><span style="font-family: monospace;">1
      </span></td>
      <td style="padding-left: 5pt; padding-right: 5pt; text-align: left; white-space: nowrap;"><span style="font-family: monospace;">0
      </span></td>
      <td style="padding-left: 5pt; padding-right: 5pt; text-align: left; white-space: nowrap;"><span style="font-family: monospace;">backend1.ru
      </span></td>
      <td style="padding-left: 5pt; padding-right: 5pt; text-align: left; white-space: nowrap;"><span style="font-family: monospace;">ResponseReceived</span></td>
      <td style="padding-left: 5pt; padding-right: 5pt; text-align: left; white-space: nowrap;"><span style="font-family: monospace;">backend3.ru
      OK </span></td>
      </tr>
      <tr style="vertical-align: baseline;">
      <td style="padding-left: 5pt; padding-right: 5pt; text-align: left; white-space: nowrap;"><span style="font-family: monospace;">.300
      </span></td>
      <td style="padding-left: 5pt; padding-right: 5pt; text-align: left; white-space: nowrap;"><span style="font-family: monospace;">1
      </span></td>
      <td style="padding-left: 5pt; padding-right: 5pt; text-align: left; white-space: nowrap;"><span style="font-family: monospace;">0
      </span></td>
      <td style="padding-left: 5pt; padding-right: 5pt; text-align: left; white-space: nowrap;"><span style="font-family: monospace;">backend1.ru
      </span></td>
      <td style="padding-left: 5pt; padding-right: 5pt; text-align: left; white-space: nowrap;"><span style="font-family: monospace;">ResponseSent
      </span></td>
      <td style="padding-left: 5pt; padding-right: 5pt; text-align: left; white-space: nowrap;">
      </td>
      </tr>
      <tr style="vertical-align: baseline;">
      <td style="padding-left: 5pt; padding-right: 5pt; text-align: left; white-space: nowrap;"><span style="font-family: monospace;">.310
      </span></td>
      <td style="padding-left: 5pt; padding-right: 5pt; text-align: left; white-space: nowrap;"><span style="font-family: monospace;">0
      </span></td>
      <td style="padding-left: 5pt; padding-right: 5pt; text-align: left; white-space: nowrap;"><span style="font-family: monospace;">NULL
      </span></td>
      <td style="padding-left: 5pt; padding-right: 5pt; text-align: left; white-space: nowrap;"><span style="font-family: monospace;">balancer.test.yandex.ru</span></td>
      <td style="padding-left: 5pt; padding-right: 5pt; text-align: left; white-space: nowrap;"><span style="font-family: monospace;">ResponseReceived</span></td>
      <td style="padding-left: 5pt; padding-right: 5pt; text-align: left; white-space: nowrap;"><span style="font-family: monospace;">backend1.ru
      OK </span></td>
      </tr>
      <tr style="vertical-align: baseline;">
      <td style="padding-left: 5pt; padding-right: 5pt; text-align: left; white-space: nowrap;"><span style="font-family: monospace;">.250
      </span></td>
      <td style="padding-left: 5pt; padding-right: 5pt; text-align: left; white-space: nowrap;"><span style="font-family: monospace;">0
      </span></td>
      <td style="padding-left: 5pt; padding-right: 5pt; text-align: left; white-space: nowrap;"><span style="font-family: monospace;">NULL
      </span></td>
      <td style="padding-left: 5pt; padding-right: 5pt; text-align: left; white-space: nowrap;"><span style="font-family: monospace;">balancer.test.yandex.ru</span></td>
      <td style="padding-left: 5pt; padding-right: 5pt; text-align: left; white-space: nowrap;"><span style="font-family: monospace;">ResponseReceived</span></td>
      <td style="padding-left: 5pt; padding-right: 5pt; text-align: left; white-space: nowrap;"><span style="font-family: monospace;">backend2.ru
      OK </span></td>
      </tr>
      <tr style="vertical-align: baseline;">
      <td style="padding-left: 5pt; padding-right: 5pt; text-align: left; white-space: nowrap;"><span style="font-family: monospace;">.400
      </span></td>
      <td style="padding-left: 5pt; padding-right: 5pt; text-align: left; white-space: nowrap;"><span style="font-family: monospace;">0
      </span></td>
      <td style="padding-left: 5pt; padding-right: 5pt; text-align: left; white-space: nowrap;"><span style="font-family: monospace;">NULL
      </span></td>
      <td style="padding-left: 5pt; padding-right: 5pt; text-align: left; white-space: nowrap;"><span style="font-family: monospace;">balancer.test.yandex.ru</span></td>
      <td style="padding-left: 5pt; padding-right: 5pt; text-align: left; white-space: nowrap;"><span style="font-family: monospace;">ResponseSent
      </span></td>
      <td style="padding-left: 5pt; padding-right: 5pt; text-align: left; white-space: nowrap;">
      </td>
      </tr>
      <tr style="vertical-align: baseline;">
      <td style="padding-left: 5pt; padding-right: 5pt; text-align: left; white-space: nowrap;"><span style="font-family: monospace;">.500
      </span></td>
      <td style="padding-left: 5pt; padding-right: 5pt; text-align: left; white-space: nowrap;"><span style="font-family: monospace;">4
      </span></td>
      <td style="padding-left: 5pt; padding-right: 5pt; text-align: left; white-space: nowrap;"><span style="font-family: monospace;">NULL
      </span></td>
      <td style="padding-left: 5pt; padding-right: 5pt; text-align: left; white-space: nowrap;"><span style="font-family: monospace;">balancer.test.yandex.ru</span></td>
      <td style="padding-left: 5pt; padding-right: 5pt; text-align: left; white-space: nowrap;"><span style="font-family: monospace;">RequestReceived
      </span></td>
      <td style="padding-left: 5pt; padding-right: 5pt; text-align: left; white-space: nowrap;">
      </td>
      </tr>
      <tr style="vertical-align: baseline;">
      <td style="padding-left: 5pt; padding-right: 5pt; text-align: left; white-space: nowrap;"><span style="font-family: monospace;">.505
      </span></td>
      <td style="padding-left: 5pt; padding-right: 5pt; text-align: left; white-space: nowrap;"><span style="font-family: monospace;">4
      </span></td>
      <td style="padding-left: 5pt; padding-right: 5pt; text-align: left; white-space: nowrap;"><span style="font-family: monospace;">NULL
      </span></td>
      <td style="padding-left: 5pt; padding-right: 5pt; text-align: left; white-space: nowrap;"><span style="font-family: monospace;">balancer.test.yandex.ru</span></td>
      <td style="padding-left: 5pt; padding-right: 5pt; text-align: left; white-space: nowrap;"><span style="font-family: monospace;">RequestSent
      </span></td>
      <td style="padding-left: 5pt; padding-right: 5pt; text-align: left; white-space: nowrap;"><span style="font-family: monospace;">backend1.ru
      </span></td>
      </tr>
      <tr style="vertical-align: baseline;">
      <td style="padding-left: 5pt; padding-right: 5pt; text-align: left; white-space: nowrap;"><span style="font-family: monospace;">.510
      </span></td>
      <td style="padding-left: 5pt; padding-right: 5pt; text-align: left; white-space: nowrap;"><span style="font-family: monospace;">5
      </span></td>
      <td style="padding-left: 5pt; padding-right: 5pt; text-align: left; white-space: nowrap;"><span style="font-family: monospace;">4
      </span></td>
      <td style="padding-left: 5pt; padding-right: 5pt; text-align: left; white-space: nowrap;"><span style="font-family: monospace;">backend1.ru
      </span></td>
      <td style="padding-left: 5pt; padding-right: 5pt; text-align: left; white-space: nowrap;"><span style="font-family: monospace;">RequestReceived
      </span></td>
      <td style="padding-left: 5pt; padding-right: 5pt; text-align: left; white-space: nowrap;">
      </td>
      </tr>
      <tr style="vertical-align: baseline;">
      <td style="padding-left: 5pt; padding-right: 5pt; text-align: left; white-space: nowrap;"><span style="font-family: monospace;">.700
      </span></td>
      <td style="padding-left: 5pt; padding-right: 5pt; text-align: left; white-space: nowrap;"><span style="font-family: monospace;">5
      </span></td>
      <td style="padding-left: 5pt; padding-right: 5pt; text-align: left; white-space: nowrap;"><span style="font-family: monospace;">4
      </span></td>
      <td style="padding-left: 5pt; padding-right: 5pt; text-align: left; white-space: nowrap;"><span style="font-family: monospace;">backend1.ru
      </span></td>
      <td style="padding-left: 5pt; padding-right: 5pt; text-align: left; white-space: nowrap;"><span style="font-family: monospace;">ResponseSent
      </span></td>
      <td style="padding-left: 5pt; padding-right: 5pt; text-align: left; white-space: nowrap;">
      </td>
      </tr>
      <tr style="vertical-align: baseline;">
      <td style="padding-left: 5pt; padding-right: 5pt; text-align: left; white-space: nowrap;"><span style="font-family: monospace;">.710
      </span></td>
      <td style="padding-left: 5pt; padding-right: 5pt; text-align: left; white-space: nowrap;"><span style="font-family: monospace;">4
      </span></td>
      <td style="padding-left: 5pt; padding-right: 5pt; text-align: left; white-space: nowrap;"><span style="font-family: monospace;">NULL
      </span></td>
      <td style="padding-left: 5pt; padding-right: 5pt; text-align: left; white-space: nowrap;"><span style="font-family: monospace;">balancer.test.yandex.ru</span></td>
      <td style="padding-left: 5pt; padding-right: 5pt; text-align: left; white-space: nowrap;"><span style="font-family: monospace;">ResponseReceived</span></td>
      <td style="padding-left: 5pt; padding-right: 5pt; text-align: left; white-space: nowrap;"><span style="font-family: monospace;">backend1.ru
      ERROR</span></td>
      </tr>
      <tr style="vertical-align: baseline;">
      <td style="padding-left: 5pt; padding-right: 5pt; text-align: left; white-space: nowrap;"><span style="font-family: monospace;">.715
      </span></td>
      <td style="padding-left: 5pt; padding-right: 5pt; text-align: left; white-space: nowrap;"><span style="font-family: monospace;">4
      </span></td>
      <td style="padding-left: 5pt; padding-right: 5pt; text-align: left; white-space: nowrap;"><span style="font-family: monospace;">NULL
      </span></td>
      <td style="padding-left: 5pt; padding-right: 5pt; text-align: left; white-space: nowrap;"><span style="font-family: monospace;">balancer.test.yandex.ru</span></td>
      <td style="padding-left: 5pt; padding-right: 5pt; text-align: left; white-space: nowrap;"><span style="font-family: monospace;">ResponseSent
      </span></td>
      <td style="padding-left: 5pt; padding-right: 5pt; text-align: left; white-space: nowrap;">
      </td>
      </tr>
      </tbody></table>
      </div>
      <!--l. 117-->
      <p style="text-indent: 0em;">запрос участника должен возвращать следующий результат: <!--tex4ht:inline-->
      </p><div style="margin-bottom: 0.5em; margin-top: 0.5em; text-align: center;">
      <table cellpadding="0" cellspacing="0" style="margin-left: auto; margin-right: auto;">
      <colgroup>
      <col>
      </colgroup>
      <tbody><tr style="vertical-align: baseline;">
      <td style="padding-left: 5pt; padding-right: 5pt; text-align: left; white-space: nowrap;"><span style="font-weight: bold;">avg_network_time_ms</span></td>
      </tr>
      <tr style="vertical-align: baseline;">
      <td style="padding-left: 5pt; padding-right: 5pt; text-align: left; white-space: nowrap;"><span style="font-family: monospace;">149.5
      </span></td>
      </tr>
      </tbody></table>
      </div>
      <!--l. 123-->
      <p style="text-indent: 0em;">Тут два корневых запроса. Выпишем времена, которые прошли между отправкой запроса/ответа и его
      получением. </p><ol style="list-style-type: decimal;">
      <li>Запрос с id <!--l. 125--><span class="MathJax_Preview" style="color: inherit; display: none;"></span><span id="MathJax-Element-1-Frame" class="mjx-chtml MathJax_CHTML" tabindex="0" style="font-size: 117%;"><span id="MJXc-Node-1" class="mjx-math" style="text-indent: 0em;"><span id="MJXc-Node-2" class="mjx-mrow"><span id="MJXc-Node-3" class="mjx-mn"><span class="mjx-char MJXc-TeX-main-R" style="padding-top: 0.369em; padding-bottom: 0.369em;">0</span></span></span></span></span><script type="math/mml" id="MathJax-Element-1"><math display="inline" style="text-indent: 0em;" xmlns="http://www.w3.org/1998/Math/MathML"><mn>0</mn></math></script><ul>
      <li><span style="font-family: monospace;">balancer.test.yandex.ru -&gt; backend1.ru </span>– <!--l. 127--><span class="MathJax_Preview" style="color: inherit; display: none;"></span><span id="MathJax-Element-2-Frame" class="mjx-chtml MathJax_CHTML" tabindex="0" style="font-size: 117%;"><span id="MJXc-Node-4" class="mjx-math" style="text-indent: 0em;"><span id="MJXc-Node-5" class="mjx-mrow"><span id="MJXc-Node-6" class="mjx-mn"><span class="mjx-char MJXc-TeX-main-R" style="padding-top: 0.369em; padding-bottom: 0.369em;">5</span></span><span id="MJXc-Node-7" class="mjx-mn"><span class="mjx-char MJXc-TeX-main-R" style="padding-top: 0.369em; padding-bottom: 0.369em;">0</span></span></span></span></span><script type="math/mml" id="MathJax-Element-2"><math display="inline" style="text-indent: 0em;" xmlns="http://www.w3.org/1998/Math/MathML"><mn>5</mn><mn>0</mn></math></script> мс (от <!--l. 127--><span class="MathJax_Preview" style="color: inherit; display: none;"></span><span id="MathJax-Element-3-Frame" class="mjx-chtml MathJax_CHTML" tabindex="0" style="font-size: 117%;"><span id="MJXc-Node-8" class="mjx-math" style="text-indent: 0em;"><span id="MJXc-Node-9" class="mjx-mrow"><span id="MJXc-Node-10" class="mjx-mo"><span class="mjx-char MJXc-TeX-main-R" style="margin-top: -0.18em; padding-bottom: 0.369em;">.</span></span><span id="MJXc-Node-11" class="mjx-mn MJXc-space1"><span class="mjx-char MJXc-TeX-main-R" style="padding-top: 0.369em; padding-bottom: 0.369em;">1</span></span><span id="MJXc-Node-12" class="mjx-mn"><span class="mjx-char MJXc-TeX-main-R" style="padding-top: 0.369em; padding-bottom: 0.369em;">0</span></span><span id="MJXc-Node-13" class="mjx-mn"><span class="mjx-char MJXc-TeX-main-R" style="padding-top: 0.369em; padding-bottom: 0.369em;">0</span></span></span></span></span><script type="math/mml" id="MathJax-Element-3"><math display="inline" style="text-indent: 0em;" xmlns="http://www.w3.org/1998/Math/MathML"><mo>.</mo><mn>1</mn><mn>0</mn><mn>0</mn></math></script>
      до <!--l. 127--><span class="MathJax_Preview" style="color: inherit; display: none;"></span><span id="MathJax-Element-4-Frame" class="mjx-chtml MathJax_CHTML" tabindex="0" style="font-size: 117%;"><span id="MJXc-Node-14" class="mjx-math" style="text-indent: 0em;"><span id="MJXc-Node-15" class="mjx-mrow"><span id="MJXc-Node-16" class="mjx-mo"><span class="mjx-char MJXc-TeX-main-R" style="margin-top: -0.18em; padding-bottom: 0.369em;">.</span></span><span id="MJXc-Node-17" class="mjx-mn MJXc-space1"><span class="mjx-char MJXc-TeX-main-R" style="padding-top: 0.369em; padding-bottom: 0.369em;">1</span></span><span id="MJXc-Node-18" class="mjx-mn"><span class="mjx-char MJXc-TeX-main-R" style="padding-top: 0.369em; padding-bottom: 0.369em;">5</span></span><span id="MJXc-Node-19" class="mjx-mn"><span class="mjx-char MJXc-TeX-main-R" style="padding-top: 0.369em; padding-bottom: 0.369em;">0</span></span></span></span></span><script type="math/mml" id="MathJax-Element-4"><math display="inline" style="text-indent: 0em;" xmlns="http://www.w3.org/1998/Math/MathML"><mo>.</mo><mn>1</mn><mn>5</mn><mn>0</mn></math></script>)
      </li>
      <li><span style="font-family: monospace;">balancer.test.yandex.ru -&gt; backend2.ru </span>– <!--l. 128--><span class="MathJax_Preview" style="color: inherit; display: none;"></span><span id="MathJax-Element-5-Frame" class="mjx-chtml MathJax_CHTML" tabindex="0" style="font-size: 117%;"><span id="MJXc-Node-20" class="mjx-math" style="text-indent: 0em;"><span id="MJXc-Node-21" class="mjx-mrow"><span id="MJXc-Node-22" class="mjx-mn"><span class="mjx-char MJXc-TeX-main-R" style="padding-top: 0.369em; padding-bottom: 0.369em;">9</span></span><span id="MJXc-Node-23" class="mjx-mn"><span class="mjx-char MJXc-TeX-main-R" style="padding-top: 0.369em; padding-bottom: 0.369em;">9</span></span></span></span></span><script type="math/mml" id="MathJax-Element-5"><math display="inline" style="text-indent: 0em;" xmlns="http://www.w3.org/1998/Math/MathML"><mn>9</mn><mn>9</mn></math></script> мс (от <!--l. 128--><span class="MathJax_Preview" style="color: inherit; display: none;"></span><span id="MathJax-Element-6-Frame" class="mjx-chtml MathJax_CHTML" tabindex="0" style="font-size: 117%;"><span id="MJXc-Node-24" class="mjx-math" style="text-indent: 0em;"><span id="MJXc-Node-25" class="mjx-mrow"><span id="MJXc-Node-26" class="mjx-mo"><span class="mjx-char MJXc-TeX-main-R" style="margin-top: -0.18em; padding-bottom: 0.369em;">.</span></span><span id="MJXc-Node-27" class="mjx-mn MJXc-space1"><span class="mjx-char MJXc-TeX-main-R" style="padding-top: 0.369em; padding-bottom: 0.369em;">1</span></span><span id="MJXc-Node-28" class="mjx-mn"><span class="mjx-char MJXc-TeX-main-R" style="padding-top: 0.369em; padding-bottom: 0.369em;">0</span></span><span id="MJXc-Node-29" class="mjx-mn"><span class="mjx-char MJXc-TeX-main-R" style="padding-top: 0.369em; padding-bottom: 0.369em;">1</span></span></span></span></span><script type="math/mml" id="MathJax-Element-6"><math display="inline" style="text-indent: 0em;" xmlns="http://www.w3.org/1998/Math/MathML"><mo>.</mo><mn>1</mn><mn>0</mn><mn>1</mn></math></script>
      до <!--l. 128--><span class="MathJax_Preview" style="color: inherit; display: none;"></span><span id="MathJax-Element-7-Frame" class="mjx-chtml MathJax_CHTML" tabindex="0" style="font-size: 117%;"><span id="MJXc-Node-30" class="mjx-math" style="text-indent: 0em;"><span id="MJXc-Node-31" class="mjx-mrow"><span id="MJXc-Node-32" class="mjx-mo"><span class="mjx-char MJXc-TeX-main-R" style="margin-top: -0.18em; padding-bottom: 0.369em;">.</span></span><span id="MJXc-Node-33" class="mjx-mn MJXc-space1"><span class="mjx-char MJXc-TeX-main-R" style="padding-top: 0.369em; padding-bottom: 0.369em;">2</span></span><span id="MJXc-Node-34" class="mjx-mn"><span class="mjx-char MJXc-TeX-main-R" style="padding-top: 0.369em; padding-bottom: 0.369em;">0</span></span><span id="MJXc-Node-35" class="mjx-mn"><span class="mjx-char MJXc-TeX-main-R" style="padding-top: 0.369em; padding-bottom: 0.369em;">0</span></span></span></span></span><script type="math/mml" id="MathJax-Element-7"><math display="inline" style="text-indent: 0em;" xmlns="http://www.w3.org/1998/Math/MathML"><mo>.</mo><mn>2</mn><mn>0</mn><mn>0</mn></math></script>)
      </li>
      <li><span style="font-family: monospace;">backend1.ru -&gt; backend3.ru </span>– <!--l. 129--><span class="MathJax_Preview" style="color: inherit; display: none;"></span><span id="MathJax-Element-8-Frame" class="mjx-chtml MathJax_CHTML" tabindex="0" style="font-size: 117%;"><span id="MJXc-Node-36" class="mjx-math" style="text-indent: 0em;"><span id="MJXc-Node-37" class="mjx-mrow"><span id="MJXc-Node-38" class="mjx-mn"><span class="mjx-char MJXc-TeX-main-R" style="padding-top: 0.369em; padding-bottom: 0.369em;">4</span></span><span id="MJXc-Node-39" class="mjx-mn"><span class="mjx-char MJXc-TeX-main-R" style="padding-top: 0.369em; padding-bottom: 0.369em;">5</span></span></span></span></span><script type="math/mml" id="MathJax-Element-8"><math display="inline" style="text-indent:
      0em;" xmlns="http://www.w3.org/1998/Math/MathML"><mn>4</mn><mn>5</mn></math></script> мс (от <!--l. 129--><span class="MathJax_Preview" style="color: inherit; display: none;"></span><span id="MathJax-Element-9-Frame" class="mjx-chtml MathJax_CHTML" tabindex="0" style="font-size: 117%;"><span id="MJXc-Node-40" class="mjx-math" style="text-indent: 0em;"><span id="MJXc-Node-41" class="mjx-mrow"><span id="MJXc-Node-42" class="mjx-mo"><span class="mjx-char MJXc-TeX-main-R" style="margin-top: -0.18em; padding-bottom: 0.369em;">.</span></span><span id="MJXc-Node-43" class="mjx-mn MJXc-space1"><span class="mjx-char MJXc-TeX-main-R" style="padding-top: 0.369em; padding-bottom: 0.369em;">1</span></span><span id="MJXc-Node-44" class="mjx-mn"><span class="mjx-char MJXc-TeX-main-R" style="padding-top: 0.369em; padding-bottom: 0.369em;">5</span></span><span id="MJXc-Node-45" class="mjx-mn"><span class="mjx-char MJXc-TeX-main-R" style="padding-top: 0.369em; padding-bottom: 0.369em;">5</span></span></span></span></span><script type="math/mml" id="MathJax-Element-9"><math display="inline" style="text-indent:
      0em;" xmlns="http://www.w3.org/1998/Math/MathML"><mo>.</mo><mn>1</mn><mn>5</mn><mn>5</mn></math></script> до <!--l. 129--><span class="MathJax_Preview" style="color: inherit; display: none;"></span><span id="MathJax-Element-10-Frame" class="mjx-chtml MathJax_CHTML" tabindex="0" style="font-size: 117%;"><span id="MJXc-Node-46" class="mjx-math" style="text-indent: 0em;"><span id="MJXc-Node-47" class="mjx-mrow"><span id="MJXc-Node-48" class="mjx-mo"><span class="mjx-char MJXc-TeX-main-R" style="margin-top: -0.18em; padding-bottom: 0.369em;">.</span></span><span id="MJXc-Node-49" class="mjx-mn MJXc-space1"><span class="mjx-char MJXc-TeX-main-R" style="padding-top: 0.369em; padding-bottom: 0.369em;">2</span></span><span id="MJXc-Node-50" class="mjx-mn"><span class="mjx-char MJXc-TeX-main-R" style="padding-top: 0.369em; padding-bottom: 0.369em;">0</span></span><span id="MJXc-Node-51" class="mjx-mn"><span class="mjx-char MJXc-TeX-main-R" style="padding-top: 0.369em; padding-bottom: 0.369em;">0</span></span></span></span></span><script type="math/mml" id="MathJax-Element-10"><math display="inline" style="text-indent: 0em;" xmlns="http://www.w3.org/1998/Math/MathML"><mo>.</mo><mn>2</mn><mn>0</mn><mn>0</mn></math></script>) </li>
      <li><span style="font-family: monospace;">backend2.ru -&gt; balancer.test.yandex.ru </span>– <!--l. 130--><span class="MathJax_Preview" style="color: inherit; display: none;"></span><span id="MathJax-Element-11-Frame" class="mjx-chtml MathJax_CHTML" tabindex="0" style="font-size: 117%;"><span id="MJXc-Node-52" class="mjx-math" style="text-indent: 0em;"><span id="MJXc-Node-53" class="mjx-mrow"><span id="MJXc-Node-54" class="mjx-mn"><span class="mjx-char MJXc-TeX-main-R" style="padding-top: 0.369em; padding-bottom: 0.369em;">4</span></span><span id="MJXc-Node-55" class="mjx-mn"><span class="mjx-char MJXc-TeX-main-R" style="padding-top: 0.369em; padding-bottom: 0.369em;">0</span></span></span></span></span><script type="math/mml" id="MathJax-Element-11"><math display="inline" style="text-indent: 0em;" xmlns="http://www.w3.org/1998/Math/MathML"><mn>4</mn><mn>0</mn></math></script> мс (от <!--l. 130--><span class="MathJax_Preview" style="color: inherit; display: none;"></span><span id="MathJax-Element-12-Frame" class="mjx-chtml MathJax_CHTML" tabindex="0" style="font-size: 117%;"><span id="MJXc-Node-56" class="mjx-math" style="text-indent: 0em;"><span id="MJXc-Node-57" class="mjx-mrow"><span id="MJXc-Node-58" class="mjx-mo"><span class="mjx-char MJXc-TeX-main-R" style="margin-top: -0.18em; padding-bottom: 0.369em;">.</span></span><span id="MJXc-Node-59" class="mjx-mn MJXc-space1"><span class="mjx-char MJXc-TeX-main-R" style="padding-top: 0.369em; padding-bottom: 0.369em;">2</span></span><span id="MJXc-Node-60" class="mjx-mn"><span class="mjx-char MJXc-TeX-main-R" style="padding-top: 0.369em; padding-bottom: 0.369em;">1</span></span><span id="MJXc-Node-61" class="mjx-mn"><span class="mjx-char MJXc-TeX-main-R" style="padding-top: 0.369em; padding-bottom: 0.369em;">0</span></span></span></span></span><script type="math/mml" id="MathJax-Element-12"><math display="inline" style="text-indent: 0em;" xmlns="http://www.w3.org/1998/Math/MathML"><mo>.</mo><mn>2</mn><mn>1</mn><mn>0</mn></math></script>
      до <!--l. 130--><span class="MathJax_Preview" style="color: inherit; display: none;"></span><span id="MathJax-Element-13-Frame" class="mjx-chtml MathJax_CHTML" tabindex="0" style="font-size: 117%;"><span id="MJXc-Node-62" class="mjx-math" style="text-indent: 0em;"><span id="MJXc-Node-63" class="mjx-mrow"><span id="MJXc-Node-64" class="mjx-mo"><span class="mjx-char MJXc-TeX-main-R" style="margin-top: -0.18em; padding-bottom: 0.369em;">.</span></span><span id="MJXc-Node-65" class="mjx-mn MJXc-space1"><span class="mjx-char MJXc-TeX-main-R" style="padding-top: 0.369em; padding-bottom: 0.369em;">2</span></span><span id="MJXc-Node-66" class="mjx-mn"><span class="mjx-char MJXc-TeX-main-R" style="padding-top: 0.369em; padding-bottom: 0.369em;">5</span></span><span id="MJXc-Node-67" class="mjx-mn"><span class="mjx-char MJXc-TeX-main-R" style="padding-top: 0.369em; padding-bottom: 0.369em;">0</span></span></span></span></span><script type="math/mml" id="MathJax-Element-13"><math display="inline" style="text-indent: 0em;" xmlns="http://www.w3.org/1998/Math/MathML"><mo>.</mo><mn>2</mn><mn>5</mn><mn>0</mn></math></script>)
      </li>
      <li><span style="font-family: monospace;">backend3.ru -&gt; backend1.ru </span>– <!--l. 131--><span class="MathJax_Preview" style="color: inherit; display: none;"></span><span id="MathJax-Element-14-Frame" class="mjx-chtml MathJax_CHTML" tabindex="0" style="font-size: 117%;"><span id="MJXc-Node-68" class="mjx-math" style="text-indent: 0em;"><span id="MJXc-Node-69" class="mjx-mrow"><span id="MJXc-Node-70" class="mjx-mn"><span class="mjx-char MJXc-TeX-main-R" style="padding-top: 0.369em; padding-bottom: 0.369em;">4</span></span><span id="MJXc-Node-71" class="mjx-mn"><span class="mjx-char MJXc-TeX-main-R" style="padding-top: 0.369em; padding-bottom: 0.369em;">0</span></span></span></span></span><script type="math/mml" id="MathJax-Element-14"><math display="inline" style="text-indent:
      0em;" xmlns="http://www.w3.org/1998/Math/MathML"><mn>4</mn><mn>0</mn></math></script> мс (от <!--l. 131--><span class="MathJax_Preview" style="color: inherit; display: none;"></span><span id="MathJax-Element-15-Frame" class="mjx-chtml MathJax_CHTML" tabindex="0" style="font-size: 117%;"><span id="MJXc-Node-72" class="mjx-math" style="text-indent: 0em;"><span id="MJXc-Node-73" class="mjx-mrow"><span id="MJXc-Node-74" class="mjx-mo"><span class="mjx-char MJXc-TeX-main-R" style="margin-top: -0.18em; padding-bottom: 0.369em;">.</span></span><span id="MJXc-Node-75" class="mjx-mn MJXc-space1"><span class="mjx-char MJXc-TeX-main-R" style="padding-top: 0.369em; padding-bottom: 0.369em;">2</span></span><span id="MJXc-Node-76" class="mjx-mn"><span class="mjx-char MJXc-TeX-main-R" style="padding-top: 0.369em; padding-bottom: 0.369em;">2</span></span><span id="MJXc-Node-77" class="mjx-mn"><span class="mjx-char MJXc-TeX-main-R" style="padding-top: 0.369em; padding-bottom: 0.369em;">0</span></span></span></span></span><script type="math/mml" id="MathJax-Element-15"><math display="inline" style="text-indent:
      0em;" xmlns="http://www.w3.org/1998/Math/MathML"><mo>.</mo><mn>2</mn><mn>2</mn><mn>0</mn></math></script> до <!--l. 131--><span class="MathJax_Preview" style="color: inherit; display: none;"></span><span id="MathJax-Element-16-Frame" class="mjx-chtml MathJax_CHTML" tabindex="0" style="font-size: 117%;"><span id="MJXc-Node-78" class="mjx-math" style="text-indent: 0em;"><span id="MJXc-Node-79" class="mjx-mrow"><span id="MJXc-Node-80" class="mjx-mo"><span class="mjx-char MJXc-TeX-main-R" style="margin-top: -0.18em; padding-bottom: 0.369em;">.</span></span><span id="MJXc-Node-81" class="mjx-mn MJXc-space1"><span class="mjx-char MJXc-TeX-main-R" style="padding-top: 0.369em; padding-bottom: 0.369em;">2</span></span><span id="MJXc-Node-82" class="mjx-mn"><span class="mjx-char MJXc-TeX-main-R" style="padding-top: 0.369em; padding-bottom: 0.369em;">6</span></span><span id="MJXc-Node-83" class="mjx-mn"><span class="mjx-char MJXc-TeX-main-R" style="padding-top: 0.369em; padding-bottom: 0.369em;">0</span></span></span></span></span><script type="math/mml" id="MathJax-Element-16"><math display="inline" style="text-indent: 0em;" xmlns="http://www.w3.org/1998/Math/MathML"><mo>.</mo><mn>2</mn><mn>6</mn><mn>0</mn></math></script>) </li>
      <li><span style="font-family: monospace;">backend1.ru -&gt; balancer.test.yandex.ru </span>– <!--l. 132--><span class="MathJax_Preview" style="color: inherit; display: none;"></span><span id="MathJax-Element-17-Frame" class="mjx-chtml MathJax_CHTML" tabindex="0" style="font-size: 117%;"><span id="MJXc-Node-84" class="mjx-math" style="text-indent: 0em;"><span id="MJXc-Node-85" class="mjx-mrow"><span id="MJXc-Node-86" class="mjx-mn"><span class="mjx-char MJXc-TeX-main-R" style="padding-top: 0.369em; padding-bottom: 0.369em;">1</span></span><span id="MJXc-Node-87" class="mjx-mn"><span class="mjx-char MJXc-TeX-main-R" style="padding-top: 0.369em; padding-bottom: 0.369em;">0</span></span></span></span></span><script type="math/mml" id="MathJax-Element-17"><math display="inline" style="text-indent: 0em;" xmlns="http://www.w3.org/1998/Math/MathML"><mn>1</mn><mn>0</mn></math></script> мс (от <!--l. 132--><span class="MathJax_Preview" style="color: inherit; display: none;"></span><span id="MathJax-Element-18-Frame" class="mjx-chtml MathJax_CHTML" tabindex="0" style="font-size: 117%;"><span id="MJXc-Node-88" class="mjx-math" style="text-indent: 0em;"><span id="MJXc-Node-89" class="mjx-mrow"><span id="MJXc-Node-90" class="mjx-mo"><span class="mjx-char MJXc-TeX-main-R" style="margin-top: -0.18em; padding-bottom: 0.369em;">.</span></span><span id="MJXc-Node-91" class="mjx-mn MJXc-space1"><span class="mjx-char MJXc-TeX-main-R" style="padding-top: 0.369em; padding-bottom: 0.369em;">3</span></span><span id="MJXc-Node-92" class="mjx-mn"><span class="mjx-char MJXc-TeX-main-R" style="padding-top: 0.369em; padding-bottom: 0.369em;">0</span></span><span id="MJXc-Node-93" class="mjx-mn"><span class="mjx-char MJXc-TeX-main-R" style="padding-top: 0.369em; padding-bottom: 0.369em;">0</span></span></span></span></span><script type="math/mml" id="MathJax-Element-18"><math display="inline" style="text-indent: 0em;" xmlns="http://www.w3.org/1998/Math/MathML"><mo>.</mo><mn>3</mn><mn>0</mn><mn>0</mn></math></script>
      до <!--l. 132--><span class="MathJax_Preview" style="color: inherit; display: none;"></span><span id="MathJax-Element-19-Frame" class="mjx-chtml MathJax_CHTML" tabindex="0" style="font-size: 117%;"><span id="MJXc-Node-94" class="mjx-math" style="text-indent: 0em;"><span id="MJXc-Node-95" class="mjx-mrow"><span id="MJXc-Node-96" class="mjx-mo"><span class="mjx-char MJXc-TeX-main-R" style="margin-top: -0.18em; padding-bottom: 0.369em;">.</span></span><span id="MJXc-Node-97" class="mjx-mn MJXc-space1"><span class="mjx-char MJXc-TeX-main-R" style="padding-top: 0.369em; padding-bottom: 0.369em;">3</span></span><span id="MJXc-Node-98" class="mjx-mn"><span class="mjx-char MJXc-TeX-main-R" style="padding-top: 0.369em; padding-bottom: 0.369em;">1</span></span><span id="MJXc-Node-99" class="mjx-mn"><span class="mjx-char MJXc-TeX-main-R" style="padding-top: 0.369em; padding-bottom: 0.369em;">0</span></span></span></span></span><script type="math/mml" id="MathJax-Element-19"><math display="inline" style="text-indent: 0em;" xmlns="http://www.w3.org/1998/Math/MathML"><mo>.</mo><mn>3</mn><mn>1</mn><mn>0</mn></math></script>)</li>
      </ul>
      <!--l. 134-->
      <p style="margin-bottom: 0.5em; text-indent: 0em;">Суммарно это <!--l. 134--><span class="MathJax_Preview" style="color: inherit; display: none;"></span><span id="MathJax-Element-20-Frame" class="mjx-chtml MathJax_CHTML" tabindex="0" style="font-size: 117%;"><span id="MJXc-Node-100" class="mjx-math" style="text-indent: 0em;"><span id="MJXc-Node-101" class="mjx-mrow"><span id="MJXc-Node-102" class="mjx-mn"><span class="mjx-char MJXc-TeX-main-R" style="padding-top: 0.369em; padding-bottom: 0.369em;">5</span></span><span id="MJXc-Node-103" class="mjx-mn"><span class="mjx-char MJXc-TeX-main-R" style="padding-top: 0.369em; padding-bottom: 0.369em;">0</span></span><span id="MJXc-Node-104" class="mjx-mo MJXc-space2"><span class="mjx-char MJXc-TeX-main-R" style="padding-top: 0.308em; padding-bottom: 0.43em;">+</span></span><span id="MJXc-Node-105" class="mjx-mn MJXc-space2"><span class="mjx-char MJXc-TeX-main-R" style="padding-top: 0.369em; padding-bottom: 0.369em;">9</span></span><span id="MJXc-Node-106" class="mjx-mn"><span class="mjx-char MJXc-TeX-main-R" style="padding-top: 0.369em; padding-bottom: 0.369em;">9</span></span><span id="MJXc-Node-107" class="mjx-mo MJXc-space2"><span class="mjx-char MJXc-TeX-main-R" style="padding-top: 0.308em; padding-bottom: 0.43em;">+</span></span><span id="MJXc-Node-108" class="mjx-mn MJXc-space2"><span class="mjx-char MJXc-TeX-main-R" style="padding-top: 0.369em; padding-bottom: 0.369em;">4</span></span><span id="MJXc-Node-109" class="mjx-mn"><span class="mjx-char MJXc-TeX-main-R" style="padding-top: 0.369em; padding-bottom: 0.369em;">5</span></span><span id="MJXc-Node-110" class="mjx-mo MJXc-space2"><span class="mjx-char MJXc-TeX-main-R" style="padding-top: 0.308em; padding-bottom: 0.43em;">+</span></span><span id="MJXc-Node-111" class="mjx-mn MJXc-space2"><span class="mjx-char MJXc-TeX-main-R" style="padding-top: 0.369em; padding-bottom: 0.369em;">4</span></span><span id="MJXc-Node-112" class="mjx-mn"><span class="mjx-char MJXc-TeX-main-R" style="padding-top: 0.369em; padding-bottom: 0.369em;">0</span></span><span id="MJXc-Node-113" class="mjx-mo MJXc-space2"><span class="mjx-char MJXc-TeX-main-R" style="padding-top: 0.308em; padding-bottom: 0.43em;">+</span></span><span id="MJXc-Node-114" class="mjx-mn MJXc-space2"><span class="mjx-char MJXc-TeX-main-R" style="padding-top: 0.369em; padding-bottom: 0.369em;">4</span></span><span id="MJXc-Node-115" class="mjx-mn"><span class="mjx-char MJXc-TeX-main-R" style="padding-top: 0.369em; padding-bottom: 0.369em;">0</span></span><span id="MJXc-Node-116" class="mjx-mo MJXc-space2"><span class="mjx-char MJXc-TeX-main-R" style="padding-top: 0.308em; padding-bottom: 0.43em;">+</span></span><span id="MJXc-Node-117" class="mjx-mn MJXc-space2"><span class="mjx-char MJXc-TeX-main-R" style="padding-top: 0.369em; padding-bottom: 0.369em;">1</span></span><span id="MJXc-Node-118" class="mjx-mn"><span class="mjx-char MJXc-TeX-main-R" style="padding-top: 0.369em; padding-bottom: 0.369em;">0</span></span><span id="MJXc-Node-119" class="mjx-mo MJXc-space3"><span class="mjx-char MJXc-TeX-main-R" style="padding-top: 0.064em; padding-bottom: 0.308em;">=</span></span><span id="MJXc-Node-120" class="mjx-mn MJXc-space3"><span class="mjx-char MJXc-TeX-main-R" style="padding-top: 0.369em; padding-bottom: 0.369em;">2</span></span><span id="MJXc-Node-121" class="mjx-mn"><span class="mjx-char MJXc-TeX-main-R" style="padding-top: 0.369em; padding-bottom: 0.369em;">8</span></span><span id="MJXc-Node-122" class="mjx-mn"><span class="mjx-char MJXc-TeX-main-R" style="padding-top: 0.369em; padding-bottom: 0.369em;">4</span></span></span></span></span><script type="math/mml" id="MathJax-Element-20"><math display="inline" style="text-indent: 0em;" xmlns="http://www.w3.org/1998/Math/MathML"><mn>5</mn><mn>0</mn> <mo>+</mo> <mn>9</mn><mn>9</mn> <mo>+</mo> <mn>4</mn><mn>5</mn>
      <mo>+</mo> <mn>4</mn><mn>0</mn> <mo>+</mo> <mn>4</mn><mn>0</mn> <mo>+</mo> <mn>1</mn><mn>0</mn> <mo>=</mo> <mn>2</mn><mn>8</mn><mn>4</mn></math></script>
      мс </p>
      </li>
      <li>Запрос с id <!--l. 135--><span class="MathJax_Preview" style="color: inherit; display: none;"></span><span id="MathJax-Element-21-Frame" class="mjx-chtml MathJax_CHTML" tabindex="0" style="font-size: 117%;"><span id="MJXc-Node-123" class="mjx-math" style="text-indent: 0em;"><span id="MJXc-Node-124" class="mjx-mrow"><span id="MJXc-Node-125" class="mjx-mn"><span class="mjx-char MJXc-TeX-main-R" style="padding-top: 0.369em; padding-bottom: 0.369em;">4</span></span></span></span></span><script type="math/mml" id="MathJax-Element-21"><math display="inline" style="text-indent: 0em;" xmlns="http://www.w3.org/1998/Math/MathML"><mn>4</mn></math></script><ul>
      <li><span style="font-family: monospace;">balancer.test.yandex.ru -&gt; backend1.ru </span>– <!--l. 137--><span class="MathJax_Preview" style="color: inherit; display: none;"></span><span id="MathJax-Element-22-Frame" class="mjx-chtml MathJax_CHTML" tabindex="0" style="font-size: 117%;"><span id="MJXc-Node-126" class="mjx-math" style="text-indent: 0em;"><span id="MJXc-Node-127" class="mjx-mrow"><span id="MJXc-Node-128" class="mjx-mn"><span class="mjx-char MJXc-TeX-main-R" style="padding-top: 0.369em; padding-bottom: 0.369em;">5</span></span></span></span></span><script type="math/mml" id="MathJax-Element-22"><math display="inline" style="text-indent: 0em;" xmlns="http://www.w3.org/1998/Math/MathML"><mn>5</mn></math></script> мс (от <!--l. 137--><span class="MathJax_Preview" style="color: inherit; display: none;"></span><span id="MathJax-Element-23-Frame" class="mjx-chtml MathJax_CHTML" tabindex="0" style="font-size: 117%;"><span id="MJXc-Node-129" class="mjx-math" style="text-indent: 0em;"><span id="MJXc-Node-130" class="mjx-mrow"><span id="MJXc-Node-131" class="mjx-mo"><span class="mjx-char MJXc-TeX-main-R" style="margin-top: -0.18em; padding-bottom: 0.369em;">.</span></span><span id="MJXc-Node-132" class="mjx-mn MJXc-space1"><span class="mjx-char MJXc-TeX-main-R" style="padding-top: 0.369em; padding-bottom: 0.369em;">5</span></span><span id="MJXc-Node-133" class="mjx-mn"><span class="mjx-char MJXc-TeX-main-R" style="padding-top: 0.369em; padding-bottom: 0.369em;">0</span></span><span id="MJXc-Node-134" class="mjx-mn"><span class="mjx-char MJXc-TeX-main-R" style="padding-top: 0.369em; padding-bottom: 0.369em;">5</span></span></span></span></span><script type="math/mml" id="MathJax-Element-23"><math display="inline" style="text-indent: 0em;" xmlns="http://www.w3.org/1998/Math/MathML"><mo>.</mo><mn>5</mn><mn>0</mn><mn>5</mn></math></script> до <!--l.
      137--><span class="MathJax_Preview" style="color: inherit; display: none;"></span><span id="MathJax-Element-24-Frame" class="mjx-chtml MathJax_CHTML" tabindex="0" style="font-size: 117%;"><span id="MJXc-Node-135" class="mjx-math" style="text-indent: 0em;"><span id="MJXc-Node-136" class="mjx-mrow"><span id="MJXc-Node-137" class="mjx-mo"><span class="mjx-char MJXc-TeX-main-R" style="margin-top: -0.18em; padding-bottom: 0.369em;">.</span></span><span id="MJXc-Node-138" class="mjx-mn MJXc-space1"><span class="mjx-char MJXc-TeX-main-R" style="padding-top: 0.369em; padding-bottom: 0.369em;">5</span></span><span id="MJXc-Node-139" class="mjx-mn"><span class="mjx-char MJXc-TeX-main-R" style="padding-top: 0.369em; padding-bottom: 0.369em;">1</span></span><span id="MJXc-Node-140" class="mjx-mn"><span class="mjx-char MJXc-TeX-main-R" style="padding-top: 0.369em; padding-bottom: 0.369em;">0</span></span></span></span></span><script type="math/mml" id="MathJax-Element-24"><math display="inline" style="text-indent: 0em;" xmlns="http://www.w3.org/1998/Math/MathML"><mo>.</mo><mn>5</mn><mn>1</mn><mn>0</mn></math></script>)
      </li>
      <li><span style="font-family: monospace;">backend1.ru -&gt; balancer.test.yandex.ru </span>– <!--l. 138--><span class="MathJax_Preview" style="color: inherit; display: none;"></span><span id="MathJax-Element-25-Frame" class="mjx-chtml MathJax_CHTML" tabindex="0" style="font-size: 117%;"><span id="MJXc-Node-141" class="mjx-math" style="text-indent: 0em;"><span id="MJXc-Node-142" class="mjx-mrow"><span id="MJXc-Node-143" class="mjx-mn"><span class="mjx-char MJXc-TeX-main-R" style="padding-top: 0.369em; padding-bottom: 0.369em;">1</span></span><span id="MJXc-Node-144" class="mjx-mn"><span class="mjx-char MJXc-TeX-main-R" style="padding-top: 0.369em; padding-bottom: 0.369em;">0</span></span></span></span></span><script type="math/mml" id="MathJax-Element-25"><math display="inline" style="text-indent: 0em;" xmlns="http://www.w3.org/1998/Math/MathML"><mn>1</mn><mn>0</mn></math></script> мс (от <!--l. 138--><span class="MathJax_Preview" style="color: inherit; display: none;"></span><span id="MathJax-Element-26-Frame" class="mjx-chtml MathJax_CHTML" tabindex="0" style="font-size: 117%;"><span id="MJXc-Node-145" class="mjx-math" style="text-indent: 0em;"><span id="MJXc-Node-146" class="mjx-mrow"><span id="MJXc-Node-147" class="mjx-mo"><span class="mjx-char MJXc-TeX-main-R" style="margin-top: -0.18em; padding-bottom: 0.369em;">.</span></span><span id="MJXc-Node-148" class="mjx-mn MJXc-space1"><span class="mjx-char MJXc-TeX-main-R" style="padding-top: 0.369em; padding-bottom: 0.369em;">7</span></span><span id="MJXc-Node-149" class="mjx-mn"><span class="mjx-char MJXc-TeX-main-R" style="padding-top: 0.369em; padding-bottom: 0.369em;">0</span></span><span id="MJXc-Node-150" class="mjx-mn"><span class="mjx-char MJXc-TeX-main-R" style="padding-top: 0.369em; padding-bottom: 0.369em;">0</span></span></span></span></span><script type="math/mml" id="MathJax-Element-26"><math display="inline" style="text-indent: 0em;" xmlns="http://www.w3.org/1998/Math/MathML"><mo>.</mo><mn>7</mn><mn>0</mn><mn>0</mn></math></script>
      до <!--l. 138--><span class="MathJax_Preview" style="color: inherit; display: none;"></span><span id="MathJax-Element-27-Frame" class="mjx-chtml MathJax_CHTML" tabindex="0" style="font-size: 117%;"><span id="MJXc-Node-151" class="mjx-math" style="text-indent: 0em;"><span id="MJXc-Node-152" class="mjx-mrow"><span id="MJXc-Node-153" class="mjx-mo"><span class="mjx-char MJXc-TeX-main-R" style="margin-top: -0.18em; padding-bottom: 0.369em;">.</span></span><span id="MJXc-Node-154" class="mjx-mn MJXc-space1"><span class="mjx-char MJXc-TeX-main-R" style="padding-top: 0.369em; padding-bottom: 0.369em;">7</span></span><span id="MJXc-Node-155" class="mjx-mn"><span class="mjx-char MJXc-TeX-main-R" style="padding-top: 0.369em; padding-bottom: 0.369em;">1</span></span><span id="MJXc-Node-156" class="mjx-mn"><span class="mjx-char MJXc-TeX-main-R" style="padding-top: 0.369em; padding-bottom: 0.369em;">0</span></span></span></span></span><script type="math/mml" id="MathJax-Element-27"><math display="inline" style="text-indent: 0em;" xmlns="http://www.w3.org/1998/Math/MathML"><mo>.</mo><mn>7</mn><mn>1</mn><mn>0</mn></math></script>)</li>
      </ul>
      <!--l. 140-->
      <p style="margin-bottom: 0.5em; text-indent: 0em;">Суммарно это <!--l. 140--><span class="MathJax_Preview" style="color: inherit; display: none;"></span><span id="MathJax-Element-28-Frame" class="mjx-chtml MathJax_CHTML" tabindex="0" style="font-size: 117%;"><span id="MJXc-Node-157" class="mjx-math" style="text-indent: 0em;"><span id="MJXc-Node-158" class="mjx-mrow"><span id="MJXc-Node-159" class="mjx-mn"><span class="mjx-char MJXc-TeX-main-R" style="padding-top: 0.369em; padding-bottom: 0.369em;">5</span></span><span id="MJXc-Node-160" class="mjx-mo MJXc-space2"><span class="mjx-char MJXc-TeX-main-R" style="padding-top: 0.308em; padding-bottom: 0.43em;">+</span></span><span id="MJXc-Node-161" class="mjx-mn MJXc-space2"><span class="mjx-char MJXc-TeX-main-R" style="padding-top: 0.369em; padding-bottom: 0.369em;">1</span></span><span id="MJXc-Node-162" class="mjx-mn"><span class="mjx-char MJXc-TeX-main-R" style="padding-top: 0.369em; padding-bottom: 0.369em;">0</span></span><span id="MJXc-Node-163" class="mjx-mo MJXc-space3"><span class="mjx-char MJXc-TeX-main-R" style="padding-top: 0.064em; padding-bottom: 0.308em;">=</span></span><span id="MJXc-Node-164" class="mjx-mn MJXc-space3"><span class="mjx-char MJXc-TeX-main-R" style="padding-top: 0.369em; padding-bottom: 0.369em;">1</span></span><span id="MJXc-Node-165" class="mjx-mn"><span class="mjx-char MJXc-TeX-main-R" style="padding-top: 0.369em; padding-bottom: 0.369em;">5</span></span></span></span></span><script type="math/mml" id="MathJax-Element-28"><math display="inline" style="text-indent: 0em;" xmlns="http://www.w3.org/1998/Math/MathML"><mn>5</mn> <mo>+</mo> <mn>1</mn><mn>0</mn> <mo>=</mo> <mn>1</mn><mn>5</mn></math></script>
      мс</p>
      </li>
      </ol>
      <!--l. 142-->
      <p style="text-indent: 0em;">Итого, ответ <!--l. 142--><span class="MathJax_Preview" style="color: inherit; display: none;"></span><span id="MathJax-Element-29-Frame" class="mjx-chtml MathJax_CHTML" tabindex="0" style="font-size: 117%;"><span id="MJXc-Node-166" class="mjx-math" style="text-indent: 0em;"><span id="MJXc-Node-167" class="mjx-mrow"><span id="MJXc-Node-168" class="mjx-mrow"><span id="MJXc-Node-169" class="mjx-mo"><span class="mjx-char MJXc-TeX-main-R" style="padding-top: 0.491em; padding-bottom: 0.614em;">(</span></span><span id="MJXc-Node-170" class="mjx-mrow"><span id="MJXc-Node-171" class="mjx-mn"><span class="mjx-char MJXc-TeX-main-R" style="padding-top: 0.369em; padding-bottom: 0.369em;">2</span></span><span id="MJXc-Node-172" class="mjx-mn"><span class="mjx-char MJXc-TeX-main-R" style="padding-top: 0.369em; padding-bottom: 0.369em;">8</span></span><span id="MJXc-Node-173" class="mjx-mn"><span class="mjx-char MJXc-TeX-main-R" style="padding-top: 0.369em; padding-bottom: 0.369em;">4</span></span><span id="MJXc-Node-174" class="mjx-mo MJXc-space2"><span class="mjx-char MJXc-TeX-main-R" style="padding-top: 0.308em; padding-bottom: 0.43em;">+</span></span><span id="MJXc-Node-175" class="mjx-mn MJXc-space2"><span class="mjx-char MJXc-TeX-main-R" style="padding-top: 0.369em; padding-bottom: 0.369em;">1</span></span><span id="MJXc-Node-176" class="mjx-mn"><span class="mjx-char MJXc-TeX-main-R" style="padding-top: 0.369em; padding-bottom: 0.369em;">5</span></span></span><span id="MJXc-Node-177" class="mjx-mo"><span class="mjx-char MJXc-TeX-main-R" style="padding-top: 0.491em; padding-bottom: 0.614em;">)</span></span></span><span id="MJXc-Node-178" class="mjx-mo MJXc-space2"><span class="mjx-char MJXc-TeX-main-R" style="padding-top: 0.491em; padding-bottom: 0.614em;">∕</span></span><span id="MJXc-Node-179" class="mjx-mn MJXc-space2"><span class="mjx-char MJXc-TeX-main-R" style="padding-top: 0.369em; padding-bottom: 0.369em;">2</span></span><span id="MJXc-Node-180" class="mjx-mo MJXc-space3"><span class="mjx-char MJXc-TeX-main-R" style="padding-top: 0.064em; padding-bottom: 0.308em;">=</span></span><span id="MJXc-Node-181" class="mjx-mn MJXc-space3"><span class="mjx-char MJXc-TeX-main-R" style="padding-top: 0.369em; padding-bottom: 0.369em;">1</span></span><span id="MJXc-Node-182" class="mjx-mn"><span class="mjx-char MJXc-TeX-main-R" style="padding-top: 0.369em; padding-bottom: 0.369em;">4</span></span><span id="MJXc-Node-183" class="mjx-mn"><span class="mjx-char MJXc-TeX-main-R" style="padding-top: 0.369em; padding-bottom: 0.369em;">9</span></span><span id="MJXc-Node-184" class="mjx-mo"><span class="mjx-char MJXc-TeX-main-R" style="margin-top: -0.18em; padding-bottom: 0.369em;">.</span></span><span id="MJXc-Node-185" class="mjx-mn MJXc-space1"><span class="mjx-char MJXc-TeX-main-R" style="padding-top: 0.369em; padding-bottom: 0.369em;">5</span></span></span></span></span><script type="math/mml" id="MathJax-Element-29"><math display="inline" style="text-indent: 0em;" xmlns="http://www.w3.org/1998/Math/MathML"><mrow><mo>(</mo><mrow><mn>2</mn><mn>8</mn><mn>4</mn>
      <mo>+</mo> <mn>1</mn><mn>5</mn></mrow><mo>)</mo></mrow><mo>∕</mo><mn>2</mn> <mo>=</mo> <mn>1</mn><mn>4</mn><mn>9</mn><mo>.</mo><mn>5</mn></math></script>.
      </p>
      <p></p>
      <p></p>

   </div>
</div></div>