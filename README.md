
# Проект по автоматизации тестирования для сайта Сберлогистика
<p align="left">
<img src="images/sberlog.jpg"> 
</p>
<a target="_blank" href="https://sberlogistics.ru/">Сайт Сберлогистика</a>

## :white_circle: Содержание:

- [Технологии и инструменты](#earth_africa-технологии-и-инструменты)
- [Реализованные проверки](#earth_africa-Реализованные-проверки)
- [Сборка в Jenkins](#earth_africa-Jenkins-job)
- [Allure отчет](#earth_africa-Allure-отчет)
- [Интеграция с Allure TestOps](#earth_africa-Интеграция-с-Allure-TestOps)
- [Отчет в Telegram](#earth_africa-Уведомление-в-Telegram-при-помощи-бота)
- [Видео пример прохождения тестов](#earth_africa-Примеры-видео-о-прохождении-тестов)

## :green_circle: Технологии и инструменты

<p align="center">
<a href="https://www.jetbrains.com/idea/"><img src="images/idea.png" width="50" height="50"  alt="IDEA"/></a>
<a href="https://www.java.com/"><img src="images/java.png" width="50" height="50"  alt="Java"/></a>
<a href="https://github.com/"><img src="images/github.png" width="50" height="50"  alt="Github"/></a>
<a href="https://junit.org/junit5/"><img src="images/junit5.png" width="50" height="50"  alt="JUnit 5"/></a>
<a href="https://gradle.org/"><img src="images/gradle.png" width="50" height="50"  alt="Gradle"/></a>
<a href="https://selenide.org/"><img src="images/selenide.png" width="50" height="50"  alt="Selenide"/></a>
<a href="https://aerokube.com/selenoid/"><img src="images/selenoid.png" width="50" height="50"  alt="Selenoid"/></a>
<a href="https://github.com/allure-framework/allure2"><img src="images/allure.png" width="50" height="50"  alt="Allure"/></a>
<a href="https://www.jenkins.io/"><img src="images/jenkins.png" width="50" height="50"  alt="Jenkins"/></a>
</p>

## 	:heavy_check_mark: Реализованные проверки

- ✓ Проверка отправки формы заказа услуг по таможенному оформлению.
- ✓ Проверка отслеживания статуса отправлений.
- ✓ Проверка отправки формы запроса сотрудничества.
- ✓ Проверка отправки формы "Стать партнером".
- ✓ Проверка корректности содержания опубликованного пользователького соглашения.
- ✓ Проверка информации в разделе "Региональные офисы".
- ✓ Проверка отправки формы "Оформить доставку".


## <img src="images/jenkins.png" width="25" height="25"  alt="Jenkins"/></a> Jenkins job
<a target="_blank" href="https://jenkins.autotests.cloud/job/Logistics/">Сборка в Jenkins</a>
<p align="center">
<a href="https://jenkins.autotests.cloud/job/Logistics/"><img src="images/jenkinsjob.jpg" alt="Jenkins"/></a>
</p>

### Параметры сборки в Jenkins:

- browser (браузер, по умолчанию chrome)
- browserVersion 
- browserSize (размер окна браузера, по умолчанию 1920x1080)
- remoteDriverUrl (логин, пароль и адрес удаленного сервера selenoid)
- videoStorage (адрес, по которому можно получить видео)


## :computer: Запуск тестов из терминала

Локальный запуск:
```bash
gradle clean test
```

Удаленный запуск:
```bash
clean
test
-Dbrowser=${BROWSER}
-DbrowserVersion=${BROWSER_VERSION}
-DbrowserSize=${BROWSER_SIZE}
-DremoteDriverUrl=https://${LOGIN}:${PASSWORD}@${REMOTE_DRIVER_URL}/wd/hub/
-DvideoStorage=https://${REMOTE_DRIVER_URL}/video/
```

## <img src="images/allure.png" width="25" height="25"  alt="Allure"/></a> Отчет в <a target="_blank" href="https://jenkins.autotests.cloud/job/Logistics/allure/">Allure report</a>

### Основное окно

<p align="center">
<img title="Allure Overview Dashboard" src="images/allurereport.jpg">
</p>

### Тесты

<p align="center">
<img title="Allure Tests" src="images/testscreen.jpg">
</p>

### Графики прохождения тестов

<p align="center">
<img title="Allure Graphics" src="images/graphs.png">
</p>

## <img src="images/allure_testopslogo.svg" width="25" height="25"  alt="Allure"/></a>Интеграция с Allure TestOps

### Дашборд

<p align="center">
<img title="Allure TestOps Dashboard" src="images/testops.jpg">
</p>

### Тест-кейсы

<p align="center">
<img title="Allure TestOps Tests" src="images/testops1.jpg">
</p>

## <img src="images/telegram.png" width="25" height="25"  alt="Allure"/></a> Уведомление в Telegram при помощи бота

<p align="center">
<img title="Allure Overview Dashboard" src="images/telegram_notifications.jpg">
</p>



### <img src="images/selenoid.png" width="25" height="25"  alt="Allure"/></a> Видео прохождения тестов

<p align="center">
<img title="Selenoid Video" src="images/video_tests.gif" width="950" height="550"  alt="video"> </p>
