/**
 * Created by jihun.park@navercorp.com on 2022-09-13.
 */
fun main(){

    // 1. for-each
    val numbers = listOf(1L,2L,3L)
    for (number in numbers) {
        println(number)
    }

    // 2. 전통적인 for문
    for (i in 1..3){  //1씩 증가
        println(i)
    }
    for (i in 3 downTo 1){ //1씩 감소
        println(i)
    }
    for (i in 1..5 step 2){ // 1~5 2씩 증가
        println(i)
    }
    for (i in 5 downTo 1 step 2){ // 5~1 2씩 감소
        println(i)
    }

    // 3. while 문
    var i = 1
    while(i <= 3){
        println(i)
        i++
    }



}