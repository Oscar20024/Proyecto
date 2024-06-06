
package modulo1;

import javax.swing.JTextArea;



public abstract class Trabajador {
    protected String nombre;
    protected String apellido;
    protected String dni;
    protected String rango;
    public abstract String getDescripcionTrabajo();
    public Trabajador(String nombre, String apellido, String dni, String rango) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.rango = rango;
    }

    public abstract void realizarTrabajo();
}


