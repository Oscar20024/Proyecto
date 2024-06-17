/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modulo2;

/**
 *
 * @author USER
 */
// Clase base para representar una caja de uvas
public class CajaDeUva {
private String codigo;
    private double precio;
    private double peso;
    private String tipoUva;

    public CajaDeUva(String codigo, double precio, double peso, String tipoUva) {
        this.codigo = codigo;
        this.precio = precio;
        this.peso = peso;
        this.tipoUva = tipoUva;
    }

    public String getCodigo() {
        return codigo;
    }

    public double getPrecio() {
        return precio;
    }

    public double getPeso() {
        return peso;
    }

    public String getTipoUva() {
        return tipoUva;
    }
}
