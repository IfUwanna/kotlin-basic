import domain.JavaMoney;

public class Lec4_operator{

    public static void main(String[] args) {
        JavaMoney money1 = new JavaMoney(2_000L);
        JavaMoney money2 = new JavaMoney(1_000L);

        if(money1.compareTo(money2) > 0){  // 기준값(money1)이 비교대상(money2)보다 크므로 0
            System.out.println("money1 >> money2");
        }

        // 동등성(Equality), 동일성(Identity)
        JavaMoney money3 = new JavaMoney(1_000L);
        JavaMoney money4 = new JavaMoney(1_000L);
        System.out.println(money3.equals(money4)); // 값비교(동등성)
        System.out.println(money3==money4); // 객체비교(동일성)

        System.out.println(money1.plus(money2));

    }

}