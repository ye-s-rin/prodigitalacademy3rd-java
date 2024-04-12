package day07;

public class CalcDemo {

    public static void main(String[] args) {

        new CalcView(new CalcController(new CalcModel()));
    }
}
