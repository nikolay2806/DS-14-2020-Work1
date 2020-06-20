/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package types;

/**
 *
 * @author Nikolay
 */
public class Zapchasty {
    private int id;
    private String name;
    private String brand;
    private String supplie;
    private String warranty;
    private String promotion;
    private int kol;
    private double price;

    public Zapchasty() {
        this.id = 0;
        this.name = "";
        this.brand = "";
        this.supplie = "";
        this.warranty = "";
        this.promotion = "";
        this.kol = 0;
        this.price = 0;
    }

    public Zapchasty(int id, String name, String brand, String supplie, String warranty, String promotion, int kol, double price) {
        this.id = id;
        this.name = name;
        this.brand = brand;
        this.supplie = supplie;
        this.warranty = warranty;
        this.promotion = promotion;
        this.kol = kol;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPromotion() {
        return promotion;
    }

    public void setPromotion(String promotion) {
        this.promotion = promotion;
    }

    public String getSupplie() {
        return supplie;
    }

    public void setSupplie(String supplie) {
        this.supplie = supplie;
    }

    public String getWarranty() {
        return warranty;
    }

    public void setWarranty(String warranty) {
        this.warranty = warranty;
    }

    public int getKol() {
        return kol;
    }

    public void setKol(int kol) {
        this.kol = kol;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
      
}
