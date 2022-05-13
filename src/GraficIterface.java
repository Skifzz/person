import java.awt.*;
import model.*;
import model.Profession.*;
import java.awt.event.*;
import javax.swing.*;

public class GraficIterface extends JFrame {

        private JButton button = new JButton("Start");
        private JTextField field = new JTextField("", 5);
        private JLabel label = new JLabel("Enter the name");
        public GraficIterface (){
            super("Party Info");
            this.setBounds(100, 100, 250, 100);
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            Container container = this.getContentPane();
            container.setLayout(new GridLayout(3, 3, 2, 2));
            container.add(label);
            container.add(field);

            button.addActionListener(new ButtonEventListener());
            container.add(button);

        }
        class ButtonEventListener implements ActionListener{
            public void actionPerformed (ActionEvent e){
                String message = "";
                message += "Вы ввели - " + field.getText() + "\n";
                message +=  "Вы - " + field.getText();
                JOptionPane.showMessageDialog(null, message, "Output", JOptionPane.PLAIN_MESSAGE);

            }

    }
}
