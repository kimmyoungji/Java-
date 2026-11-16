# 4. 조건문과 반복문

## 4.1 조건문
### 4.1.1 if문
### 4.1.2 if-else문
### 4.1.3 if-else if문
### 4.1.4 중첩 if문
### 4.1.5 switch 문

## 4.2 반복문 - for, while, do-while
### 4.2.1 for문
### 4.2.2 while문
### 4.2.3 do-while문
### 4.2.4 break문
### 4.2.5 continue문
### 4.2.6 이름 붙은 반복문
```java
import java.util.Scanner;

class Test {
    public static void main(String[] args) {
        int menu = 0, num = 0;

        Scanner scanner = new Scanner(System.in);

        outer: while (true) {
            System.out.println("(1) square");
            System.out.println("(2) square root");
            System.out.println("(3) log");
            System.out.print("원하는 메뉴(1~3)를 선택하세요.(종료:0)> ");

            String tmp = scanner.nextLine();
            menu = Integer.parseInt(tmp);

            if (menu == 0) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else if (!(1 <= menu && menu <= 3)) {
                System.out.println("메뉴를 잘못 선택하셨습니다. (종료는 0)");
                continue;
            }

            for (;;) { // 조건식이 참으로 해석되어 무한 반복된다.
                System.out.print("계산할 값을 입력하세요.(계산 종료:0, 전체 종료:99)> ");
                tmp = scanner.nextLine();
                num = Integer.parseInt(tmp);

                if (num == 0)
                    break;

                if (num == 99)
                    break outer;

                switch (menu) {
                    case 1:
                        System.out.println("result=" + num * num);
                        break;
                    case 2:
                        System.out.println("result=" + Math.sqrt(num));
                        break;
                    case 3:
                        System.out.println("result=" + Math.log(num));
                        break;
                }
            }
        }
    }
}
```