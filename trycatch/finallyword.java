package trycatch;

public class finallyword {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int S=0;
        try {
            for (String arg : args) {
                S+= Integer.parseInt(arg);
                System.out.println(arg);
            }
        } catch (Exception e) {
            System.out.println("Error:"+e.toString());
        } finally {
            System.out.println("This is end");
        }
            
    }
}
