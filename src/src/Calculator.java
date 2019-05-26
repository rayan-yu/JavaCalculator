//Rayan Yu

package JavaCalculator;

import javax.swing.*;
import java.awt.*;
public class Calculator extends JPanel
{
    private JLabel equals;
    private JTextField input1, input2;
    public Calculator()
    {
        setLayout(new GridLayout(3, 2));

        add(new JLabel("Term 1:", SwingConstants.LEFT));
        add(new JLabel("Term 2:", SwingConstants.LEFT));

        input1 = new JTextField("", 10);
        input1.setHorizontalAlignment(SwingConstants.LEFT);
        add(input1);

        input2 = new JTextField("", 10);
        input2.setHorizontalAlignment(SwingConstants.LEFT);
        add(input2);

        add(new JLabel("=", SwingConstants.CENTER));
        equals = new JLabel("0.0");
        equals.setFont(new Font("Times New Roman", Font.BOLD, 15));
        equals.setForeground(Color.black);
        add(equals);

    }

    public void clear()
    {
        input1.setText("0.0");
        input2.setText("0.0");
        equals.setText("0.0");
    }

    public void calculatePlus()
    {
        double terma = Double.parseDouble(input1.getText());
        double termb = Double.parseDouble(input2.getText());

        double termc = terma + termb;

        equals.setText("" + termc);
    }

    public void calculateMinus()
    {
        double terma = Double.parseDouble(input1.getText());
        double termb = Double.parseDouble(input2.getText());

        double termc = terma - termb;

        equals.setText("" + termc);
    }

    public void calculateMultiply()
    {
        double terma = Double.parseDouble(input1.getText());
        double termb = Double.parseDouble(input2.getText());

        double termc = terma * termb;

        equals.setText("" + termc);
    }

    public void calculateDivide()
    {
        double terma = Double.parseDouble(input1.getText());
        double termb = Double.parseDouble(input2.getText());

        double termc = terma / termb;

        equals.setText("" + termc);
    }
}