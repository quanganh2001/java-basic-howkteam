public class Student {
    // Tạo một class Student của một trường ‘Kteam Education’, như vậy chỉ cần một bộ nhớ chung lưu thông tin tên trường, như vậy tiết kiệm bộ nhớ hơn
    public String name;
    public int age;
    public float height;

    public static String universityName = "USTH University";
    public static int total = 0;

    public Student(String name, int age, float height) {
        this.name = name;
        this.age = age;
        this.height = height;
        total += 1;
    }
    
    public static void getInfoUniversity() {
		System.out.println("HowKteam. Free Educcation!");
	}
}
