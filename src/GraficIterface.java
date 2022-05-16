import java.awt.*;

import com.sun.jdi.connect.Connector;
import model.*;
import model.Profession.*;
import java.awt.event.*;
import javax.swing.*;

public class GraficIterface extends JFrame {

        private JButton button = new JButton("Start");
        private JTextField field = new JTextField("", 5);
        private JLabel label = new JLabel("Enter the name");
        private JRadioButton Destr = new JRadioButton("Destroer");
        private JRadioButton SHE = new JRadioButton("Shilien Elder");
        private JRadioButton SHK = new JRadioButton("Shilien Knight");
        private JRadioButton SS = new JRadioButton("Spell Singer");
        private JRadioButton Warc = new JRadioButton("Warcraer");
        private JCheckBox check = new JCheckBox("wtf", false);
        public GraficIterface (){
            super("Party Info");
            this.setBounds(1, 1, 200, 800);
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            Container container = this.getContentPane();
            container.setLayout(new GridLayout(20, 1, 2, 2));
            container.add(label);
            container.add(field);
                ButtonGroup group = new ButtonGroup();
                group.add(Destr);
                group.add(Warc);
                group.add(SHE);
                group.add(SHK);
                group.add(SS);
            container.add(Destr);
            container.add(Warc);
            container.add(SHE);
            container.add(SHK);
            container.add(SS);
            container.add(check);

            button.addActionListener(new ButtonEventListener());
            container.add(button);


        }
        class ButtonEventListener implements ActionListener{
            public void actionPerformed (ActionEvent e){
                Destroer destroer = new Destroer();
                destroer.setDestr();
                SpellSinger spellSinger = new SpellSinger();
                spellSinger.setSs();
                Warcraer warcraer = new Warcraer();
                warcraer.setWarc();
                ShilienKnight shilienKnight = new ShilienKnight();
                shilienKnight.setSk();
                ShilienElder shilienElder = new ShilienElder();
                shilienElder.setShe();
                String name = field.getText();
                String message = "Name is: " + name +" \n";
                message += "You choosed: " +
                        (Destr.isSelected() ? Destr.getText() : "")  +
                        (SS.isSelected() ? SS.getText() : "") +
                        (Warc.isSelected() ? Warc.getText() : "") +
                        (SHK.isSelected() ? SHK.getText() : "") +
                        (SHE.isSelected() ? SHE.getText() : "") +
                        " \n";

                message += (Destr.isSelected() ? destroer.getDestr() : "");
                message +=(SS.isSelected() ? spellSinger.getSs() : "");
                message += (Warc.isSelected() ? warcraer.getWarc() : "");
                message += (SHK.isSelected() ? shilienKnight.getSk() : "");
                message += (SHE.isSelected() ? shilienElder.getShe() : "");

                JOptionPane.showMessageDialog(null, message, "Output", JOptionPane.PLAIN_MESSAGE);

            }

    }
}
