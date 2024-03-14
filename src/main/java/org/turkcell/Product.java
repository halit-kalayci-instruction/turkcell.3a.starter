package org.turkcell;

// erişim_belirteci class class_ismi
public class Product
{
    // Kalıp oluşturmak
    private String name;
    private double unitPrice;
    private int stock;

    // Eğer bir nesne hiç bir ctor tanımı içermiyor ise boş parametreli boş içerikli
    // bir ctor otomatik atanır.
    public Product() {
        System.out.println("Constructor çalıştı..");
    }
    public Product(String name, double unitPrice, int stock) {
        this.name = name;
        this.unitPrice = unitPrice;
        this.stock = stock;
    }
    // bla bla...

    // Encapsulation

    // getter-setter method
    // this => class'ın kendisini ifade eder.
    public String getName() {
        return this.name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    // ALT + INSERT
    public double getUnitPrice() {
        return unitPrice;
    }
    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public int getStock() {
        return stock;
    }
    public void setStock(int stock) {
        this.stock = stock;
    }
}

// Özellik adı : GB
// Özellik değeri : 45

// Özellik adı: Renk
// Özellik değr: Kırmızı

// Ürün id 5 =>

// Ürün id 6 =>