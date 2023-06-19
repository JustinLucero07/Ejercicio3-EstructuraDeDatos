/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.tarea.en.clase3.estructura;

import ec.edu.ups.tarea.en.clase3.estructura.ListaEnlazada;

/**
 *
 * @author Usuario
 */
public class Agenda<T> {
    private ListaEnlazada<Contacto<T>> listaContactos;
    
    
    public Agenda() {
        listaContactos = new ListaEnlazada<>();
    }

    public void agregarContacto(T nombre, T telefono) {
        Contacto<T> nuevoContacto = new Contacto<>(nombre, telefono);
        listaContactos.agregar(nuevoContacto);
    }

    public Contacto<T> buscarContacto(T nombre) {
        NodoGenerico<Contacto<T>> actual = listaContactos.getCabeza();
        while (actual != null) {
            Contacto<T> contacto = actual.getElemento();
            if (contacto.getNombre().equals(nombre)) {
                return contacto;
            }
            actual = actual.getSiguiente();
        }
        return null;
    }

    public void eliminarContacto(T nombre) {
        NodoGenerico<Contacto<T>> actual = listaContactos.getCabeza();
        NodoGenerico<Contacto<T>> anterior = null;

        while (actual != null) {
            Contacto<T> contacto = actual.getElemento();
            if (contacto.getNombre().equals(nombre)) {
                if (anterior == null) {
                    listaContactos.setCabeza(actual.getSiguiente());
                } else {
                    anterior.setSiguiente(actual.getSiguiente());
                }
                return;
            }
            anterior = actual;
            actual = actual.getSiguiente();
        }
    }
    
    public void mostrar(){
        listaContactos.mostrarContactos();
    }
}
