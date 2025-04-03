package adts;

import java.util.Scanner;

public class ProceduralAbstraction {
    public static void main(String[] args) {
        String name = readName();
        System.out.println("Hello " + name);
        insertIntoDb(name);
        System.out.println("Informata eshte ruajtuar, dergo email!");

        String test = "Une jam une, e ti je ti, kush jam une!";

        System.out.println(test.indexOf("une"));
        System.out.println(test.indexOf("une",10));

    }

    private static String readName() {
        Scanner reader = new Scanner(System.in);
        return reader.nextLine();
    }

    private static void insertIntoDb(String name) {
        System.out.println("INSERT INTO db....");
    }
}
