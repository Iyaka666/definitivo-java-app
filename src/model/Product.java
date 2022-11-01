package model;

import exceptions.StringVoidAtribException;
import java.util.Objects;

/**
 *
 * @author Marlon
 */
public class Product {

    private long codigo;
    private String nombre;
    private Double costo;
    private TypeProduct esteTipoProducto;

    public Product(long codigo, String nombre, Double costo, TypeProduct tipoProducto)
            throws Exception {
        if (!(100000000000L >= codigo && codigo <= 999999999999L)) {
            throw new NumberFormatException("el codigo debe contener 12 digitos");
        }
        
        if ("".equals(nombre.trim())) {
            throw new StringVoidAtribException("la cadena de texto no puede estar vacia");
        }
        this.codigo = codigo;
        this.nombre = nombre;
        this.costo = costo;
        this.esteTipoProducto = tipoProducto;
    }

    public long getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public Double getCosto() {
        return costo;
    }

    public TypeProduct getTipoProducto() {
        return esteTipoProducto;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCosto(Double costo) {
        this.costo = costo;
    }

    public void setEsteTipoProducto(TypeProduct esteTipoProducto) {
        this.esteTipoProducto = esteTipoProducto;
    }
    
    

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Product other = (Product) obj;
        if (this.codigo != other.codigo) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.costo, other.costo)) {
            return false;
        }
        return Objects.equals(this.esteTipoProducto, other.esteTipoProducto);
    }

}
