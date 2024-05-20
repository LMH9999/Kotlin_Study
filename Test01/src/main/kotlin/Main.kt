fun main(args: Array<String>) {
    mapOf(1 to "Mon", 2 to "Tue")
}

fun startsWithA1(str: String?): Boolean{
    /*if (str == null){
        throw IllegalArgumentException("null이 들어왔습니다")
    }*/
    return str?.startsWith("A") ?: throw IllegalArgumentException("null이 들어왔습니다")
}

fun startsWithA2(str: String?): Boolean?{
//    if (str == null){
//        return null
//    }
    return str?.startsWith("A")
}

fun startsWithA3(str: String?): Boolean{
//    if (str == null){
//        return false
//    }

    return str?.startsWith("A") ?: false
}

fun startsWithA(str: String?): Boolean{
    return str!!.startsWith("A")
}