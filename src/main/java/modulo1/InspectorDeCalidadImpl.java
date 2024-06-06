
package modulo1;



public class InspectorDeCalidadImpl extends Trabajador {
    public InspectorDeCalidadImpl(String nombre, String apellido, String dni) {
        super(nombre, apellido, dni, "Inspector de Calidad");
    }

     @Override
    public void realizarTrabajo() {
        getDescripcionTrabajo();
        
    }

   @Override
    public String getDescripcionTrabajo() {
        return "Esta Inspeccionando";
    }
}
