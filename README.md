# Microservice Course

## App Architecture

![architecure image](img.png)

##### **fronted available in the [repo](https://github.com/devgithinji/course-purchase-microservice-frontend)**

Techologies used

Spring Boot

Spring Cloud Gateway

Spring Cloud OpenFeign

Spring Cloud Netflix (Dicovery service)

Maven

PostgreSql

MySql

## Endpoints

### Save Course

```
POST /api/course HTTP/1.1
Host: localhost:3333
Authorization: Basic cmFuZG9tU2VjdXJlS2V5VXNlcm5hbWUhOnJhbmRvbVNlY3VyZUtleVBhc3N3b3JkIQ==
Content-Type: application/json
Cookie: JSESSIONID=72BD06831B7758346A498049A60A6AC3
Content-Length: 68

{
    "title": "nam",
    "subtitle": "impedit",
    "price": "85"
}
```

### Get Courses

```
GET /api/course HTTP/1.1
Host: localhost:3333
Authorization: Basic cmFuZG9tU2VjdXJlS2V5VXNlcm5hbWUhOnJhbmRvbVNlY3VyZUtleVBhc3N3b3JkIQ==
Content-Type: application/json

{
    "title": "molestiae",
    "subtitle": "temporibus",
    "price": "85"
}
```

### Delete Course

```
DELETE /api/course/10 HTTP/1.1
Host: localhost:3333
Authorization: Basic cmFuZG9tU2VjdXJlS2V5VXNlcm5hbWUhOnJhbmRvbVNlY3VyZUtleVBhc3N3b3JkIQ==
Content-Type: application/json

{
    "title": "sit",
    "subtitle": "occaecati",
    "price": "85"
}
```

### Purchase Course

```
POST /api/purchase HTTP/1.1
Host: localhost:3334
Authorization: Basic cmFuZG9tU2VjdXJlS2V5VXNlcm5hbWUhOnJhbmRvbVNlY3VyZUtleVBhc3N3b3JkIQ==
Content-Type: application/json

{
    "userId": "1",
    "courseId": "1",
    "title":"course-1",
    "price": "58"
}
```

### Get Purchases of a User

```
GET /api/purchase/1 HTTP/1.1
Host: localhost:3334
Authorization: Basic cmFuZG9tU2VjdXJlS2V5VXNlcm5hbWUhOnJhbmRvbVNlY3VyZUtleVBhc3N3b3JkIQ==
Content-Type: application/json

{
    "title": "quo",
    "subtitle": "et",
    "price": "58"
}
```
