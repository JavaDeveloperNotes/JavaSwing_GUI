package my.zhamri.window;

import javax.swing.*;

public class Window1 {

    private JFrame j;

    public Window1() {
        j = new JFrame("Hello World");
        j.setSize(400, 300);
        j.setLayout(null);
        j.setDefaultCloseOperation(j.EXIT_ON_CLOSE);
        j.setVisible(true);
    }

    public static void main(String[] args) {
        Window1 window1 = new Window1();
    }
}
