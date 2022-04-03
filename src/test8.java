public class test8 {
    public static void main(String[] args) {
        //자동형변환
        double a = 3.0F;
        System.out.println();

        int b = 3;
        float c = 1.0F;
        double d = b + c;
        //정수는 실수로 형변환 3.0f + 1.0f = 4.0f 은 c 에 담기기 때문에 4.0 더블이 된다
        System.out.println(d);
    }
}
