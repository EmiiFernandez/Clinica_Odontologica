# Clinica odontológica API REST
Proyecto final de la materia Back-End I de Certified Tech Developer, Digital House

### Sistema de reserva de turnos
Se desea implementar un sistema que permita administrar la reserva de turnos para una clínica odontológica. Este debe cumplir con los siguientes requerimientos:
   * Administración de datos de odontólogos: listar, agregar, modificar y eliminar odontólogos. Registrar apellido, nombre y matrícula de los mismos.
   * Administración de datos de los pacientes: listar, agregar, modificar y eliminar pacientes. De cada uno se almacenan: nombre, apellido, domicilio, DNI y fecha de alta.
   * Registrar turno: se tiene que poder permitir asignar a un paciente un turno con un odontólogo a una determinada fecha y hora. 
   * Login: validar el ingreso al sistema mediante un login con usuario y password. Se debe permitir a cualquier usuario logueado (ROLE_USER) registrar un turno, pero solo a quienes tengan un rol de administración (ROLE_ADMIN) poder gestionar odontólogos y pacientes. Un usuario podrá tener un único rol y los mismos se ingresarán directamente en la base de datos.

### Requerimientos técnicos
La aplicación debe ser desarrollada en capas:
 * Capa de entidades de negocio: son las clases Java de nuestro negocio modelado a través del paradigma orientado a objetos.
 * Capa de acceso a datos (Repository): son las clases que se encargarán de acceder a la base de datos.
 * Capa de datos (base de datos): es la base de datos de nuestro sistema modelado a través de un modelo entidad-relación. Utilizaremos la base H2 por su practicidad. 
 * Capa de negocio: son las clases service que se encargan de desacoplar el acceso a datos de la vista.
 * Capa de presentación: son las pantallas web que tendremos que desarrollar utilizando el framework de Spring Boot MVC con los controladores y alguna de estas dos opciones: HTML+JavaScript o React para la vista.

Es importante realizar el manejo de excepciones logueando cualquier excepción que se pueda generar y la realización de test unitarios para garantizar la calidad de los desarrollos.
    
## Tecnologías utilizadas 
  - Java 20
  - Maven
  - Spring Boot / Security
  - H2 DataBase 
  - HTML 
  - CSS 
  - Bootstrap 
  - JavaScript 
  - Postman

## Instalación

  1. Clonar el repositorio: 
     `git clone https://github.com/EmiiFernandez/Clinica_Odontologica.git`
  2. Abrir y ejecutar el proyecto en tu IDE
  3. Ingresar a `http://localhost:8090/login`
  4. Iniciar sesión:
      * Inicio de sesión como administrador: 
        - Username: admin 
        - Password: admin
      * Inicio de sesión como user 
        - Username: user 
        - Password: user
   5. Una vez logueado se podra acceder a los funcionalidades del sistema, según el rol seleccionado

## Mockup 
<a href="#">
  <img align="center" width = 1000px src=/main/resources/static/img/macbook-pro-mockup-with-a-white-iphone-6-in-front-view-a11923.png?raw=true"
</a>
