# Grading System through Spring Boot

![GUI](resources/screenshot1.png)

In this Spring Boot project, I used JPA for persistence, MySQL being the 
database.

Take note, when Spring Boot maps the service class into the database,
the naming convention is critical, for example:

`roboticsGrade` will be mapped in the database column as
`robotics_grade`.

Now, you might not notice this when you have `clear-drop` setting because
Spring Boot automatically solves the issue. But when you want the persistent
database record, you must set it to `none`. 	

## Q&A

If you have questions, please feel free to ask me: 

<mongAlvarez@gmail.com>
   
You can also create a pull request or raise
an issue to start the discussion or query/ies.

## Compile, Build & Run
Before you compile and build, make sure you are at the project directory
`SpringBootProjectDir`. Take note also, I'm using Maven build tool here. 

In Windows,

to package your program as an executable jar file:

	mvn clean package

to simply clean and compile:

	mvn clean compile

to just clean your project:

	mvn clean

to run the program:

	mvn spring-boot:run

to build and run the program:

	mvn clean install


## Contributing

1. Fork it!
2. Then, made changes, and create a pull request. 
I'm much more willing to collaborate with you!

## License

MIT - the permissive license