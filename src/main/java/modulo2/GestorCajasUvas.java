
package modulo2;


import java.util.ArrayList;
import java.util.List;

public class GestorCajasUvas {
     private List<CajaDeUva> cajas;

    public GestorCajasUvas() {
        this.cajas = new ArrayList<>();
    }

    public boolean agregarCaja(CajaDeUva caja) {
        // Verificar si ya existe una caja con el mismo código
        for (CajaDeUva c : cajas) {
            if (c.getCodigo().equals(caja.getCodigo())) {
                return false; // Ya existe, no se puede agregar
            }
        }
        
        // Si no existe, agregar la caja
        cajas.add(caja);
        return true;
    }

    public void mostrarCajasRegistradas() {
        StringBuilder stringBuilder = new StringBuilder();
        for (CajaDeUva c : cajas) {
            System.out.println("Caja registrada:");
            System.out.println("Código: " + c.getCodigo());
            System.out.println("Precio: $" + c.getPrecio());
            System.out.println("Peso: " + c.getPeso() + " kg");
            System.out.println("Tipo de Uva: " + c.getTipoUva());
            System.out.println("----------------------------");
        }
    }
    
    
    
}