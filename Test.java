import java.util.Arrays;
import java.util.Scanner;

class Data {
    int x;
    int y;
}

class Test {
    public static void main(String[] args) {
        Data d = new Data();
        d.x = 10;
        d.y = 20;
        System.out.printf("d.x : %d, d.y : %d %n", d.x, d.y);
        Data d2 = copy(d);
        System.out.printf("d2.x: %d, d2.y: %d %n", d2.x, d2.y);
    }

    static Data copy(Data d) {
        Data nd = new Data();
        nd.x = d.x;
        nd.y = d.y;
        return nd;
    }
}