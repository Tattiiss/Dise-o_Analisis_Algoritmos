package com.mycompany.tarea1;


public class Tarea1 {

    public static void main(String[] args) {
        
        NodoArbol<Integer> n20 = new NodoArbol<>(20);
        NodoArbol<Integer> n23 = new NodoArbol<>(23);
        NodoArbol<Integer> n19 = new NodoArbol<>(19);
        NodoArbol<Integer> n57 = new NodoArbol<>(57);
        NodoArbol<Integer> n67 = new NodoArbol<>(67);
        NodoArbol<Integer> n99 = new NodoArbol<>(99);
        
        NodoArbol<Integer> head = n20;
        
        n20.setIzq(null);
        n20.setCent(n19);
        n20.setDer(n23);
        
        n23.setIzq(null);
        n23.setCent(n57);
        n23.setDer(null);
        
        n19.setIzq(n67);
        n19.setCent(null);
        n19.setDer(null);
        
        n67.setCent(n99);
        
        
        //busqueda
        NodoArbol<Integer> encontro = Arbol.buscar(head, 99);
        if (encontro != null) {
            System.out.println("head: " + encontro.getData());
        } else {
            System.out.println("Valor no encontrado.");
        }
        
    }
}
