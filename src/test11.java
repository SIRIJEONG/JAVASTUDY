public class test11 {
    public static void main(String[] args) {
        //연산자 형변환

        int a = 10;
        int b = 3;

        float c = 10.0f;
        float d = 3.0f;

        System.out.println(a/b); //정수 나누기 정수 이기때문에 소수점 뒤에 숫자는 손실
        System.out.println(c/d); //실수 나누기 실수 이기때문에 소수점 뒤에 숫자는 손실되지않는다
        System.out.println(a/d); //정수나누기실수는 정수가 실수로 바뀐다
    }
}
