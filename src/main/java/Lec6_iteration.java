import java.util.Arrays;
import java.util.List;

/**
 * Created by jihun.park@navercorp.com on 2022-09-13.
 */
public class Lec6_iteration {

    public static void main(String[] args) {

        // 1. for-each
        List<Long> numbers = Arrays.asList(1L,2L,3L);
        for (Long number : numbers) {
            System.out.println(number);
        }

        // 1. 전통적인 for문
        for (int i = 1; i <= 3; i++) {  // 1~3 1씩 증가
            System.out.println(i);
        }
        for (int i = 3; i >= 1 ; i--) { // 3~1 1씩 감소
            System.out.println(i);
        }
        for (int i = 1; i <= 5 ; i=i+2) { // 1~5 2씩 증가
            System.out.println(i);
        }
        for (int i = 5; i >= 1 ; i=i-2) { // 5~1 2씩 감소
            System.out.println(i);
        }




    }

}
