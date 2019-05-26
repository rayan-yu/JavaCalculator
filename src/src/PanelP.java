//Rayan Yu

package JavaCalculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class PanelP extends JPanel
{
    private Calculator calc;
    private JLabel label;
    private JTextField input1;
    public PanelP()
    {
        setLayout(new GridLayout(3, 2));

        calc = new Calculator();
        add(calc);

        JButton buttonClear = new JButton("Clear");
        buttonClear.addActionListener(new ClearListener());
        add(buttonClear);

        JButton buttonAdd = new JButton("Plus");
        buttonAdd.addActionListener(new AddListener());
        add(buttonAdd);

        JButton buttonSub = new JButton("Minus");
        buttonSub.addActionListener(new SubListener());
        add(buttonSub);

        JButton buttonMult = new JButton("Multiply");
        buttonMult.addActionListener(new MultListener());
        add(buttonMult);

        JButton buttonDiv = new JButton("Divide");
        buttonDiv.addActionListener(new DivListener());
        add(buttonDiv);

    }

    private class ClearListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            calc.clear();
        }
    }

    private class AddListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            calc.calculatePlus();
        }
    }

    private class SubListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            calc.calculateMinus();
        }
    }

    private class MultListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            calc.calculateMultiply();
        }
    }

    private class DivListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            calc.calculateDivide();
        }
    }




}