# 📝 Spring MVC Todo App

This is a simple **Spring Web MVC** based Todo application built for learning and understanding core concepts of Spring MVC.

---

## 🚀 Features

* Add new Todo
* View all Todos
* Store data temporarily using `ServletContext`
* Display success messages using Flash Attributes
* Responsive UI using Bootstrap

---

## 🧠 Concepts Covered

* Spring MVC Architecture
* DispatcherServlet
* Controller (`@Controller`)
* Request Mapping (`@GetMapping`, `@PostMapping`)
* Model & Data Binding (`@ModelAttribute`)
* JSP with JSTL
* Form Handling using Spring Form Tags
* Redirect (PRG Pattern)
* Flash Attributes
* ServletContext (Application Scope)
* ServletContextListener

---

## 🛠️ Tech Stack

* Java
* Spring MVC (XML Configuration)
* JSP & JSTL
* Apache Tomcat
* Bootstrap

---

## 📂 Project Structure

```
com.todo
 ├── controller
 │    └── HomeController.java
 ├── entities
 │    └── Todo.java
 ├── listener
 │    └── MyListener.java
```

---

## 🔁 Application Flow

1. User opens `/home`
2. Clicks **Add Todo**
3. Fills form and submits
4. Data stored in `ServletContext`
5. Redirects to home page
6. Todos displayed in list

---

## ⚠️ Note

* This project uses **in-memory storage (ArrayList)**
* Data will be lost when server restarts
* This is intended for learning purposes only

---

## 🚀 Future Improvements

* Add Update (Edit Todo)
* Add Delete functionality
* Integrate MySQL Database
* Convert to Spring Boot

---

## 📌 Author

**Om Solanki**
