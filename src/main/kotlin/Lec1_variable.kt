import domain.Person

fun main(){

    /** 수정가능여부 var, val */
    var number1 = 10L       // 가변
    var number2: Long = 10L  // 가변 (타입명시)
    val number3 = 10L       // 불변
    val number4: Long = 5;  // 불변 : 초기화 되지 않았을 경우는 오류
    // number2 = 5L // 오류

    /** val 컬렉션에 element 추가 가능 */
    val numberList:ArrayList<Int> = arrayListOf<Int>(1,2,3); // arrayListOf 가변
    numberList.add(4);

    /** nullable ::  변수에 null이 들어갈 수 있다면 Type? 를 사용해줘야함 */
    var nullableNumber:Long? = 100L;
    nullableNumber = null;

    /** 객체의 인스턴스화 */
    val person = Person("박지훈",10);  // new 키워드 사용하지 않음

//    val numberArray = arrayOf(1,2,3);
//    val numberList:List<Int> = listOf<Int>(1,2,3); // listOf 불변
//    val intNumbers = intArrayOf(1,2,3); // primitive int
//

}

fun startsWithA1(str:String?) : Boolean{ // ?없으면 boolean 과 같다.
    if(str == null){
        throw java.lang.IllegalArgumentException("null이 들어와씃ㅂ니다.")
    }
    return str.startsWith("A");
}