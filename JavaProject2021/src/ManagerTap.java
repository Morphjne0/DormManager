import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class ManagerTap extends JFrame {
    ManageTab ManTab;
    StdTab STab;
    Login login;
    Menu menu;
    CenterPanel cenP;
    Scanner scan = new Scanner(System.in);
    Container c = getContentPane();

    void viewP(JPanel p){
        c.removeAll();
        c.add(menu, BorderLayout.NORTH);
        if (p instanceof ManageTab) {
            c.add((ManageTab) p, BorderLayout.CENTER);
        }
//        if (p instanceof EditPanel) {
//            c.add((EditPanel) p, BorderLayout.CENTER);
//        }
//        if (p instanceof DeletePanel) {
//            c.add((DeletePanel) p, BorderLayout.CENTER);
//        }
//        if (p instanceof ListPanel) {
//            c.add((ListPanel) p, BorderLayout.CENTER);
//        }
        revalidate();
    }
}
