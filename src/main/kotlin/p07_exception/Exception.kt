package p07_exception

import java.io.BufferedReader
import java.io.File
import java.io.FileReader

fun main() {
    readFile1()
    readFile2("./a.txt")
}

/*
private int parseIntOrThrow(@NotNull String str) {
    try {
        return Integer.parseInt(str);
    } catch (NumberFormatException e) {
        throw new IllegalArgumentException(String.format("주어진 %s은 숫자가 아닙니다", str));
    }
}
 */

fun parseIntOrThrow(str: String): Int {
    try {
        return str.toInt()
    } catch (exception: NumberFormatException) {
        throw IllegalArgumentException("주어진 ${str}은 숫자가 아닙니다.")
    }
}

/*
private Integer parseIntOrThrowV2(String str) {
    try {
        return Integer.parseInt(str);
    } catch (NumberFormatException exception) {
        return null;
    }
}
 */

fun parseIntOrThrowV2(str: String): Int? {
    return try {
        str.toInt()
    } catch (exception: NumberFormatException) {
        null
    }
}

/*
public void readFile() throws IOException {
    File currentFile = new File(".");
    File file = new File(currentFile.getAbsolutePath() + "/a.txt");
    BufferedReader reader = new BufferedReader(new FileReader(file));
    System.out.println(reader.readLine());
    reader.close();
}
 */
fun readFile1() {
    val currentFile = File(".")
    val file = File(currentFile.absolutePath + "/a.txt")
    val reader = BufferedReader(FileReader(file))
    println(reader.readLine())
    reader.close()
}

/*
public void readFile2(String path) throws IOException {
    try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
        System.out.println(reader.readLine());
    }
}
 */
fun readFile2(path: String) {
    BufferedReader(FileReader(path)).use { reader ->
        println(reader.readLine())
    }
}
