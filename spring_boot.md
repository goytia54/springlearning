## Spring boot

### Definitions

POJO: Plain old Java object
JavaBeans: Simple objects with only getters and setters
Spring beans: POJOs configured in the application context
DTO: Bean used to move state between layers

### Inversion of Control (Ioc)

* provides a mechanism of dependency injection
* ApplicationContext wraps the BeanFactory, which serves the beans to the runtime of the application
* Spring Boot provides auto-configuration of the ApplicationContext

### Why Spring Boot ?
* Supports rapid development
* Removes boilerplate of application setup
* Many uses
* Cloud native support, but also traditional

### Key Components
* Embedded Tomcat(or others)
* Auto-configuration of ApplicationContext, componet scanning
* Automatic servlet mappings
* Embedded database support and hibernate/JPS dialect
* Automatic controller mappings

### Data Access in Spring
* Build classes representing the tables using `@Entity` and `@Table(name="TABLE_NAME")`
* Within the class we now need to use `@Id`, `@Column(name="ColumnName")`, and `@GeneratedValue(strategty=)` for the primary key while just using `@Column(name="")` for regular columns
 

### Dependency Injection
* IoC container configures by developer
* Spring maintains handles to objects constructed at startup
* Spring serves singletons to classes during construction
* Spring maintians lifecycle of beans

* `@Service` is more customizable
* `@Autowired` 

### MVC
* Model is the data
* View is the visual display that is populated
* Controller wires the view with the model

#### Spring MVC
* Spring bean, start with POJO to make it a controller with annotations
* Respond to web request

### Rest Controller
Will just convert to json without having to do anything
 
 
 	
