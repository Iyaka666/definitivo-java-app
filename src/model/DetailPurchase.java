package model;

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

}
