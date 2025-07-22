# Implementación de IntList

Este ejercicio define una interfaz `IntList` y dos implementaciones: `IntArrayList` e `IntVector`.

## Comparación de Eficiencia

### ¿Cuándo es más eficiente `IntArrayList`?
- Cuando se espera que la cantidad de elementos crezca **lentamente o de forma predecible**.
- La estrategia de crecimiento del 50% evita la sobreasignación de memoria y ahorra espacio.
- Ideal para aplicaciones con recursos de memoria limitados o cuando las inserciones son poco frecuentes.

### ¿Cuándo es más eficiente `IntVector`?
- Cuando se espera que la cantidad de elementos crezca **rápidamente o de forma impredecible**.
- Duplicar el tamaño minimiza la cantidad de redimensionamientos (tiempo constante amortizado).
- Ideal para aplicaciones críticas en rendimiento, donde la velocidad de inserción es más importante que el uso de memoria.
