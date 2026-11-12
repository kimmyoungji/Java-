
class Test {
    public static void main(String[] args) {
        char c1 = 'a';
        char c2 = (char) c1 - 32; // '-' 연산뒤 int 형이 반환되고 int(4byte) -> char(2byte)로 변환시 데이터 손실이 발생하므로 오류
        System.out.println(c2);
    }
}