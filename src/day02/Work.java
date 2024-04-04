package day02;

public class Work {
    public static void main(String[] args) {
        Store store = new Store();
        Phone galaxy = new SamsungPhone();
        Phone iphone = new ApplePhone();

        Person sony = new Korean("쏘니", galaxy);
        Person beckham = new American("베컴", iphone);
        
        store.perchase(sony);
        store.perchase(beckham);
        
        sony.turnOn();
        beckham.turnOn();
    }
}

class Store{
    Person customer;
    
    void perchase(Person customer){
        this.customer = customer;
        System.out.printf("%s(이/가) 핸드폰을 샀습니다.\n", customer.getName());
    }
}

class Person {
    private String name;
    private Phone phone;
    
    Person(String name, Phone phone){
        this.name = name;
        this.phone = phone;
    }
    
    void turnOn(){
        System.out.printf("\n%s(이/가) 핸드폰을 켰습니다.\n", this.name);
        phone.turnOn();
    }

    Phone getPhone(){
        return phone;
    }

    String getName(){
        return this.name;
    }
}

class Korean extends Person{
    Korean(String name, Phone phone){
        super(name, phone);
    }

    void turnOn(){
        System.out.printf("\n%s(이/가) 핸드폰을 켰습니다.\n", super.getName());
        System.out.println("야 내가 핸드폰 켜볼게");
        super.getPhone().turnOn();
    }
}

class American extends Person{
    American(String name, Phone phone){
        super(name, phone);
    }

    void turnOn(){
        System.out.printf("\n%s(이/가) 핸드폰을 켰습니다.\n", super.getName());
        System.out.println("turn on");
        super.getPhone().turnOn();
    }
}

class Phone{
    String sound="띠롱";

    void turnOn(){
        System.out.println(sound);
    }
}

class SamsungPhone extends Phone{
    String sound="삐비빅";

    void turnOn(){
        System.out.println(sound);
    }
}

class ApplePhone extends Phone{
    String sound="bbeep";

    void turnOn(){
        System.out.println(sound);
    }
}