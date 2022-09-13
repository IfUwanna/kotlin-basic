
import domain.JavaMoney
import domain.KotlinMoney

/**
 * Created by jihun.park@navercorp.com on 2022-09-13.
 */

fun main(){
    val money1 = JavaMoney(1000L)
    val money2 = JavaMoney(2000L)

    // 객체에 비교 연산자를 사용하면 내부적으로 compareTo()를 사용해줌
    if(money1 > money2){
        println("money1 >> money2")
    }

    // 동등성(Equality), 동일성(Identity)
    val money3 = JavaMoney(1000L)
    val money4 = JavaMoney(1000L)
    println(money3 == money4)  // 값비교(동등성)
    println(money3 === money4)  // 객체비교(동일성)

    var str = "ABC"
    println(str[0])

    // 연산자 오버로딩
    val kotlinMoney1 = KotlinMoney(1_000L)
    val kotlinMoney2 = KotlinMoney(2_000L)
    println(kotlinMoney1 + kotlinMoney2)

}
