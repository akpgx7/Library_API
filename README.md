# 📚 Library_API

**Library_API** is a Spring Boot-based RESTful API for managing a library system. It supports operations such as adding, updating, and retrieving books, authors, and users. The project is backed by a MySQL database and can be integrated with a frontend using HTML, CSS, and JavaScript.

---

## 🛠️ Tech Stack

- **Backend**: Java, Spring Boot, Spring Data JPA
- **Database**: MySQL
- **Frontend**: HTML, CSS, JavaScript
- **Tools & Libraries**: Maven, Lombok, Hibernate

---

## 📁 Project Structure
<p>
Library_API/<br>
├── src/<br>
│   ├── main/<br>
│   │   ├── java/<br>
│   │   │   └── com/<br>
│   │   │       └── library/<br>
│   │   │           └── api/<br>
│   │   │               ├── controller/<br>
│   │   │               ├── model/<br>
│   │   │               ├── repository/<br>
│   │   │               └── service/<br>
│   │   └── resources/<br>
│   │       ├── application.properties<br>
│   │       └── static/          # For HTML, CSS, JS files<br>
├── pom.xml<br>
└── README.md<br>
</p>

---

## 🚀 Getting Started

### Prerequisites

- Java 17 or later
- Maven
- MySQL Server

### Screenshot
#### Frontend
![image](https://github.com/user-attachments/assets/1f3a1463-19e4-4a8f-931c-c839d31eb736)
#### Database
![image](https://github.com/user-attachments/assets/5010c9b0-fd43-4e0d-804b-9e90bfef7315)

### Setup

1. **Clone the Repository**

```bash
git clone https://github.com/akpgx7/Library_API.git
cd Library_API
```
---

2. **🛠️ Configure Database**

Edit `src/main/resources/application.properties` and update your MySQL credentials:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/library_db
spring.datasource.username=your_mysql_username
spring.datasource.password=your_mysql_password
spring.jpa.hibernate.ddl-auto=update
```
---

3. **Run the Application**

```bash
mvn spring-boot:run
```
---

4. **🔧 Features**

📖 Add and fetch books
👤 Manage authors and users
🔍 Search functionality
🗃️ RESTful endpoints with JSON support
🧩 Frontend-ready integration with HTML/JS

## ✍️ Author
**Aman Prajapati**

📬 **Don't forget to reach out if you have any questions or suggestions!**  
Feel free to open an issue or contact me via [akpgx7@gmail.com](mailto:akpgx7@gmail.com).
