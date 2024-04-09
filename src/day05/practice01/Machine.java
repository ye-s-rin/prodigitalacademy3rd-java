package day05.practice01;

public class Machine {
    String name;
    String location;
    String bin;

    public Machine(String name, String location) {
        this.name = name;
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public String getLocation() { return location; }

    public String getBin() {
        return bin;
    }

    public String flush() {
        String result = bin;
        bin = null;
        return result;
    }

    public void takeBasket(String basket) {
        this.bin = basket;
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();

        sb.append("Machine : ").append(name);

        if (bin != null)
            sb.append(" bin = ").append(bin);

        sb.append("\n");
        return sb.toString();
    }
}