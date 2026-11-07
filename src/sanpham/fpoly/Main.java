package sanpham.fpoly;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();


        products.add(new ImportedProduct("Laptop Gaming", "IP01", 20000000, 0.1, 500000));
        products.add(new ImportedProduct("Dien thoai thong minh", "IP02", 15000000, 0.08, 300000));

        products.add(new Product("Ban phim co", "P01", 1200000));
        products.add(new Product("Chuot khong day", "P02", 450000));
        products.add(new Product("Tai nghe Bluetooth", "P03", 850000));

    
        System.out.println("=== DANH SACH SAN PHAM ===");
        for (Product p : products) {
            System.out.println(p.toString() + " | Gia cuoi cung: " + p.finalPrice());
            System.out.println("");
        }

        // Tim san pham co finalPrice() cao nhat
        if (!products.isEmpty()) {
            Product maxPriceProduct = products.get(0);
            for (int i = 1; i < products.size(); i++) {
                if (products.get(i).finalPrice() > maxPriceProduct.finalPrice()) {
                    maxPriceProduct = products.get(i);
                }
            }

            System.out.println("\n=== SAN PHAM CO GIA CUOI CUNG CAO NHAT ===");
            System.out.println(maxPriceProduct.toString() + " | Gia cuoi cung: " + maxPriceProduct.finalPrice());
        }
    }
}