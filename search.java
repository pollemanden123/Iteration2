import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class search implements ActionListener {

    // Development of a GUI:
    JTextField tf1,tf3;
    JButton b1, b2;
    search(){
        JFrame gui1 = new JFrame("Search");

        JLabel txtLabel1 = new JLabel("Velkommen - Her kan du fremsøge en patient:");
        txtLabel1.setLocation(5,0);
        txtLabel1.setSize(400,20);
        gui1.add(txtLabel1);

        JLabel txtLabel2 = new JLabel("- Angiv venligst et CPR-nr:");
        txtLabel2.setLocation(5,30);
        txtLabel2.setSize(400,15);
        gui1.add(txtLabel2);

        JLabel txtLabel4 = new JLabel("Fremsøgte patient:");
        txtLabel4.setLocation(15,82);
        txtLabel4.setSize(400,15);
        gui1.add(txtLabel4);

        tf1 = new JTextField();
        tf1.setBounds(15,50,170,20);

        tf3 = new JTextField();
        tf3.setBounds(15,100,255,20);
        tf3.setEditable(false);

        b1 = new JButton("Søg");
        b1.setBounds(200,50,70,20);
        b1.addActionListener(this);

        b2 = new JButton("Videre");
        b2.setBounds(105,130,80,20);
        b2.addActionListener(this);

        gui1.add(tf1);gui1.add(tf3);gui1.add(b1);gui1.add(b2);
        gui1.setSize(300,200);
        gui1.setLayout(null);
        gui1.setVisible(true);
        gui1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent e) {
        // Extracting the user-input:
        String search = tf1.getText();

        // String-objects of certain patients:
        String patient1 = "Paul Petersen";
        String patient2 = "Lars Andersen";
        String patient3 = "Marie Larsen";

        // Integer-objects of certain CPR-nr:
        String cpr1 = "0102551123";
        String cpr2 = "0103773325";
        String cpr3 = "0201771222";

        // ArrayList to hold the patients name:
        ArrayList<String> patients = new ArrayList<>();

        // ArrayList to hold the patients CPR:
        ArrayList<String> cpr = new ArrayList<>();

        // Adding of the patients to 'patients':
        patients.add(patient1);
        patients.add(patient2);
        patients.add(patient3);

        // Adding of the CPR to 'patientscpr':
        cpr.add(cpr1);
        cpr.add(cpr2);
        cpr.add(cpr3);

        // If-statement to check, whether a patient is registered with the specific CPR-nr.:
        if(cpr.contains(search)) {
            int index = cpr.indexOf(search);
            tf3.setText(patients.get(index));
        } else {
            tf3.setText("Intet resultat - Prøv igen");
        }
    }
    public static void main(String[] args) {
        new search();
    }
}

