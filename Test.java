import java.util.Arrays;
import java.util.Scanner;

class InitTest {
    static int cv = 1;
    int iv = 1;

    static {
        cv = 2;
    }
    {
        iv = 2;
    }

    InitTest() {
        iv = 3;
    }
}

class Test {
    public static void main(String[] args) {

    }
}