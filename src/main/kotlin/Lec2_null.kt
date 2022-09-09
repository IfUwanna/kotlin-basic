import domain.Person

// 0. NPE null 체크를 자동으로 해줌!
//Only safe (?.) or non-null asserted (!!.) calls are allowed on a nullable receiver of type String?
//fun startWithA(str: String?): Boolean{
//    return str.startsWith("A");
//}

fun main(){

    /** safe call */
    var str : String? = "ABC"
    str?.length // str이 null이 아닐때만 실행 아닌경우 null 반환
    //str.length // 오류 - str이 null일 수도 있어 오류 발생
    //Only safe (?.) or non-null asserted (!!.) calls are allowed on a nullable receiver of type String?

    /** Elvis 연산자 */
    val str2 : String? = null
    println(str2?.length?:0) // 연산(str?.length) 결과가 null이면 뒤의 값(0) 사용

    /** nuLl아님! 단언 */
    println(startWithA("B")) // !!단언 사용
    println(startWithA(null)) // NPE 발생

    /** Java 클래스 연동시 플랫폼 타입 주의  */
    val person = Person("지훈")
    //startWithB(person.name)  // @Nullable 필드이므로 컴파일 오류 발생


}
/** early Return  */
fun earlyReturn(number:Long?) : Long{
    //if(number == null) return 0;
    number?: return 0
    return 1
}

/** nuLl아님! 단언 */
fun startWithA(str: String?): Boolean{
    return str!!.startsWith("B");  // !!단언 사용하여 컴파일 오류 안남
}


fun startWithB(str: String): Boolean{  // null 불가
    return str.startsWith("B");
}

// 1. null 체크 IllegalArgumentException
fun startWithA1(str: String?): Boolean{
    return str?.startsWith("A") ?: throw IllegalArgumentException("null이 들어옴")
}

// 2. null > Boolean null반환
fun startWithA2(str: String?): Boolean?{
    return str?.startsWith("A")
}

// 3. null > false 반환
fun startWithA3(str: String?): Boolean{ //null 들어 올수 있음
    return str?.startsWith("A") ?: false
}
