package StringsAndStringBuilder;

public class StringsInitial {
    public static void main(String[] args) {
        String a = "Hello";
        String b = "Hello";
        System.out.println(a);
        System.out.println(b);
        a = "Hello1";
        System.out.println(a);
        String h = new String("name");
        String q = new String("name");
        System.out.println(h == q);
        System.out.println(h.equals(q));
        float v = 1223.121f;
        System.out.printf("Formatted number is %.2f\n",v);
        System.out.println(Math.PI);
        System.out.printf("Formatted %n number : %2f\n", Math.PI);
        System.out.printf("%s %s","Clint","Clins");
    }
}
