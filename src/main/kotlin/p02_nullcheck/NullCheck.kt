package p02_nullcheck

fun main() {
    // Safe Call
    val str: String? = null
    println(str?.length)

    // Elvis 연산자
    println(str?.length ?: 0)

    println(startsWithA4(null)) // NPE발생
}

/*
public boolean startsWithA1(String str) {
    if(str == null) {
       throw new IllegalArgumentException("null이 들어왔습니다.");
    }
    return str.startsWith("A");
}
*/
fun startsWithA1(str: String?): Boolean {
    return str?.startsWith("A") ?: throw IllegalArgumentException("null이 들어왔습니다.")
}

/*
public Boolean startsWithA2(String str) {
    if(str == null) {
        return null;
    }
    return str.startsWith("A");
}
*/
fun startWithA2(str: String?): Boolean? {
    return str?.startsWith("A")
}

/*
public boolean startsWithA3(String str) {
    if(str == null) {
        return false;
    }
    return str.startsWith("A");
}
*/
fun startWithA3(str: String?): Boolean {
    return str?.startsWith("A") ?: false
}

// NULL 아님 단언
fun startsWithA4(str: String?): Boolean {
    return str!!.startsWith("A")
}
