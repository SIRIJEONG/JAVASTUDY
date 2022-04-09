public class test24 {
    public static void main(String[] args) {
        //반복문 제어 break

        for ( int i = 0; i < 10; i++) {
            if (i == 5)
                break;
            System.out.println("hello" + i);
        }

        for ( int i = 0; i < 10; i++) {
            if (i == 5)
                continue;
            System.out.println("hello" + i);
        }

    }
}
