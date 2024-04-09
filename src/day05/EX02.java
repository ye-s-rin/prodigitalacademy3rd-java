package day05;

public class EX02 {
    int _quantitiy;
    int _itemPrice;
    int discountLevel;

    // 임의로 지정. 본래는 객체에서 get
    int getDiscountLevel(){
        return discountLevel;
    }

    // 멤버 변수는 매개변수로 전달할 필요X
    // double getDiscountedPrice(int basePrice, int discountLevel){
    double getDiscountedPrice(){
        // return basePrice * discountLevel;
        return (_quantitiy * _itemPrice) * getDiscountLevel();
    }

    void method(){
        // 지역변수는 적을수록 좋다
        // int basePrice = _quantitiy * _itemPrice; // 정가
        // discountLevel = getDiscountLevel(); // 할인률

        System.out.printf("최종 금액은 %f 달러입니다.\n", getDiscountedPrice());
    }
}
