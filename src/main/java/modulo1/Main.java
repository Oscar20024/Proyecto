
package modulo1;


import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean repetir=true;
        int contadorEmpleados=1;

      
        GestionPersonal gestionPersonal = new GestionPersonal();

        
        do{
        System.out.print("\n Ingrese la cantidad de empleados a agregar: ");
        int cantidadEmpleados = scanner.nextInt();
        scanner.nextLine(); // Consumir la nueva línea después de nextInt()
        

        
        for (int i = 0; i < cantidadEmpleados; i++) {
            System.out.println("Ingrese los datos del empleado " + contadorEmpleados + ":");

            System.out.print("Nombre: ");
            String nombre = scanner.nextLine();

            System.out.print("Apellido: ");
            String apellido = scanner.nextLine();

            System.out.print("DNI: ");
            String dni = scanner.nextLine();

            System.out.print("Puesto (Agricultor/Transportador/Empaquetador/Inspector/Distribuidor): ");
            String puesto = scanner.nextLine();

            switch (puesto.toLowerCase()) {
                case "agricultor":
                    gestionPersonal.agregarTrabajador(new AgricultorImpl(nombre, apellido, dni));
                    break;
                case "transportador":
                    gestionPersonal.agregarTrabajador(new TransportadorImpl(nombre, apellido, dni));
                    break;
                case "empaquetador":
                    gestionPersonal.agregarTrabajador(new EmpaquetadorImpl(nombre, apellido, dni));
                    break;
                case "inspector":
                    gestionPersonal.agregarTrabajador(new InspectorDeCalidadImpl(nombre, apellido, dni));
                    break;
                case "distribuidor":
                    gestionPersonal.agregarTrabajador(new DistribuidorImpl(nombre, apellido, dni));
                    break;
                default:
                    System.out.println("Puesto ingresado no válido.");
            }
            contadorEmpleados++;
             gestionPersonal.mostrarTrabajadores();
            
        }

        

        
    }while(repetir);
        
}
}
