package day07;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class CalcView extends JFrame implements ActionListener {

    // text field 생성
    JTextField tf_num1 = new JTextField();
    JTextField tf_num2 = new JTextField();

    // 더하기 버튼
    JButton btn_plus = new JButton("더하기");

    // 라벨 = 가변 이름표
    JLabel la_result = new JLabel("결과 출력");

    CalcView() {

        setSize(300, 200); // 창 크기
        setLayout(null); // 레이아웃 매니저 초기화

        tf_num1.setBounds(50, 50, 50, 40);
        tf_num2.setBounds(100, 50, 50, 40);
        btn_plus.setBounds(150, 50, 80, 40);
        la_result.setBounds(50, 100, 200, 40);

        btn_plus.addActionListener(this);

        add(tf_num1);
        add(tf_num2);
        add(btn_plus);
        add(la_result);

        // 창을 끄면, 프로그램 종료
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // 더하기 버튼이 클릭되면,
        la_result.setText("더하기 버튼 눌렸다!");
    }
}
