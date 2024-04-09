package day05.practice01;

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

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();

        if (machine != null)
            sb.append(" location=").append(machine.getName());

        if (basket != null)
            sb.append(" bin=" ).append(basket);

        return sb.toString();
    }
}
