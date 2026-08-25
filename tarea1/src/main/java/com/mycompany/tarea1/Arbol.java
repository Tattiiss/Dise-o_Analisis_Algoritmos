
package com.mycompany.tarea1;


public class Arbol {
    
    
    public static NodoArbol<Integer> buscar(NodoArbol<Integer> nodo, int valor){
        if (nodo == null){
            return null;
        }
        if (nodo.getData() == valor){
            return nodo;
        }
        NodoArbol<Integer> encontro;
        
        encontro = buscar(nodo.getIzq(), valor);

        if (encontro != null) {
            return encontro;
        }

        encontro = buscar(nodo.getCent(), valor);

        if (encontro != null) {
            return encontro;
        }

        encontro = buscar(nodo.getDer(), valor);

        if (encontro != null) {
            return encontro;
        }
        return null;
        
    }
    
}
