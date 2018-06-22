package foodcalculator;

import java.awt.event.*;
import java.awt.*;
import javax.swing.event.*;
import javax.swing.*;


public class BagelPanel extends JPanel {
    
    public final double WHITE_BAGEL= 1.25;
    public final double WHEAT_BAGEL= 1.50;
    
    private JRadioButton whitebagel;
    private JRadioButton wheatbagel;
    private ButtonGroup bg;
    
    public BagelPanel()
    {
    setLayout(new GridLayout(2,1));
    
    whitebagel = new JRadioButton("White", true);
    wheatbagel = new JRadioButton("Wheat");
    
    bg= new ButtonGroup();
    bg.add(whitebagel);
    bg.add(wheatbagel);
    
    setBorder(BorderFactory.createTitledBorder("Bagel"));
    
    add(whitebagel);
    add(wheatbagel);
    }
    
    public double getBagelCost()
    {
double bagelCost = 0.0;
if (whitebagel.isSelected())
    bagelCost = WHITE_BAGEL;

else
    bagelCost = WHEAT_BAGEL;

return bagelCost;
        
    
    
    
    
    
    }   
    
    
            
    

}
