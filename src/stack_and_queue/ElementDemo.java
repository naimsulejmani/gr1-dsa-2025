package stack_and_queue;

public class ElementDemo {
    public static void main(String[] args) {
        Element<Integer> nr1 = new Element<>(10, null);
        nr1.setData(30);
        Element<String> str1 = new Element<>("10", null);
        str1.setData("30");
        Element<Person> pers1 = new Element<>(new Person(), null);
        pers1.setData(new Person());

        Test<Integer,Double,String,Float> t1 = new Test<>();
    }
}
