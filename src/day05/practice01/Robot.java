package day05.practice01;

import java.io.IOException;
import java.io.Writer;

public class Robot {

    Machine machine;
    String basket;

    public Robot() {}

    public Machine getCurrentLocation() {
    	return machine;
    }
    
    public void moveToMachine(Machine machine) {
    	this.machine = machine;
    }

    public void pickBasket() {
    	this.basket = machine.flush();
    }
    
    public String getBasket() {
    	return basket;
    }

    public void giveBasket() {
        machine.takeBasket(basket);
        basket = null;
    }

    public void printRobotStatus(Writer out) throws IOException {

        out.write("Robot");

        StringBuffer sb = new StringBuffer();

        if (machine != null)
            sb.append(" location=").append(machine.getName());

        if (basket != null)
            sb.append(" bin=" ).append(basket);

        sb.append("\n");
        out.write(sb.toString());
    }
}
