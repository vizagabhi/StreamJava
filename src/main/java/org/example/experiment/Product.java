package org.example.experiment;

import java.util.ArrayList;
import java.util.List;

public class Product {

    private int product_id;

    private double price;

    private String category;

    public Product(int product_id, double price, String category) {
        this.product_id = product_id;
        this.price = price;
        this.category = category;
    }

    public static void main(String[] args) {


        Product product = new Product(1, 100, "FootWear");
        Product product5 = new Product(2, 100, "FootWear");
        Product product1 = new Product(3, 100, "something");
        Product product2 = new Product(4, 100, "pop");
        Product product3 = new Product(5, 100, "hello");
        Product product4 = new Product(6, 100, "dd");
        List<Product> productList = new ArrayList<>();
        productList.add(product);
        productList.add(product1);
        productList.add(product2);
        productList.add(product3);
        productList.add(product4);
        productList.add(product5);

        //Find all the products which belong to “Footwear” category and apply 15% discount on them.
        productList.stream()
                .filter(prod -> prod.getCategory().equals("FootWear"))
                .forEach(filprod -> {
                    filprod.setPrice(filprod.getPrice() - filprod.getPrice() * 0.15);
                    System.out.println(filprod);
                });


    }

    public int getProduct_id() {
        return product_id;
    }

    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Product{" +
                "product_id=" + product_id +
                ", price=" + price +
                ", category='" + category + '\'' +
                '}';
    }
}
//=============================================================================================================

//Author  & Books
//
//@Entity
//class Author{
//    @Id(Genrate..)
//    private Long id;
//
//    private String name;
//
//    @OneToMany
//    @JoinColumn(mappedBy = author)
//    private List<Books> books;
//
//    //Getters and Setters
//}
//
//@Entity
//class Books{
//    @Id(Genrate..)
//    private Long bid;
//
//    private String bname;
//
//    @ManyToOne
//    private String Author;
//
//    //Getters and Setters
//}

class Randoms {
    public static void main(String[] args) {

        int[] arr = {2, 4, 6, 8, 9};
        int n = arr.length;
        int j = n - 1;
        for (int i = 0; i < n / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            j--;
        }
        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}