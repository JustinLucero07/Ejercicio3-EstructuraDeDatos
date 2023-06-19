/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.tarea.en.clase3.estructura;

/**
 *
 * @author Usuario
 */
public class Contacto<T> {
    private T nombre;
    private T telefono;

    public Contacto() {
    }

    public Contacto(T nombre, T telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
    }
    

    public T getNombre() {
        return nombre;
    }

    public void setNombre(T nombre) {
        this.nombre = nombre;
    }

    public T getTelefono() {
        return telefono;
    }

    public void setTelefono(T telefono) {
        this.telefono = telefono;
    }

    

    @Override
    public String toString() {
        return "Contacto{" + "nombre=" + nombre + ", telefono=" + telefono + '}';
    }
    
    
}
