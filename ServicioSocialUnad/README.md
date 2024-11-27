# Proyecto de Gestión del acueducto de villalosada Huila

Este Proyecto es para el sistema de gestion del acueducto de villalosada Huila
## Características

- Crear, Leer, Actualizar y Eliminar usuarios (CRUD).
- Interfaz de usuario simple y elegante con Bootstrap 5.
- Integración con MySQL para el almacenamiento de datos.

## Requisitos Previos

Antes de comenzar, asegúrate de tener instalados los siguientes programas:

- [Java JDK 17](https://www.oracle.com/java/technologies/javase-jdk17-downloads.html)
- [Maven](https://maven.apache.org/install.html)
- [MySQL](https://dev.mysql.com/downloads/mysql/)
- [Git](https://git-scm.com/)

## Configuración del Proyecto

1. **Clona el repositorio:**

    ```sh
    git clone https://github.com//Acosta000/CrudThymeleaf
    cd CrudThymeleaf
    ```

2. **Configura la base de datos:**

    Crea una base de datos MySQL llamada `usersdb`:

    ```sql
    CREATE DATABASE usersdb;
    ```

    Spring Boot se encargará de crear la tabla `users` automáticamente.

3. **Configura las propiedades de la aplicación:**

    Edita el archivo `src/main/resources/application.properties` con los detalles de tu configuración de MySQL:

    ```properties
    spring.datasource.url=jdbc:mysql://localhost:3306/usersdb
    spring.datasource.username=tu_usuario
    spring.datasource.password=tu_contraseña
    spring.jpa.hibernate.ddl-auto=update
    ```

4. **Construye y ejecuta la aplicación:**

    ```sh
    mvn clean install
    mvn spring-boot:run
    ```

## Uso de la Aplicación

Una vez que la aplicación esté en ejecución, puedes acceder a ella en tu navegador web en `http://localhost:8081/users`.

### Funcionalidades

- **Listar Usuarios:** Muestra una lista de todos los usuarios.
- **Agregar Usuario:** Permite añadir un nuevo usuario.
- **Editar Usuario:** Permite editar un usuario existente.

## Tecnologías Utilizadas

- **Spring Boot**: Framework principal para la aplicación.
- **Thymeleaf**: Motor de plantillas para la renderización del lado del servidor.
- **Bootstrap 5**: Biblioteca de CSS para el diseño y estilo de la interfaz de usuario.
- **MySQL**: Base de datos relacional para el almacenamiento de datos.
- **Maven**: Herramienta de gestión de dependencias y construcción del proyecto.


## Licencia

Este proyecto está licenciado bajo la Licencia MIT. Para más detalles, consulta el archivo [LICENSE](LICENSE).