import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
        String proba = new String();
        Method[] methods = proba.getClass().getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            System.out.println(methods[i]);
        }
        System.out.println("Hello world!");
    }
}