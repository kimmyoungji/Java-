# 6.객체지향 프로그래밍 1

## 6.1 객체지향 언어
### 6.1.1 객체지향 언어의 역사
### 6.1.2 객체지향 언어

## 6.2 클래스와 객체
### 6.2.1 클래스와 객체의 정의와 용도
- 클래스의 정의: 클래스란 객체를 정의해 놓은 것
- 클래스의 용도: 클래스는 객체를 새성하는데 사용된다.
- 객체의 정의: 실제로 존재하는 것. 사물 또는 개념
- 객체의 용도: 객체가 가지고 있는 기능과 속성에 따라 다름
- 유형의 객체: 책상, 의자, 자동차, TV와 같은 사물
- 무형의 객체: 수학굥식, 프로그램 에러와 같으 논리나 개념

### 6.2.2 객체와 인스턴스
- 클래스 --(인스턴스화)--> 인스턴스(객체)

### 6.2.3 객체의 구성요소 - 속성과 기능
- 객체는 속성과 기능 두종류의 구성요소로 이루어져있다.
  - 속성(property): 멤버변수, 특성, 필드, 상태
  - 기능(function): 메서드, 함수, 행위

### 6.2.4 인스턴스 생성과 사용
```java
Tv t = new Tv();
```
- new 연산자에 의해 Tv클래스의 인스턴스가 메모리의 빈 공간에 생성된다. 
- t 변수에 인스턴스가 할당된 메모리의 헤더 주소가 저장된다.
- 인스턴스의 각 멤버변수는 각 자료형에 해당하는 기본값으로 초기화 된다.
- 생성된 인스턴스는 해당 인스턴스의 메모리 히더 주소가 저장된 "참조변수"를 통해서만 다룰 수 있다. 
- 참조변수의 타입은 인스턴스의 타입과 일치해야한다. 

### 6.2.5 객체 배열
- 객체 배열을 생성하는 것은, 그저 객체를 다루기 이ㅜ한 참조 변수들이 만들어진 것일 뿐, 아직 객체가 저장되지 않았다.
- 객체를 생성해서 객체 배열의 각 요소에 저장하는 것을 잊으면 안 된다. 

### 6.2.6 클래스의 또 다른 정의
- 클래스 - 데이터와 함수의 결합이다.
  - 변수: 하나의 데이터를 저장할 수 있는 공간
  - 배열: 동일한 형태의 여러 데이터를 하나의 집합으로 저장할 수 있는 공간
  - 구조체: 상이한 형태의 여러 데이터를 하나의 집합으로 저장할 수 있는 공간
  - 클래스: 상이한 형태의 여러 데이터와 그와 관련된 함수를 하나의 집합으로 저장할 수 있는 공간
- 클래스 - 사용자정의 타입이다.

## 6.3 변수와 메서드
### 6.3.1 선언위치에 따른 변수의 종류
- 클래스 변수  : 클래스 영역에 선언 / 클래스가 메모리에 올라갈 때 생성 
- 인스턴스 변수: 클래스 영역에 선언 / 인스턴스가 생성되었을 때 생성
- 지역변수    : 블럭 내부에 선언  / 변수 선언문이 수행되었을 때 생성

### 6.3.2 클래스변수와 인스턴스 변수
- 인스턴스 변수는 인스턴스가 생성될 때 마다 생성되므로 인스턴스마다 각기 다른 값을 유지할 수 있지만, 클래스 변수는 모든 인스턴스가 하나의 저장공간을 공유하므로, 항상 공통된 값을 갖는다.

### 6.3.3 메서드
- 특정 작업을 수행하는 인련의 문장들을 하나로 묶은 것
- 수학의 함수와 유사
- 메서드를 사용하는 이유: 재사용성, 중복제거, 프로그램 구조화

### 6.3.4 메서드의 선언과 구현
```java
int add(int x, int y) {
    int result = x + y;
    return result;
}
```

### 6.3.5 메서드의 호출
```java
add(1,2)
```
- 인자와 매개변수
- 메서드의 실행 흐름
  - 같은 클래스 내의 메서드 끼리는 참조변수를 사용하지 않고도 서로 호출이 가능하지만, static 메서드는 같은 클래스 내의 인스턴스 메서드를 호출할 수 없다.
### 6.3.6 return 문
- return 문은 현재 실행 중인 메서드를 종료하고 호출한 메서드로 되돌아간다.
- 메서드의 구현부{}를 작성할 때, 제일 먼저 해야하는 일이 매개변수의 값이 적절한 것인지 확인하는 것이다.

### 6.3.7 JVM 메모리 구조
- 1) 메서드 영역
  - 클래스 데이터가 저장된다
  - static 변수와 static 함수가 이 영역에 저장된다.
- 2) 힙 영역
  - 이 영역에 인스턴스가 생성된다.
  - 인스턴스 변수와 함수가 생성되는 공간.
- 3) 호출 스택
  - 메서드의 작업에 필요한 메모리 공간을 제공한다.
  - 지역변수, 매개변수, 연산의 중간 결과등을 저장하는 공간.
  - 메서드가 호출되면, 호출 스택에 호출된 메서드를 위한 메모리가 할당되고 메서드가 작업을 마치면 할당되었던 메모리 공간은 반환되어 비워진다. 
### 6.3.8 기본형 매개변수와 참조형 매개변수
- 기본형 매개변수: readonly
```java
class Test {
    public static void main(String[] args) {
        int x = 10;
        System.out.println(x);
        change(x);
        System.out.println(x);
    }

    static void change(int x) {
        x = 1000;
        System.out.println(x);
    }
}
```
- 참조형 매개변수: read and write
```java
class Data {
    int x;
}

class Test {
    public static void main(String[] args) {
        Data d = new Data();
        d.x = 10;
        System.out.println(d.x);
        change(d);
        System.out.println(d.x);
    }

    static void change(Data d) {
        d.x = 1000;
        System.out.println(d.x);
    }
}
```

### 6.3.9 참조형 반환타입
```java
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
```

### 6.3.10 재귀호출
- 메서드 내부에서 메서드 자신을 다시 호출하는 것을 "재귀호출"이라 한다.
- 재귀호출이 가능한 이유는, 호출된 메서드는 "값에 의한 호출(call by value)"를 통해 원래의 값이 아닌 복사된 값으로 작업하게 때문에 호출한 메서드와 관계없이 독립적인 작업 수행이 가능하다.
```java
class Node {
    int value;
    Node next;

    Node(int value) {
        this.value = value;
    }
}

public class Main {

    static void printNodes(Node node) {
        if (node == null) return;

        System.out.println(node.value);

        printNodes(node.next);
    }

    public static void main(String[] args) {
        Node first = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);

        first.next = second;
        second.next = third;

        printNodes(first);
    }
}
```
- 자바의 모든 메서드는 call by value 방식으로 인자를 전달한다.
- call by value VS call by refernce
  - call by value: 전달하고자하는 값을 복사하여 매개변수에 직접 할당하는 방식으로 값을 전달
  - call by reference: 전다랗고자하는 값을 가리키는 주소값을 매개변수에 할당하는 방식으로 값을 전달
- Java에서 참조형 매개변수를 갖는 메서드도 Call by Value 방식으로 호출된다. 이때 객체 자체가 아닌 객체를 가리키는 참조값의 복사본이 전달된다. 따라서 호출자와 피호출자는 동일한 객체에 접근할 수 있어 객체의 내부 상태 변경은 공유된다. 그러나 참조변수 자체는 각각 독립적이므로, Call by Reference와는 다르다. 아래 예제를 보면
```java
class Data {
    int value;

    Data(int value) {
        this.value = value;
    }
}

public class Main {
    static void change(Data data) {
        data = new Data(100);
    }

    public static void main(String[] args) {
        Data original = new Data(10);

        change(original);

        System.out.println(original.value);
        // 100이 아닌 10이 출력된다. 
        // 진정한 Call by Reference라면 
        // 메서드 내부에서 매개변수를 다른 객체로 재할당하는 동작이 호출자의 변수에도 영향을 미칠 수 있다.
        // 그러나 여기서는 내부에서 매개변수의 재할당이 호출자의 변수에 아무런 영향을 미칠 수 없기 때문에 call by reference가 아님
    }
}
```

- 재귀함수를 사용하는 이유
  - 재귀호출이 주는 논리적 간결함 때문이다. 몇 겹의 반복문과 조건문으로 복합하게 작성된 코드가 재귀호출로 작성하면 보다 단순한 구조로 바뀔 수도 있다.

- 언제 재귀함수를 사용해야 적절한가? 
  - 재귀호출은 매개변수 복사와 종료 후 복귀할 주소저장 등이 추가로 필요하기 때문에 반복문보다 재귀호출의 수행시간이 더 오래 걸린다. 그러므로 재귀 호출의 간결함이 주는 이득이 충분히 큰 경우에만 사용해야한다.

- 대표적인 재귀함수의 활용: 팩토리얼 연산
```java
class Test {
    public static void main(String[] args) {
        System.out.println(factorial(10));
        System.out.println(factorial2(10));
    }

    static public int factorial(int n) {
        if (n == 1)
            return 1;

        return n * factorial(n - 1);
    }

    static public int factorial2(int n) {
        int result = 1;
        while (n != 0) {
            result *= (n--);
        }
        return result;
    }
}
```

### 6.3.11 클래스 메서드(static메서드)와 인스턴스 메서드
- 인스턴스 메서드는 인스턴스 변수와 관련된 작업을 하는, 즉 메서드의 작업을 수행하는 데 인스턴스변수를 필요로하는 메서드이다.
- 반면에 메서드 중에서 인스턴스와 관계없는 메서드를 클래스 메서드(static메서드)로 정의한다. 
- 클래스 변수, 메서드와 인스턴스 변수, 메서드 사이에서 무엇으로 선언 할 지 선택하는 규칙
  - 1) 클래스를 설계할 때, 멤버변수 중 모든 인스턴스에 공통으로 사용하는 것에 static을 붙인다.
  - 2) 클래스 변수(static 변수)는 인스턴스를 생성하지 않아도 사용할 수 있다.
  - 3) 클래스 메서드(static 메서드)는 인스턴스 변수를 사용할 수 없다.
  - 4) 메서드 내에서 인스턴스 변수를 사용하지 않는다면, static을 붙이는 것을 고려한다.
```java
class MyMath {

    // 인스턴스 매개변수
    long a, b;

    // 인스턴스변수 a, b만을 이용해서 작업하므로 매개변수가 필요없다.
    // 인스턴스 메서드
    long add() {
        return a + b;
    }

    long substract() {
        return a - b;
    }

    long multiply() {
        return a * b;
    }

    double divide() {
        return a / b;
    }

    // 클래스 메서드
    static long add(long a, long b) {
        return a + b;
    }

    static long substract(long a, long b) {
        return a - b;
    }

    static long multiply(long a, long b) {
        return a * b;
    }

    static double divide(long a, long b) {
        return a / b;
    }
}

class Test {
    public static void main(String[] args) {
        System.out.println(MyMath.add(200L, 100L));
        System.out.println(MyMath.substract(200L, 100L));
        System.out.println(MyMath.multiply(200L, 100L));
        System.out.println(MyMath.divide(200L, 100L));
        System.out.println("");

        MyMath myMath = new MyMath();
        myMath.a = 100L;
        myMath.b = 200L;
        System.out.println(myMath.add());
        System.out.println(myMath.substract());
        System.out.println(myMath.multiply());
        System.out.println(myMath.divide());
    }
}
```


### 6.3.12 클래스 멤버와 인스턴스 멤버간의 참조와 호출
- 같은 클래스에 속한 멤버들 간에는 별도의 인스턴스를 생성하지 않고도 서로 참조 또는 호출이 가능하다.
- 단, 클래스멤버가 인스턴스 멤버를 참조 또는 호출하고자 하는 경우에는 인스턴스를 생성해야 한다.
- 왜냐하면, 인스턴스 멤버가 존재하는 시점에 클래스 멤버는 항상 존재하지만, 클래스멤버가 존재하는 시점에 인스턴스 멤버가 ㅈㄴ재하지 않을 수도 있기 때문이다.

## 6.4 오버로딩(overloading)
### 6.4.1 오버로딩 이란? 
- 한 클래스 내에 같은 이름의 메서드를 여러 개 정의하는 것

### 6.4.2 오버로딩의 조건 
1. 메서드 이름이 같아야 한다. 
2. 매개변수의 개수 또는 타입이 달라야 한다.

### 6.4.3 오버로딩의 예

### 6.4.5 오버로딩의 장점
- 메서드 이름을 짓는데 고민을 덜 수 있는 동시에 사용되었어야 할 메서드 이름을 다른 메서드의 이름으로 사용할 수 있다.

### 6.4.5 가변인자(varargs)의 오버로딩
- 예
```java
public PrintSream printf(String format, Object... args){...}
```
- 가변인자는 내부적으로 배열을 이용한다. 그래서 가변인자가 선언된 메서드를 호출할 때마다 배열이 새로 생성된다. 그러므로 효율성을 위해 꼭 필요할 때만 사용해야한다.
- 매개변수의 타입을 배열로 하면, 반드시 인자를 지정해 줘야하기 때문에, 인자를 생략할 수 없다. 그래서 null 이나 길이가 0인 배열을 인자로 지정해줘야 하는 불편함이 있다. 
```java

class Test {
    public static void main(String[] args) {
        String[] strArr = { "100", "200", "300" };

        System.out.println(concatenate("", "100", "200", "300"));
        System.out.println(concatenate("-", strArr));
        System.out.println(concatenate(",", new String[] { "100", "200", "300" }));
        System.out.println(concatenate(",", new String[0]));
        System.out.println(concatenate(","));
    }

    static public String concatenate(String delim, String... args) {
        String result = "";

        for (String str : args) {
            result += str + delim;
        }
        return result;
    }

    // 아래 함수를 활성화 하면 위의 함수와 구분이 되지 않아서 오류가 발생할 수 있다.
    // static public String concatenate(String... args) {
    // return concatenate(" ", args);
    // }
}
```

## 6.5 생성자(Constructor)
### 6.5.1 생성자란? 
- 생성자는 인스턴스가 생성될 때 호출되는 '인스턴스 초기화 메서드'이다.
- 생성자의 규칙
  - 1. 생성자의이름은 클래스와 같다
  - 2. 생성자는 리턴 값이 없다.
- 주의: 연산자 new가 인스턴스를 생성하는 것이지 생성자가 인스턴스를 생성하는 것이 아니다.

### 6.5.2 기본 생성자(default constructor)
- 컴파일러는 생성자가 정의되어 있지 않으면 기본 생성자를 추가해준다.
```java
클래스 이름() {}
```

### 6.5.3 매개변수가 있는 생성자

### 6.5.4 생성자에서 다른 생성자 호출하기 - this(), this
- 생성자 가에도 서로 호출이 가능하다 단 아래의 조건을 충족해야 한다.
  - 생성자의 이름으로 클래스이름 대신 this를 사용한다.
  - 한 생성자에서 다른 생성자를 호출할 때는 바드시 첫 줄에서만 호출이 가능하다.
    - 다른 생성자를 호출하기 이전의 초기화 작ㅇ버이 무의미해질 수 있기 때문이다.
```java
class Car {
    String color;
    String gearType;
    int doorCnt;
    static String brand = "KN";

    Car() {
        this("white", "auto", 4);
    }

    Car(String color) {
        this(color, "auto", 3);
    }

    Car(String color, String gearType, int doorCnt) {
        this.color = color;
        this.gearType = gearType;
        this.doorCnt = doorCnt;
        this.brand = "HD";
    }
}

class Test {
    public static void main(String[] args) {
        Car c1 = new Car();
        Car c2 = new Car("blue");

        System.out.printf("Car1: %s, %s, %d %n", c1.color, c1.gearType, c1.doorCnt);
        System.out.printf("Car1: %s, %s, %d %n", c2.color, c2.gearType, c2.doorCnt);
        System.out.println(c1.brand);
    }
}
```
- this는 참조변수로 인스턴스 자신을 가리킨다. 
- 클래스 메서드는 this를 사용할 수 없다.
- this로 클래스 변수에 접근할 수 있다.
- 인스턴스 메서드는 this를 사용할 수 있다. 
- this로 인스턴스 변수에 접근할 수 있다.

### 6.5.5 생성자를 이용한 인스턴스이 복사
```java
class Car {
    String color;
    String gearType;
    int doorCnt;
    static String brand = "KN";

    Car() {
        this("white", "auto", 4);
    }

    Car(String color) {
        this(color, "auto", 3);
    }

    Car(Car car) {
        this(car.color, car.gearType, car.doorCnt);
    }

    Car(String color, String gearType, int doorCnt) {
        this.color = color;
        this.gearType = gearType;
        this.doorCnt = doorCnt;
    }
}

class Test {
    public static void main(String[] args) {
        Car c1 = new Car();
        Car c2 = new Car("blue");
        Car c3 = new Car(c2);

        System.out.printf("Car1: %s, %s, %d %n", c1.color, c1.gearType, c1.doorCnt);
        System.out.printf("Car2: %s, %s, %d %n", c2.color, c2.gearType, c2.doorCnt);
        System.out.printf("Car3: %s, %s, %d %n", c3.color, c3.gearType, c3.doorCnt);
    }
}
```

## 6.6 변수의 초기화
- 클래스변수와 인스턴스변수와 배열의 초기화는 선택적이지만 지역변수는 사용하기 전에 반드시 초기화 해야한다.
- 각 타입의 기본값
  - boolean: false
  - char: '\u0000';
  - byte, short, int: 0
  - long: 0L
  - float: 0.0f 
  - double: 0.0d 
  - 참조형변수: null
- 멤버변수(클래스변수와 인스터스변수)
  - 명시적 초기화
  - 생성자
  - 초기화 블럭
    - 인스턴스 초기화 블럭: 인스턴스 변수의 복잡한 초기화에 사용
      - 인스턴스 변수의 초기화는 주로 생성자를 사용하고, 인스턴스 초기화블럭은 모든 생성자에서 공통으로 수행돼야하는 코드를 넣는데 사용한다.
    - 클래스 초기화 블럭: 클래스 변수의 복잡한 초기화에 사용
```
class InitBlock {
    static { /* 클래스 초기화 블럭 */ }
    { /* 인스턴스 초기화 블럭 */ }
}
```
### 6.6.1 변수의 초기화
### 6.6.2 명시적 초기화 
### 6.6.3 초기화 블럭
- 초기화 블럭
  - 인스턴스 초기화 블럭: 인스턴스 변수의 복잡한 초기화에 사용
    - 인스턴스 변수의 초기화는 주로 생성자를 사용하고, 인스턴스 초기화블럭은 모든 생성자에서 공통으로 수행돼야하는 코드를 넣는데 사용한다.
  - 클래스 초기화 블럭: 클래스 변수의 복잡한 초기화에 사용
```java
class InitBlock {
    static { /* 클래스 초기화 블럭 */ }
    { /* 인스턴스 초기화 블럭 */ }
}
```
### 6.6.4 멤버변수의 초기화 시기와 순서
- 클래스 변수의 초기화 시점: 클래스가 처음 로딩될 때 단 한번 초기화 된다.
- 인스턴스 변수의 초기화 시점: 인스턴스가 생성될 때마다 각 인스턴스별로 초기화가 이루어진다.
- 클래스변수의 초기화 순서: 기본값 -> 명시적 초기화 -> 클래스 초기화 블럭
- 인스턴스 변수의 초기화 순서: 기본값 -> 명시적 초기화 -> 인스턴스 초기화 블럭 -> 생성자
```java
class InitTest {
    //(0) 먼저 기본값 0으로 초기화
    static int cv = 1;  //(1) 클래스 변수 명시적 초기화
    
    //(3) 먼저 0으로 초기화 
    int iv = 1; //(4) 인스턴스 변수 명시적 초기화

    static { cv = 2 }; //(2) 클래스 변수 초기화 블록
    { iv = 2 }; //(5) 인스턴스 변수 초기화 블록

    InitTest() {
        iv = 3; //(6) 인스턴스 변수 생성자 초기화
    }
}
```
