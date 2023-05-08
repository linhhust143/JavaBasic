package JB01;

public class SinhVien {

    public static String name = "Nguyen Van A";
    public int age = 23;


    private void printName() {
        System.out.println("Student Name: " + name);
    }

    private void printAge() {
        System.out.println("Student Age: " + age);
    }

    private void printID() {
        String id = "SV001";
        System.out.println("Student ID: " + id);
    }

    public static void main(String[] args) {
        SinhVien sv = new SinhVien();
        sv.printName();
        sv.printAge();
        sv.printID();

        ThongTin tv = new ThongTin();
        System.out.println("Project 1's score: " + tv.project1Score);
        System.out.println("Project 2's score: " + tv.project2Score);
        System.out.println("Project 3's score: " + tv.project3Score);
    }
}
