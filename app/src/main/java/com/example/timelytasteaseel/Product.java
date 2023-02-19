package com.example.timelytasteaseel;
import java.io.Serializable;
public class Product implements Serializable {

    private String productName;
    private String proInfo;
    private String proCompany;
    private String proPhoto;
    private String proPrice;
    private String onselcteditem;


    public Product() {
    }
    public Product(String productName, String proInfo, String proCompany, String proPhoto, String proPrice,String onselcteditem ) {
        this.productName =productName;
        this.proInfo = proInfo;
        this.proCompany = proCompany;
        this.proPhoto = proPhoto;
        this.proPrice =proPrice;
        this.onselcteditem=onselcteditem;

    }
    public String getProductName() { return productName; }
    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProInfo() { return proInfo; }
    public void setProInfo(String proInfo) { this.proInfo = proInfo; }

    public String getProCompany() { return proCompany; }
    public void setProCompany(String proCompany) { this.proCompany = proCompany; }

    public String getProPhoto() { return proPhoto; }
    public void setProPhoto(String proPhoto) { this.proPhoto = proPhoto; }

    public String getProPrice() {
        return proPrice;
    }
    public void setProPrice(String proPrice) {
        this.proPrice = proPrice;
    }

    @Override
    public String toString() {
        return "MainPage{" +
                "productName='" + productName + '\'' +
                ",proInfo='" + proInfo+ '\'' +
                ",  proCompany='" +  proCompany + '\'' +
                ", proPhoto='" +proPhoto + '\'' +
                ", proPrice=" + proPrice +
                '}';
    }
}






