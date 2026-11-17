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
### 5.2.2 String배열의 초기화
### 5.2.3 char배열과 String클래스
### 5.2.4 커맨드 라인을 통해 입력받기

## 5.3 다차원 배열
### 5.3.1 2차원 배열의 선언과 인덱스
### 5.3.2 2차원 배열의 초기화
### 5.3.3 가변 배열
### 5.3.4 다차원 배열의 활용
