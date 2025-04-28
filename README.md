# stsm - Ejemplo educativo de Thymeleaf + Spring

Este proyecto es una extracción del ejemplo oficial de **Thymeleaf** para **Spring 6**, originalmente disponible en:  
[https://github.com/thymeleaf/thymeleaf/tree/3.1-master/tests/thymeleaf-tests-spring6](https://github.com/thymeleaf/thymeleaf/tree/3.1-master/tests/thymeleaf-tests-spring6)

El motivo de esta extracción es que el repositorio oficial de Thymeleaf incluye muchos más ejemplos y dependencias, haciéndolo muy pesado para su uso directo en entornos educativos.

Todos los méritos de este proyecto corresponden a los creadores de **Thymeleaf**.  
Únicamente se han añadido algunos tests adicionales con propósitos **educativos** para ser trabajados en el aula.

---

## Tutorial relacionado

Se recomienda seguir el tutorial oficial de Thymeleaf que explica el funcionamiento de este proyecto paso a paso:

📖 [Thymeleaf + Spring Tutorial (versión 3.1)](https://www.thymeleaf.org/doc/tutorials/3.1/thymeleafspring.html)

---

## Tecnologías utilizadas

- **Spring Boot 3 / Spring Framework 6**
- **Thymeleaf 3.1**
- **Maven**
- **JUnit 5**
- **Servlet 6.0 API**

---

## Estructura del proyecto

- **`business`**: Configuración de negocio, entidades de dominio, repositorios y servicios.
- **`web`**: Configuración web, controladores, conversores y vistas Thymeleaf.
- **`resources`**: Archivos de configuración (`application.properties`, `Messages.properties`, etc.).
- **`static` y `templates`**: Recursos web (CSS, imágenes) y plantillas HTML.
- **`tests`**: Pruebas unitarias de servicios, repositorios, conversores y controladores.

---

## Requisitos para ejecutar

- **Java 17** o superior
- **Maven 3.8+**
- IDE compatible con Spring Boot (IntelliJ IDEA, Eclipse, VSCode)

Para compilar y ejecutar el proyecto:

```bash
mvn clean spring-boot:run
```

La aplicación estará disponible en:

[http://localhost:8080](http://localhost:8080)

---

## Créditos

Este proyecto es una adaptación del trabajo original de [Thymeleaf.org](https://www.thymeleaf.org/).  
Todo el mérito de la estructura, lógica y ejemplos pertenece a los autores de Thymeleaf.

Esta versión ha sido adaptada únicamente para facilitar su uso educativo en el aula, simplificando su acceso y pruebas.
