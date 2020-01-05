import java.awt.*;
import javax.swing.*;

public class Crisis extends JFrame {
    JButton panicButton;
    JButton dontPanicButton;
    JButton blameButton;
    JButton mediaButton;
    JButton saveButton;
    
    public Crisis() {
        super("Crisis");
        setLookAndFeel();
        setSize(38, 128);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        FlowLayout flo = new FlowLayout();
//        setLayout(flo);
//        GridLayout gr = new GridLayout(2, 3);
//        setLayout(gr);
//        BorderLayout bl = new BorderLayout(23, 45);
//        setLayout(bl);
        panicButton = new JButton("panic");
        dontPanicButton = new JButton("Don't Panic");
        blameButton = new JButton("Blame Others");
        mediaButton = new JButton("Notify the Media");
        saveButton = new JButton("Save Yourself");
        JPanel pane = new JPanel();
        BoxLayout box = new BoxLayout(pane, BoxLayout.Y_AXIS);
        pane.add(panicButton);
        pane.add(dontPanicButton);
        pane.add(blameButton);
        pane.add(mediaButton);
        pane.add(saveButton);
        add(pane);
//        add(panicButton);
//        add(dontPanicButton);
//        add(blameButton);
//        add(mediaButton);
//        add(saveButton);
//        add(panicButton, BorderLayout.NORTH);
//        add(dontPanicButton, BorderLayout.SOUTH);
//        add(blameButton, BorderLayout.EAST);
//        add(mediaButton, BorderLayout.WEST);
//        add(saveButton, BorderLayout.CENTER);
        setVisible(true);
    }
    
    private void setLookAndFeel() {
        try {
            UIManager.setLookAndFeel(
                    "com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel"
            );
        } catch (Exception exc){
            // ignore error
        }
    }
    
    public static void main(String[] arguments) {
        Crisis cr = new Crisis();
    }
}
