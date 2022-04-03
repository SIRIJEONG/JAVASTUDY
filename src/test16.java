public class test16 {
    public static void main(String[] args) {
        //else

        //false일경우 2가 실행된다
        if (true) {
            System.out.println(1);
        } else {
            System.out.println(2);
        }

        //else if true가 처음 나타난 구간이 나온다
        if (false) {
            System.out.println(1);
        } else if (true) {
            System.out.println(2);
        } else if (true) {
            System.out.println(3);
        } else {
            System.out.println(4);
        }

    }
}
