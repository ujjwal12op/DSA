public class Strings {
    public static void main(String[] args) {
        String name = "ujjwal";
        System.out.println(name);
        name.concat("tiwari");
        System.out.println(name);


        StringBuilder name1 = new StringBuilder("Ujjwal");
        System.out.println(name1);
        name1.append("tiwari");
        System.out.println(name1);


        // String kaise banate hai?

        // Inside String constant pool, duplicates allowed.

        String s1 = "Ujjwal";
        String s2 = "Ujjwal";
        System.out.println(s1==s2);

        // Inside heap area.

        String s3 = new String("Ujjwal");
        String s4 = new String("Ujjwal");
        System.out.println(s3==s4);

    }
}
