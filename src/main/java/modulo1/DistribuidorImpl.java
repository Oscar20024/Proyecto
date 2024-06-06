                                                                                         
package modulo1;



public class DistribuidorImpl extends Trabajador  {
    
    public DistribuidorImpl(String nombre, String apellido, String dni) {
        super(nombre, apellido, dni, "Distribuidor");
    }

     @Override
    public void realizarTrabajo() {
        getDescripcionTrabajo();
        
    }

   @Override
    public String getDescripcionTrabajo() {
        return "Esta Distribuyendo";
    }
}