package Day33_StringBuilder;

public class Topic1_HA_StringBuilder {
    public static void main(String[] args) {
        String MyString = "Hello";

        MyString = MyString +" World";
        System.out.println(MyString);

        for (int i = 1; i <=10 ; i++) {
            MyString = "This is the line";
            MyString = MyString + i;
            System.out.println(MyString);
        }

        // DataType VariableName = new DataType()
        StringBuffer SF = new StringBuffer();

        SF.append("Hello");
        System.out.println(SF);

        SF.append(" World");
        System.out.println(SF);

        // String is Immutable and Thread-Safe
        // String Buffer is Mutable and Thread-Safe.
        // String Builder is Mutable and not Thread-Safe

        StringBuilder SB = new StringBuilder();
        System.out.println("*****************");
        SB.append("Hello");
        SB.append(" World");
        System.out.println(SB);
        // Hello World
        // HeJavallo World

        SB.insert(2,"Java");
        System.out.println(SB);

        // HeJavallo World
        // HeJavaWhat World

        SB.replace(6,9, "What");
        System.out.println(SB);

        // HeJavaWhat World
        // HeJavaWhat rld
        SB.delete(11,13);
        System.out.println(SB);

        SB.reverse();
        System.out.println(SB);

        //dlr tahWavaJeH
        int position = SB.indexOf("avaJ");
        System.out.println(position);

        //dlr tahWavaJeH
        System.out.println(SB.charAt(5));




    }
}
