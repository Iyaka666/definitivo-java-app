package model;

import exceptions.OutRangeGivenDoubleException;
import exceptions.StringVoidException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Marlon E. Zambrano Z.
 */
public class TypeProduct {

    private String name;
    private Double percentageIva;

    public TypeProduct(String name, Double percentageIva) throws Exception {
        
        if("".equals(name.trim()) ){
            throw new StringVoidException("Name is empty");
        }
        
        if(!((percentageIva >= 0.0)&&(percentageIva <= 1.0))){
            throw new OutRangeGivenDoubleException("Value is incorrect to percentage");
        }
        
        this.name = name;
        this.percentageIva = percentageIva;
    }

    public String getName() {
        return name;
    }

    public Double getPercentageIva() {
        return percentageIva;
    }

    public void setName(String name) {
        if (this.name.equals(name)) {
            return;
        }
        this.name = name;
    }

    public void setPercentageIva(Double percentageIva) {
        this.percentageIva = percentageIva;
    }

    @Override
    public String toString() {
        return name;
    }

}
