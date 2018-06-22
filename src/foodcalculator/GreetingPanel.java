
package foodcalculator;

import java.awt.event.*;
import java.awt.*;
import javax.swing.event.*;
import javax.swing.*;


public class GreetingPanel extends JPanel
        
{
    private final JLabel greeting; 

    public GreetingPanel()
    {
    greeting = new JLabel ("Welcome to the Bagel House");
    
    add(greeting);
    }
    
}
