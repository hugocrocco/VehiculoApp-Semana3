# VehiculoApp — Semana 3
# Proyecto Semana 3 – Aplicación de Consola en Java

Este proyecto implementa una aplicación de consola en **Java** que permite al usuario ingresar datos personales y de un vehículo, calcular el costo de despacho de alimentos según reglas de negocio, y mostrar un resumen final en pantalla.  
El programa incluye validaciones de entrada y manejo de excepciones con try catch para evitar errores en la ejecución.  

---

=============  Requerimientos Funcionales  ============= 

1. **Ingreso de datos de usuario**  
   - El sistema solicita y registra el nombre del usuario.  
   - El sistema solicita y valida la edad (entre 1 y 99 años).  

2. **Ingreso de datos de vehículo**  
   - El sistema solicita marca, modelo y tipo de combustible.  
   - El sistema solicita y valida la cilindrada (mayor que 0).  
   - El sistema solicita y valida la capacidad de pasajeros (mínimo 1).  

3. **Ingreso de parámetros de despacho**  
   - El sistema solicita y valida el monto de la compra (no puede ser negativo).  
   - El sistema solicita y valida la distancia en km (mayor que 0).  

4. **Cálculo del costo de despacho**  
   - Si el monto es **mayor o igual a $50.000** → despacho gratis.  
   - Si el monto está **entre $25.000 y $49.999** → $150 por km.  
   - Si el monto es **menor a $25.000** → $300 por km.  

5. **Presentación de resultados**  
   - El sistema muestra los datos del usuario.  
   - El sistema muestra los datos del vehículo.  
   - El sistema muestra monto, distancia y costo de despacho calculado.  

---

============= Requerimientos No Funcionales ============= 

1. **Validación de entradas**  
   - El sistema valida que los valores numéricos estén en rangos correctos.  
   - El sistema utiliza try catch para manejar entradas inválidas (ej. letras en lugar de números).  

2. **Usabilidad**  
   - El sistema presenta mensajes claros y comprensibles al usuario.  
   - El sistema informa de manera inmediata cuando un valor no es válido.  

3. **Robustez**  
   - El sistema no se interrumpe ante errores de entrada.  
   - El sistema garantiza que los cálculos solo se realizan con datos válidos.  

4. **Portabilidad**  
   - El sistema se desarrolla en **Java**, por lo que puede ejecutarse en cualquier sistema operativo que disponga de JDK.  

5. **Organización del código**  
   - El sistema utiliza estructuras de control claras if-else y while
   - El sistema mantiene la modularidad dentro del método main.  

---

## Tecnologías utilizadas
- **Lenguaje:** Java (JDK 8 o superior).  
- **Entorno:** Consola de comandos / IDE (VS Code, IntelliJ, NetBeans).  
- **Control de versiones:** Git + GitHub.  

---

