package Start.SchoolManagementSystem;

public class Main {
    public static void main(String[] args) {
        int[] grades = {10, 9, 8};
        Student student1 = new Student("Beni", "Hoxha", 20, 'M', grades);
        student1.displayData();

        Student student2 = new Student ("Ana", "Hoxha", 19, 'F');
        student2.displayData();

        Student anonimStudent = new Student();
        anonimStudent.displayData();
    }
}
