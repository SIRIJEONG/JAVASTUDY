import java.util.Scanner;

public class test17 {
    public static void main(String[] args) {
        //조건문 응용
        //.equals 앞과 뒤에 오는값을 비교해서 t&f
        //args는 아직은 입력값이라고만 알고있기
        Scanner sc = new Scanner(System.in);
        String id = sc.next();
        if (id.equals("hello")){
            System.out.println("right");
        } else {
            System.out.println("wrong");
        }

    }
}
