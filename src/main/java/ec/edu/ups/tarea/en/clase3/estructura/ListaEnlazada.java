/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.tarea.en.clase3.estructura;

/**
 *
 * @author Usuario
 */
public class ListaEnlazada<T> {
    private NodoGenerico<T> cabeza;
    private int tamano;

    //Metodo Agregar
    
     public boolean estaVacia() {
        return cabeza == null;
    }

     
    public void mostrarContactos() {
        if (estaVacia()) {
            System.out.println("La agenda está vacía.");
        } else {
            NodoGenerico<T> actual = cabeza;
            while (actual != null) {
                Contacto contacto = (Contacto) actual.getElemento();
                System.out.println("Nombre: " + contacto.getNombre() + ", Teléfono: " + contacto.getTelefono());
                actual = actual.getSiguiente();
            }
        }
    }
 
    public void agregar(T elemento){
        NodoGenerico<T> nuevo = new NodoGenerico(elemento);
        if(cabeza == null){
            cabeza = nuevo;
        }else{
            NodoGenerico<T> ultimoNodo = obtenerUltimo();
            ultimoNodo.setSiguiente(nuevo);
        }
        tamano++;
    }
    
    public NodoGenerico<T> obtenerUltimo(){
        NodoGenerico<T> actual = cabeza;
        while(actual.getSiguiente()!=null){
            actual = actual.getSiguiente();
        }
        return actual;
    }
    
    public T getElementByIndice(int indice){
        NodoGenerico<T> actual = cabeza;
        for (int i = 0; i < indice; i++) {
            actual = actual.getSiguiente();
        }
        return actual.getElemento();
    }
    
    public void deleteByIndice(int indice){
        if(indice == 0){
            cabeza = cabeza.getSiguiente();
        }else{
            NodoGenerico<T> anterior = obtenerNodoByIndice(indice-1);
            NodoGenerico<T> nodoActual = anterior.getSiguiente();
            anterior.setSiguiente(nodoActual.getSiguiente()); 
        }
        tamano--;
    }
    
    public NodoGenerico<T> obtenerNodoByIndice(int indice) {
        NodoGenerico<T> actual = cabeza;
        for (int i = 0; i < indice; i++) {
            actual = actual.getSiguiente();
        }
        return actual;
    }
    
    public int tamañoLista() {
        int contador = 0;
        NodoGenerico<T> actual = cabeza;
        while (actual != null) {
            contador++;
            actual = actual.getSiguiente();
        }
        return contador;
    }

    
    
    public NodoGenerico<T> getCabeza() {
        return cabeza;
    }

    public void setCabeza(NodoGenerico<T> cabeza) {
        this.cabeza = cabeza;
    }

    
    
    public int getTamano() {
        return tamano;
    }

    public void setTamano(int tamano) {
        this.tamano = tamano;
    }
    
    
}
