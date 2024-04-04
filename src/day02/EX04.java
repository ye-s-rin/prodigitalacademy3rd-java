package day02;

public class EX04 {
    public static void main(String[] args) {
        Car bus = new Bus();
        bus.ride();
        bus.showWheelNum();

        Car taxi = new Taxi();
        taxi.ride();
        taxi.showWheelNum();
    }
}

// 부모 클래스는 자식 클래스의 공통된 특징!
// 자식부터 설계하고, 부모 설계 쉽다!
class Car{
    int wheels = 4;

    void ride(){
        System.out.println("부아앙");
    }

    void showWheelNum(){
        System.out.printf("바퀴 수는 %d개 입니다.\n",this.wheels);
    }
}
// 버스
class Bus extends Car{
//    int wheels = 4;

    void ride(){
        System.out.println("부릉부릉");
    }

//    void showWheelNum(){
//        System.out.printf("바퀴 수는 %d개 입니다.\n",this.wheels);
//    }
}
// 택시
class Taxi extends Car{
//    int wheels = 4;

    void ride(){
        System.out.println("빵빵");
    }

//    void showWheelNum(){
//        System.out.printf("바퀴 수는 %d개 입니다.\n",this.wheels);
//    }
}
// 메소드: 달린다 (버스-부릉부릉, 택시-빵빵)