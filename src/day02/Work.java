package day02;

public class Work {
    public static void main(String[] args) {
        Store store = new Store();

        Phone galaxy = new SamsungPhone();
        Phone iphone = new ApplePhone();

        Language korean = new Korean();
        Language english = new English();

        Person sony = new Person("쏘니", korean, galaxy);
        Person beckham = new Person("베컴", english, iphone);
        
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
    private Language language;
    private Phone phone;
    
    Person(String name, Language language, Phone phone){
        this.name = name;
        this.language = language;
        this.phone = phone;
    }
    
    void turnOn(){
        System.out.printf("\n%s(이/가) 핸드폰을 켰습니다.\n", this.name);
        language.say();
        phone.turnOn();
    }

    String getName(){
        return this.name;
    }
}

class Language {
    void say(){
        System.out.println("오버라이딩");
    }
}

class Korean extends Language{
    void say(){
        System.out.println("야 내가 핸드폰 켜볼게");
    }
}

class English extends Language{
    void say(){
        System.out.println("turn on");
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