
package modulo1;






public class GestionPersonal {
    private Trabajador[] trabajadores;
    private int count;

    public GestionPersonal() {
        this.trabajadores = new Trabajador[10]; // Capacidad inicial de 10 trabajadores
        this.count = 0;
    }

    public void agregarTrabajador(Trabajador trabajador) {
        if (count < trabajadores.length) {
            trabajadores[count++] = trabajador;
        } else {
            System.out.println("No se pueden agregar más trabajadores.");
        }
    }

 public String mostrarTrabajadores() {
    StringBuilder stringBuilder = new StringBuilder();
    for (int i = 0; i < count; i++) {
        Trabajador trabajador = trabajadores[i];
        stringBuilder.append(trabajador.nombre)
                     .append(" ")
                     .append(trabajador.apellido)
                     .append(" (")
                     .append(trabajador.dni)
                     .append(") - ")
                     .append(trabajador.getDescripcionTrabajo())
                     .append("\n");
    }
    return stringBuilder.toString();
}
  
  
  
  
}