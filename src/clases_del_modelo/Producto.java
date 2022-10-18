package clases_del_modelo;

import exceptions.StringVoidAtribException;
import java.util.Objects;

/**
 *
 * @author Marlon
 */
public class Producto {

    private long codigo;
    private String nombre;
    private Double costo;
    private TipoProducto esteTipoProducto;

    public Producto(long codigo, String nombre, Double costo, TipoProducto tipoProducto)
            throws Exception {
        if (!(1000000000000L >= codigo && codigo <= 999999999999L)) {
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

    public TipoProducto getTipoProducto() {
        return esteTipoProducto;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCosto(Double costo) {
        this.costo = costo;
    }

    public void setEsteTipoProducto(TipoProducto esteTipoProducto) {
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
        final Producto other = (Producto) obj;
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
