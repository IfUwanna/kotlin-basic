import domain.Person

fun main(){
    // 코틀린에서는 선언된 기본 값을 보고 타입을 추론한다.
    val number1 = 3 // Int
    val number2 = 3L // Long
    val number3 = 3.0f // Float
    val number4 = 3.0f // Double

    // 기본타입 명시적 변환
    val num1 = 4
    val num2:Long = num1.toLong()
    println(num1+num2)

    // nullable 처리
    val num3: Int? = 3
    val num4: Long = num3?.toLong() ?: 0L

    printAgeIfPerson(null);

    // String Interpolation
    val person = Person("지훈",100);
    println("이름 : ${person.name} / 나이 : ${person.age} ")
    println("이름 : $person.name / 나이 : $person.age ")
    System.out.println(String.format("이름 : %s / 나이 : %s ", person.name, person.age)) //java

    // indextation 이 사라지고 인터가 들어간살태로 출력
    val name = "지훈"
    println( """
        내
        이름은
        ${name}  
    """.trimIndent()
    )

    //String indexing
    val str = "ABC"
    println(str[0])
    println(str[2])

}
/** 타입 캐스팅 **/
fun printAgeIfPerson(obj:Any?){
    // if(obj !is Person){  person 타입이 아니라면
    if(obj is Person){
        val person = obj as Person
        println(person.age)
    }

    //nullable일경우 as? 사용
    val person2 = obj as? Person  // null이 들어오면 전체가 Null이 된다.
    println(person2?.age)   // safe call


}

// Nothing (무조건 예외를 반환)
fun fail(message: String): Nothing{
    throw IllegalArgumentException(message)
}
