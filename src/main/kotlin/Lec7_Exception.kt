import java.io.BufferedReader
import java.io.File
import java.io.FileReader

/**
 * Created by jihun.park@navercorp.com on 2022-09-27.
 */

fun parseIntOrThrow(str :String) : Int{
    try{
        return str.toInt()
    }catch(e: NumberFormatException){
        throw IllegalArgumentException("주어진 ${str}는 숫자가 아닙니다.")
    }
}

fun parseIntOrThrow2(str :String) : Int?{   // 하나의 표현식 처럼 처리
    return try{
        str.toInt()
    }catch(e: NumberFormatException){
        null
    }
}

fun readFile(){
    val currentFile = File(".")
    val file = File(currentFile.absolutePath + "/a.txt")
    val reader = BufferedReader(FileReader(file))
    println(reader.readLine())
    reader.close()
}

fun readFile(path: String){
    BufferedReader(FileReader(path)).use { reader ->
        println(reader.readLine())
    }
}