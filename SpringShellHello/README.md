# Spring shell Hello world

## Steps
- make a mvn quick start archetype project
- add spring boot parent in this case 2.6.6
- add dependency for spring boot starter and build plugin maven spring boot
- add spring shell starter in this case version 2.1.0
- Make sure main method class has SpringBootApplication anno
- in main method call SpringApplication.run
- write a separate class with @ShellComponent and method sayHello with one args name and anno @ShellMethod
- make package and run .jar file, it shall open a shell prompt
- say-hello Amandeep
- should print Hello Amandeep