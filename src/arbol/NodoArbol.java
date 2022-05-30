
package arbol;

/**
 *
 * @author Pablo
 */
public class NodoArbol {        // Función Principal

    NodoArbol li;
    NodoArbol ld;
    int dato;                 // se declara dato como entero (información del nodo)

    public NodoArbol(int d) {    //constructor del  NodoArbol. Función de cración del árbol
        dato = d;                //dato es igual a d
        li = null;
        ld = null;          //li, ld son null
    }

    /*
     *synchronized
     *apila procesos que luego se llevaran a cabo
     */

    /*________________________________________________*/// Función de insertar en el Árbol
    public synchronized void insertar(int d) {

        
        
        if (d < dato) {                   // si d es menor que dato si insertará a la izquierda
            if (li == null) {             // en caso de que el nodo esté vacio
                li = new NodoArbol(d);  // se crea uno nuevo
                System.out.println("\nInsertado a la izquierda..."); // se inserta
            } else {
                li.insertar(d); // en caso de que ya hubiera uno insertado a la izquierda pero el nuevo es menor se corre al siguiente nodo
            }
        }

        if (d > dato) {                       // si d es mayorr que dato si insertará a la derecha
            if (ld == null) {                 // en caso de que el nodo esté vasio
                ld = new NodoArbol(d);      // se crea uno nuevo
                System.out.println("\nInsertado a la derecha...");    // se inserta
            } else {
                ld.insertar(d); // en caso de que ya hubiera uno insertado a la derecha pero el nuevo es mayor se corre al siguiente nodo
            }
        }

    }//fin insertar

    public int retornadato() {  // Función que vuelva a insertar otro dato
        return (dato);          // retorna a dato
    }                          //end retornadato
}