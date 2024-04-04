package day01;

public class EX07 {
    public static void main(String[] args) {
        // 객체 생성
        // 2개: 삼성, LG
        Laptop samsung = new Laptop("삼성");
        Laptop lg = new Laptop("LG");
        // 객체의 변수 출력
        System.out.println(samsung.brand);
        System.out.println(lg.brand);
    }
}

// 노트북 클래스, 브랜드
class Laptop {
    String brand;

    Laptop(String brand){
        this.brand = brand;
        System.out.printf("%s의 노트북을 구매했습니다.\n", this.brand);
    }
}