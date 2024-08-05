# EstructuraDatos

**Integrantes:**


* Nathaly Nikooll Camacho Ordoñez.
* Iván Alexander Fernandez Cañar.
* José Francisco Riofrío Maldonado.
* Ariana Sophía Sarango Tandazo.

**Ciclo:**

* Segundo "A"

## ACD - ESTRUCTURA DE DATOS


Generar un diagrama UML y código en Java con las siguientes características:


* Arboles binarios (AVL y Rojo Negro).
* Grafo.
* Listas enlazadas.
* Listas doblemente enlazadas.
* Listas circular.
* Listas doblemente circulares.
* En el caso de los arboles genere recorridos en orden, postorden y preorden, en todas las demas presente de acuerdo al orden de inserción.
* En todas las estructuras se pueda agregar, insertar y eliminar.

## Taller Interfaz gráfica árboles

Generar una interfaz gráfica de escritorio, que soporte los elementos de un árbol binario de búsqueda y pinte el recorrido tanto en preorden, inorden y postorden.



## Para ingresar a nuestro proyecto realizamos lo siguiente:


1) Descargar el código, el cual se encuentra en la rama principal main.


2)  Descomprimir el archivo y guardalo en la carpeta donde se tengan todos los proyectos de NetBeans.

   
3) Abrir la carpeta del código en Netbeans.


4) Ejecutar el proyecto para poder visualizar e interactuar con la interfaz.

   

## Diagrama UML


![image](https://github.com/user-attachments/assets/c0532fac-2b04-4365-a90d-1e7bef98ab11)


## UML


## 1.Clase Arbol:

**Atributos:**

* nodo : raiz - La raíz del árbol.
* ultimoInsertado : nodo - El último nodo insertado en el árbol.
* cant : int - La cantidad de nodos en el árbol.

**Métodos:**   

* obtenerMenor() : string - Devuelve el nodo con el valor menor en el árbol.
* obtenerMayor() : string - Devuelve el nodo con el valor mayor en el árbol.
* borrarMenor() : string - Elimina el nodo con el valor menor.
* borrarMayor() : string - Elimina el nodo con el valor mayor.
* insertarDatos() : string - Inserta datos en el árbol.
* cambiarDatos() : string - Cambia los datos de un nodo específico.
* buscarPadre() : string - Busca y devuelve el nodo padre de un nodo dado.
* borrar() : string - Elimina un nodo específico.
* podar() : string - Realiza la poda del árbol, eliminando nodos innecesarios.
* obtenerNumeroRamas() : string - Devuelve el número de ramas en el árbol.
* imprimirRecorrido() : string - Imprime un recorrido del árbol.


## 2.Clase Nodo:

**Atributos:**

* dato : int - El valor almacenado en el nodo.
* nodoIzq : Nodo - Nodo hijo izquierdo.
* nodoDer : Nodo - Ndo hijo derecho.
* olorNodo : string - Color del nodo.

**Métodos:**

* pintarNodo() : void - Método para pintar el nodo.


## 3.Clase ArbolExpresionGrafico:

**Atributos:**

* arbol : Arbol - Árbol que se va a visualizar gráficamente.

**Métodos:**

* calcularPosisiones() : void - Calcula las posiciones de los nodos para su representación gráfica.
* calcularTamañoSubArbol() : void - Calcula el tamaño de un subárbol.
* calcularPosicion() : void - Calcula la posición de un nodo específico.
* dibujarArbol() : void - Dibuja el árbol de manera gráfica.
* pintar() : void - Pinta el árbol en la visualización gráfica.


## 4.Clase SimuladorArbolBinario:

**Atributos:**

* arbol : Arbol - Árbol que se va a simular.
    
**Métodos:**

* insertar() : int - Inserta un nodo en el árbol.
* borrar() : int - Elimina un nodo del árbol.
* imprimirPreOrden() : string - Imprime el recorrido en preorden.
* imprimirInOrden() : string - Imprime el recorrido en inorden.
* imprimirPostOrden() : string - Imprime el recorrido en postorden.
* imprimirPorNiveles() : string - Imprime el recorrido por niveles.
* darHojas() : int - Devuelve el número de hojas del árbol.
* darPadre() : string - Devuelve el nodo padre de un nodo específico.
* buscarDato() : string - Busca un dato en el árbol.
* recorrido() : string - Realiza un recorrido del árbol.
* cantNodos() : int - Devuelve la cantidad de nodos en el árbol.


## Referencias


* G. P. M. “Las principales estructuras de datos que deberías saber para tu próxima entrevista de programación”. freeCodeCamp.org. Accedido el 19 de junio de 2024. [En línea]. Disponible: https://www.freecodecamp.org/espanol/news/las-principales-estructuras-de-datos-que-deberias-saber-para-tu-proxima-entrevista-de-programacion/


* “DSTool: Herramienta para la programación con estructuras de datos”. HCI-RG: welcome - home. Accedido el 19 de junio de 2024. [En línea]. Disponible: https://www.hci.uniovi.es/Products/DSTool/avl/avl-operaciones.html


* Sitio Web Docente del Prof. Edgardo AdriÃ¡n Franco MartÃ­nez en el IPN. Accedido el 19 de junio de 2024. [En línea]. Disponible: https://docencia.eafranco.com/materiales/estructurasdedatos/12/Tema12.pdf

