
package modulo1;


public class AgricultorImpl extends Trabajador  {
    
    public AgricultorImpl(String nombre, String apellido, String dni) {
        super(nombre, apellido, dni, "Agricultor");
    }

    @Override
    public void realizarTrabajo() {
        getDescripcionTrabajo();
        
    }

   @Override
    public String getDescripcionTrabajo() {
        return "Esta Sembrando";
    }
    
    //ayudaaa

   
}