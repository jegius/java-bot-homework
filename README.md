## Описание проекта

Данный проект предназначен для создания и запуска Telegram бота, который умеет обрабатывать простые команды и интерактивно отвечать пользователям. Бот реализован на Java с использованием Spring-like внедрения зависимостей (Dependency Injection, DI).

Цель обучения - научить участников основам работы с Telegram API для ботов, закрепить практические навыки программирования на Java и ознакомить с концепцией DI и контейнерами, аналогичными использующимся в Spring Framework.

## Установка и настройка Java и Maven

### Windows

1. Скачайте и установите JDK (Java Development Kit) с официального сайта Oracle или AdoptOpenJDK.
2. Установите переменные среды для `JAVA_HOME` и обновите `PATH`, добавив путь к исполняемым файлам JDK.
3. Скачайте и распакуйте Maven с официального сайта Apache.
4. Добавьте путь к папке `bin` Maven в переменную среды `PATH`.
5. Проверьте установку, выполните в командной строке:
   ```
   java -version
   mvn -version
   ```

### Unix/Linux

1. Установите JDK через менеджер пакетов в зависимости от вашего дистрибутива.
2. Настройте переменные окружения `JAVA_HOME` и `PATH`.
3. Установите Maven, используя менеджер пакетов вашего дистрибутива.
4. Проверьте установку, выполните в терминале:
   ```
   java -version
   mvn -version
   ```

### macOS

1. Установите Homebrew, если он еще не установлен.
2. Установите JDK и Maven с помощью команд:
   ```
   brew cask install adoptopenjdk
   brew install maven
   ```
3. Проверьте установку JDK и Maven, запустив:
   ```
   java -version
   mvn -version
   ```

## Запуск бота

Для запуска бота выполните следующие шаги:

1. Клонируйте репозиторий проекта на свой локальный компьютер.
2. Перейдите в корневую директорию проекта.
3. Настройте параметры бота (`YOUR_BOT_USERNAME` и `YOUR_BOT_TOKEN`) в классе `Bot`.
4. Запустите Maven проект при помощи команды:
   ```
   mvn clean install
   ```
5. Запустите приложение используя команду:
   ```
   mvn exec:java -Dexec.mainClass="org.homework.Main"
   ```

## Основные зависимости проекта

- org.reflections: пакет для работы механизма рефлексии и сканирования классов аннотированных DI аннотациями.
- org.slf4j: API для логгирования.
- ch.qos.logback: реализация для slf4j.
- org.telegram.telegrambots: библиотека для создания ботов Telegram.
- org.apache.httpcomponents: клиент для HTTP запросов.

## Регистрация бота в Telegram через BotFather

Для того чтобы ваш бот начал функционировать, вам необходимо создать его в Telegram и получить уникальный токен. Благодаря токену бот может отправлять и получать сообщения. Используйте следующие шаги:

1. Откройте Telegram и найдите пользователя с именем [@BotFather](https://t.me/botfather), это официальный бот Telegram для создания и управления ботами.
2. Отправьте команду `/newbot`, чтобы начать процесс создания нового бота.
3. BotFather попросит вас ввести имя для вашего бота. Это имя будет отображаться в контактах Telegram.
4. Затем вам нужно будет создать уникальное имя пользователя (username) для вашего бота, которое должно заканчиваться на `bot` (например, `sample_bot`).
5. Если все было сделано правильно, BotFather создаст бота и предоставит вам токен доступа (секретный ключ), который необходимо будет использовать в вашем коде для аутентификации бота в Telegram API.
6. Сохраните полученный токен, вы введете его позже в конфигурационный файл или передадите непосредственно в код бота, как описано в разделе "Запуск бота".

Никому не разглашайте токен и не загружайте его в публичные хранилища, так как с помощью этого токена можно управлять вашим ботом.

## Завершение настройки бота

После получения токена от BotFather:

1. Замените placeholder `YOUR_BOT_TOKEN` в классе `Bot` или в файле конфигурации на реальный токен, который вы получили.
2. Если бот будет взаимодействовать с пользователем через username, укажите это имя вместо `YOUR_BOT_USERNAME`.

Теперь запустите приложение согласно инструкциям в разделе "Запуск бота", и ваш бот будет готов к использованию.

Для изменения настроек бота или для сброса токена в будущем, вы можете в любой момент обратиться к BotFather и использовать команды `/setname`, `/setusername`, `/settoken` и другие.

## Последующее использование и масштабирование бота

После запуска ваш бот может потребовать дополнительных настроек и оптимизаций. Вы можете реализовывать новые команды и функции, ориентируясь на потребности ваших пользователей, и масштабировать сервисы в соответствии с возрастающей нагрузкой. Рассмотрите возможность логгирования, мониторинга и обеспечения безопасности вашего Telegram бота.

## Навигационные ссылки (примеры)

- [Класс Bot](src/main/java/org/homework/bot/Bot.java)
- [Класс DIContainer](src/main/java/org/homework/di/DIContainer.java)
- [Интерфейсы API](src/main/java/org/homework/api)
- [Реализация сервисов](src/main/java/org/homework/services)
- [Модель данных](src/main/java/org/homework/model)
- [Логгирование](src/main/java/org/homework/logger)
