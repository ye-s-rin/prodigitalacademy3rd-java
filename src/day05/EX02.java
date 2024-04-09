package day05;

public class EX02 {
    int _quantitiy;
    int _itemPrice;
    int discountLevel;

    // 임의로 지정. 본래는 객체에서 get
    int getDiscountLevel(){
        return discountLevel;
    }

    double getDiscountedPrice(int basePrice, int discountLevel){
        // discountLevel 스위치는 생략
        return basePrice * discountLevel;
    }

    void method(){
        int basePrice = _quantitiy * _itemPrice; // 정가
        discountLevel = getDiscountLevel(); // 할인률

        double finalPrice = getDiscountedPrice(basePrice, discountLevel);

        System.out.printf("최종 금액은 %d 달러입니다.\n", finalPrice);
    }
}
