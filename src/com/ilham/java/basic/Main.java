package com.ilham.java.basic;

public class Main {
    public static void main(String[] args) {
        int totalsemua;

        Data barang1 = new Data();
        barang1.setNama("Lampu");
        barang1.setStock(20);
        barang1.setHarga(20000);
        barang1.setTotal(20,20000);
        int b1 = barang1.getTotal();

        Data barang2 = new Data();
        barang2.setNama("Tas");
        barang2.setStock(50);
        barang2.setHarga(15000);
        barang2.setTotal(50,15000);
        int b2 = barang1.getTotal();

        System.out.println("\nNama Barang : "+barang1.getNama());
        System.out.println("Jumlah Stock : "+barang1.getStock());
        System.out.println("Harga Barang : "+barang1.getHarga());
        System.out.println("Total Harga : "+barang1.getTotal());

        System.out.println("\nNama Barang : "+barang2.getNama());
        System.out.println("Jumlah Stock : "+barang2.getStock());
        System.out.println("Harga Barang : "+barang2.getHarga());
        System.out.println("Total Harga : "+barang2.getTotal());

        totalsemua = b1 + b2;
        System.out.println("\nTotal Harga Keseluruhan adalah "+totalsemua);

    }
}
