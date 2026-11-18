# 5.배열

## 5.1 배열
### 5.1.1 배열이란?
- 같은 타입의 여러 변수를 하나의 묶음으로 다루는 것
### 5.1.2 배열의 선언과 생성
```java
// 선언
int[] score;
// 생성
score = new int[5]{1,2,3,4,5};
// 측약ver
int[] score2 = {1,2,3,4,5};
```
### 5.1.3 배열의 길이와 인덱스
### 5.1.4 배열의 초기화
### 5.1.5 배열의 복사
```java
// for문을 사용하여 복사할 수 있지만, System.arraycopy()를 사용하는 것이 좋다
public static void main(String[] args) {
    char[] abc = { 'a', 'b', 'c' };
    char[] num = { '1', '2', '3', '4', '5' };
    char[] result = new char[10];

    System.arraycopy(abc, 0, result, 0, abc.length);
    System.arraycopy(num, 0, result, abc.length, num.length);

    System.out.println(Arrays.toString(num));
    System.out.println(Arrays.toString(result));
}
```
### 5.1.6 배열의 활용
- 총합과 평균
- 최대값과 최소값
- 섞기
- 임의의 값으로 배열 채우기
- 정렬하기
- 빈도수 구하기

## 5.2 String 배열
### 5.2.1 String 배열의 선언과 생성
```java
public static void main(String[] args) {
    // 선언
    String[] strArr0;

    // 생성
    strArr0 = new String[]{"Apple", "Samsung", "LG", "Microsoft"};

    // 축약
    String[] strArr1 = new String[] { "Apple", "Samsung", "LG", "Microsoft" };
    String[] strArr2 = new String[4];
    String[] strArr3 = { "Apple", "Samsung", "LG", "Microsoft" };
}
```
### 5.2.2 String배열의 초기화
- 참조형 배열의 각 메모리는 null로 초기화된다.

### 5.2.3 char배열과 String클래스
- char[] 에 편리한 기능을 추가한 객체가 String 클래스이다. 
- String 객체에 재할당하면 완전히 새로운 객체가 생성되어 할당되고, 기존의 객체는 가비지가 된다.
```java
String str = "java";
str = str + "17"; // "str17"이라는 내용을 담은 새로운 인스턴스의 주소값이 str에 할당된다.
```
- 편리한 메서드
  - "abcdefg".charAt('a') // String 객체 "abcdefg"에서 a의 위치
  - "abcdefg".subString('a',1,4) // String 객체 "abcdefg"의 인덱스 1,2,3에 있는 문자열 잘라오기 -> "bcd"
  - "abcdefg".length() // String 객체 "abcdefg"의 길이 구하기
  - "abcdefg".equals('a') // String 객체 "abcdefg"와 문자열 "a"를 비교
  - "abcdefg".toCharArray('a') // String 객체 "abcdefg"를 char[] 형태로 반환
### 5.2.4 커맨드 라인을 통해 입력받기
- main 메서드의 arg 변수는 String 배열이다.
- java 명령어로 클래스 파일 실행시 실행 파일 뒤에 빈칸을 구분자로 붙는 문자열들은 main 메서드의 파라미터이다. 순서대로 arg String 배열의 요소로 할당된다.
  - 예) java ***.class arg0 arg1 2 "Hello World"// 이 때 arg = {"arg0", "arg1", "2", "Hello World"}

## 5.3 다차원 배열
### 5.3.1 2차원 배열의 선언과 인덱스
```java
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
```
### 5.3.2 2차원 배열의 초기화
- 2차원 배열은 "배열의 배열"로 구성되어 있다.
### 5.3.3 가변 배열
- 2차원 배열의 생성을 나중에 해서, 다양한 길이의 배열 할당 가능
### 5.3.4 다차원 배열의 활용
- 좌표에 x표하기
- 빙고
- 행렬의 곱셈
- 단어 맞추기