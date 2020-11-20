<h1 class="title">Диалоги по UCM (31%)</h1>
<p><a href="https://acmp.ru/index.asp?main=task&id_task=877" target="_blank">Ссылка на задачу</a></p>
<p><b>Время: 1 сек.<br>Память: 16 Мб<br>Сложность: 31%</b></p>
<p class=text>
Федя живет активной жизнью онлайн. Он легко ищет самые сложные рефераты, используя всемирно известные поисковые машины, скачивает музыку и делится ею с друзьями, он присоединился к многим популярным сообществам в Jивом Jурнале. И конечно же, он много общается с интернет-друзьями по UCM (You Seek Me)  известному чат-клиенту.
</p>
<p class=text>
Федя учится в школе. В школе изучают русский язык. Однажды учительница задала домашнее задание  написать не менее 10-15 фраз, используя косвенную речь. Феде лень переписывать стандартные фразы из школьных учебников, он хочет мыслить нестандартно. И вот у Феди блеснула оригинальная идея – а не взять ли несколько диалогов из его любимого UCM и не перевести ли их в косвенную речь?
</p>
<p class=text>
Идея хороша, но, к сожалению, Федя не умеет программировать, так как его еще не учили этому в школе. Помогите ему!
</p>
<h2>Формат ввода</h2>
<p class=text>
Во входном файле находится распечатка одного из диалогов по UCM. В первой строке находится сообщение о том, что собеседник Феди вошел с ним в контакт. Оно выглядит так:
</p>
<p class=text>
ЧЧ:ММ:СС: <Имя> signed on
</p>
<p class=text>
где ЧЧ:ММ:СС – время, когда собеседник вошел в контакт, <Имя> – имя собеседника, записанное в транслите (английскими буквами). Любое число в отображении времени занимает две цифры, например, 9 часов 43 минуты 5 секунд будет выглядеть как 09:43:05.
</p>
<p class=text>
В каждой из последующих строк (кроме самой последней строки файла) находится реплика участника диалога. Если каждой реплике присвоить ее порядковый номер (начиная с единицы), то нечетные реплики были произнесены Федей, а четные – его собеседником.
</p>
<p class=text>
Реплика находится целиком на одной строке и состоит из метки времени, смысловой части и знака препинания конца предложения.
</p>
<p class=text>
Метка времени имеет вид ЧЧ:ММ:СС:.
</p>
<p class=text>
Смысловая часть отделена от метки времени пробелом и содержит текст, состоящий из больших или маленьких английских букв, цифр, пробелов, апострофов (заменяют мягкий и твердый знаки в транслите), а также запятых, точек с запятыми и круглых скобок.
</p>
<p class=text>
Знак препинания – это восклицательный знак, вопросительный знак или точка. Он может быть опущен, в этом случае подразумевается точка.
</p>
<p class=text>
Пример реплики:
</p>
<p class=text>
11:22:33: Ya skazal etu frazu.
</p>
<p class=text>
Последняя строка файла имеет вид
</p>
<p class=text>
ЧЧ:ММ:СС: <Имя> signed off
</p>
<p class=text>
где <Имя> – имя все того же собеседника.
</p>
<p class=text>
Объем входного файла не превышает 20 килобайт. Длина каждой строки не превосходит 250 символов.
</p>
<h2>Формат вывода</h2>
<p class=text>
В выходной файл OUTPUT.TXT выведите для каждой реплики ее же, преобразованную в косвенную речь. Преобразование заключается в следующем. Сначала заключите реплику в двойные кавычки, при этом если она оканчивается на точку, то вместо точки поставьте запятую, иначе оставьте знак препинания без изменений, например:
</p>
<p class=text>
Zakanchivayu tochkoi. &#8594; «Zakanchivayu tochkoi,»
Eto voskhititel'no!	&#8594; «Eto voskhititel'no!»
</p>
<p class=text>
Затем поставьте пробел, три знака «–» (тире) и снова пробел, после чего выведите слово «ѕkazal» и имя собеседника, произнесшего эту реплику. После имени выведите точку. Федя запишется как «Fedya», имя его собеседника можно узнать из первой строки входного файла.
</p>
<h3>Примеры</h3>
<table class="sample-tests">
  <thead>
     <tr>
        <th>Ввод</th>
        <th>Вывод</th>
     </tr>
  </thead>
  <tbody>
     <tr>
        <td>08:59:59: Vasya signed on<br>
            09:00:00: Privet!<br>
            09:00:31: Privet<br>
            09:00:59: Vasya signed off</td>
        <td>"Privet!" --- skazal Fedya.<br>
            "Privet," --- skazal Vasya.</td>
     </tr>
  </tbody>
</table>