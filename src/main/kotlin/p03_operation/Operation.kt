package p03_operation

import java.util.Objects

fun main() {
    val money1 = JavaMoney(2_000L)
    val money2 = JavaMoney(1_000L)
    val money3 = money1
    val money4 = JavaMoney(2_000L)

    if (money1 > money2) {
        println("money1 is greater than money2")
    }

    println(money1 == money3)
    println(money1 === money3)
    println(money1 == money4)
    println(money1 === money4)

    println(money1 + money2)
}

data class JavaMoney(val amount: Long) : Comparable<JavaMoney> {

    override fun compareTo(other: JavaMoney): Int {
        return amount.compareTo(other.amount)
    }

    operator fun plus(other: JavaMoney): JavaMoney {
        return JavaMoney(amount + other.amount)
    }
}
