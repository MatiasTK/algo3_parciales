# Solucion a preguntas del punto 2.

## Pregunta a

La ventaja que posee el primer diagrama es que al utilizar herencia en la clase `Vehiculo` y `camion` se reutilizan los
atributos evitando asi que se tengan que esribir 2 veces. De esta misma manera tambien se reutiliza la clase `consultor`
ya que basta con que el vehiculo conozca a esta clase para que el camion la pueda utilizar evitando asi codigo
duplicado.

## Pregunta b

No cumple el **principio de inversion de la depedencia** de solid, ya que la clase `Consultor` lo crea el Vehiculo
haciendo imposible cambiar el Consultor en caso de que este en algun futuro cambie.
Dado que el camion usa el mismo constructor que el vehiculo no se puede cambiar el valor de referencia.

## pregunta c

Cumple con **inversion de la dependencia** en el consultor haciendolo mas sencillo para modificaciones a nuevos
consultores. Cumple con el principio
de **abierto/cerrado** ya que el consultor esta abierto a su extension pero cerrado a su modificacion, un cambio en el
consultor no requeriria necesariamente un cambio en las clases que lo utilizan.
Es mas facil añadir un nuevo tipo de vehiculo.

## pregunta d

Codigo repetido ya que tanto el auto como el camion tienen los mismos atributos y es probable que algunos de sus metodos
hagan lo mismo.