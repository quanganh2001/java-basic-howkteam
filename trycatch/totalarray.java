package trycatch;
// Try Catch có nhiệm vụ bắt (Catch) các lỗi mà thực tế có thể xảy ra để xử lý sao cho chương trình thân thiện với người dùng hơn.
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
