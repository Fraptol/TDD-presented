
public class Print {
    static String greet="Hello, ";
    static String unknown="my friend";

    public static String sayHello(String names[])
    {
        if (names.length<0){            //return if no name
            return greet+unknown+".";
        }
            return greet+names[0]+".";  //return if 1 name
    }
}
