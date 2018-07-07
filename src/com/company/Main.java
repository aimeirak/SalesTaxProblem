package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input_from_keyboard = new Scanner(System.in);
        ArrayList<Tax> list = new ArrayList<Tax>();
        int no = 1;
        while (true) {
            Tax tax = new Tax();
            System.out.println("Add Products: " + no);
            System.out.print("Quantity: ");
            int quantity = input_from_keyboard.nextInt();
            tax.quantity = quantity;
            System.out.print("Product Name: ");
            String prod = input_from_keyboard.next();
            tax.productName = prod;
            System.out.print("Price: ");
            float p = input_from_keyboard.nextFloat();
            tax.product_price = p;
            System.out.print("Is it Imported[y/n]: ");
            String imp = input_from_keyboard.next();
            if (imp.toLowerCase().equals("y"))
                tax.imported = true;
            System.out.print("Is it Exempted[y/n]: ");
            String exempt = input_from_keyboard.next();
            if (exempt.toLowerCase().equals("y"))
                tax.exempted = true;
            tax.calculateSalesTax();
            list.add(tax);
            no++;
            System.out.print("Add More Products [y/n]: ");
            String add = input_from_keyboard.next();
            if (add.toLowerCase().equals("n"))
                break;
        }
        float total_price = 0.0f;
        float sales_tax = 0.0f;
        for (int i = 0; i < list.size(); i++) {
            Tax tax = list.get(i);
            total_price += tax.product_price;
            sales_tax += tax.sales_tax;
            System.out.println(tax);
        }

        System.out.println("Sales Taxes:" + sales_tax);
        System.out.println("Total: " + (total_price + total_price));
    }
}
