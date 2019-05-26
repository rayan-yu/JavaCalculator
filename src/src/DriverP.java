//Rayan Yu

package JavaCalculator;

import javax.swing.JFrame;
public class DriverP
{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame("Project");
        frame.setSize(300, 300);
        frame.setLocation(200, 100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setContentPane(new PanelP());
        frame.setVisible(true);
    }
}