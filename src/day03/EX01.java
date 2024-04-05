package day03;

public class EX01 {
    public static void main(String[] args) {
        // Cow, Chicken: cry() - "음메", "꼬끼오"
        // Farm: getSound() - cow, chicken .cry()
        // Animal: 상속 - 오버라이딩

        Animal cow = new Cow();
        Animal chicken = new Chicken();

        Farm farm = new Farm(new Animal[]{cow, chicken});

        farm.getSound();
    }
}

class Farm{
    private Animal[] animals;

    Farm(Animal[] animals){
        this.animals = animals;
    }

    void getSound(){
        for (Animal animal : animals) {
            animal.cry();
        }
    }
}

class Animal{
    void cry(){
        System.out.println("동물 울음소리");
    }
}

class Cow extends Animal{
    @Override
    void cry(){
        System.out.println("음메");
    }
}

class Chicken extends Animal{
    @Override
    void cry(){
        System.out.println("꼬끼오");
    }
}