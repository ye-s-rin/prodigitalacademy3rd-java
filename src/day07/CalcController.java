package day07;

public class CalcController {

    private CalcModel model;
    private CalcView view;

    CalcController(CalcModel model){
        this.model = model;
        this.view = new CalcView(this);
    }

    String reqPlus(String num1, String num2) {
        return String.valueOf(model.plus(Integer.parseInt(num1), Integer.parseInt(num2)));
    }
}
