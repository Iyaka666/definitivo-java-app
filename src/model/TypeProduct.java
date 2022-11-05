package model;

import exceptions.ItIsNotDoubleException;
import exceptions.StringVoidException;
import exceptions.PercentageOutRangeException;

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
        setName(name);
        setPercentageIva(percentageIva);
    }

    public String getName() {
        return name;
    }

    public Double getPercentageIva() {
        return percentageIva;
    }

    public void setName(String name) throws Exception{
        if("".equals(name)){
            throw new StringVoidException("Name is empty");
        }
        if(!(name.equals(this.name))){
            this.name = name;
        }
    }

    public void setPercentageIva(Double percentageIva) throws Exception{
        if(!( percentageIva instanceof Double )){
            throw new ItIsNotDoubleException("Value is incorrect to percentage");
        }
        if(!(percentageIva >= 0.0 && percentageIva <= 1.0)){
            throw new PercentageOutRangeException("Value should be 0% into 100&%");
        }
        if(!(percentageIva >= 0)){
            throw new NegativeInvalidException("Percentege should be a negative value");
        }
        this.percentageIva = percentageIva;
    }
    
    public String viewPercentage(){
        return String.valueOf( (short)(this.percentageIva * 100) ) +"%";
    }
    
    @Override
    public String toString() {
        return name;
    }

}
