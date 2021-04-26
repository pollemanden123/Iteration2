import javax.swing.*;

public class consultPatientNew{

    public JPanel createContentPane(){

        JPanel newGUI = new JPanel();
        newGUI.setLayout(null);

        JPanel titlePanel = new JPanel();
        titlePanel.setLayout(null);
        titlePanel.setLocation(0,60);
        titlePanel.setSize(300, 0);
        newGUI.add(titlePanel);

        JLabel introLabel = new JLabel("Velkommen - Du har fremsøgt: ");
        introLabel.setLocation(0,10);
        introLabel.setSize(200, 20);
        introLabel.setHorizontalAlignment(0);
        newGUI.add(introLabel);

        // Højre del af vinduet:
        JLabel navnLabel = new JLabel("Navn: ");
        navnLabel.setLocation(5,35);
        navnLabel.setSize(40, 20);
        navnLabel.setHorizontalAlignment(0);
        newGUI.add(navnLabel);

        JTextField navnTextField= new JTextField();
        navnTextField.setBounds(55,35,150,20);
        navnTextField.setEditable(false);
        navnTextField.setText("Anders Andersen");
        newGUI.add(navnTextField);

        JLabel cprLabel = new JLabel("CPR: ");
        cprLabel.setLocation(5,60);
        cprLabel.setSize(35, 20);
        cprLabel.setHorizontalAlignment(0);
        newGUI.add(cprLabel);

        JTextField cprTextField= new JTextField();
        cprTextField.setBounds(55,60,150,20);
        cprTextField.setEditable(false);
        cprTextField.setText("112233-4455");
        newGUI.add(cprTextField);

        // Venstre del af vinduet:
        JLabel postnrLabel = new JLabel("Postnr.: ");
        postnrLabel.setLocation(215,35);
        postnrLabel.setSize(55, 20);
        postnrLabel.setHorizontalAlignment(0);
        newGUI.add(postnrLabel);

        JTextField postnrTextField= new JTextField();
        postnrTextField.setBounds(270,35,150,20);
        postnrTextField.setEditable(false);
        postnrTextField.setText("1111");
        newGUI.add(postnrTextField);

        JLabel variantLabel = new JLabel("Variant: ");
        variantLabel.setLocation(213,60);
        variantLabel.setSize(55, 20);
        variantLabel.setHorizontalAlignment(0);
        newGUI.add(variantLabel);

        JTextField variantTextField= new JTextField();
        variantTextField.setBounds(270,60,150,20);
        variantTextField.setEditable(false);
        variantTextField.setText("Generisk");
        newGUI.add(variantTextField);

        // Samtykkestatus

        JLabel samstatusLabel = new JLabel("Den fremsøgte borgers samtykkestatus: ");
        samstatusLabel.setLocation(0,125);
        samstatusLabel.setSize(250, 20);
        samstatusLabel.setHorizontalAlignment(0);
        newGUI.add(samstatusLabel);

        JTextField samstatusTextField= new JTextField();
        samstatusTextField.setBounds(100,155,230,20);
        samstatusTextField.setEditable(false);
        samstatusTextField.setText("Borgeren har IKKE afgivet sit samtykke");
        newGUI.add(samstatusTextField);

        // Adgang til Geodata og Sensordata

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(null);
        buttonPanel.setLocation(100, 190);
        buttonPanel.setSize(250, 70);
        newGUI.add(buttonPanel);

        JButton dataButton = new JButton("Sensordata");
        dataButton.setLocation(0, 0);
        dataButton.setSize(110, 30);
        dataButton.setEnabled(false);
        buttonPanel.add(dataButton);

        JButton geoButton = new JButton("Geolokation");
        geoButton.setLocation(120, 0);
        geoButton.setSize(110, 30);
        geoButton.setEnabled(false);
        buttonPanel.add(geoButton);

        newGUI.setOpaque(true);
        return newGUI;
    }
    private static void createAndShowGUI() {

        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame frame = new JFrame("CoronaNet - Konsultation");

        //Create and set up the content pane.
        consultPatientNew demo = new consultPatientNew();
        frame.setContentPane(demo.createContentPane());

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(450, 270);
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        SwingUtilities.invokeLater(consultPatientNew::createAndShowGUI)
        ;}
}

