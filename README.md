# Employee CRUD API with DAO, Service, and REST Controller

## Description
This project is a RESTful API for managing employee data, built with Spring Boot. It supports CRUD operations (Create, Read, Update, Delete) and demonstrates a traditional layered architecture using DAO, Service, and REST Controller.

## Technologies Used
- Spring Boot 3
- Spring 6
- Hibernate (JPA)
- MySQL
- Maven
- Swagger UI for API documentation and testing

### Dependencies
- **springdoc-openapi-starter-webmvc-ui**: Added to enable Swagger UI for interactive API documentation and testing (version 2.8.9).

## How to Run the Project
1. **Clone the repository**:
   ```bash
   git clone https://github.com/abdalrhman002/employee-crud-dao-service-rest.git
   ```
2. **Navigate to the directory**:
   ```bash
   cd employee-crud-dao-service-rest
   ```
3. **Set up the database**:
    - Create a MySQL database named `employee_db`.
    - Update `application.properties` with your database credentials.
4. **Run the application**:
   ```bash
   mvn spring-boot:run
   ```
5. **Access Swagger UI**:
    - Open your browser and go to `http://localhost:8080/ui.html`.
    - Use Swagger UI to explore and test the API endpoints interactively.

## Approach Explanation
This project uses a classic three-layer architecture:
- **DAO (Data Access Object)**: Handles database interactions using `EntityManager`.
- **Service Layer**: Contains business logic and transaction management.
- **REST Controller**: Defines API endpoints and handles HTTP requests.

This approach provides fine-grained control over each layer, making it ideal for understanding how Spring Boot manages data flow from the database to the client.

## API Documentation
- **Swagger UI**: Available at `http://localhost:8080/ui.html` for interactive API testing.
- **OpenAPI Docs**: Available at `http://localhost:8080/api-doc` for the API specification.

## Related Projects
Explore other implementations:
- [Spring Data JPA Version](https://github.com/abdalrhman002/employee-crud-spring-data-jpa)
- [Spring Data REST Version](https://github.com/abdalrhman002/employee-crud-spring-data-rest)