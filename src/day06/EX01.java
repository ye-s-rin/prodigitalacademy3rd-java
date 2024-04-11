package day06;

public class EX01 {
    public static void main(String[] args) {
        // 다형성
        Shape square = new Square();

        //캡슐화
        System.out.println(square.getVertex());
    }
}

// 추상화
abstract class Shape {
    private int vertex;

    abstract int getVertex();
}

// 상속
class Square extends Shape {
    private int vertex = 4;

    int getVertex() { return this.vertex; }
}