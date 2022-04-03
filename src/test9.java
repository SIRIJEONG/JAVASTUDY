public class test9 {
    public static void main(String[] args) {
        //명시적 형변환

        float a = (float)100.0;
        int b = (int)100.0F;

        int c = (int)100.1;
        //이 경우에는 .1값이 손실되어 100이 된다
        System.out.println();
    }
}
