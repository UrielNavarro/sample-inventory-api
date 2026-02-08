# Sample Inventory REST API

> Sistema backend para la gestión de activos digitales de audio (samples), diseñado con arquitectura escalable y buenas prácticas de desarrollo.

![Java](https://img.shields.io/badge/Java-25-orange?style=for-the-badge&logo=openjdk)
![Spring Boot](https://img.shields.io/badge/Spring_Boot-3-green?style=for-the-badge&logo=spring-boot)
![Hibernate](https://img.shields.io/badge/Hibernate-ORM-59666C?style=for-the-badge&logo=hibernate)

## Descripción
Este proyecto es una **API RESTful**. Su objetivo es administrar un inventario de sonidos (loops, one-shots) permitiendo operaciones de **CRUD** completas.

A diferencia de un CRUD básico, este sistema implementa una **Arquitectura en Capas (Layered Architecture)** para desacoplar la lógica de negocio del acceso a datos, facilitando su escalabilidad y mantenimiento.

## Arquitectura del Proyecto
El sistema sigue el patrón de diseño **Controller-Service-Repository**:

1.  **Controller Layer** (`/controller`): Maneja las peticiones HTTP (GET, POST, DELETE) y la validación básica.
2.  **Service Layer** (`/service`): Contiene la lógica de negocio pura. Aquí se decide si un sample puede ser borrado o guardado.
3.  **Repository Layer** (`/repository`): Interfaz con **Spring Data JPA** para comunicarse con la base de datos sin escribir SQL manual.
4.  **Model Layer** (`/model`): Entidades que representan la estructura de datos (POJOs mapeados con `@Entity`).

## Tecnologías Clave
* **Lenguaje:** Java 25 (LTS Features)
* **Framework:** Spring Boot 3
* **Base de Datos:** H2 Database (In-Memory para prototipado rápido)
* **Persistencia:** Spring Data JPA / Hibernate
* **Herramientas:** Maven, IntelliJ HTTP Client

## API Endpoints
| Método | Endpoint | Descripción |
| :--- | :--- | :--- |
| `GET` | `/api/samples` | Obtiene la lista completa de samples. |
| `GET` | `/api/samples/{id}` | Busca un sample específico por su ID. |
| `POST` | `/api/samples` | Registra un nuevo sample (JSON Body requerido). |
| `DELETE` | `/api/samples/{id}` | Elimina un registro de la base de datos. |

## Instalación y Ejecución

1.  **Clonar el repositorio:**
    ```bash
    git clone [https://github.com/tu-usuario/sample-inventory-api.git](https://github.com/tu-usuario/sample-inventory-api.git)
    ```
2.  **Abrir en tu IDE de preferencia
3.  **Ejecutar la clase principal:** `SampleInventoryApplication.java`.
4.  **Probar la API:**
    * Puedes usar el archivo `pruebas.http` incluido en el proyecto.
    * O acceder a la consola de H2 en: `http://localhost:8080/h2-console`

---
*Desarrollado por Héctor Uriel Navarro Díaz de León - Estudiante de Desarrollo de Software Multiplataforma*
