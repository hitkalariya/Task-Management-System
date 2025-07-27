# 🚀 Task Management API

A robust REST API built with **Spring Boot** for managing tasks efficiently. This project demonstrates modern Java development practices including dependency injection, database integration, and automated scheduling.

## ✨ Key Features

- **RESTful API Design** - Clean, intuitive endpoints for task operations
- **H2 In-Memory Database** - Fast, lightweight data persistence
- **Spring Boot Framework** - Production-ready application foundation
- **Global Exception Handling** - Consistent error responses across all endpoints
- **Automated Task Scheduling** - Background processes for task management
- **Environment Profiles** - Separate configurations for dev/prod environments

## 🛠️ Technology Stack

| Component | Technology |
|-----------|------------|
| **Backend Framework** | Spring Boot 3.x |
| **Database** | H2 (In-Memory) |
| **Build Tool** | Maven |
| **Java Version** | JDK 17+ |
| **API Documentation** | RESTful Endpoints |

## 🚀 Quick Start

### Prerequisites
- Java 17 or higher
- Maven 3.6+
- Your favorite IDE (IntelliJ IDEA, Eclipse, VS Code)

### Installation Steps

1. **Clone the Repository**
   ```bash
   git clone https://github.com/your-username/Task-Management-System
   cd Task-Management-System
   ```

2. **Build the Project**
   ```bash
   mvn clean install
   ```

3. **Run the Application**
   ```bash
   mvn spring-boot:run
   ```

4. **Access the Application**
   - API Base URL: `http://localhost:8080`
   - H2 Console: `http://localhost:8080/h2-console`
   - Database URL: `jdbc:h2:mem:testdb`

## 📋 API Documentation

### Task Management Endpoints

#### Get All Tasks
```http
GET /tasks
```

**Response:**
```json
[
  {
    "id": 1,
    "name": "Complete project documentation",
    "completed": false
  }
]
```

#### Create New Task
```http
POST /tasks
Content-Type: application/json

{
  "name": "Implement user authentication",
  "completed": false
}
```

#### Update Task
```http
PUT /tasks/{id}
Content-Type: application/json

{
  "name": "Updated task name",
  "completed": true
}
```

#### Delete Task
```http
DELETE /tasks/{id}
```

## ⚙️ Configuration

### Application Properties
```properties
# Database Configuration
spring.datasource.url=jdbc:h2:mem:testdb
spring.datasource.driverClassName=org.h2.Driver
spring.jpa.hibernate.ddl-auto=update

# H2 Console
spring.h2.console.enabled=true
spring.h2.console.path=/h2-console

# Server Configuration
server.port=8080
```

### Environment Profiles

#### Development Profile
```bash
mvn spring-boot:run -Dspring-boot.run.profiles=dev
```
- Port: 8081
- Debug logging enabled

#### Production Profile
```bash
mvn spring-boot:run -Dspring-boot.run.profiles=prod
```
- Port: 8082
- Optimized for performance

## 🔧 Project Structure

```
src/
├── main/
│   ├── java/
│   │   └── com/taskmanagerspringbootapi/apiapp/
│   │       ├── controller/     # REST API endpoints
│   │       ├── service/        # Business logic layer
│   │       ├── repository/     # Data access layer
│   │       ├── entity/         # JPA entities
│   │       ├── exception/      # Global exception handling
│   │       └── scheduler/      # Background task scheduling
│   └── resources/
│       ├── application.properties
│       ├── application-dev.properties
│       └── application-prod.properties
└── test/
    └── java/
        └── com/taskmanagerspringbootapi/apiapp/
            └── ApiappApplicationTests.java
```

## 🎯 Core Components

### Controller Layer
- **TaskController**: Handles HTTP requests for task operations
- RESTful design with proper HTTP status codes
- JSON request/response handling

### Service Layer
- **TaskService**: Contains business logic for task management
- Transaction management
- Data validation and processing

### Repository Layer
- **TaskRepository**: JPA repository for database operations
- Extends JpaRepository for CRUD operations
- Custom query methods support

### Entity Layer
- **Task**: JPA entity with proper annotations
- Automatic ID generation
- Data validation constraints

## 🔄 Background Processing

The application includes automated task scheduling that runs every 5 seconds to perform maintenance operations and generate system reports.

## 🛡️ Error Handling

Comprehensive exception handling with consistent error responses:

```json
{
  "message": "Error: Task not found with ID 123"
}
```

## 🧪 Testing

Run the test suite:
```bash
mvn test
```

## 📈 Future Roadmap

- [ ] User authentication and authorization
- [ ] PostgreSQL/MySQL database integration
- [ ] Comprehensive unit and integration tests
- [ ] API documentation with Swagger/OpenAPI
- [ ] Docker containerization
- [ ] CI/CD pipeline setup

## 🤝 Contributing

1. Fork the repository
2. Create a feature branch (`git checkout -b feature/amazing-feature`)
3. Commit your changes (`git commit -m 'Add amazing feature'`)
4. Push to the branch (`git push origin feature/amazing-feature`)
5. Open a Pull Request

## 📄 License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## 📞 Support

For questions and support, please contact:
- **Email**: support@taskmanager.com
- **LinkedIn**: [Your Professional Profile](https://www.linkedin.com/in/your-profile/)

---

**Built with ❤️ using Spring Boot**
