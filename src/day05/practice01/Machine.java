public class Machine {
    String name;
    String location;
    String basket;

    public Machine(String name, String location) {
        this.name = name;
        this.location = location;
    }

    public String take() {
        String result = basket;
        basket = null;
        return result;
    }

    public String basket() {
        return basket;
    }

    public void put(String bin) {
        this.basket = bin;
    }

    public String name() {
        return name;
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();

        sb.append("Machine : ").append(name);

        if (basket != null)
            sb.append("bin = ").append(basket);

        sb.append("\n");
        return sb.toString();
    }
}