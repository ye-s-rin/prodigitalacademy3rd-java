package day02;

public class Temp {
    public static void main(String[] args) {
        Store store = new Store();
        Phone kphone = new Phone("삐비빅");
        Phone aphone = new Phone("bbeep");

        Person sonu = new Person("쏘니", kphone, true);
        Person beckham = new Person("베컴", aphone, false);
        
        store.perchase(sonu);
        store.perchase(beckham);
        
        sonu.turnOn();
        beckham.turnOn();
    }
}

class Store{
    Person customer;
    
    void perchase(Person customer){
        System.out.printf("%s(이/가) 핸드폰을 샀습니다.\n", customer.getName());
    }
}

class Person {
    String name;
    Phone phone;
    boolean isKorean;
    
    Person(String name, Phone phone, boolean isKorean){
        this.name = name;
        this.phone = phone;
        this.isKorean = isKorean;
    }
    
    void turnOn(){
        System.out.printf("\n%s(이/가) 핸드폰을 켰습니다.\n", this.name);
        if(isKorean)
            System.out.println("야 내가 핸드폰 켜볼게");
        else
            System.out.println("turn on");

        phone.turnOn();
    }

    String getName(){
        return this.name;
    }
}

class Phone{
    String sound;

    Phone(String sound){
        this.sound = sound;
    }

    void turnOn(){
        System.out.println(sound);
    }
}