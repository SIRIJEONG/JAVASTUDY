public class test20 {
    public static void main(String[] args) {
        //논리연산자
        //&&는 그리고 ||는 또는
        if (true&&true) {
            System.out.println(1);
        }

        if (true&&false) {
            System.out.println(2);
        }

        if (false&&true) {
            System.out.println(3);
        }

        if (false&&false) {
            System.out.println(4);
        }

        if (true||true) {
            System.out.println(1);
        }

        if (true||false) {
            System.out.println(2);
        }

        if (false||true) {
            System.out.println(3);
        }

        if (false||false) {
            System.out.println(4);
        }

    }
}
