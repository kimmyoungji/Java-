# 7.객체지향 프로그래밍 2

## 7.1 상속
### 7.1.1 상속의 정의와 장점
- 상속의 정의: 기존의 클래스를 재사용하여 새로운 클래스를 작성하는 것
- 상속의 장점: 코드의 재사용성을 높이고, 코드의 중복을 제거하여 프로그램의 생산성과 유지보수에 크게 기여한다.
```java
class Child extends Parent {}
```
- 생성자와 초기화 블록은 상속되지 않고, 멤버만 상속된다.
- 자손 클래스의 멤버 개수는 조상 클래스보다 항상 같거나 많다.

### 7.1.2 클래스간의 관계 - 포함관계
- 한 클래스의 멤버변수로 다른 클래스 타입의 참조변수를 선언하는 것

### 7.1.3 클래스간의 관계 결정하기
- 상속관계: ~은 ~이다. (예: Circle는 Shape이다.)
- 포함관계: ~은 ~를 가진다. (예: Circle는 Point를 가진다.)

### 7.1.4 단일 상속(single inheritance)
- C++에서는 여러 조상 클래스로부터 상속 받는 것이 가능한 다중 상속을 허용하지만, 자바에서는 단일 상속만을 허용한다.

### 7.1.5 Object클래스
- 모든 클래스는 Object 클래스를 상속 받는다.

## 7.2 오버라이딩
### 7.2.1 오버라이딩이란? 
- 조상으로 부터 상속 받은 메서드를 재정의하는 것

### 7.2.2 오버라이딩의 조건
- 조상이 내려준 메서드와 이름, 매개변수, 반환 타입이 같아야함 (즉 메서드 선언부가 서로 일치해야 함)
- 접근제어자는 조상클래스의 메서드 보다 좊은 범위로 변경할 수 없다.
- 예외는 조상 클래스의 메서드보다 많이 선언할 수 없다.
- 인스턴스메서드를 static메서드로 또는 그 반대로 변경할 수 없다.

### 7.2.3 오버로딩 VS 오버라이딩
- 오버로딩: 같은 클래스내의 동명 함수들을 정의하는 것 
- 오버라이딩: 부모로부터 상속 받은 메서드를 재정의하는 것

### 7.2.4 super
- super는 자손 클래스에서 조상 클래스로부터 상속받은 멤버를 참조하는데 사용되는 참조변수이다.
- 조상클래스에 선언된 멤버변수와 같은 이름의 멤버변수를 자손 클래스에서 중복해서 정의하는 것이 가능하며 참조변수 super를 이용해서 서로 구별할 수 있다. 
```java
class Test {
    public static void main(String[] args) {
        Child c = new Child();
        c.method();
    }
}

class Parent {
    int x = 200;

    public void method() {
        System.out.println(x);
    }
}

class Child extends Parent {
    int x = 10;

    public void method() {
        System.out.println(this.x);
        System.out.println(super.x);
        super.method();
    }
}
```
- 변수만이 아니라 메서드 역시 super를 써서 호출할 수 있다.

### 7.2.5 super - 조상클래스의 생성자
- Object클래스를 제외한 모든 클래스의 생성자 첫 줄에 생성자 this() 또는 super()를 호출해야한다. 그렇지 않으면 컴파일러가 자동으로 super()를 생성자의 첫줄에 삽입한다.
- 조상 클래스의 멤버변수는 조상의 생성자에 의해 초기화되도록 해야하는 것
- 인스턴스를 생성하면 자식 클래스에서 부모클래스 방향으로 거슬러 올라가면서 모든 조상 클래스의 생성자가 순서대로 호출된다. 아래 코드의 경우 Point3D -> Point -> Object 순으로 생성자가 호출된다.
```java
class Test {
    public static void main(String[] args) {
        Point3D p3 = new Point3D();
        System.out.printf("x: %d, y: %d, z: %d ", p3.x, p3.y, p3.z);
    }
}

class Point {
    int x = 10;
    int y = 20;

    Point(int x, int y) {
        // super() 가 생략되어있다. 여기서 super는 Object 클래스이다.
        this.x = x;
        this.y = y;
    }
}

class Point3D extends Point {
    int z = 30;

    Point3D() {
        this(100, 200, 300);
    }

    Point3D(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }
}

```

## 7.3 package와 import
### 7.3.1 패키지
- 패키지란, 클래스의 묶음이다.
- 클래스가 물리적으로 하나의 클래스파일(.class)과 같이 패키지는 물리적으로 하나의 디렉토리이다.
- 하나의 소스파일에는 첫 번째 문장으로 단 한번의 패키지 선언만을 허용한다.
- 모든 클래스는 반드시 하나의 패키지에 속해야한다.
- 패키지는 점(.)을 구분자로 하여 계층 구조로 구성할 수 있다.
### 7.3.2 패키지 선언
- 클래스명과 구분을 위해 소문자로 명명 하는 것이 원칙이다.
- 자바에서는 패키지가 없을 경우 기본 패키지인 'unnamed package'에 포함된다.
```java
package 패키지명;
```
- 패키지 단위로 컴파일 하기
```bash
# javac -d [패키지루트dir] [소스위치]
javac -d . javabasic/chapter07/packageandimport/Test.java

# 실행시에는 패키지 경로를 붙여서 호출
java javabasic.chapter07.packageandimport.Test 

# 필요시, 생성한 패키지의 경로를 classpath로 추가하여 
# 어디서든 컴파일된 소스를 실행할 수있게 한다.
#
# 1) 실행할 때마다 지정
java -cp ~/dev/standardOfJava javabasic.chapter07.packageandimport.Test
#
# 2) ~/.zshrc 아래에 추가
export CLASSPATH=.:$HOME/dev/standardOfJava
```

### 7.3.3 import문
- 소스코드를 작성할 때 다른 패키지의 클래스를 사용하려면 패키지명이 포함된 클래스 이름을 사용해야 한다.
- import문으로 사용하고자 하는 클래스의 패키지를 미리 명시해주면 소스코드에 사용되는 클래스이름에서 패키지명은 생략할 수 있다.
- 컴파일 시에 컴파일러는 import문을 통해 소스파일에 사용된 클래스들의 패키지를 알아 낸 다음, 모든 클래스이름 앞에 패키지명을 붙여 준다.

### 7.3.4 import문의 선언
- 일반적인 소스파일(*.java)의 구성
  - 1) package 문
  - 2) import 문
  - 3) 클래스 선언
- 한 패키지에서 여러 클래스를 사용하는 경우 "패키지명.*" 과 같이 사용할 수 있으나, '*'를 사용하는 것이 하위 패키지의 클래스까지 포함하는 것은 아니므로 주의해야한다. 예를 들어 아래와 같다.
```java
import java.util.*
import java.text.*
import java.* //이 문장이 위의 두 문장을 대체할 수 없다.
```
- java.lang은 매우 빈번히 사용되는 중요한 클래스들이 속한 패키지이기 때문에 따로 import 문으로 지정하지 않아도 된다. - 소스 파일에 묵시적으로 import java.lang을 한다.

### 7.3.5 static import
- import 문을 사용하면 클래스의 패키지명을 생략할 수 있는 것과 같이 static import문을 사용하면 static멤버를 호출할 때 클래스 이름을 생략할 수 있다.
```java
import static java.lang.System.out;
import static java.lang.Math.*; 

class StaticImportEx1 {
    public static void main(String[] args) {
        // System.out.println(Math.random());
        out.println(random());

        // System.out.println("Math.PI :"+Math.PI)
        out.println("Math.PI :"+PI);
    }
}
```


## 7.4 제어자
### 7.4.1 제어자란? 
- 제어자는 클래스, 변수 또는 메서드의 선언부에 함께 사용되어 부가적인 의미를 부여한다.
- 제어자의 종류
  - 접근 제어자: public, protected, default, private
  - 그 외: static, final, abstract, native, transientm synchronized, volatile, strictfp

### 7.4.2 static - 클래스의, 공통적인
- static이 사용될 수 있는 곳: 멤버변수, 메서드, 초기화 블럭
- static 멤버변수
  - 모든 인스턴스에 공통적으로 사용되는 클래스변수.
  - 인스턴스를 생성하지 않아도 사용가능.
  - 클래스가 메모리에 로드 될 때 생성된다.
- static 메서드
  - 인스턴스를 생성하지 않아도 호출가능. static 메서드 내에서는 인스턴스 멤버들을 사용할 수 없다.

### 7.4.3 final - 마지막의 변경될 수 없는
- final 사용될 수 있는 곳: 클래스, 메서드, 멤버변수, 지역변수
- final 클래스
  - 상속으로 확장할 수 없는 클래스
  - 주로 생성자가 private
- final 메서드
  - 오버라이딩 할 수없는 메서드
- final 멤버변수, 지역변수
  - 재할당 할 수 없는 상수 변수
- 생성자를 이용한 final멤버 변수의 초기화
  - final 변수를 생성자 맥락에서 초기화함으로써, 각각의 인스턴스가 서로 다른 final 변수를 생성할 수 있게 하는 구조
```java
class Card {
    final int NUMBER;
    final String KIND;
    static int width = 100;
    static int height = 250;

    Card(String kind, int num) {
        KIND = kind;
        NUMBER = num;
    }

    Card() {
        this("HEART", 1);
    }

    public String toString() {
        return KIND + " " + NUMBER;
    }
}

class FinalCardTest {
    public static void main(String[] args) {
        Card c = new Card("HEART", 10);
        // c.NUMBER = 5; //에러
        System.out.println(c.KIND);
        System.out.println(c.NUMBER);
        System.out.println(c.toString());
    }
}
```
### 7.4.4 abstract - 추상의 미완성의
- abstract가 사용될 수 있는 곳: 클래스, 메서드
- abstract 클래스: 추상 메서드를 갖는 클래스
- abstract 메서드: 선언만 되고, 구현부는 작성하지 않은 추상 메서드
- abstract 클래스를 상속 받아서, 일부의 원하는 메서드만 오버라이딩해도 된다는 장점이 있다. 만약 이 클래스가 없다면 아무런 내용도 없는 메서드를 잔뜩 오버랑딩해야한다. 

### 7.4.5 접근 제어자(access modifier)
- 접근 제어자가 사용될 수 있는 곳 - 클래스, 멤버변수, 메서드, 생성자
- 접근 제어자 종류

| 제어자 | 같은클래스 | 같은패키지 | 자손클래스 | 전체 |
| :--- | :--- | :--- | :--- | :--- |
| public    | o | o | o | o |
| protected | o | o | o | x |
| default   | o | o | x | x |
| private   | o | x | x | x |

- 접근 제어가를 이용한 캡슐화
  - 외부로부터 데이터를 보호
  - 외부에는 불필요한, 내부적으로만 사용되는 부분을 감추기 위함

- 생성자와 접근 제어자
  - 보통 클래스의 접근 제어자와 생성자의 접근제어자는 동일하나, 다르게 정의할 수도 있다.
  - 생성자의 접근 제어자를 private으로 지정하면, 이 클래스를 외부에서 생성해서 사용할 수 없다. 하지만 클래스 내부적으로 생성한 인스턴스를 반환하는 public static 메서드를 정의해주면 이 경우에도 클래스를 외부에서 사용할 수 있게 된다. 아래는 그 예시이다.
```java
final class Singleton {
    private static Singleton s = new Singleton();

    private Singleton() {
        // ...
    }

    public static Singleton getInstance() {
        if (s == null)
            s = new Singleton();

        return s;
    }
}
```

### 7.4.6 제어자(modifier)의 조합

| 대상 | 사용가능한 제어자 |
|:---|:---|
| 클래스  | public, default, final, abstract |
| 메서드  | 모든접근제어자, static, final, abstract|
| 멤버변수 | 모든접근제어자, static, final |
| 지역변수 | final |

- 제어자를 조합해서 사용할 때 주의 사항
  - 메서드에 static, abstract 동시 사용 불가
    - static은 몸통이 있는 메서드만 사용가능
  - 클래스에 final, abstract 동시 사용 불가
    - final은 확장 불가를 의미하고, abstarct는 확장 필수를 의미하므로 의미 충돌
  - abstract 메서드의 접근제어가가 private일 수 없다.
    - abstract는 자손에게 상속 되어 구현되야하기 때문
  - 메서드에 private과 final을 같이 사용할 필요는 없다.
    - 접근 제어자가 final인 메서드는 오버라이딩할 수 없기 때문

## 7.5 다형성

### 7.5.1 다형성이란? 
- 조상클래스 타입의 참조변수로 자손클래스의 인스턴스를 참조할 수 있도록 한것
```java
class Tv {
    boolean power;
    int channel;

    void power() { power = !power; }
    void channelUp() { ++channel; }
    void channelDown() { --channel; }
}
```
### 7.5.2 다형성이란? 
### 7.5.1 다형성이란? 
### 7.5.1 다형성이란? 

## 7.6 추상클래스
## 7.7 인터페이스
## 7.8 내부클래스