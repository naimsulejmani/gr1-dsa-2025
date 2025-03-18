package recursions;

import java.sql.Statement;
import java.util.Scanner;

public class ShembullHP {
    static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {
        pyetje("JO");
    }

    static void pyetje(String aPoKupton) {
        if (aPoKupton.equalsIgnoreCase("PO")) {
            return;
        }
        System.out.println("Pyetje: A po e kupton? (PO/JO)");
        aPoKupton = reader.nextLine();
        pyetje(aPoKupton);
    }
}







