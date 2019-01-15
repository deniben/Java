public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(repeatStr(5, "Lolo"));
    }

    public static String repeatStr(final int repeat, final String string) {
        String strings = "";
        for (int i =0; i < repeat; i++){
            strings += string;
        }
        return strings;
    }
}
class A{
    public static final int B = 1;
    public void method1(){};
}
