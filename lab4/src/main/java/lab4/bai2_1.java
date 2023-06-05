/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

/**
 *
 * @author ASUS
 */
public class bai2_1 {
    private String  pruductId,name,unit;
    private double  price;
     private String provider;

    public bai2_1() {
    }

    public bai2_1(String pruductId, String name, String unit, double price, String provider) {
        this.pruductId = pruductId;
        this.name = name;
        this.unit = unit;
        this.price = price;
        this.provider = provider;
    }

    public String getPruductId() {
        return pruductId;
    }

    public void setPruductId(String pruductId) {
        this.pruductId = pruductId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }
     
}
