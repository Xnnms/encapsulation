package com.ilham.java.basic;

public class Data {
    private String nama;
    private int stock;
    private int harga;
    private int total;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int stock, int harga) {
        this.total = stock * harga;
    }
}

