
package modulo1;




public class EmpaquetadorImpl extends Trabajador  {
    public EmpaquetadorImpl(String nombre, String apellido, String dni) {
        super(nombre, apellido, dni, "Empaquetador");
    }

    @Override
    public void realizarTrabajo() {
        getDescripcionTrabajo();
        
    }

   @Override
    public String getDescripcionTrabajo() {
        return "Esta Empaquetando";
    }
}
