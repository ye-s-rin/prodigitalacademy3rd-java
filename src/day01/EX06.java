package day01;

public class EX06 {
    public static void main(String[] args) {
        Person songa = new Person("손가");
        Person kelly = new Person("켈리");
        Person jason = new Person("제이슨");

        System.out.println(kelly.name);
    }
}

// 사람 클래스
class Person{
    // 변수 (=부품)
    String name;

    // 생성자
    Person(String name) {
        this.name = name;
        System.out.printf("%s(이/가) 태어났습니다.\n", this.name);
    }
}