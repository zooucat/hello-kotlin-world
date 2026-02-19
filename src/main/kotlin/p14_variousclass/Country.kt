package p14_variousclass

fun handleCountry(country: Country) {
    when (country) {
        Country.KOREA -> TODO()
        Country.AMERICA -> TODO()
    }
}

/*
public enum Country {
    KOREA("KO"),
    AMERICA("US");

    private final String code;

    Country(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }
}
 */
enum class Country(private val code: String) {

    KOREA("KO"),
    AMERICA("US");

}