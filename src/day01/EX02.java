package day01;

public class EX02 {
    public static void main(String[] args) {
        // num 변수의 값이 9면 A
        // 8이면 B
        // 7이면 C
        // 6이하면 F

        int num=0;
        char result;

        switch(num){
            case 9:
                result = 'A';
                break;
            case 8:
                result ='B';
                break;
            case 7:
                result = 'C';
                break;
            default:
                result = 'F';
                break;
        }

        System.out.println(result);
    }
}
