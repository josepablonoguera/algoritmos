/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Listas;

/**
 *
 * @author Pablo
 */
public class Lista {

    NodoPersona primero;

    public Lista() {
        primero = null;
    }

    public boolean estaVacia() {
        boolean retorno = false;
        if (primero == null) {
            retorno = true;
        }
        return retorno;
    }

    public void insertarPrimero(NodoPersona nodo) {

        if (estaVacia()) {
            primero = nodo;

        } else {
            nodo.sig = primero;
            primero = nodo;
        }
    }
    
   public NodoPersona eliminar(NodoPersona nodo){
       
       if (estaVacia()) {
           System.out.println("No hay personas para eliminar");
           return null;
       }else{
         
            NodoPersona posicionAnterior = buscar(nodo);
            if (posicionAnterior == null) {
                System.out.println("La persona a eliminar no esta en la lista");
           }else{
           if (posicionAnterior == primero) {
                    if (primero.sig == null) {
                        primero = null;
                    }else{
                     posicionAnterior.sig = posicionAnterior.sig.sig;
                    }    
                }else{
                     posicionAnterior.sig = posicionAnterior.sig.sig;
                }
             }
       
       }
       
   
   return null;
   }

    public void insertarFinal(NodoPersona nodo) {

        if (estaVacia()) {
            primero = nodo;
        } else {
            NodoPersona aux;
            aux = primero;
            while (aux != null) {
                if (aux.sig == null) {
                    aux.sig = nodo;
                    nodo.sig = null;
                }
                aux = aux.sig;
            }
        }

    }

    public void mostrar() {

        NodoPersona aux;
        aux = primero;
        while (aux != null) {
            System.out.println("Cedula: " + aux.getCedula());
            aux = aux.sig;
        }


    }

    public NodoPersona[] ordenar(Lista nueva) {//Lista = a un NODO

        NodoPersona[] x = new NodoPersona[length(nueva)];
        NodoPersona aux;
        aux = primero;
        for (int i = 0; i < x.length; i++) {
            x[i] = aux;
            aux = aux.sig;
        }

        int t = x.length;
        NodoPersona temp;
        for (int i = 1; i < t; i++) {
            for (int j = t - 1; j >= i; j--) {
                if (x[j].getNombreCompleto().compareTo(x[j-1].getNombreCompleto())<0) {
                    temp = x[j];
                     x[j] = x[j - 1];
                     x[j - 1] = temp;
                }
               
            }
        }
     return x;
    }

    private int length(Lista nueva) {
        int i = 0;
        if (!estaVacia()) {
            NodoPersona aux;
            aux = primero;
            while (aux != null) {
                i++;
                aux = aux.sig;
            }
        }
        return i;
    }

    public NodoPersona buscar(NodoPersona nodo) {
   
        if (estaVacia()) {
             System.out.println("No se encontro la persona");
            return null;
        }else{
            
            if (primero.getCedula().equalsIgnoreCase(nodo.getCedula())) {
                    System.out.println("Se encontraba en primero");
                    return primero;
                }
        
            if (primero.sig == null) {
                if (primero.getCedula().equalsIgnoreCase(nodo.getCedula())) {
                    System.out.println("Se encontraba en primero");
                    return primero;
                }
            }
            NodoPersona aux = primero;
            while (aux.sig != null) {                
                if (aux.sig.getCedula().equalsIgnoreCase(nodo.getCedula())) {
                    System.out.println("La persona existe");
                    System.out.println("Cedula en buscar: "+aux.getCedula());
                    return aux;
                }
                aux = aux.sig;
            }     
            
        }
        System.out.println("No existe la persona");
        return null;
    }
}
