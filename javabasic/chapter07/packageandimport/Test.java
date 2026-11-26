package javabasic.chapter07.packageandimport;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Vector;

class Product {
    int price;
    int bonusPoint;

    Product(int price) {
        this.price = price;
        this.bonusPoint = (int) (price / 10.0);
    }

    Product() {
        price = 0;
        bonusPoint = 0;
    }
}

class Tv extends Product {
    Tv() {
        super(100);
    }

    public String toString() {
        return "Tv";
    }
}

class Computer extends Product {
    Computer() {
        super(200);
    }

    public String toString() {
        return "Computer";
    }
}

class Audio extends Product {
    Audio() {
        super(50);
    }

    public String toString() {
        return "Audio";
    }
}

class Buyer {
    int money = 1000;
    int bonusPoint = 0;
    Vector item = new Vector(); // 내부적으로 Object 배열을 갖는다.

    void buy(Product p) {
        if (money < p.price) {
            System.out.println("short of money..");
            return;
        }

        money -= p.price;
        bonusPoint += p.bonusPoint;
        item.add(p);
        System.out.println("you've purchased: " + p);
    }

    void refund(Product p) {
        if (item.remove(p)) {
            money += p.price;
            bonusPoint -= p.bonusPoint;
            System.out.println("you've refunded: " + p);
        } else {
            System.out.println("you haven't prurchased : " + p);
        }
    }

    void summary() {
        int sum = 0;
        String itemList = "";

        if (item.isEmpty()) {
            System.out.println("nothing purchased");
            return;
        }

        for (int i = 0; i < item.size(); i++) {
            Product p = (Product) item.get(i);
            sum += p.price;
            itemList += (i == 0) ? "" + p : ", " + p;
        }
        System.out.println("spending total: " + sum);
        System.out.println("Purchased List: " + itemList);
    }
}

class PolyArgumentTest3 {
    public static void main(String[] args) {
        Buyer b = new Buyer();
        Tv tv = new Tv();
        Computer computer = new Computer();
        Audio audio = new Audio();

        b.buy(tv);
        b.buy(computer);
        b.buy(audio);
        b.refund(tv);
        b.summary();
    }
}