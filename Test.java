import java.util.Arrays;
import java.util.Scanner;

class Test {
    public static void main(String[] args) {
        char[] abc = { 'a', 'b', 'c' };
        char[] num = { '1', '2', '3', '4', '5' };
        char[] result = new char[10];

        System.arraycopy(abc, 0, result, 0, abc.length);
        System.arraycopy(num, 0, result, abc.length, num.length);

        System.out.println(Arrays.toString(num));
        System.out.println(Arrays.toString(result));
    }
}