package day02;

public class EX02 {
    public static void main(String[] args) {
//        Coffee coffee = new Coffee(3500, "hot", "tall");
//        coffee.getInfo();
//        coffee.setPrice(4000);
//        coffee.setPrice(-5000);
//        coffee.setPrice(400);
//        coffee.getInfo();

//        Coffee americano = new Coffee();
//        americano.price = 4000;
//        americano.hotOrIce = "ice";
//        americano.size = "venti";
//        americano.getInfo();

        Barista chunsik = new Barista("춘식");
        Coffee coffee2 = new Coffee(5000, chunsik);
        chunsik.getCoffeeInfo();
        chunsik.makeCoffee();
    }
}

// 커피 클래스
// 필드: 가격, hot or ice, 사이즈
// 메소드: getInfo - sout(갸격, hot or ice, 사이즈)
class Coffee{
    private int price;
    private String hotOrIce;
    private String size;
    Barista barista;

    Coffee(int price, String hotOrIce, String size){
        this.price = price;
        this.hotOrIce = hotOrIce;
        this.size = size;
        System.out.printf("커피를 주문했습니다.\n\n");
    }

    Coffee(int price, Barista barista){
        this.price = price;
        this.barista = barista;
        barista.setCoffee(this);
    }

    void getInfo(){
        System.out.printf("%d원입니다.\n%s입니다.\n사이즈는 %s입니다.\n\n",this.price, this.hotOrIce, this.size);
    }

    int getPrice(){
        return this.price;
    }

    void setPrice(int price){
        int prePrice = this.price;
        if(price<=prePrice) {
            System.out.printf("%d은 잘못된 입력입니다.\n\n", price);
            return;
        }
        this.price = price;
        System.out.printf("가격이 %d원에서 %d원으로 변경되었습니다.\n\n", prePrice, this.price);
    }
}

class Barista {
    private String name;
    Coffee coffee;

    Barista(String name){
        this.name = name;
    }

    void getCoffeeInfo(){
        int price = coffee.getPrice();
        System.out.printf("이 커피는 %d원입니다.\n", price);
    }

    void makeCoffee(){
        System.out.println("커피 여기있습니다~");
    }

    void setCoffee(Coffee coffee){
        this.coffee = coffee;
    }
}