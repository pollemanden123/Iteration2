import javax.swing.*;

public class consultation {

    consultation() {

        JFrame gui3 = new JFrame("Consultation");

        JPanel content = new JPanel();
        content.setLayout(null);

        JPanel titlePanel = new JPanel();
        titlePanel.setLayout(null);
        titlePanel.setLocation(0, 60);
        titlePanel.setSize(300, 0);
        content.add(titlePanel);

        JLabel introLabel = new JLabel("Velkommen - Du har fremsøgt: ");
        introLabel.setLocation(0, 10);
        introLabel.setSize(200, 20);
        introLabel.setHorizontalAlignment(0);
        content.add(introLabel);

        // Højre del af vinduet:
        JLabel navnLabel = new JLabel("Navn: ");
        navnLabel.setLocation(5, 35);
        navnLabel.setSize(40, 20);
        navnLabel.setHorizontalAlignment(0);
        content.add(navnLabel);

        JTextField navnTextField = new JTextField();
        navnTextField.setBounds(55, 35, 150, 20);
        navnTextField.setEditable(false);
        navnTextField.setText("Anders Andersen");
        content.add(navnTextField);

        JLabel cprLabel = new JLabel("CPR: ");
        cprLabel.setLocation(5, 60);
        cprLabel.setSize(35, 20);
        cprLabel.setHorizontalAlignment(0);
        content.add(cprLabel);

        JTextField cprTextField = new JTextField();
        cprTextField.setBounds(55, 60, 150, 20);
        cprTextField.setEditable(false);
        cprTextField.setText("112233-4455");
        content.add(cprTextField);

        // Venstre del af vinduet:
        JLabel postnrLabel = new JLabel("Postnr.: ");
        postnrLabel.setLocation(215, 35);
        postnrLabel.setSize(55, 20);
        postnrLabel.setHorizontalAlignment(0);
        content.add(postnrLabel);

        JTextField postnrTextField = new JTextField();
        postnrTextField.setBounds(270, 35, 150, 20);
        postnrTextField.setEditable(false);
        postnrTextField.setText("1111");
        content.add(postnrTextField);

        JLabel variantLabel = new JLabel("Variant: ");
        variantLabel.setLocation(213, 60);
        variantLabel.setSize(55, 20);
        variantLabel.setHorizontalAlignment(0);
        content.add(variantLabel);

        JTextField variantTextField = new JTextField();
        variantTextField.setBounds(270, 60, 150, 20);
        variantTextField.setEditable(false);
        variantTextField.setText("Generisk");
        content.add(variantTextField);

        // Samtykkestatus

        JLabel samstatusLabel = new JLabel("Den fremsøgte borgers samtykkestatus: ");
        samstatusLabel.setLocation(0, 125);
        samstatusLabel.setSize(250, 20);
        samstatusLabel.setHorizontalAlignment(0);
        content.add(samstatusLabel);

        JTextField samstatusTextField = new JTextField();
        samstatusTextField.setBounds(100, 155, 230, 20);
        samstatusTextField.setEditable(false);
        samstatusTextField.setText("Borgeren har IKKE afgivet sit samtykke");
        content.add(samstatusTextField);

        // Adgang til Geodata og Sensordata

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(null);
        buttonPanel.setLocation(100, 190);
        buttonPanel.setSize(250, 70);
        content.add(buttonPanel);

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


        gui3.add(content);
        gui3.setSize(450, 270);
        gui3.setVisible(true);
        gui3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
    public static void main(String[] args) {
        new consultation();
    }
}
