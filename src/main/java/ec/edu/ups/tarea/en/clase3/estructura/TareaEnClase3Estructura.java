/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ec.edu.ups.tarea.en.clase3.estructura;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class TareaEnClase3Estructura {

    public static void main(String[] args) {
       Agenda<String> agenda = new Agenda<>();

        Scanner scanner = new Scanner(System.in);
        int opcion = 0;

        do {
            System.out.println("------ MENU ------");
            System.out.println("1. Agregar contacto");
            System.out.println("2. Buscar contacto");
            System.out.println("3. Eliminar contacto");
            System.out.println("4. Imprimir");
            System.out.println("5. Salir");
            System.out.print("Ingrese una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el nombre del contacto: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Ingrese el teléfono del contacto: ");
                    String telefono = scanner.nextLine();
                    agenda.agregarContacto(nombre, telefono);
                    System.out.println("Contacto agregado correctamente.");
                    break;
                case 2:
                    System.out.print("Ingrese el nombre del contacto a buscar: ");
                    String nombreBusqueda = scanner.nextLine();
                    Contacto<String> contactoEncontrado = agenda.buscarContacto(nombreBusqueda);
                    if (contactoEncontrado != null) {
                        System.out.println("Contacto encontrado:");
                        System.out.println("Nombre: " + contactoEncontrado.getNombre());
                        System.out.println("Teléfono: " + contactoEncontrado.getTelefono());
                    } else {
                        System.out.println("Contacto no encontrado.");
                    }
                    break;
                case 3:
                    System.out.print("Ingrese el nombre del contacto a eliminar: ");
                    String nombreEliminacion = scanner.nextLine();
                    agenda.eliminarContacto(nombreEliminacion);
                    System.out.println("Contacto eliminado correctamente.");
                    break;
                case 4:
                    System.out.println("LISTA DE CONTACTOS");
                    agenda.mostrar();
                    break;
                case 5:
                    System.out.println("Saliendo del programa...");
                default:    
            }

            System.out.println();
        } while (opcion != 5);
    }
}
