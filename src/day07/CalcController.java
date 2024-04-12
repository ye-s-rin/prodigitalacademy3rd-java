package day07;

public class CalcController {

    private CalcModel model;
    private CalcView view;

    CalcController(CalcModel model){
        this.model = model;
        this.view = new CalcView(this);
    }

    String reqPlus(String strNum1, String strNum2) {
        return String.valueOf(model.plus(Integer.parseInt(strNum1), Integer.parseInt(strNum2)));
    }

    public String reqMinus(String strNum1, String strNum2) {
        return String.valueOf(model.minus(Integer.parseInt(strNum1), Integer.parseInt(strNum2)));
    }

    public String reqMulti(String strNum1, String strNum2) {
        return String.valueOf(model.multi(Integer.parseInt(strNum1), Integer.parseInt(strNum2)));
    }

    public String reqDivide(String strNum1, String strNum2) {
        return String.valueOf(model.divide(Integer.parseInt(strNum1), Integer.parseInt(strNum2)));
    }
}
