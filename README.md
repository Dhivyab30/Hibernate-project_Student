# Hibernate-project_Student

This project is a simple CRUD (Create, Read, Update, Delete) application using Hibernate ORM and JPA annotations.
It manages Student records in a database, allowing insertion, retrieval, modification, and deletion of student data. The application demonstrates how Hibernate simplifies database interactions compared to plain JDBC.

🚀Getting Started:
-------------------
1. Clone or download the project repository.

2. Configure your database connection in hibernate.cfg.xml.

3. Include required libraries (Hibernate, JPA, JDBC driver) in your project.

4. Run the CRUDApp.java class to perform CRUD operations.


🧱 Prerequisites:
---------------

✓ Java JDK 11 or higher

✓ IDE (Eclipse, IntelliJ IDEA, or NetBeans)

✓ MySQL or H2 database

✓ Hibernate ORM 6.x or compatible version

✓ JDBC Driver for your database

Requirement Version / Tools:
-----------------------------
Tool / Software.   	Version / Requirement

Java	                         11+
Hibernate ORM.                 6.x
Database	                     MySQL 8 / H2
IDE	                           Eclipse / IntelliJ
Maven (optional)	             3.x

Database Table Required:
------------------------
Table: Student

Column Name	          Data Type	        Constraint

sid	                    INT	             PRIMARY KEY
sName                 	VARCHAR	         NOT NULL
sLocation	              VARCHAR	

 
⚙️ Installation Steps:
---------------------
1. Install Java JDK and set JAVA_HOME.


2. Install MySQL or H2 database.


3. Clone the repository:

git clone <repository-url>


4. Add Hibernate and JDBC driver libraries to the project classpath (or Maven dependencies).

Example Maven dependencies:
---------------------------
<dependency>
    <groupId>org.hibernate.orm</groupId>
    <artifactId>hibernate-core</artifactId>
    <version>6.3.0.Final</version>
</dependency>
<dependency>
    <groupId>mysql</groupId>
    <artifactId>mysql-connector-java</artifactId>
    <version>8.0.36</version>
</dependency>

5. Configure hibernate.cfg.xml with your database details.

🧑‍💻 Usage / Running the Application:
---------------------------------
1. Open CRUDApp.java.


2. Uncomment the CRUD operation you want to perform (Insert, Read, Update, Delete).


3. Run the main method.


4. Observe console output and check database table for changes.

Example Flow:
-------------
Insert:

Student s1 = new Student(101, "Nandhini", "Chennai");
so.save(s1);
ts.commit();

Output:

Hibernate: insert into Student (sLocation, sName, sid) values (?, ?, ?)

Read:

Student s = so.get(Student.class, 101);
System.out.println(s);

Output:

Student [sid=101, sName=Nandhini, sLocation=Chennai]

Update:

Student su = so.get(Student.class, 102);
su.setsLocation("Pondy");
so.update(su);
ts.commit();

Output:

Hibernate: update Student set sLocation=?, sName=? where sid=?

Delete:

Student sd = so.get(Student.class, 101);
so.delete(sd);
ts.commit();

Output:

Hibernate: delete from Student where sid=?

🧪 Running Test:
-------------

✓ The project can be manually tested by running each CRUD operation sequentially.

✓ Optional: Use JUnit to automate CRUD operation tests.

🌐 Deployment:
-----------
1. Package the project as a .jar using IDE or Maven.


2. Ensure the target system has Java Runtime Environment (JRE) installed.


3. The database must be accessible and configured in hibernate.cfg.xml.

🛠️ Build With:
------------
✓ Java – Programming language

✓ Hibernate ORM – Object-relational mapping

✓ JPA (Jakarta Persistence API) – Entity mapping

✓ MySQL / H2 – Relational database

✓ Maven (optional) – Dependency management

✓ Eclipse / IntelliJ – IDE for development

🏁 Conclusion:
------------
This project demonstrates the use of Hibernate ORM to manage database operations in Java efficiently.
It shows how Hibernate handles CRUD operations, reduces boilerplate code, and improves maintainability.
The project can be extended with features such as:

✓ GUI interface.

✓ REST API integration.

✓ Complex entity relationships.

✓ Automated testing.
