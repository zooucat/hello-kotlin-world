package p05_control

/*
public void validateScoreIsNotNegative(int score) {
    if (score < 0) {
        throw new IllegalArgumentException(String.format("%s는 0보다 작을 수 없습니다.", score));
    }
}
*/

fun validateScoreIsNotNegative(score: Int) {
    if (score < 0) {
        throw IllegalArgumentException("${score}는 0보다 작을 수 없습니다.")
    }
}

/*
private String getPassOrFail(int score) {
    if (score >= 50) {
        return "P";
    } else {
        return "F";
    }
}
*/

fun getPassOrFail(score: Int): String {
    return if (score >= 50) {
        "P"
    } else {
        "F"
    }
}

/*
private String getGrade(int score) {
    if (score >= 90) {
        return "A";
    } else if (score >= 80) {
        return "B";
    } else if (score >= 70) {
        return "C";
    } else {
        return "D";
    }
}
*/

fun getGrade(score: Int): String {
    return if (score >= 90) {
        "A"
    } else if (score >= 80) {
        "B"
    } else if (score >= 70) {
        "C"
    } else {
        "D"
    }
}

/*
private void validate(int score) {
    if (0 <= score && score <= 100) {
        System.out.println();
    }
}
*/

fun validate(score: Int) {
    if (score in 0..100) {
        println()
    }
}

/*
private String getGradeWithSwitch(int score) {
    switch (score / 10) {
        case 9:
            return "A";
        case 8:
            return "B";
        case 7:
            return "C";
        default:
            return "D";
    }
}
*/

fun getGradeWithSwitch(score: Int): String {
    return when (score) {
        in 90..99 -> "A"
        in 80..89 -> "B"
        in 70..79 -> "C"
        else -> "D"
    }
}

/*
private boolean startsWithA(Object obj) {
    if (obj instanceof String) {
        return ((String) obj).startWith("A");
    } else {
        return false;
    }
}
*/

fun startWithA(obj: Any?): Boolean {
    return when (obj) {
        is String -> obj.startsWith("A")
        else -> false
    }
}

/*
private void judgeNumber(int number) {
    if (number == 1 || number == 0 || number == -1) {
        System.out.println("어디서 많이 본 숫자입니다.");
    } else {
        System.out.println("1, 0, -1이 아닙니다.");
    }
}
*/

fun judgeNumber(number: Int) {
    when (number) {
        -1, 0, 1 -> println("어디서 많이 본 숫자입니다.")
        else -> println("1, 0, -1이 아닙니다.")
    }
}

/*
private void judgeNumber2(int number) {
    if (number == 0) {
        System.out.println("주어진 숫자는 0입니다.");
        return;
    }

    if (number % 2 == 0) {
        System.out.println("주어진 숫자는 짝수입니다.");
        return;
    }

    System.out.println("주어진 숫자는 홀수입니다.");
}
*/

fun judgeNumber2(number: Int) {
    when {
        (number == 0) -> println("주어진 숫자는 0입니다.")
        (number % 2 == 0) -> println("주어진 숫자는 짝수입니다.")
        else -> println("주어진 숫자는 홀수입니다.")
    }
}
