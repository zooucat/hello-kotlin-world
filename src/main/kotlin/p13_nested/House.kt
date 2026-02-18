package p13_nested

/*
public class House {

    private String address;
    private LivingRoom livingRoom;

    public House(String address) {
        this.address = address;
        this.livingRoom = new LivingRoom(10);
    }

    public LivingRoom getLivingRoom() {
        return livingRoom;
    }

    public class RivingRoom {

        private double area;

        public LivingRoom(double area) {
            this.area = area;
        }

        public String getAddress() {
            return JavaHouse.this.address;
        }
    }
}
 */
class House(
    private val address: String,
    private val livingRoom: LivingRoom
) {

    inner class LivingRoom(private val area: Double) {

        val address: String
            get() = this@House.address

    }

}
