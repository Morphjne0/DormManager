import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Login extends JFrame {

        private JPanel loginPanel = new JPanel(new GridLayout(4, 2,20,10));

                JPanel BP = new JPanel(new BorderLayout());

        private JLabel idLabel = new JLabel("아이디 ");

        private JTextField idText = new JTextField();

        private JLabel pwLabel = new JLabel("비밀번호 ");

        private JPasswordField pwText = new JPasswordField();

        private JButton loginBtn = new JButton("로그인");
                JLabel trash = new JLabel(" ");
                JPanel t1 = new JPanel();

                JPanel test1 = new JPanel(new BorderLayout());
                JPanel test2 = new JPanel(new GridLayout(2,1));
                ImageIcon img = new ImageIcon("img/symbol.png");
                JLabel logo = new JLabel(img);
                //JButton bt1 = new JButton("로그인");
        public Login() {

            super("로그인 창!");


            this.setContentPane(test1);
            t1.setLayout(null);
            test1.add(test2,BorderLayout.CENTER);

            test2.add(logo);

            test2.add(BP);
            //BP.add(loginPanel,BorderLayout.CENTER);
            BP.add(t1,BorderLayout.CENTER);

            idLabel.setBounds(50,50,100,25);
            idText.setBounds(130,50,130,25);
            pwLabel.setBounds(50,90,100,25);
            pwText.setBounds(130,90,130,25);
            loginBtn.setBounds(270,120,70,30);

//            idLabel.setBounds(13,50,100,25);        // 오른쪽 로그인쓸거면
//            idText.setBounds(110,50,150,25);
//            pwLabel.setBounds(13,90,100,25);
//            pwText.setBounds(110,90,150,25);
//            bt1.setBounds(285,50,70,63);

            t1.add(bt1);
            t1.add(idLabel);
            t1.add(idText);
            t1.add(pwLabel);
            t1.add(pwText);


//라벨 가운데 정렬

            idLabel.setHorizontalAlignment(NORMAL);

            pwLabel.setHorizontalAlignment(NORMAL);


//현재 프레임 창 가운데 정렬 setSize를 먼저 해주어야 정상적으로 프레임이 가운데 정렬이 됨!

            setSize(400,500);

            this.setLocationRelativeTo(null);

            this.setVisible(true);

            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

//로그인 버튼을 눌렀을때

            loginBtn.addActionListener(new ActionListener() {

                public void actionPerformed(ActionEvent e) {


//아이디 비번 확인 테스트 코드

                    String id = idText.getText().trim();

                    String pw = pwText.getText().trim();


                    if(id.length()==0 || pw.length()==0) {

                        JOptionPane.showMessageDialog(null, "아이디 또는 비밀번호를 입력하십시오.", "오류!", JOptionPane.DEFAULT_OPTION);

                        return;

                    }


                    if(id.equals("admin") && pw.equals("1234")) {

                        JOptionPane.showMessageDialog(null, "로그인 성공", "로그인 확인!", JOptionPane.DEFAULT_OPTION);

                        return;

                    }


                    JOptionPane.showMessageDialog(null, "로그인 실패", "로그인 확인!", JOptionPane.DEFAULT_OPTION);

                }

            });


//아이디 비밀번호 찾기 버튼을 눌렀을때



        }

        public static void main(String[] args) {

            new Login();

        }

    }

