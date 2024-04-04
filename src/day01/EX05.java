package day01;

public class EX05 {
    public static void main(String[] args) {
        // 자료형 = 변수에 담길 데이터 형태
        Product product = new Product();
        Computer computer = new Computer();
    }
}

//  상품 클래스
class Product {
    // 생략 - 객체를 만드는 방법
    // 생성자 = 클래스로 객체를 만드는 방법
    Product(){

    }
}

// 컴퓨터 클래스
class Computer {
    Computer(){
        System.out.println("컴퓨터가 생성되었습니다.");
    }
}