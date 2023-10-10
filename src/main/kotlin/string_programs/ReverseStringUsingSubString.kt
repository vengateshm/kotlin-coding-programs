package string_programs

fun reverseStringUsingSubString(str:String):String{
    var rev = ""
    for(i in str.lastIndex downTo 0){
        rev += str.substring(i, i+1)
    }
    return rev
}

fun main(){
    println(reverseStringUsingSubString("BLOOM"))
}