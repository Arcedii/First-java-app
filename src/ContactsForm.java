import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ContactsForm extends JFrame {
     JTextField name_field;
     JTextField email_field;
     JRadioButton male, female;
     JCheckBox check;


      public ContactsForm() {
          super("Регистрация Bitch");
          super.setBounds(200, 100, 300, 200);
          super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

          Container container = super.getContentPane();
          container.setLayout(new GridLayout(5, 2, 2, 10));

          JLabel name = new JLabel("Введите имя");
          name_field = new JTextField("",1);

          JLabel email = new JLabel("Введите имя");
          email_field = new JTextField("@",1);

          container.add(name);
          container.add(name_field);
          container.add(email);
          container.add(email_field);


          male = new JRadioButton("Мужской");
          female = new JRadioButton("Женский");
          check = new JCheckBox("Гей?", false);
          JButton sendButton = new JButton("Отправить");


          male.setSelected(true);
          container.add(male);
          container.add(female);
          container.add(check);
          container.add(sendButton);


          ButtonGroup group = new ButtonGroup();
          group.add(male);
          group.add(female);


          sendButton.addActionListener(new ButtonEvent());

      }

      class ButtonEvent implements ActionListener {

          @Override
          public void actionPerformed(ActionEvent e) {
              String name = name_field.getText();
              String email = email_field.getText();

              String isMail = "Мужской";
              if(!male.isSelected()) {
                  isMail = "Женский";
              }

              String isCheck = "Ах тыж пидорюга";
              if(!check.isSelected()) {
                  isCheck = "Молодчик";
              }



              boolean checkBox = check.isSelected();

              JOptionPane.showMessageDialog(null,
                      "Ваша почта :" + email + "\nВаш пол :" + isMail + "\nДа?" + isCheck,
                          "Привет :" + name, JOptionPane.PLAIN_MESSAGE);
          }
      }

}
