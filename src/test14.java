public class test14 {
    public static void main(String[] args) {
        //비교와불린(boolean)-참과 거짓을 의미하는 데이터 타입으로 bool이라고도 부른다

        System.out.println(1 == 2);
        System.out.println(1 == 1);
        System.out.println("one" == "two");
        System.out.println("one" == "one");

        // ==는 비교 !는 부정

        System.out.println(1!=2);
        System.out.println(1!=1);
        System.out.println("one"!="two");
        System.out.println("one"!="one");

        System.out.println(10 > 20);
        System.out.println(10 > 2);
        System.out.println(10 > 10);

        // >는좌항보다 우항이크다 <는반대  >=는좌항이 우항보다 크거나 같다 <=는반대

        System.out.println(10 >= 20);
        System.out.println(10 >= 2);
        System.out.println(10 >= 10);

        // .equals 문자열 비교 메소드

        String a = "hello world";
        String b = new String("hello world");
        System.out.println(a == b);
        System.out.println(a.equals(b));


    }
}
