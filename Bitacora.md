## Bitacora

- Al parecer la regla "new feature = new file" no siempre es sinónimo de un diseño correcto, por lo menos no completamente.
- La herencia parecía ser un buen diseño, pero en el mantenimiento se evidencia que no lo es.
- Flyable y Quackable intefaces: La abstracción de un comportamiento aplicada en la situación incorrecta nos puede traer muchas complicaciones si abstraemos un comportamiento que deben implementar un número alto de clientes (clientes = clases que extienden la clase abstracta), ademas, si el comportamiento es igual en muchos de los clientes, tendríamos código repetido.
- Take what varies and “encapsulate” it so it won’t affect the rest of your code. The result? Fewer unintended consequences from code changes and more flexibility in your systems!
- Es necesario identificar lo que cambia y lo que permanece igual. "fly() y quack() pueden ser diferentes dependiendo la variedad de pato"
- Gran lección: “Program to an interface” really means "Program to supertype"
- La solución, segregación de interfaces para las acciones que cambian según el tipo de pato.
- Por último, las interfaces FlyBehavior y QuackBehavior pasan a COMPONER al Duck, de esta manera se podrá definir dinámicamente estos comportamientos.