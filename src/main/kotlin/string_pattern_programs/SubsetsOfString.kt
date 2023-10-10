package string_pattern_programs

fun subsetsOfString(str:String){
    for (i in str.indices){
        for (j in i..<str.length){
            println(str.substring(i, j+1))
        }
    }
}

fun main(){
    subsetsOfString("FUN")
}