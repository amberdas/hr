# hr Operation Application
Sample Spring boot Application for Crud Operation
Prerequisite Run in your local:
1. Java 8
2. MySQL
3. Run all sql files from DDL directory. Path: src\main\resources\ddl 
- context path is hroperations
- To use environment specific properties change below property in application.properties file
  - spring.profiles.active=<$environment name>
  
1. Fetch All:
   - Method - Get
   - url - http://localhost:8080/hroperations/employee/all
2. Save Employee:
   - Method - POST
   - url - http://localhost:8080/hroperations/employee/save
   - body - {"name": "User10","salary": 450000 }
3. Update Employee:
   - Method - PUT
   - url - http://localhost:8080/hroperations/employee/update
   - body - {"id": 215,"name": "User10","salary": 450000}
4. Fetch Employee by ID:
   - Method - GET
   - url - http://localhost:8080/hroperations/employee/215
5. Delete Employee by ID:
   - Method - DELETE
   - url - http://localhost:8080/hroperations/employee/112
   
