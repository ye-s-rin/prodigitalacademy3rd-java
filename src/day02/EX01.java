package day02;

public class EX01 {
    public static void main(String[] args) {
        Animal dog = new Animal("개", "멍멍");
        dog.cry();

        Animal cow = new Animal("소", "음메");
        cow.cry();
    }
}

// 동물 클래스
// 이름 (생성자, 필드)
// 울음소리 메소드
class Animal {
    String name;
    String sound;

    Animal(String name, String sound){
        this.name = name;
        this.sound = sound;
        System.out.printf("%s가 있습니다.\n", this.name);
    }

    // 접근제어자 반환타입 메소드명()
    void cry(){
        System.out.printf("%s가 %s하고 울음소리를 냅니다.\n", this.name, this.sound);
    }
}