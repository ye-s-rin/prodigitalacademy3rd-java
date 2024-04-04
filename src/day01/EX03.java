package day01;

public class EX03 {
    public static void main(String[] args) {
        int age = 19;
        switch (age/10){
            case 3:
                System.out.println("30대");
                break;
            case 2:
                System.out.println("20대");
                break;
            case 1:
                System.out.println("10대");
                break;
            case 0:
                System.out.println("어린이");
                break;
            default:
                System.out.println("40대 이상");
        }
    }
}
