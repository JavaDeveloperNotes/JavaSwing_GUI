package my.zhamri.window;

import javax.swing.*;

public class Window2 extends JFrame {

    public Window2() {
        setTitle("Hello World");
        setSize(600, 400);
        setLayout(null);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Window2();
    }
}
