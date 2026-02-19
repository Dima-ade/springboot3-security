# springboot3-security

AUthentication and authorization in Spring Boot

https://www.geeksforgeeks.org/springboot/spring-boot-3-0-jwt-authentication-with-spring-security-using-mysql-database/

The database used is Postgresql. The database university must be manually created.

The end points:

- http://localhost:8080/auth/addNewUser POST, without authentication
 {
     "name": "ana",
     "password": "123",
     "email": "ana@yahoo.com",
     "roles": "ROLE_USER"
 }
 - http://localhost:8080/auth/generateToken POST, without authentication
 {
     "username": "ana@yahoo.com",
     "password": "123"
 }
 - http://localhost:8080/auth/user/userProfile GET with Header Authorization Bearer token-generated-above
