import domain.Person;

/**
 * Created by jihun.park@navercorp.com on 2022-09-11.
 */
public class Lec3_type {

    public static void main(String[] args) {

        /** 기본타입 암시적 변환 */
        int number1 = 4;
        long number2 = number1; // 큰타입(long)으로 암시적 변경
        System.out.println(number1+number2);

        Person person = new Person("지훈",100);
        System.out.println(String.format("이름:%s / 나이:%s ", person.getName(),person.getAge()));

    }

    public static void printAgeIfPerson(Object obj) {
        //if (!(obj instanceof Person)) { person 타입이 아니라면
        if (obj instanceof Person) {
            Person person = (Person) obj;
            System.out.println(person.getAge());
        }
    }

}


