import java.util.Arrays;
import java.util.Scanner;

class Test {
    public static void main(String[] args) {
        // 선언
        int[][] narray0;

        // 생성
        narray0 = new int[3][4];

        // 축약
        int[][] narray1 = new int[][] { { 1, 2, 3, 4 }, { 1, 2, 3, 4 }, { 1, 2, 3, 4 }, { 1, 2, 3, 4 } };
        int[][] narray2 = { { 1, 2, 3, 4 }, { 1, 2, 3, 4 }, { 1, 2, 3, 4 }, { 1, 2, 3, 4 } };
        int[][] narray3 = new int[3][];
        narray3[0] = new int[] { 1, 2, 3, 4 };
        narray3[1] = new int[] { 1, 2, 3, 4, 5, 6, 7, 8 };
        narray3[2] = new int[] { 1, 2, 3, 4, 5, 6 };
    }
}