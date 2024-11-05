## Hotel Management System 🏬

### (HMS) - Java with Hibernate ♨️

Welcome to our Hotel Management System project! 🎉 Building a Hotel Management System (HMS) in Java using Hibernate for CRUD operations is an excellent project for honing your skills in both Java programming and Hibernate ORM.

I'll guide you through the process step by step. Let's begin by crafting a well-structured Main class that serves as the entry point to our application. Additionally, this approach facilitates easy integration of more advanced features and functionalities as our Hotel Management System evolves.

### Setup Instructions 🚀

To set up the project locally, follow these steps:

1. **Clone the Repository:**

   ```
   git clone <git@github.com:itsindrajput/Hotel-Management-System.git>
   ```

2. **IDE Setup:**

   - Open the project in your preferred IDE (e.g., Eclipse, IntelliJ IDEA).

3. **Database Configuration:**

   - Choose a database management system (DBMS) like MySQL, PostgreSQL, or H2.
   - Configure the database connection details in `hibernate.cfg.xml`.
   - This MySQL hibernate.cfg.xml example includes optional settings to generate and format SQL as well as an instruction to create database tables if any entity beans require them.

   ```
      <?xml version="1.0" encoding="UTF-8"?>
      <!DOCTYPE hibernate-configuration PUBLIC
            "-//Hibernate/Hibernate Configuration DTD 3.0//EN"
            "http://www.hibernate.org/dtd/hibernate-configuration-3.0.dtd">
      <hibernate-configuration>
         <session-factory>
            <!-- Database connection settings -->
            <property name="hibernate.connection.driver_class">com.mysql.cj.jdbc.Driver</property>
            <property name="hibernate.connection.url">jdbc:mysql://localhost:3306/hotel_management</property>
            <property name="hibernate.connection.username">username</property>
            <property name="hibernate.connection.password">password</property>
            <property name="hibernate.hbm2ddl.auto">update</property>

            <!-- Hibernate dialect -->
            <property name="hibernate.dialect">org.hibernate.dialect.MySQLDialect</property>

            <!-- Enable Hibernate automatic session context management -->
            <property name="hibernate.current_session_context_class">thread</property>

            <!-- Specify the package to scan for entity classes -->
            <mapping class="org.example.model.Room"/>
            <mapping class="org.example.model.Guest"/>
            <mapping class="org.example.model.Invoice"/>
            <mapping class="org.example.model.Reservation"/>
         </session-factory>
      </hibernate-configuration>

   ```

4. **Dependency Management:**

   - Make sure to include these dependencies in your pom.xml if you're using Maven for dependency management.
     POM is an acronym for Project Object Model. The pom.xml file contains information of project and configuration information for the maven to build the project such as dependencies, build directory, source directory, test source directory, plugin, goals etc. Maven reads the pom. xml file, then executes the goal.

   ```
      <dependencies>
      <dependency>
         <groupId>junit</groupId>
         <artifactId>junit</artifactId>
         <version>3.8.1</version>
         <scope>test</scope>
      </dependency>

      <!-- https://mvnrepository.com/artifact/mysql/mysql-connector-java -->
      <dependency>
         <groupId>mysql</groupId>
         <artifactId>mysql-connector-java</artifactId>
         <version>8.0.32</version>
      </dependency>
      <!-- https://mvnrepository.com/artifact/org.hibernate/hibernate-core -->
      <dependency>
         <groupId>org.hibernate</groupId>
         <artifactId>hibernate-core</artifactId>
         <version>6.1.7.Final</version>
      </dependency>
   </dependencies>
   ```

### Usage Instructions 📘

1. **Run the Application:**
   - Start the application from your IDE.
2. **Interacting with the System:**
   - Use the provided CRUD operations to manage rooms, guests, reservations, and invoices.

### Folder Structure 📚

```
src/main/java
└── org
    └── example
        ├── config
        │   └── HibernateUtil.java
        ├── dao
        │   ├── RoomDAO.java
        │   └── GuestDAO.java
        ├── model
        │   ├── Room.java
        │   ├── Guest.java
        │   ├── Invoice.java
        │   └── Reservation.java
        ├── service
        │   ├── RoomService.java
        │   ├── GuestService.java
        │   └── ReservationService.java
        └── App.java
```

### Output Menu Options 🎉

- This screenshot illustrates the various operations available in the hotel management system, including reading rooms, managing guests, creating reservations, and more.
- ![Screenshot 2024-05-20 140003](https://github.com/itsindrajput/Hotel-Management-System/assets/70815899/53d7ee7f-a75e-4b3a-ba79-1ed18b1b9673)

### Contributing ✨

Contributions to the project are welcome! If you'd like to contribute, please follow these steps:

1. Fork the repository.
2. Create a new branch for your feature or bug fix.
3. Make your changes and commit them with descriptive messages.
4. Push your changes to your fork.
5. Submit a pull request to the main repository.

### License 📜

This project is licensed under the [MIT License](LICENSE).

Feel free to explore and enhance our Hotel Management System! If you have any questions or suggestions, please open an issue or reach out to us. Together, let's craft the finest Hotel Management System!!
