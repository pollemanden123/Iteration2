import java.util.ArrayList;

public class searchFunc {
    public String ser(String search) {

        String patient1 = "Paul Petersen";
        String patient2 = "Lars Andersen";
        String patient3 = "Marie Larsen";

        String cpr1 = "0102551123";
        String cpr2 = "0103773325";
        String cpr3 = "0201771222";

        ArrayList<String> patients = new ArrayList<>();

        ArrayList<String> cpr = new ArrayList<>();

        patients.add(patient1);
        patients.add(patient2);
        patients.add(patient3);

        cpr.add(cpr1);
        cpr.add(cpr2);
        cpr.add(cpr3);


        if(cpr.contains(search)) {
            int index = cpr.indexOf(search);
            String result = (patients.get(index));
            return result;

        } else {
            String result = ("Intet resultat - Prøv igen");
            return result;
        }
    }
}