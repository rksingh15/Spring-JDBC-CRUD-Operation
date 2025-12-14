# Spring JDBC CRUD Operation

This project demonstrates basic **CRUD (Create, Read, Update, Delete)** operations using **Spring JDBC**.

## 📌 Project Structure

* **Student.java** – Model class representing the student entity
* **Student_rowMapper.java** – RowMapper implementation for mapping result set to Student object
* **Spring_Config.java** – Spring configuration class
* **App.java** – Main class to run CRUD operations

---

## ⚙️ Technologies Used

* Java
* Spring Core
* Spring JDBC
* MySQL / Any relational DB

---

## 🛠️ CRUD Operations Implemented

### ✔ Create (Insert)

Insert a new student into the database.

### ✔ Read (Select)

Fetch all students or a specific student.

### ✔ Update

Modify existing student record.

### ✔ Delete

Remove a student record from the database.

---

## 📦 How to Run

1. Add database credentials in **Spring_Config.java**
2. Create the required table:

```sql
CREATE TABLE student (
  id INT PRIMARY KEY,
  name1 VARCHAR(50),
  gender VARCHAR(10)
);
```

3. Run **App.java** from your IDE.

---

## 📝 Notes

* Make sure MySQL server is running.
* Add Spring dependencies in your `pom.xml` if using Maven.

---

## ✨ Author

## – Spring JDBC Beginner Project

---

If you want to add screenshots, examples, or enhance formatting, let me know!
