
package modulo1;




public class TransportadorImpl extends Trabajador  {
    public TransportadorImpl(String nombre, String apellido, String dni) {
        super(nombre, apellido, dni, "Transportador");
    }

     @Override
    public void realizarTrabajo() {
        getDescripcionTrabajo();
        
    }

   @Override
    public String getDescripcionTrabajo() {
        return "Esta Transportando";
    }
}