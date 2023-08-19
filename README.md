# 4 PILARES DE LA PROGRAMACIÓN ORIENTADA A OBJETOS
Integrantes: Paredes Miguel y Simba Cristian
## Abstracción
Se refiere al proceso de simplificar y representar entidades complejas mediante la identificación de características esenciales y la ocultación de los detalles irrelevantes. 
### Ejemplo
<img width="518" alt="image" src="https://github.com/cristian-simba/Pilares_/assets/117742977/99aa4ddf-a305-4740-8af5-0263432f88a1"><br>
Se utiliza la abstracción para representar formas geométricas. La clase Forma es abstracta y contiene un método abstracto calcularArea(), lo que significa que no tiene una implementación concreta en la clase base. Luego, la clase concreta Circulo hereda de Forma y proporciona una implementación específica para el cálculo del área de un círculo.

 ## Encapsulamiento
Se refiere a la idea de ocultar los detalles internos de un objeto y proporcionar una interfaz controlada para acceder y modificar sus datos. Esto se logra mediante el uso de modificadores de acceso y métodos para interactuar con los datos de un objeto.
 ### Ejemplo
 <img width="371" alt="image" src="https://github.com/cristian-simba/Pilares_/assets/117742977/17e0e164-8ae3-4839-8714-d1fc29fef36a"><br>
<img width="469" alt="image" src="https://github.com/cristian-simba/Pilares_/assets/117742977/f112e995-860b-4533-838d-57b394129efb"><br>
En este ejemplo, la clase Persona encapsula los datos de nombre y edad utilizando variables privadas. Los métodos getNombre() y getEdad() permiten acceder a estos datos de manera controlada desde fuera de la clase.

