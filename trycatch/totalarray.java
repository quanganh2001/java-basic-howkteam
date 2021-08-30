package trycatch;

public class totalarray {
    public static void main(String[] args) {
        int S = 0;
        try {
            for (String arg : args) {
                System.out.println(arg);
            }
        } catch (Exception e) {
            System.out.println("Error:"+e.toString());
        }
            
    }
}
