package testingCheckbox;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class CheckboxFrame extends JFrame {

    private JTextField textField;
    private JCheckBox boldJcheckBox;
    private JCheckBox italicJcheckBox;

    public CheckboxFrame(){
        super("JCheckbox Test Ishan");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout(FlowLayout.CENTER));
        setSize(400,400);

        textField = new JTextField("Watch the font style change",20);
        textField.setFont(new Font("Serif",Font.PLAIN,14));
        add(textField);

        boldJcheckBox=new JCheckBox("Bold");
        italicJcheckBox= new JCheckBox("Italic");
        add(boldJcheckBox);
        add(italicJcheckBox);

        CheckBoxHandler handler = new CheckBoxHandler();
        boldJcheckBox.addItemListener(handler);
        italicJcheckBox.addItemListener(handler);
    }

    private class CheckBoxHandler implements ItemListener{
        public void itemStateChanged(ItemEvent event){
            Font font = null;
            if(boldJcheckBox.isSelected() && italicJcheckBox.isSelected())
                font = new Font("Serif", Font.BOLD + Font.ITALIC,14);
            else if (boldJcheckBox.isSelected()) {
                font = new Font("Serif", Font.BOLD,14);
            } else if (italicJcheckBox.isSelected()) {
                font = new Font("Serif", Font.ITALIC,14);
            }
            else
                font = new Font("Serif", Font.PLAIN,14);
            textField.setFont(font);
        }
    }
}
