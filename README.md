# Spring Boot To-Do

Веб-приложение ToDo ( список задач ). Позволяет добавлять, редактировать, удалять и отмечать задачи как завершённые.

---

## Используемые Технологии

- Java 17.0.14
- Maven
- Spring Boot 3.5.0
- Docker
  
---

## Зависимости - Dependency 

- Spring Web
- Thymeleaf
- Spring Data JPA
- H2 Database
- Validation
- Lombok
- Bootstrap 5.3.5
- Bootstrap-Icons 1.13.1

---

# Установка и запуск

1. Установите Java JDK 17<br />
Скачать можно с  Adoptium <br /> https://adoptium.net/temurin/releases/?version=17&os=any&arch=any

2. Откройте терминал/командную строку.
3. Клонируйте репозиторий:

```bash
git clone https://github.com/Alivaros/WEB-repos.git
```

4. Перейдите в директорию проекта
```bash
cd WEB-repos
```

## Docker

1. Убедитесь, что у вас установлен Docker и Docker Compose. Docker Compose включён в Docker Desktop. <br /> 
Скачать Docker Desktop можно с официального сайта <br />https://www.docker.com/products/docker-desktop/

2. Введите в терминал/командную строку команду для сборки и запуска контейнеров:
   
```bash
docker-compose up --build
```

3. Перейдите в браузере по адресу:
  http://localhost:3000

4. Для остановки введите

```bash
docker-compose down
```

## Запуск без использования Docker и Docker Compose.

1. Введите в терминал/командную строку

```bash
mvnw spring-boot:run
```

*Для Windows PowerShell используйте*

```bash
./mvnw spring-boot:run
```


2. Перейдите в браузере по адресу:
    http://localhost:8000

3. Для остановки нажмите  `CTRL+C` находясь в открытом терминале/командной строке, где запущено приложение 
