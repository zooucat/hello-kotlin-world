package p08_function

fun main() {
    repeat("Hello World", useNewLine = false)
    printNameAndGender(gender = "FEMALE", name = "최윤정")

    printAll("A", "B", "C")
    val array = arrayOf("A", "B", "C")
    printAll(*array) // 스프레드 연산자
}

/*
public int max(int a, int b) {
    if (a > b) {
        return a;
    }
    return b;
}
 */

fun max(a: Int, b: Int) = if (a > b) a else b

/*
public void repeat(String str, int num, boolean useNewLine) {
    for (int i = 1; i <= num; i++) {
        if (useNewLine) {
            System.out.println(str);
        } else {
            System.out.print(str);
        }
    }
}

public void repeat(String str, int num) {
    repeat(str, num, true);
}

public void repeat(String str) {
    repeat(str, 3, true);
}
 */

fun repeat(str: String, num: Int = 3, useNewLine: Boolean = true) {
    for (i in 1..num) {
        if (useNewLine) {
            println(str)
        } else {
            print(str)
        }
    }
}

fun printNameAndGender(name: String, gender: String) {
    println(name)
    println(gender)
}

/*
public static void printAll(String... strings) {
    for (String str : strings) {
        System.out.println(str);
    }
}

String[] array = new String[]("A", "B", "C");
printAll(array);

printAll("A", "B", "C");
 */

fun printAll(vararg strings: String) {
    for (str in strings) {
        println(str)
    }
}
