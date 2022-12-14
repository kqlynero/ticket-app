# 🎞Cinema shop🎞
![image](https://user-images.githubusercontent.com/83237769/182023095-422653b6-b86f-4a2d-8257-3986492dae3e.png)
## 👨‍💻General description
This is a simple web application that supports authentication, registration, and other CRUD operations. We can buy tickets, choose the cinema hall and movie. The cinema shop has a 3-layer design in compliance with REST technology:
* Controllers
* Service
* DAO

## 🚷All features by endpoint with authority

The role system is also implemented in this application. Each user has certain restrictions, depending on their role:
- **[POST]** `/register` - all
- **[GET]** `/cinema-halls` - user/admin
- **[POST]** `/cinema-halls` - admin
- **[GET]** `/movies` - user/admin
- **[POST]** `/movies` - admin
- **[GET]** `/movie-sessions/available` - user/admin
- **[POST]** `/movie-sessions` - admin
- **[PUT]** `/movie-sessions/{id}` - admin
- **[DELETE]** `/movie-sessions/{id}` - admin
- **[GET]** `/orders` - user
- **[POST]** `/orders/complete` - user
- **[PUT]** `/shopping-carts/movie-sessions` - user
- **[GET]** `/shopping-carts/by-user` - user
- **[GET]** `/users/by-email` - admin
 

## 💻Used technologies

* Java 11+
* MySQL 8.0.29
* Maven
* Hibernate technologies:
* * Annotations
* * Criteria API
* * HQL
* Spring technologies:
* * Spring Core
* * Sping Web MVC
* * Spring Security

## ⚙Implementations

* Registration
* Authentication
* Add new movies, and cinema halls and create new movie session
* Buy tickets and add them to your shopping cart
* After order, your shopping cart will be empty, and we can take new order
* Sign in and logout user

## How to run this project

* Download and install MySQL, Maven, JDK 11+, Tomcat 9
* Clone project from the repository
* Configure file db.properties
* Create a connection to your DB
* Add Tomcat configuration (root must be "/")
* Run application

## Database structure

![image](https://user-images.githubusercontent.com/83237769/182023806-9440f8c2-9847-45b2-8c15-1bc28408b1e0.png)
