# Patrones de diseño orientado a clases y objetos

Este tipo de patrones de diseño solamente **definen la estructura y comportamiento de clases u objetos**.

Hay una gran variedad de patrones de diseño orientado a clases y objetos. Los más populares y aceptados por la comunidad son del libro **Design patterns, Elements of Reusable Object- Oriented Software**, escrita por los **Gang of Four (GOF)**, en este libro se presentan 23 patrones de diseño, divididos en 3 categorías. 

### Creational
* Se encarga de la Inicialización y Configuración de objetos.

- [x] **Abstract Factory:** Provee una interfaz para la creación de familias de objetos sin especificar una clase en concreta.
- [x] **Builder:** Separa la construcción de objetos complejos.
- [x] **Factory Method:** Define una interfaz para la creación de un objeto, pero deja que la subclase decida que clase instanciar.
- [x] **Prototype:** Especifica que tipo de objetos crear usando una instancia prototipo y crea nuevos objetos copiando este prototipo.
- [x] **Simple Factory:**
- [x] **Singleton:** Este patrón de diseño asegura que solo existirá una, solo una instancia de la clase, y habrá acceso global a la clase
- [x] **Singleton Concurrent:**

### Structural
* Separan la interfaz de la implementación. Se ocupan de cómo las clases y objetos se agrupan para formar estructuras más grandes.

- [x] **Adapter:** Convierte la interfaz de una clase en otro interfaz que el cliente espera.
- [x] **Composite:** Composite sirve para construir objetos complejos a partir de otros más simples y similares entre sí, gracias a la composición recursiva y a una estructura en forma de árbol.
- [x] **Decorator:** Agrega responsabilidades adicionales a un objeto de forma dinámica. 
- [x] **Facade:** Nos permite utilizar módulos complejos de una forma sencilla y con bajos costos para el cliente.
- [x] **Flyeight:** Nos permite eliminar o reducir redundancia cuando trabajamos con una gran cantidad de objetos.
- [x] **Proxy:** Permite controlar el acceso a diferentes áreas de módulos,
- [x] **Virtual Proxy:** 

### Behavior
* Se encarga en describir objetos o clases y la comunicación entre ellos.

- [x] **Chain of Responsibility:** Evita acoplar el emisor de una petición a su receptor dando a más de un objeto la posibilidad de responder a una petición. Para ello, se encadenan los receptores y pasa la petición a través de la cadena hasta que es procesada por algún objeto.
- [x] **Command:** Permite solicitar una operación a un objeto sin conocer realmente el contenido de esta operación, ni el receptor real de la misma. Para ello se encapsula la petición como un objeto, con lo que además facilita la parametrización de los métodos.
- [x] **Interpreter:** Dado un idioma, define una representación para su gramática junto con un intérprete que use la representación para interpretar oraciones en el lenguaje.
- [x] **Iterator:** Define una interfaz que declara los métodos necesarios para acceder secuencialmente a un grupo de objetos de una colección.
- [x] **Mediator:** Define un objeto que encapsula cómo un conjunto de objetos interactúan.
- [x] **Memento:** Permite almacenar el estado de un objeto (o del sistema completo) en un momento dado de manera que se pueda restaurar en ese punto de manera sencilla. Para ello se mantiene almacenado el estado del objeto para un instante de tiempo en una clase independiente de aquella a la que pertenece el objeto (pero sin romper la encapsulación), de forma que ese recuerdo permita que el objeto sea modificado y pueda volver a su estado anterior.
- [x] **Observer:** Define una dependencia del tipo uno a muchos entre objetos, de manera que cuando uno de los objetos cambia su estado, notifica este cambio a todos los dependientes. 
- [x] **State:** Se utiliza cuando el comportamiento de un objeto cambia dependiendo del estado del mismo.
- [x] **Strategy:** 
- [x] **Template Method:** Define el esqueleto de programa de un algoritmo en un método, llamado método de plantilla, el cual difiere algunos pasos a las subclases
- [x] **Visitor:** Representa una operación que se realiza sobre los elementos que conforman la estructura de un objeto.

# Patrones de diseño orientado a subsistemas de componentes

Este tipo de patrones de diseño definen estructuras de componentes o sus relaciones, por ejemplo: patrones de diseño orientado al acceso de datos, dominio o presentación, como también definen la estructura y comportamiento de clases y objetos.

Generalmente, este tipo de patrones está orientado para aplicaciones empresariales. Entre los patrones más conocidos de este tipo tenemos; los patrones de diseño presentados en el libro J2EE Patterns, Best Practices and Design Strategies – Second Edition-2002 escrita por desarrolladores de  Java. En este libro, indican que existen 5 capas de arquitectura, y 15 patrones de diseño, divididos en 3 de las capas, presentación, negocios e integración. 

### Patrones de diseño orientado a la capa de presentación: 
* Estos patrones se encargan de la interfaz gráfica y de la interacción con el usuario.

- [x] Intercepting Filter
- [x] Front Controller
- [x] View Helper
- [x] Composite view
- [x] Service To Worker
- [x] Dispatcher View

### Patrones de diseño orientado a la capa de negocio: 
* Estos patrones se encargan de las reglas de negocio, validaciones de negocio y transferencia de datos. 

- [x] Business Delegate
- [x] Session Facade
- [x] Service Locator
- [x] Value Object Assembler
- [x] Value List Handler
- [x] Composity Entity
- [x] Data Transfer Object(DTO)

### Patrones orientado de integración o acceso a datos:
* estos patrones se encarga de explotar los datos de cualquier fuente, ya sea archivos o base de datos.

- [x] Service Activator
- [x] Data Access Object(DAO)

