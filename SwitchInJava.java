public class SwitchInJava {
    public static void main(String[] args) {
        String gender = "Boy";
        switch (gender) {
            case "Boy":
                System.out.println("You are boy");
                break;
            case "Girl":
                System.out.println("You are girl");
                break;
            default:
                System.out.println("We don't know");
        }
    }
}
