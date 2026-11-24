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
```
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
## 7.4 제어자 
## 7.5 다형성
## 7.6 추상클래스
## 7.7 인터페이스
## 7.8 내부클래스