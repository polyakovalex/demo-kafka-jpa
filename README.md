# Общее описание
прототипы микросервсив

## 1) Установка ПО
#### Необходимо установить следующее ПО:

* Open JDK 11
* Apache Maven
* GIT

## 2) Используемый стэк

|         Назначение          |   Технология                                            |
| ----------------------------| ------------------------------------------------------- |
| Среда выполнения            | [Spring Boot](https://spring.io/projects/spring-boot) |
| Обработка REST запросов     | [Spring Web MVC](https://docs.spring.io/spring/docs/current/spring-framework-reference/web.html) |
| Мониторинг                  | [Spring Boot Actuator](https://www.baeldung.com/spring-boot-actuators) |

# Структура проекта
```
demo - корневой модуль демок
│
└── demo-mq-mybatys - Образец микросервиса взаимодействия очереди IBM MQ с БД MS SQL через MyBatis (написание SQL)
│
└── common - Библиотека с набором общих классов
│
└── router - Маршрутизатор входящих файлов
│
└── sender - Модуль занимающийся формированием ответного пакета и его отправкой в шлюз