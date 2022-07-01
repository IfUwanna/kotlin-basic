package com.kotlin

/**
 * Created by jihun.park@navercorp.com on 2022-06-29.
 */
class Condition {

    companion object {
    @JvmStatic
    fun main(args: Array<String>){
        val message:String = if(3>1){"3이 더크다"}else{"아니다"}
        val message2:String = when{ 3>1 -> "3이 더크다"  else ->"아니다"}
        println(message)
        println(message2)
    }
    }
}