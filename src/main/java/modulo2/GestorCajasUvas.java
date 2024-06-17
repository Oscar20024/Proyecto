
package modulo2;


import java.util.ArrayList;
import java.util.List;

public class GestorCajasUvas {
    private List<Caja> cajas;

    public GestorCajasUvas() {
        this.cajas = new ArrayList<>();
    }

    public boolean agregarCaja(Caja caja) {
        if (cajas.size() < 10) { // Capacidad inicial de 10 cajas
            // Verificar si ya existe una caja con el mismo código
            for (Caja c : cajas) {
                if (c.getCodigo().equals(caja.getCodigo())) {
                    return false; // Ya existe, no se puede agregar
                }
            }
            
            // Si no existe, agregar la caja
            cajas.add(caja);
            return true;
        } else {
            System.out.println("No se pueden agregar más cajas.");
            return false;
        }
    }

    public String mostrarCajas() {
        StringBuilder stringBuilder = new StringBuilder();
        for (Caja caja : cajas) {
            stringBuilder.append("Caja registrada:\n")
                         .append("Codigo: ").append(caja.getCodigo()).append("\n")
                         .append("Precio: $").append(caja.getPrecio()).append("\n")
                         .append("Peso: ").append(caja.getPeso()).append(" kg\n")
                         .append("Tipo de Uva: ").append(caja.getTipoUva()).append("\n");
                         
        }
        return stringBuilder.toString();
    }
}