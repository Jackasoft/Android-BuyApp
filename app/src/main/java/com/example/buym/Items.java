package com.example.buym;

public class Items {

    String itemId;
    String itemName;

    String price;
    int image;


    public Items(String itemId, String itemName, String price,int image){
        this.itemId = itemId;
        this.image = image;
        this.itemName = itemName;
        this.price = price;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

}
