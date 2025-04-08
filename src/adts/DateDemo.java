package adts;

import java.util.Arrays;

public class DateDemo {
    public static void main(String[] args) {
        Date dtMirlind = new Date(7, 6, 2006);
        Date dtArdi = new Date(23, 11, 2006);

        if (dtMirlind.compareTo(dtArdi) > 0) {
            System.out.println("Mirlindi eshte me i madh se Ardi");
        } else if (dtMirlind.compareTo(dtArdi) < 0) {
            System.out.println("Ardi eshte me i madh se Mirlindi");
        } else {
            System.out.println("Mirlindi eshte i njejte me Ardin");
        }


        Date[] array = {dtMirlind, dtArdi};
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));

    }
}












