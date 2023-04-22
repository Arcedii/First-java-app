import javax.swing.*;
import java.awt.*;

public class ContactsForm extends JFrame {
      public ContactsForm() {
          super("Регистрация Bitch");
          super.setBounds(200, 100, 250, 100);
          super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

          Container container = super.getContentPane();
          container.setLayout(new GridLayout(3, 2, 2, 2));
      }
}
