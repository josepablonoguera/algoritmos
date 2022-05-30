/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package arbol;

/**
 *
 * @author Pablo
 */

public class Arbol {

    private NodoArbol nodoar;

    public Arbol() {
        nodoar = null;

    }

    public NodoArbol retornaraiz() {
        return (nodoar);
    }

    /*
     *synchronized
     *apila procesos que luego se llevaran a cabo
     */
    public synchronized void insertarNodo(int d) {

        if (nodoar == null) {
            nodoar = new NodoArbol(d);
            System.out.println("\nInsertado en la Raiz...");
           } else {
            nodoar.insertar(d);
        }
    }//fin insertarNodo

    public synchronized void getInOrden(NodoArbol raiz) { // Funcion muestra en Preorden
        if (raiz.li != null) {//1
            getInOrden(raiz.li);//visita en Orden árbol izquierdo
        }

        System.out.print(" " + raiz.dato);//Visita nodo, 2

        if (raiz.ld != null) {//3
            getInOrden(raiz.ld);//Visita EnOrden árbol derecho
        }
    } 
    
    public synchronized void getPreOrden(NodoArbol raiz) { // Funcion muestra en Preorden   77   5 - 1 - 3 - 8 - 7 - 9 
      

        System.out.print(" " + raiz.dato);//Visita nodo, 2
       
        if (raiz.li != null) {//1
            getPreOrden(raiz.li);//visita en Orden árbol izquierdo
        }

        if (raiz.ld != null) {//3
            getPreOrden(raiz.ld);//Visita EnOrden árbol derecho
        }
    } 
     public synchronized void getPostOrden(NodoArbol raiz) { // Funcion muestra en Preorden //  3  - 1 -  7 - 9 - 8 - 5 
      
  
        if (raiz.li != null) {//1
            getPostOrden(raiz.li);//visita en Orden árbol izquierdo
        }

        if (raiz.ld != null) {//3
            getPostOrden(raiz.ld);//Visita EnOrden árbol derecho
        }
        System.out.print(" " + raiz.dato);//Visita nodo, 
    } 
     
     public synchronized void getHojas(NodoArbol raiz) { 
     
         
         if (raiz.li == null && raiz.ld == null) {//1
             System.out.println("hoja: "+ raiz.dato);//visita en Orden árbol izquierdo
        }
         
         if (raiz.li != null) {
             getHojas(raiz.li);
         }
          if (raiz.ld != null) {
             getHojas(raiz.ld);
         }
     }

}// fin class Arbol