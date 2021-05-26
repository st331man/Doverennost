package sample;

import javax.swing.*;
import java.awt.*;

public class UserInterfaceD extends JFrame {
    public UserInterfaceD() {
 super("Доверенность 1.0");
 setBounds(200,100,1000,600);
 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

     }

    public static void main(String[] args) {
        UserInterfaceD app = new UserInterfaceD();
        app.setVisible(true);

    }

}
