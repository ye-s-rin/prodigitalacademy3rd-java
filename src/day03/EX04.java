package day03;

public class EX04 {
    public static void main(String[] args) {
        // 레시피 - 슈퍼: getInfo() 이 레시피는 00의 레시피입니다.
        // 파스타레시피 - 자식: makeSource 소스를 만듭니다.
        // 스테이크레시피 - 자식: grillSteak 고기를 굽습니다.

        Pasta pasta = new Pasta("김씨 요리사");
        Steak steak = new Steak("이씨 요리사");

        pasta.getInfo();
        pasta.makeSource();

        steak.getInfo();
        steak.grillSteak();
    }
}

abstract class Recipe {
    String chef;

    Recipe(String chef){
        this.chef = chef;
    }

    void getInfo(){
        System.out.printf("이 레시피는 %s의 레시피입니다.\n", this.chef);
    }
}

class Pasta extends Recipe{
    Pasta(String chef) {
        super(chef);
    }

    void makeSource(){
        System.out.println("파스타 소스를 만듭니다.\n");
    }
}

class Steak extends Recipe{
    Steak(String chef) {
        super(chef);
    }

    void grillSteak() {
        System.out.println("스테이크를 굽습니다.\n");
    }

}