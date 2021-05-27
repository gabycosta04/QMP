## QMP (2 ITERACION)

# Enunciado: Quinta Iteracion

En esta iteración continuaremos trabajando sobre las sugerencias de atuendos:

Como usuarie de QuéMePongo, quiero compartir mis guardarropas con otras personas.


Por ahora, comenzaremos atacando los siguientes requerimientos específicos:

- Como usuarie de QuéMePongo, quiero poder manejar varios guardarropas para separar mis prendas según diversos criterios (ropa de viaje, ropa de entrecasa, etc). 

- Como usuarie de QuéMePongo, quiero poder crear guardarropas compartidos con otros usuaries (ej, ropa que comparto con mi hermane). 

- Como usuarie de QuéMePongo, quiero que otro usuario me proponga tentativamente agregar una prenda al guardarropas.

- Como usuarie de QuéMePongo, quiero que otro usuario me proponga tentativamente quitar una prenda del guardarropas.

- Como usuarie de QuéMePongo, necesito ver todas las propuestas de modificación (agregar o quitar prendas) del guardarropas y poder aceptarlas o rechazarlas..

- Como usuarie de QuéMePongo, quiero poder deshacer las propuestas de modificación que haya aceptado.



# Resolucion del diseño realizado:
En base a los requerimentos establecidos en el enunciado, realize una alternativa, la cual esta guardada en la carpeta src/main/java/CuartaIteracion.
- La catedra nos provee una API, la cual nos permite obtener la temperatura actual, la cual es de gran utilidad ya que esta va a permitir que la sugerencia valide con una lista de prendas, a ver si estas cumplen la condicion de tener una temperatura consistente con la actual.
- La sugerencia va a primer filtrar el conjunto de prendas que cumplan con la condicion de la temperatura adecuada. 
- Luego se va a seleccionar una prenda de tipo superior, otra de tipo inferior, otra de tipo calzado y otra de tipo accesorio, de manera aleatoria entre las que fueron validadas.
- Y esto permitira luego devolver la prenda en base a las caracteristicas que selecciono la sugerencia. Podria declararse por ejemplo dos sugerencias distintas, y como eligen al azar entre las prendas aptas, podria pasar que a pesar de pasarle la misma lista de prendas, elijan diferentes (lo que seria la idea porque nos gustaria que pueda devolver distintas sugerencias posibles)
- El atuendo al recibir las prendas , esta se encargara de validar que las categorias de las prendas sean consistentes con lo solicitado


# DIAGRAMA DEL DISEÑO REALIZADO

![Im](src/main/java/QuintaIteracion/DiagramaDeClasesQuintaIteracion.png)
