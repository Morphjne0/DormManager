import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StdMenu extends JPanel {

    JButton bt1 = new JButton("현재원 관리");
    JButton bt2 = new JButton("현재원 관리");
    JButton bt3 = new JButton("현재원 관리");
    JButton bt4 = new JButton("현재원 관리");
    JButton bt5 = new JButton("현재원 관리");

    ManageTab ManTab;
    StdTab STab;
    Login login;
    Menu menu;
    CenterPanel cenP;

    public StdMenu() {
        add(bt1);
        add(bt2);
        add(bt3);
        add(bt4);
        add(bt5);
        bt1.addActionListener(new MenuAL());
        bt2.addActionListener(new MenuAL());
        bt3.addActionListener(new MenuAL());
        bt4.addActionListener(new MenuAL());
        bt5.addActionListener(new MenuAL());

    }
    class MenuAL implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            JButton b = (JButton) e.getSource();
            DormManager DM = (DormManager) getTopLevelAncestor();



            Object[]option={"확인"};
            if (b.getText().equals("외박 신청")) {

                JOptionPane.showOptionDialog(null, "외박 신청화면으로 이동합니다.", "확인",JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,null,option,option[0]);
                DM.viewP(new ManageTab());


            } if (b.getText().equals("애로사항 등록")) {
                JOptionPane.showOptionDialog(null, "애로사항 등록화면으로 이동합니다.", "확인",JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,null,option,option[0]);

                //DM.viewP(new EditPanel());
            } if (b.getText().equals("로그아웃")) {
                System.out.println("프로그램을 종료합니다.");
                JOptionPane.showOptionDialog(null, "프로그램을 종료합니다.", "확인",JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,null,option,option[0]);

                new Logout();
            }
        }
    }
}
