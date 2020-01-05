import javax.swing.*;
import java.awt.*;
//import java.util.*;

public class SalutonFrame extends JFrame {
    public SalutonFrame (){
        super("JFrame Framework");
        setLookAndFeel();
        setSize(350, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        JButton okButton = new JButton("点我干哈？");
//        JLabel jl = new JLabel("猜猜我是啥");
////        this.add(okButton);
//        add(okButton);
//        add(jl);
        JCheckBox jumboSize = new JCheckBox("Jumbo Size");
//        FlowLayout flo = new FlowLayout();
        JCheckBox frogLegs = new JCheckBox("Frog Leg Grande", true);
        JCheckBox fishTacos = new JCheckBox("Fish Taco Platter", false);
        JCheckBox emuNuggets = new JCheckBox("Emu Nuggets", false);
        FlowLayout flo = new FlowLayout();
        ButtonGroup meals = new ButtonGroup();
        meals.add(frogLegs);
        meals.add(fishTacos);
        meals.add(emuNuggets);
        setLayout(flo);
//        add(jumboSize);
//        add(frogLegs);
//        add(fishTacos);
//        add(emuNuggets);
        
        JComboBox profession = new JComboBox();
        profession.addItem("Butcher");
        profession.addItem("Baker");
        profession.addItem("Candlestick maker");
        profession.addItem("Fletcher");
        profession.addItem("Fighter");
        profession.addItem("Technical writer");
        profession.setEditable(true);
        
        JTextArea comments = new JTextArea("Saluton Mondo!",8, 40);
        setLayout(flo);
        add(comments);
        
//        add(profession);
        
        
        setVisible(true);
        
        
    }
    
    private void setLookAndFeel() {
        try {
            UIManager.setLookAndFeel(
         "com.sun.java.swing.plafnimbus.NimbusLookAndFeel"
            ) ;
        } catch (Exception exc) {
        // ignore error
        }
    }
    
    public static void main(String[] arguments) {
        SalutonFrame sal = new SalutonFrame();
//        sal.setLookAndFeel();
        JButton okButton = new JButton("ok");
//        sal.add(okButton);
    }
}
