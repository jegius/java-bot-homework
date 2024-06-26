Добро пожаловать в корневую директорию проекта Telegram-бота для студентов. Эта директория содержит ключевые компоненты приложения, включая точку входа.

## Содержание

- [Краткое Введение](#краткое-введение)
- [Описание Класса Main](#описание-класса-main)
- [Навигация](#навигация)

## Краткое Введение

Этот репозиторий предназначен для разработки Telegram-бота. Корневая директория `org.homework` включает в себя классы, которые обеспечивают запуск и инициализацию бота, а также связь различных сервисов бота с использованием Dependency Injection (внедрение зависимостей).

## Описание Класса Main

### Main

`Main` является основным классом, содержащим `public static void main` метод, который служит точкой входа в приложение.

#### Основные характеристики и функции Main:
- Создание контейнера зависимостей `DIContainer`, который управляет жизненным циклом сервисов.
- Инициализация `TelegramBotsApi` для создания сессии бота.
- Регистрация экземпляра `Bot`, который обрабатывает обновления и команды от пользователей Telegram.

При возникновении исключения `TelegramApiException` (например, при ошибке регистрации бота), ошибка выводится в стандартный поток ошибок с помощью `e.printStackTrace()`.

## Навигация

Для получения информации о структуре проекта, инструкциях по разработке и документации по использованным библиотекам и фреймворкам, пожалуйста, перейдите к основному [README.md](../../README.md) файлу в корневой директории проекта `java-bot-homework`.

Произведите следующие шаги для запуска бота:

1. Склонируйте репозиторий на вашу локальную машину.
2. Установите все зависимости, указанные в файле `pom.xml`.
3. Запустите `Main` класс.

Не забудьте настроить файл конфигурации, создав файл `application.properties` в каталоге ресурсов (`src/main/resources`), где вы укажете токен для вашего бота и другие необходимые параметры.

Для разработчиков, желающих добавить новую функциональность или сервис в проект, рекомендуем ознакомиться с пакетом `org.homework.services`, где находятся основные интерфейсы и реализации сервисов.