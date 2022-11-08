package model;

import java.util.Objects;

/**
 *
 * @author Marlon
 */
public class DetailPurchase {

    private short quantity;
    private Double costPurchase;
    private Double valueIva;
    private Product product;

    public DetailPurchase(short quantity, Product product) throws Exception{
        this.product = product;
        if(!(quantity>=0)){
            throw new NegativeInvalidException("it does not accept negative values");
        }
        this.quantity = quantity;
        this.valueIva = this.product.getCost() * this.product.getTypeProduct().getPercentageIva();        
        this.costPurchase = (this.product.getCost() + this.valueIva) * this.quantity;
    }

    public short getQuantity() {
        return quantity;
    }

    public Double getCostPurchase() {
        return costPurchase;
    }

    public Double getValueIva() {
        return valueIva;
    }

    public Product getProduct() {
        return product;
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
        final DetailPurchase other = (DetailPurchase) obj;
        if (this.quantity != other.quantity) {
            return false;
        }
        if (!Objects.equals(this.costPurchase, other.costPurchase)) {
            return false;
        }
        if (!Objects.equals(this.valueIva, other.valueIva)) {
            return false;
        }
        return Objects.equals(this.product, other.product);
    }
    
    
}
