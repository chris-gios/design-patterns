# Java Design Patterns
Catalogo de los patrones de diseño orientados a objetos en Java

### Creational
* Se utiliza para simplificar la creación de objetos para hacerlos más adaptables a diferentes situaciones.

- [x] **Abstract Factory:** Provee una interfaz para la creación de familias de objetos sin especificar una clase en concreta.
- [x] **Builder:** Separa la construcción de objetos complejos.
- [x] **Factory Method:** Define una interfaz para la creación de un objeto, pero deja que la subclase decida que clase instanciar.
- [x] **Prototype:** Especifica que tipo de objetos crear usando una instancia prototipo y crea nuevos objetos copiando este prototipo.
- [x] **Simple Factory:**
- [x] **Singleton:** Este patrón de diseño asegura que solo existirá una, solo una instancia de la clase, y habrá acceso global a la clase
- [x] **Singleton Concurrent:**

### Structural
* Se utiliza para conectar diferentes partes de un objeto, de modo que cuando una determinada parte de la estructura cambia, no es necesario que cambie toda la parte.

- [x] **Adapter:** Convierte la interfaz de una clase en otro interfaz que el cliente espera.
- [x] **Composite:** Composite sirve para construir objetos complejos a partir de otros más simples y similares entre sí, gracias a la composición recursiva y a una estructura en forma de árbol.
- [x] **Decorator:** Agrega responsabilidades adicionales a un objeto de forma dinámica. 
- [x] **Facade:** Nos permite utilizar módulos complejos de una forma sencilla y con bajos costos para el cliente.
- [x] **Flyeight:** Nos permite eliminar o reducir redundancia cuando trabajamos con una gran cantidad de objetos.
- [x] **Proxy:** Permite controlar el acceso a diferentes áreas de módulos,
- [x] **Virtual Proxy:** 

### Behavior
* Se utiliza para las interacciones / comunicación entre objetos y crea objetos flexibles (poco acoplados).

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
