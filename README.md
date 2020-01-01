# hr Operation Application
Sample Spring boot Application for Crud Operation
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
   