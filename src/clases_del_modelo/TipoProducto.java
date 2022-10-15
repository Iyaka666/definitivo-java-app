package clases_del_modelo;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Marlon E. Zambrano Z.
 */
public class TipoProducto {

    private String nombre;
    private Double porcentajeIva;

    public TipoProducto(String nombre, Double porcentajeIva) {
        this.nombre = nombre;
        this.porcentajeIva = porcentajeIva;
    }

    public String getNombre() {
        return nombre;
    }

    public Double getPorcentajeIva() {
        return porcentajeIva;
    }

    public void setNombre(String nombre) {
        if (this.nombre.equals(nombre)) {
            return;
        }
        this.nombre = nombre;
    }

    public void setPorcentajeIva(Double porcentajeIva) {
        if (this.porcentajeIva.equals(porcentajeIva)) {
            return;
        }
        this.porcentajeIva = porcentajeIva;
    }

    @Override
    public String toString() {
        return nombre;
    }

}
