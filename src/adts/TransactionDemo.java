package adts;

public class TransactionDemo {
    public static void main(String[] args) {
        Transaction tr1 = new Transaction("Ardi", new Date(23, 11, 2006), 1000);
        Transaction tr2 = new Transaction("Mirlindi", new Date(7, 6, 2007), 1000);
        Transaction tr3 = new Transaction("Ardi", new Date(23, 11, 2006), 1000);
        Transaction tr4 = tr1;

        System.out.println(tr1 == tr3);

        System.out.println((tr1 == tr1));
        System.out.println(tr4 == tr1);


        if (tr1.compareTo(tr2) > 0) {
            System.out.println("Ardi ose ka me shume vlere, ose date me te madhe ose emri i tij eshte me i madh se Mirlindi");
        } else if (tr1.compareTo(tr2) < 0) {
            System.out.println("Mirlindi ose ka me shume vlere, ose date me te madhe ose emri i tij eshte me i madh se Ardi");
        } else {
            System.out.println("Ardi eshte i njejte me Mirlindin");
        }


        Character ch = 'A';
        Character ch1 = 'B';

        if (ch.compareTo(ch1)>0) {

        }









    }
}
