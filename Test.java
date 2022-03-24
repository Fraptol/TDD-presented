class Test {
    static String greet="Hello, "       ;
    static String unknown="my friend"   ;
    static String and=", and "          ;
    public static void Try() {
        String greetings =          "The note says: first run"  ;
        assert greetings.matches(   "The note says: first run"  );
        System.out.println("Welcome to testing!"                );
    }
    //1
    public static void TestHello1() {
        String greetings =          greet+unknown+"."   ;
        System.out.println(         "Koszones 1...")    ;
        assert greetings.matches(   "Hello my friend."  );
        assert greetings.matches(   Print.sayHello());
    }
    //2
    public static void TestHello2_a() {
        String greetings =          greet+"Bob"+"."             ;
        System.out.println(         "Koszones nev szerint..."   );
        assert greetings.matches(   Print.sayHello("Bob")       );
    }
    //3
    public static void TestHello3_aaa(){
        String greetings =          greet+"Alice, Bob"+and+"Jerry."   ;
        System.out.println(         "3 koszones nev szerint..."       );
        assert greetings.matches(   Print.sayHello("Alice Bob Jerry"));
    }
    }        
}
//Laying the groundworks,
//Making sure it works,
//Refractoring until everything is up to step.
