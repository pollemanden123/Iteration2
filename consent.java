import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class consent implements ActionListener {

    // Development of a GUI:
    JTextField tf1,tf3;
    JButton b1, b2;
    public consent(){
        JFrame gui2 = new JFrame("Consent");

        JLabel txtLabel1 = new JLabel("Velkommen - Her kan du afgive dit samtykke:");
        txtLabel1.setLocation(5,0);
        txtLabel1.setSize(400,20);
        gui2.add(txtLabel1);

        JLabel txtLabel2 = new JLabel("- Angiv venligst ja eller nej:");
        txtLabel2.setLocation(10,30);
        txtLabel2.setSize(400,15);
        gui2.add(txtLabel2);

        JLabel txtLabel4 = new JLabel("Status på samtykke:");
        txtLabel4.setLocation(15,82);
        txtLabel4.setSize(400,15);
        gui2.add(txtLabel4);

        tf1 = new JTextField();
        tf1.setBounds(15,50,170,20);

        tf3 = new JTextField();
        tf3.setBounds(15,100,255,20);
        tf3.setEditable(false);

        b1 = new JButton("OK");
        b1.setBounds(200,50,70,20);
        b1.addActionListener(this);

        b2 = new JButton("Videre");
        b2.setBounds(105,130,80,20);
        b2.addActionListener(this);

        gui2.add(tf1);gui2.add(tf3);gui2.add(b1);gui2.add(b2);
        gui2.setSize(300,200);
        gui2.setLayout(null);
        gui2.setVisible(true);
        gui2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent e) {
        // Extracting the user-input:
        String search = tf1.getText().toLowerCase();

        System.out.println(search);
        // String-objects of certain patients:
        String accept = "ja";

        // Integer-objects of certain CPR-nr:
        String decline = "nej";

        // If-statement to check, whether a patient is registered with the specific CPR-nr.:
        if(accept.equals(search)) {
            tf3.setText("Du har afgivet dit samtykke");
        } else {
            if (decline.equals(search)) {
                tf3.setText("Du har IKKE afgivet dit samtykke");
            } else {
                tf3.setText("Fejl - Angiv venligst Ja eller Nej");
            }
        }
    }
    public static void main(String[] args) {
        new consent();
    }
}

