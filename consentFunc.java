public class consentFunc {
    public String ser1(String search) {

        String accept = "ja";

        String decline = "nej";

        if (accept.equals(search)) {
            String result = "Du har afgivet dit samtykke";
            return result;
        } else {
            if (decline.equals(search)) {
                String result = "Du har IKKE afgivet dit samtykke";
                return result;
            } else {
                String result = "Fejl - Angiv venligst Ja eller Nej";
                return result;
            }
        }
    }
}
