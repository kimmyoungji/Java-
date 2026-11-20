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
- 자바의 모든 메서드는 call by value 방식으로 인자를 전달한다.
- Java에서 참조형 매개변수를 갖는 메서드도 Call by Value 방식으로 호출된다. 이때 객체 자체가 아닌 객체를 가리키는 참조값의 복사본이 전달된다. 따라서 호출자와 피호출자는 동일한 객체에 접근할 수 있어 객체의 내부 상태 변경은 공유된다. 그러나 참조변수 자체는 각각 독립적이므로, Call by Reference와는 다르다.
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
    }
}
```
- call by value VS call by refernce
  - call by value: 전달하고자하는 값을 복사하여 매개변수에 직접 할당하는 방식으로 값을 전달
  - call by reference: 전다랗고자하는 값을 가리키는 주소값을 매개변수에 할당하는 방식으로 값을 전달
```
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
### 6.3.11 클래스 메서드(static메서드)와 인스턴스 메서드
### 6.3.12 클래스 멤버와 인스턴스 멤버간의 참조와 호출

## 6.4 오버로딩(overloading)
### 6.4.1 오버로딩 이란? 
### 6.4.2 오버로딩의 조건 
### 6.4.3 오버로딩의 예
### 6.4.4 가변인자(varargs)의 오버로딩

## 6.5 생성자(Constructor)
### 6.5.1 생성자란? 
### 6.5.2 기본 생성자(default constructor)
### 6.5.3 매개변수가 있는 생성자
### 6.5.4 생성자에서 다른 생성자 호출하기 - this(), this
### 6.5.5 생성자를 이용한 인스턴스이 복사

## 6.6 변수의 초기화
### 6.6.1 변수의 초기화
### 6.6.2 명시적 초기화 
### 6.6.3 초기화 블럭
### 6.6.4 멤버변수의 초기화 시기와 순서
