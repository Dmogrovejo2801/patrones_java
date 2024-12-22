# Patrón Factory Method

## **Funcionamiento del Código**

### **Separación de responsabilidades:**
1. **Clase `Persona`:**
    - Clase abstracta que define la estructura base para cualquier tipo de persona.
    - Contiene el atributo común `ruc` con su getter, asegurando que todas las subclases tendrán este atributo.

2. **Subclases (`PersonaNaturalConNegocio`, `PersonaJuridica`):**
    - Extienden la clase base `Persona`.
    - Representan tipos específicos de personas con posibles comportamientos adicionales en un escenario real.

3. **Interfaz `PersonaCreator`:**
    - Define un contrato para crear instancias de `Persona` mediante el método `create(String ruc)`.

4. **Clase `PersonaFactory`:**
    - Centraliza la lógica de creación y registro de tipos de `Persona`.
    - Utiliza un mapa para asociar un tipo (`PNN`, `PJ`) con su correspondiente creador.

5. **Clase `PersonaBuilder`:**
    - Proporciona una interfaz sencilla para que el cliente pueda construir objetos `Persona`.

---

### **Proceso de Ejecución**
1. **Registro en `PersonaFactory`:**
    - En el bloque `static` de `PersonaFactory`, se registran los tipos disponibles (`PNN` y `PJ`) con sus correspondientes constructores (`PersonaNaturalConNegocio` y `PersonaJuridica`) mediante expresiones lambda.

2. **Creación de Objetos:**
    - El cliente solicita crear una `Persona` con `PersonaBuilder`.
    - `PersonaBuilder` llama a `PersonaFactory.createPersona()`, pasando el tipo (`PNN` o `PJ`) y el `ruc`.
    - `PersonaFactory` busca en su mapa el creador correspondiente al tipo solicitado.
    - El creador construye dinámicamente el objeto concreto (`PersonaNaturalConNegocio` o `PersonaJuridica`).

3. **Extensibilidad:**
    - Para agregar un nuevo tipo de persona, se sigue este flujo:
        - Crear una nueva subclase de `Persona`.
        - Registrar el nuevo tipo en `PersonaFactory`.

---

## **Explicación del Patrón Factory Method**

### **Definición Conceptual:**
El patrón **Factory Method** es un patrón de diseño creacional que proporciona una interfaz para crear objetos en una clase base, permitiendo que las subclases o componentes especializadas definan el tipo exacto de objeto a crear.

---

### **Componentes Principales:**
1. **Producto (`Persona`):**
    - Define la clase base que todos los objetos creados deben implementar.

2. **Subproductos (`PersonaNaturalConNegocio`, `PersonaJuridica`):**
    - Implementan la clase base.
    - Representan las variantes del producto.

3. **Creador (`PersonaFactory`):**
    - Contiene la lógica central de creación.
    - Puede ser extensible para manejar nuevos tipos de productos dinámicamente.

4. **Cliente (`Main`):**
    - Solicita productos a la fábrica.
    - No conoce ni se preocupa por los detalles de instanciación.

---

### **Ventajas del Factory Method:**
1. **Encapsulación:**  
   La lógica de creación está centralizada en la fábrica. El cliente solo interactúa con el método de creación.

2. **Extensibilidad:**  
   Agregar nuevos tipos no afecta el código existente. Se cumple el principio **abierto/cerrado (OCP)**.

3. **Reutilización:**  
   La lógica de creación se centraliza en un único lugar.

---

### **Comparación con Otros Patrones Creacionales**
- **Factory Method:**  
  Se centra en delegar la creación a subclases o componentes dinámicos.

- **Builder:**  
  Construye objetos paso a paso, ideal para objetos complejos con muchas configuraciones.

- **Abstract Factory:**  
  Permite la creación de familias completas de objetos relacionados.

---

### **Analogía del Mundo Real**
En un restaurante:
1. **Producto:**  
   Platillos como `Pizza` o `Hamburguesa`.

2. **Creador:**  
   El chef (`PersonaFactory`) decide cómo preparar el platillo.

3. **Cliente:**  
   Tú (`Main`) haces el pedido y recibes tu platillo listo.

El cliente no sabe ni necesita saber cómo se prepara la comida; simplemente confía en el chef.

---

### **Por qué Elegir este Enfoque**
- **Simplicidad para el Cliente:**  
  Solo necesitas especificar el tipo y los detalles básicos para obtener el producto deseado.

- **Cumplimiento de Buenas Prácticas:**  
  El diseño sigue el principio de responsabilidad única y el principio abierto/cerrado.