package day07;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class CalcView extends JFrame implements ActionListener {

    // text field 생성
    JTextField tf_num1 = new JTextField();
    JTextField tf_num2 = new JTextField();

    // 연산 버튼
    JButton btn_plus = new JButton("더하기");
    JButton btn_minus = new JButton("빼기");
    JButton btn_multi = new JButton("곱하기");
    JButton btn_divide = new JButton("나누기");

    // 라벨 = 가변 이름표
    JLabel la_result = new JLabel("결과 출력");

    // Controller
    private CalcController controller;

    CalcView(CalcController controller) {

        this.controller = controller;

        setSize(300, 300); // 창 크기
        setLayout(null); // 레이아웃 매니저 초기화

        tf_num1.setBounds(50, 50, 50, 40);
        tf_num2.setBounds(100, 50, 50, 40);

        btn_plus.setBounds(150, 50, 80, 40);
        btn_minus.setBounds(150, 90, 80, 40);
        btn_multi.setBounds(150, 130, 80, 40);
        btn_divide.setBounds(150, 170, 80, 40);

        la_result.setBounds(50, 100, 200, 40);

        btn_plus.addActionListener(this);
        btn_minus.addActionListener(this);
        btn_multi.addActionListener(this);
        btn_divide.addActionListener(this);

        add(tf_num1);
        add(tf_num2);

        add(btn_plus);
        add(btn_minus);
        add(btn_multi);
        add(btn_divide);

        add(la_result);

        // 창을 끄면, 프로그램 종료
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btn_plus) {
            la_result.setText(controller.reqPlus(tf_num1.getText(), tf_num2.getText()));
        } else if (e.getSource() == btn_minus) {
            la_result.setText(controller.reqMinus(tf_num1.getText(), tf_num2.getText()));
        } else if (e.getSource() == btn_multi) {
            la_result.setText(controller.reqMulti(tf_num1.getText(), tf_num2.getText()));
        } else if (e.getSource() == btn_divide) {
            la_result.setText(controller.reqDivide(tf_num1.getText(), tf_num2.getText()));
        }
    }
}
