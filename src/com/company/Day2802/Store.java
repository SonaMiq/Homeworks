package com.company.Day2802;

public class Store {

    private int countOfWorkers;
    private String name;
    private String phone;
    int[] products;

    public String getName() {
        return name;
    }

    public int getCountOfWorkers() {
        return countOfWorkers;
    }

    public int[] getProducts() {
        return products;
    }

    public String getPhone() {
        return phone;
    }

    public void setCountOfWorkers(int countOfWorkers) {

        if (countOfWorkers < 2 || countOfWorkers > 50) {
            System.out.println("Invalid input");
            return;
        }
        this.countOfWorkers = countOfWorkers;
    }

    public void setPhone(String phone) {
        if (phone.length() != 8) {
            System.out.println("Invalid input");
            return;
        }
        for (int i = 0; i < phone.length(); i++) {
            if (phone.charAt(i) < 0 || phone.charAt(i) > 9) {
                System.out.println("Invalid input");
                return;
            }
        }
        this.phone = phone;
    }

    public void setName(String name) {
        if (name.length() < 3) {
            System.out.println("Invalid input");
            return;
        }
        this.name = name;
    }

    public void setProducts(int[] products) {
        this.products = products;
    }
}
