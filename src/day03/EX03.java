package day03;

public class EX03 {
    public static void main(String[] args) {
        // class Garden
        // getSound(동물): 매개변수.cry()
        // class Dog, Cat extends Pet
        // cry()

        Garden garden = new Garden();

        garden.getSound(new Dog());
        garden.getSound(new Cat());
    }
}

class Garden{
    void getSound(Pet pet){
        pet.cry();
        // instanceof는 다형성 주입으로 대체 가능
        // instanceof는 대체적으로 필요X
//        if(pet instanceof Dog){
//            System.out.println("멍멍");
//        }
//        else if(pet instanceof Cat){
//            System.out.println("야옹");
//        }
    }
}

class Pet{
    void cry(){}
}

class Dog extends Pet{
    @Override
    void cry(){
        System.out.println("멍멍");
    }
}

class Cat extends Pet{
    @Override
    void cry(){
        System.out.println("야옹");
    }
}