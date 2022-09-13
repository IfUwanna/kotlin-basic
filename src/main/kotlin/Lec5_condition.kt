/**
 * Created by jihun.park@navercorp.com on 2022-09-13.
 */
fun main(){
    validateScoreIsNotNegative(100)
    judgeNumber2(1);
}

fun validateScoreIsNotNegative(score: Int){   // void 생략
    if(score !in 0..100){
        throw  IllegalArgumentException("${score}는 0~100사이입니다.");
    }
}

fun getPassOrFail(score: Int) : String {
    return if(score >= 50){  // if문도 expression 이기때문에 바로 반환
        "P"
    }else{
        "F"
    }
}

/**
when(값){
    조건1 -> 구문
    조건2 -> 구문
    else -> 구문
}*/
fun getGrade(score: Int): String? {
    return when (score / 10) {  // 특정값을 조건으로 분기처리
        9 -> "A"
        8 -> "B"
        7 -> "C"
        else -> "D"
    }
}
fun getGrade2(score: Int): String? {
    return when (score) {       // 특정값의 범위를 조건으로 분기 처리
        in 90..99 -> "A"
        in 80..89 -> "B"
        in 70..79 -> "C"
        else -> "D"
    }
}

fun startsWithA(obj:Any): Boolean{
    return when(obj){  // is를 이용하여 타입 체크
        is String -> obj.startsWith("A")
        else -> false
    }
}

fun judgeNumber(number:Int){
    when(number){   // 특정 값들일 경우 분기 처리
        1,0,-1 -> println("유효한 숫자입니다.")
        else -> println("유효하지 않은 숫자입니다.")
    }
}

fun judgeNumber2(number: Int){
    when {   // when 에 대입 없이 early return 처럼 활용
        number == 0 -> println("주어진 숫자는 0입니다.")
        number % 2 == 0 -> println("주어진 숫자는 짝수입니다.")
        else -> println("주어진 숫자는 홀수입니다.")
    }
}

