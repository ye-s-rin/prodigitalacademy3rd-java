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
        // ApplePhone => SamsungPhone 기기변경

        ApplePhone applePhone = new ApplePhone();
        SamsungPhone samsungPhone = new SamsungPhone();

        Person person = new Person();

        person.buyPhone(applePhone);
        person.buyPhone(samsungPhone);
    }
}

class Person {
    private Phone phone;

    void buyPhone(Phone phone) {
        this.phone = phone;
    }

    void charge() {
        phone.charge();
    }

    void useKakaotalk() {
        phone.useKakaotalk();
    }

    void useYoutube() {
        phone.useYoutube();
    }

    void showCapacity() {
        phone.showCapacity();
    }

    void turnOn() {
        phone.turnOn();
    }

    void turnOff() {
        phone.turnOff();
    }
}

interface Phone {
    // 1. 구현체가 어떤 게 오든 받아줄 수 있게 타입 형태로 제시
    // => implements Phone
    // * 추상 클래스는 extends 공통 기능 상속
    // * 인터페이스는 implements 공통 규약, 구현
    // 2. 구현체(객체)를 필요 = 구현체 사용 = 메소드 호출
    //    메소드 선언(명, 매개변수) 통일
    // * 인터페이스는 implements 공통 규약, 구현
    void charge();

    void useKakaotalk();

    void useYoutube();

    void showCapacity();

    void turnOn();

    void turnOff();
}

class ApplePhone implements Phone {
    private boolean isOn = false;
    private final int capacity = 100;
    private int battery = 100;

    public void charge() {
        this.battery = Math.min(this.battery + 10, capacity);
    }

    public void useKakaotalk() {
        if (isOn){
            this.battery = Math.max(this.battery - 5, 0);
        }
        if (this.battery == 0) turnOff();
    }

    public void useYoutube() {
        if (isOn){
            this.battery = Math.max(this.battery - 10, 0);
        }
        if (this.battery == 0) turnOff();
    }

    public void showCapacity() {
        System.out.println(this.battery);
    }

    public void turnOn() {
        this.isOn = true;
    }

    public void turnOff() {
        this.isOn = false;
    }
}

class SamsungPhone implements Phone{
    private boolean isOn = false;
    private final int CAPACITY = 100;
    private int battery = 100;

    public void charge() {
        this.battery = Math.min(this.battery + 15, CAPACITY);
    }

    public void useKakaotalk() {
        if (isOn){
            this.battery = Math.max(this.battery - 3, 0);
        }
        if (this.battery == 0) turnOff();
    }

    public void useYoutube() {
        if (isOn){
            this.battery = Math.max(this.battery - 15, 0);
        }
        if (this.battery == 0) turnOff();
    }

    public void showCapacity() {
        System.out.println(this.battery);
    }

    public void turnOn() {
        this.isOn = true;
    }

    public void turnOff() {
        this.isOn = false;
    }
}
