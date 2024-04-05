package day03;

public class EX06 {
    public static void main(String[] args) {
        // ApplePhone: 배터리 용량 capacity (정수) (초기값 100), isOn = false
        // charge(): 배터리 충전 (+10)
        // useKakaotalk(): -5
        // useYoutube(): -10
        // 배터리 남은 용량 확인
        // turnOn() - boolean isOn 변경
        // turnOff()

        // Person => ApplePhone 모든 기능을 사용하는 유저
        // SamsungPhone: ApplePhone 모든 기능이 있되 숫자는 다르게
    }
}

class Person{
    private Phone phone;

    void purchase(Phone phone){
        this.phone = phone;
    }

    void charge(){
        phone.charge();
    }

    void useKakaotalk(){
        phone.useKakaotalk();
    }

    void useYoutube(){
        phone.useYoutube();
    }

    void showCapacity(){
        phone.showCapacity();
    }

    void turnOn(){
        phone.turnOn();
    }

    void turnOff(){
        phone.turnOff();
    }
}

class Phone {
    void charge(){}

    void useKakaotalk(){}

    void useYoutube(){}

    void showCapacity(){}

    void turnOn(){}

    void turnOff(){}
}

class ApplePhone extends Phone{
    private boolean isOn = false;
    private final int capacity = 100;
    private int battery = 100;

    void charge(){
        this.battery = Math.min(this.battery + 10, capacity);
    }

    void useKakaotalk(){
        if(this.battery > 0) turnOn();
        this.battery = Math.max(this.battery - 5, 0);
        if(this.battery == 0) turnOff();
    }

    void useYoutube(){
        if(this.battery > 0) turnOn();
        this.battery = Math.max(this.battery - 10, 0);
        if(this.battery == 0) turnOff();
    }

    void showCapacity(){
        System.out.println(this.battery);
    }

    void turnOn(){
        this.isOn = true;
    }

    void turnOff(){
        this.isOn = false;
    }
}

class SamsungPhone extends Phone{
    private boolean isOn = false;
    private final int CAPACITY = 100;
    private int battery = 100;

    void charge(){
        this.battery = Math.min(this.battery + 15, CAPACITY);
    }

    void useKakaotalk(){
        if(this.battery > 0) turnOn();
        this.battery = Math.max(this.battery - 3, 0);
        if(this.battery == 0) turnOff();
    }

    void useYoutube(){
        if(this.battery > 0) turnOn();
        this.battery = Math.max(this.battery - 15, 0);
        if(this.battery == 0) turnOff();
    }

    void showCapacity(){
        System.out.println(this.battery);
    }

    void turnOn(){
        this.isOn = true;
    }

    void turnOff(){
        this.isOn = false;
    }
}
