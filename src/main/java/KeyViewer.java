import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.sql.Time;
import java.time.Instant;
import java.util.Calendar;

// 类中含有监听事件时，需要在后面加上 implements 和相应的监听事件类如 KeyListener
public class KeyViewer extends JFrame implements KeyListener {
    JTextField keyText = new JTextField(80);
    JLabel keyLabel = new JLabel("Presss any key in the text field");
    
    KeyViewer() {
        super("KeyViewer");
        setLookAndFeel();
        setSize(350, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        keyText.addKeyListener(this);
        BorderLayout bord = new BorderLayout();
        setLayout(bord);
        add(keyLabel, BorderLayout.NORTH);
        add(keyText, BorderLayout.CENTER);
        setVisible(true);
    }
    
    public void keyTyped(KeyEvent input) {
        char key = input.getKeyChar();
        String gs = input.getSource().toString();
        Object ob = input.getSource();
        Component cop = input.getComponent();
//        int gk = input.getKeyLocation();
        long gw = input.getWhen();
        
//        keyLabel.setText("You pressed " + key);
//        keyLabel.setText("You pressed " + gk);
        keyLabel.setText("You pressed " + gw);
//        keyLabel.setText("You pressed " + gs);
//        keyLabel.setText("You pressed " + ob);
//        keyLabel.setText("You pressed " + cop);
    }
    
    public void keyPressed(KeyEvent txt) {
        // do nothing
    }
    
    public void keyReleased(KeyEvent txt){
        // do nothing
    }
    
    private void setLookAndFeel() {
        try {
            UIManager.setLookAndFeel(
            "com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel"
                );
            }catch (Exception exc) {
                // ignore error
            }
    }
    
    public static void main(String[] arguments) {
        KeyViewer frame = new KeyViewer();
    }
}
