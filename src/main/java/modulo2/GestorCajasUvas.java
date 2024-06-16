
package modulo2;

import java.util.ArrayList;


class GestorCajasUvas implements GestionCajasUvas {
    private ArrayList<CajaDeUva> cajasRegistradas;

    public GestorCajasUvas() {
        cajasRegistradas = new ArrayList<>();
    }

    @Override
    public boolean agregarCaja(CajaDeUva caja) {
        if (!cajaYaRegistrada(caja.getCodigo())) {
            cajasRegistradas.add(caja);
            return true;
        }
        return false;
    }

    @Override
    public boolean cajaYaRegistrada(String codigo) {
        for (CajaDeUva caja : cajasRegistradas) {
            if (caja.getCodigo().equals(codigo)) {
                return true;
            }
        }
        return false;
    }

    public ArrayList<CajaDeUva> getCajasRegistradas() {
        return cajasRegistradas;
    }
}