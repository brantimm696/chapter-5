package DeBugging;

import javax.swing.*;
import javax.swing.*;

public class DebuggingFive4 {//


    public class FixDebugFive4
    {
        public void main(String[] args)
        {
            int one;
            int two;
            int three;
            int four;
            String str;
            String output;
            str = JOptionPane.showInputDialog(null,"Enter an integer");
            one = Integer.parseInt(str);
            str = JOptionPane.showInputDialog(null,"Enter an integer");
            two = Integer.parseInt(str);
            str = JOptionPane.showInputDialog(null,"Enter an integer");
            three = Integer.parseInt(str);
            str = JOptionPane.showInputDialog(null,"Enter an integer");
            four = Integer.parseInt(str);
            if(one > two & one > three & one > four)
            output = "Highest is " + one;

            if(two > one & two > three && two > four)
            output =("Highest is %d" + two);

            if (three <= one || three <= two || three <= four) output = "Highest is " + four;
            else {
                output = "Highest is " + three;
            }
            JOptionPane.showMessageDialog(null, output);
        }
    }

}
