## API Rest with microservices - Plantilla Eureka Server
> Plantilla Eureka Server

## Microservicios
* https://github.com/gusguma/template-microservice-user
* https://github.com/gusguma/template-microservice-eureka-server
* https://github.com/gusguma/template-microservice-gateway

### Estado del código

[![Build Status](https://travis-ci.org/gusguma/template-microservice-gateway.svg?branch=develop)](https://travis-ci.org/gusguma/template-microservice-user)
[![Quality Gate Status](https://sonarcloud.io/api/project_badges/measure?project=es.gusguma%3Atemplate-microservice-gateway&metric=alert_status)](https://sonarcloud.io/dashboard?id=es.gusguma%3Atemplate-microservice-eureka-server)

### Tecnologías necesarias
* Java
* Maven
* GitHub
* Travis-ci
* Sonarcloud
* Better Code Hub
* Spring-boot
* Spring-Cloud-Eureka-Client
* Spring-Cloud-Zuul

### Clonar en repositorio en tu equipo mediante consola:
1. Situarse en una carpeta raíz donde se encuentran los proyectos, mediante la consola:  
 **>cd %ruta-de-la-carpeta%**
1. Clonar el repositorio, se visualizará el contenido de la rama por defecto:  
 **>git clone https://github.com/gusguma/template-microservice-xxx**

### Importar el proyecto mediante IntelliJ IDEA
1. **Import Project**, y seleccionar la carpeta del proyecto
1. Marcar **Create Project from external model**, elegir **Maven**
1. **Next** … **Finish**

### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.3.2.RELEASE/maven-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/2.3.2.RELEASE/maven-plugin/reference/html/#build-image)
* [Spring Web](https://docs.spring.io/spring-boot/docs/2.3.2.RELEASE/reference/htmlsingle/#boot-features-developing-web-applications)
* [Spring Boot DevTools](https://docs.spring.io/spring-boot/docs/2.3.2.RELEASE/reference/htmlsingle/#using-boot-devtools)

### Guides
The following guides illustrate how to use some features concretely:

* [Routing and Filtering](https://spring.io/guides/gs/routing-and-filtering/)
* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/bookmarks/)

# Spring Cloud Netflix Maintenance Mode

The dependencies listed below are in maintenance mode. We do not recommend adding them to
new projects:

*  Zuul

The decision to move most of the Spring Cloud Netflix projects to maintenance mode was
a response to Netflix not continuing maintenance of many of the libraries that we provided
support for.

Please see [this blog entry](https://spring.io/blog/2018/12/12/spring-cloud-greenwich-rc1-available-now#spring-cloud-netflix-projects-entering-maintenance-mode)
for more information on maintenance mode and a list of suggested replacements for those
libraries.
