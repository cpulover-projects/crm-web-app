# Steps
1. Create new Dynamic Web Project in Eclipse
2. Create MySQL database in Workbench [create-database.sql]
3. Include MySQL connector in WEB-INF/lib
4. Create a servlet to test database connection (Project facets/runtimes/Tomcat)
5. Include configuaration xml files (spring mvc and web) in WEB-INF.
6. Include JSTL API in WEB-INF/lib
7. Include lastest Spring framework jars in WEB-INF/lib [link]
8. Include lastest Hibernate jars (required folder) and c3p0 jars (optional folder) in WEB-INF/lib [link]
9. For Java 9+, include those jars in WEB-INF/lib
  - javax.activation-1.2.0.jar
  - jaxb-api-2.3.0.jar
  - jaxb-core-2.3.0.jar
  - jaxb-impl-2.3.0.jar
10. Configure Spring + Hibernate
  - Define database dataSource / connection pool in Spring MVC configuration xml file
  - Setup Hibernate session factory
  - Setup Hibernate transaction manager
  - Enable configuration of transctional annotation
  - Add support for reading web resources: css, images, js, etc.
## Notes
- Package for scanning should match in Spring configuration xml file.
- 'view' folder containning jsp file should match in Spring configuration xml file
- Run project: choose project root -> run as -> run on server