import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class DormManager extends JFrame {

    ManageTab ManTab;
    StdTab STab;
    Login login;
    Menu menu;
    CenterPanel cenP;
    Scanner scan = new Scanner(System.in);
    Container c = getContentPane();

    void viewP(JPanel p){
        c.removeAll();
        c.add(menu,BorderLayout.NORTH);
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


    public DormManager(){
        ManTab= new ManageTab();
        STab = new StdTab();
        login = new Login();
        cenP = new CenterPanel();
        menu = new Menu();
        setLayout((new BorderLayout()));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Dormitary Management Program");
        this.setVisible(true);
        this.setSize(1680,1080);

        c.add(cenP,BorderLayout.CENTER);
        c.add(menu,BorderLayout.NORTH);



    }
    public static void main(String[] args) {
        new DormManager();
    }

}
