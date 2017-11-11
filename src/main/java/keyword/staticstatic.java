package keyword;

public class staticstatic {
    private static String str1 = "staticProperty";
    private String str2 = "property";

    public staticstatic(){}

    public void print1() {
        System.out.println(str1);
        System.out.println(str2);
        print2();
    }

    public static void print2(){
        System.out.println(str1);
//        System.out.print(str2);
//        print1();
    }
}
