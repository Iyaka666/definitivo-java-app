package model;

import exceptions.StringVoidException;
import java.util.Objects;

/**
 *
 * @author Marlon
 */
public class Product {

    private long code;
    private String name;
    private Double cost;
    private TypeProduct typeProduct;

    public Product(long code, String name, Double cost, TypeProduct typeProduct)
            throws Exception {
        if (!(100000000000L >= code && code <= 999999999999L)) {
            throw new CodeInvalidException("el code debe contener 12 digitos");
        }
        
        if ("".equals(name.trim())) {
            throw new StringVoidException("la cadena de texto no puede estar vacia");
        }
        this.code = code;
        this.name = name;
        this.cost = cost;
        this.typeProduct = typeProduct;
    }

    public long getCode() {
        return code;
    }

    public void setCode(long code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    public TypeProduct getTypeProduct() {
        return typeProduct;
    }

    public void setTypeProduct(TypeProduct typeProduct) {
        this.typeProduct = typeProduct;
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
        if (this.code != other.code) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.cost, other.cost)) {
            return false;
        }
        return Objects.equals(this.typeProduct, other.typeProduct);
    }

}
