
package com.mycompany.tarea1;

public class NodoArbol<T> {
    private T data;
    private NodoArbol<T> izq;
    private NodoArbol<T> cent;
    private NodoArbol<T> der;
    
    public NodoArbol(){
    }
    
    public NodoArbol(T data){
        this.data = data;
        this.izq = null;
        this.cent = null;
        this.der = null;
    }
    
    public T getData(){
        return data;
    }
    
    public void setData(T data) {
        this.data = data;
    }

    public NodoArbol<T> getIzq() {
        return izq;
    }

    public NodoArbol<T> getCent() {
        return cent;
    }

    public NodoArbol<T> getDer() {
        return der;
    }

    public void setIzq(NodoArbol<T> izq) {
        this.izq = izq;
    }

    public void setCent(NodoArbol<T> cent) {
        this.cent = cent;
    }

    public void setDer(NodoArbol<T> der) {
        this.der = der;
    }
    
    
    
}
