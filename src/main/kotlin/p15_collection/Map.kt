package p15_collection

/*
// JDK 8까지
Map<Integer, String> map = new HashMap<>();
map.put(1, "MONDAY");
map.put(2, "TUESDAY");

// JDK 9부터
Map<Integer, String> map = Map.of(1, "MONDAY", 2, "TUESDAY");

for (int key : map.keySet()) {
    System.out.println(key);
    System.out.println(map.get(key));
}

for (Map.Entry<Integer, String> entry : map.entrySet()) {
    System.out.println(entry.getKey());
    System.out.println(entry.getValue());
}
 */

fun main() {
    val map1 = mutableMapOf<Int, String>()
    map1[1] = "MONDAY"
    map1[2] = "TUESDAY"

    val map2 = mapOf(1 to "MONDAY", 2 to "TUESDAY")

    for (key in map1.keys) {
        println(key)
        println(map1[key])
    }

    for ((key, value) in map2.entries) {
        println(key)
        println(value)
    }
}
