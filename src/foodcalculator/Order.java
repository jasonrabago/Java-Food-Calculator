package foodcalculator;

import java.awt.event.*;
import java.awt.*;
import javax.swing.event.*;
import javax.swing.*;




public class Order extends JFrame
{
    private BagelPanel bagels;
    private ToppingPanel toppings;
    private CoffeePanel coffee;
    private GreetingPanel banner;
    private JPanel buttonPanel;
    private JButton calButton;
    private JButton exitButton;
    private final double TAX_RATE = 0.08;
    
    
    
    public Order()
    {
    
    setTitle("Order Calculator");
    
    
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    
    setLayout(new BorderLayout());
    
    
    banner = new GreetingPanel();
    bagels = new BagelPanel();
    toppings = new ToppingPanel();
    coffee = new CoffeePanel();
    
    
    buildButtonPanel();
    
    
    add(banner, BorderLayout.NORTH);
    add(bagels, BorderLayout. WEST);
    add(toppings, BorderLayout.CENTER);
    add(coffee, BorderLayout.EAST);
    add(buttonPanel, BorderLayout.SOUTH);
    
    
    
    pack();
    
    setVisible(true);
    }
    
    
    private void buildButtonPanel()
    {
    buttonPanel = new JPanel();
    
    calButton = new JButton("Calculate");
    exitButton = new JButton("Exit");
    
    calButton.addActionListener(new CalButtonListener());
    exitButton.addActionListener(new ExitButtonListener());
    
    buttonPanel.add(calButton);
    buttonPanel.add(exitButton);
    
     }
    
    
    private class CalButtonListener implements ActionListener
    {
    
    
    public void actionPerformed(ActionEvent e)
         
    {
    double subtotal, tax, total;
    
    subtotal = bagels.getBagelCost() +
            toppings.getToppingCost() +
            coffee.getCoffeeCost();
    
    
    tax = subtotal * TAX_RATE;
    
    
    total = subtotal + tax;
    
    
    JOptionPane.showMessageDialog(null, 
            String.format("Subtotal: $%, .2f\n" +
                    "Tax: $%, .2f\n" +
                    "Total: $%, .2f",
                    subtotal, tax, total));
    
    
    }
  
    }
    
    
    private class ExitButtonListener implements ActionListener
    {
    
    public void actionPerformed(ActionEvent e)
    {
    System.exit(0);
    }
    }
    
    
    
    
}
