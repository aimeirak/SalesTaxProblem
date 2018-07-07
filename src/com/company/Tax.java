package com.company;

class Tax {
    int quantity = 0;
    String productName = null;
    float product_price = 0.0f;
    boolean imported = false;
    boolean exempted = false;
    float sales_tax = 0.0f;

    void calculateSalesTax() {
        float totalTax = 0.0f;
        if (imported)
            totalTax = 0.05f;
        if (!exempted)
            totalTax = .1f;
        sales_tax = totalTax * product_price;
    }

    public String toString() {
        float p = product_price + sales_tax;
        return quantity + " " + productName + " at " + p;
    }
}
