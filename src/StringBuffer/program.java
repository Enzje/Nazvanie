package StringBuffer;

public class program {
    public static void main(String[] args) {
        String string1 = "Hello";
        StringBuffer stringBuffer3 = new StringBuffer("Hello");
        int start = 1;
        int end = 3;
        char[] buffer = new char[end - start];
        //stringBuffer.getChars()
        stringBuffer3.insert(5,"L");
        System.out.println(stringBuffer3);
        stringBuffer3.deleteCharAt(2);
        System.out.println(stringBuffer3);
        String s1 = stringBuffer3.substring(5);
        System.out.println(s1);



    }
}
