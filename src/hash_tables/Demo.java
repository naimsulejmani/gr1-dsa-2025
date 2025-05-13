package hash_tables;

import java.time.LocalDate;

public class Demo {
    public static void main(String[] args) {
        Object object1 = 10;
        System.out.println(object1.hashCode());
        Object object2 = "Naim";
        System.out.println(object2.hashCode());
        Object object3 = LocalDate.now();
        Object demo = new Demo();
        Integer nr = 10;
        Double nr1 = 20.2;
        Boolean bool = true;
        String str = "Naim";
        System.out.println(str.hashCode());
        System.out.println("naim".hashCode());
        System.out.println("adea".hashCode());
        System.out.println("edona".hashCode());
        System.out.println("mirlind".hashCode());

        double value = 1;
        System.out.println(value);
        value-=0.1;
        System.out.println(value);
        value -=0.1;
        System.out.println(value);
        value -=0.1;
        System.out.println(value);
        value -=0.1;
        System.out.println(value);
        value -=0.1;
        System.out.println(value);



    }
}












