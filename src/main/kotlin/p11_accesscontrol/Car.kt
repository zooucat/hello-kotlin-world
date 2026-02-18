package p11_accesscontrol

class Car(
    internal val name: String, // 바이트 코드 상 public이 되기 때문에 Java 코드에서는 Kotlin 모듈의 internal 코드를 가져올 수 있다.
    private val owner: String,
    _price: Int) {

    var price = _price
        private set
}
