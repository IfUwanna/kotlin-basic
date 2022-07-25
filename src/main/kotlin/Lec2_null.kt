package com.kotlin

fun main(){

}

// 0. NPE null 체크를 자동으로 해줌!
//Only safe (?.) or non-null asserted (!!.) calls are allowed on a nullable receiver of type String?
//fun startWithA(str: String?): Boolean{
//    return str.startsWith("A");
//}
fun startWithA(str: String): Boolean{
    return str.startsWith("A");
}

// 1. null 체크 IllegalArgumentException
fun startWithA1(str: String?): Boolean{
    if(str == null){
        throw IllegalArgumentException("null이 들어옴")
    }
    return str.startsWith("A")
}

// 2. null > Boolean null반환
fun startWithA2(str: String?): Boolean?{ // Boolean :null 들어 올수 있음
    if(str == null){
        return null
    }
    return str.startsWith("A");
}

// 3. null > false 반환
fun startWithA3(str: String?): Boolean{ //null 들어 올수 있음
    if(str == null){
        return false
    }
    return str.startsWith("A"); // 위에서 Null체크를 하면 에러 안뜸
}


