package day07;

public class CalcController {

    CalcModel model;

    CalcController(CalcModel model){
        this.model = model;
    }

    String resPlus(String num1, String num2) {
        return String.valueOf(model.plus(Integer.parseInt(num1), Integer.parseInt(num2)));
    }
}
