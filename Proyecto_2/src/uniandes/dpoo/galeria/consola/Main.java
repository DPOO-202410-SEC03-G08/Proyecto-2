package uniandes.dpoo.galeria.consola;


import java.util.Date;
import java.util.Scanner;

import uniandes.dpoo.galeria.modelo.Inventario;
import uniandes.dpoo.galeria.modelo.pieza.Pieza;
import uniandes.dpoo.galeria.modelo.usuario.Cliente;
import uniandes.dpoo.galeria.modelo.ventas.Venta;
import uniandes.dpoo.galeria.modelo.ventas.VentaFija;


public class Main {
	
	private static Inventario inventario;
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        while (true) {
            System.out.println("Menú:");
            System.out.println("1. Ingresar como Trabajador");
            System.out.println("2. Ingresar como Cliente");
            System.out.println("3. Crear Managers");
            System.out.println("4. Salir");
            System.out.print("Elige una opción: ");
            
            opcion = scanner.nextInt();
            scanner.nextLine();
            switch (opcion) {
                case 1:
                    System.out.println("Has seleccionado la Opción 1.");
                    System.out.println("Ingrese el Nombre.");
                    String nombre = scanner.next();
                    System.out.println("Ingrese el Correo.");
                    String correo = scanner.next();
                    System.out.println("Ingrese el Numero Celular.");
                    int celular = scanner.nextInt();
                    System.out.println("Ingrese la Contraseña (0000-9999).");
                    int contraseña = scanner.nextInt();
                    Cliente cliente = new Cliente(nombre, correo, celular, contraseña, 0, null, 0);
                    System.out.println("Menú:");
                    System.out.println("1. Comprar Pieza");
                    System.out.println("2. Consignar Pieza");
                    System.out.println("3. Consultar Historia de una Pieza");
                    System.out.println("4. Consultar Historia de un Artista");
                    System.out.print("Elige una opción: ");
                    
                    int opcion2 = scanner.nextInt();
                    switch (opcion2) 
                    {
                    case 1:
                    	System.out.println("Has seleccionado la Opción COMPRAR.");
                    	System.out.println("Ingrese el ID unico de la pieza que quiere comprar.");
                    	int opcion3 = scanner.nextInt();
                    	Pieza pieza = inventario.getPieza(opcion3);
                    	System.out.println("Ingrese la modalidad de compra (fija/subasta).");
                    	String opcion4 = scanner.next();
                    	switch (opcion4) {
                    	case "fija":
                    		Date fecha = new Date();
                    		fecha.getDate();
                    		VentaFija venta = new VentaFija(pieza, fecha, (double) pieza.getPrecio(), cliente, null);
                    	case "subasta":
                    	}
                    	break;
                    case 2:
                    	break;
                    case 3:
                    	break;
                    case 4:
                    	break;
                    default:
                    	System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
                    }
                    break;
                case 2:
                    System.out.println("Has seleccionado la Opción 2.");
                    System.out.print("Por favor, ingresa el rol (administrador/cajero/operario): ");
                    String rol = scanner.next();
                    switch (rol)
                    {
                    case "administrador":
                    	System.out.println("Has seleccionado la Opción Administrador.");
                    	break;
                    case "cajero":
                    	System.out.println("Has seleccionado la Opción Cajero.");
                    	break;
                    case "operario":
                    	System.out.println("Has seleccionado la Opción Operario.");
                    	break;
                    default:
                    	System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
                    }
                    break;
                case 3:
                	System.out.println("Has seleccionado la Opción 3.");
                	System.out.println("Creando User Manager");
                	System.out.println("Creando Ventas Manager");
                case 4:
                    System.out.println("Saliendo del programa...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
            }

            System.out.println();
        }
    }
}