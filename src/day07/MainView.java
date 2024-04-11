package day07;

import javax.swing.*;

public class MainView extends JFrame {

    // text field 생성
    JTextField tf_num1 = new JTextField();
    JTextField tf_num2 = new JTextField();

    MainView() {

        setSize(500, 300);
        setLayout(null);

        tf_num1.setBounds(50, 50, 50, 40);
        tf_num2.setBounds(100, 50, 50, 40);

        add(tf_num1);
        add(tf_num2);

        // 창을 끄면, 프로그램 종료
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setVisible(true);
    }
}
