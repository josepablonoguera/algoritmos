package arbol;

public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Arbol miArbol = new Arbol();
        
        miArbol.insertarNodo(5);
        miArbol.insertarNodo(8);
        miArbol.insertarNodo(9);
        miArbol.insertarNodo(7);
        miArbol.insertarNodo(1);
        miArbol.insertarNodo(3);
         miArbol.insertarNodo(0);

        
        System.out.println("");
        miArbol.getInOrden(miArbol.retornaraiz());
        System.out.println("");
        
        System.out.println("Hojas:");
        miArbol.getHojas(miArbol.retornaraiz());
        System.out.println("");
        
        /* System.out.println("");
        miArbol.getPreOrden(miArbol.retornaraiz());
        System.out.println("");
        
         System.out.println("");
        miArbol.getPostOrden(miArbol.retornaraiz());
        System.out.println("");*/
        
        
       
        
        
        
    }
}
