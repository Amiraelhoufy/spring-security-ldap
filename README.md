# Spring Security with LDAP Authentication
A simple spring boot application showing how to integrate LDAP (Lightweight Directory Access Protocol) authentication using Spring Security. The configuration allows users to authenticate via an LDAP server.

# Features
- LDAP-based authentication with Spring Security.
- Simple, easy-to-understand implementation based on official Spring documentation
 ```https://spring.io/guides/gs/authenticating-ldap```

## Running the Application
1. **Clone the repository:**
   ```bash
   git clone https://github.com/Amiraelhoufy/spring-security-ldap.git
   cd spring-security-ldap
    ```

2. **Build and run the application:**

 ```bash 
    mvn spring-boot:run
 ```

The application will run on  ```http://localhost:8080 ```

3. **Use the following test credentials (from the default embedded LDAP server) to log in:**
- **Username**:  ```ben ```
- **Password**:  ```benspassword ```

# Project Structure
- **src/main/java**: Contains the source code, including security configuration and controller.
- **src/main/resources**: Contains application properties and LDAP configuration.
- **LDAP Server Configuration:**
This application uses an embedded LDAP server by default. The configuration can be found in the application.properties file.

# Dependencies
To set up LDAP authentication, the following dependencies are included in the pom.xml file:
 ```xml
<dependencies>
    <dependency>
        <groupId>org.springframework.security</groupId>
        <artifactId>spring-security-ldap</artifactId>
    </dependency>
    <dependency>
        <groupId>org.springframework.ldap</groupId>
        <artifactId>spring-ldap-core</artifactId>
    </dependency>
    <dependency>
        <groupId>com.unboundid</groupId>
        <artifactId>unboundid-ldapsdk</artifactId>
    </dependency>
</dependencies>
 ```
