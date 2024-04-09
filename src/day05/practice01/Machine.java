package day05.practice01;
import java.io.IOException;
import java.io.Writer;

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

    public void printMachineStatus(Writer out) throws IOException {
        StringBuffer sb = new StringBuffer();

        sb.append("Machine : ").append(name);

        if (bin != null)
            sb.append(" bin = ").append(bin);

        sb.append("\n");
        out.write(sb.toString());
    }
}