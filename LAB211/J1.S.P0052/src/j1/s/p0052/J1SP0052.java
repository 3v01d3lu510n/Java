package j1.s.p0052;
import java.util.ArrayList;

public class J1SP0052 {

    public static void main(String[] args) {
        ArrayList<Country> lc = new ArrayList<>();
        //loop until user want to exist
        while (true) {
            int choice = ManageEastAsiaCountries.menu();
            switch (choice) {
                case 1:
                    ManageEastAsiaCountries.inputCountry(lc);
                    break;
                case 2:
                    ManageEastAsiaCountries.printCountry(lc);
                    break;
                case 3:
                    ManageEastAsiaCountries.searchByName(lc);
                    break;
                case 4:
                    ManageEastAsiaCountries.printCountrySorted(lc);
                    break;
                case 5:
                    return;
            }
        }
    }
    
}
