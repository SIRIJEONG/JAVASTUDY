public class test10 {
    public static void main(String[] args) {
        //연산자

        //result의 값은 3
        int result = 1 + 2;
        System.out.println(result);

        //result의 값은 2
        result=result - 1;
        System.out.println(result);

        //result의 값은 4
        result=result*2;
        System.out.println(result);

        //result의 값은 2
        result=result/2;
        System.out.println(result);

        //result의 값은 10
        result=result+8;
        System.out.println(result);

        //result의 값은 3
        result=result%7;
        System.out.println(result);

        int a = 3;
        System.out.println(0%a); //0
        System.out.println(1%a); //1
        System.out.println(2%a); //2
        System.out.println(3%a); //0
        System.out.println(4%a); //1
        System.out.println(5%a); //2
        System.out.println(6%a); //0

        //+연산자는 숫자와 숫자도 사용되지만 문자와 문자에도 사용된다
        String firstString = "this is";
        String secondString = " man";
        String thirdString = firstString+secondString;
        System.out.println(thirdString);
    }
}
