/**
 * Created by jihun.park@navercorp.com on 2022-10-04.
 */

fun main(){
    repeat("Hello World", 3, true)

    // default parameter
    repeat("Hello World")

    // named argument
    repeat("Hello World", useNewLine = false)
    printNameAndGender("Jihun Park","M")
    printNameAndGender(gender = "M", name="Jihun Park") // builder 처럼 사용 가능

    // 가변인자
    val array = arrayOf("A","B","C")
    printAll(*array)
    printAll("A","B","C")
}

fun max(a: Int, b: Int): Int {
    return if (a > b) a else b // expression
}

fun max2(a: Int, b: Int) = if (a > b) a else b  // 결과가 하나일 경우 중괄호 생략

fun repeat(
    str: String,
    num: Int = 3,  // 기본값 설
    useNewLine: Boolean = true) { // 기본값 설정

    for(i in 1..num) {
        if (useNewLine) {
            println(str)
        } else {
            print(str)
        }
    }
}

fun printNameAndGender(name:String, gender: String){
    println(name)
    println(gender)
}

fun printAll(vararg strings:String){
    for (str in strings){
        print(str)
    }
}