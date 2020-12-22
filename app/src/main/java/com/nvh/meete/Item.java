package com.nvh.meete;

public class Item {
    int image;
    String name, giamgia, diachi;

    public Item(int image, String name, String giamgia, String diachi) {
        this.image = image;
        this.name = name;
        this.giamgia = giamgia;
        this.diachi = diachi;
    }

    public int getImage() {
        return image;
    }

    public String getName() {
        return name;
    }

    public String getGiamgia() {
        return giamgia;
    }

    public String getDiachi() {
        return diachi;
    }
}
