package Start.SchoolManagementSystem;

public class Student {
    //vecorite => variablat e instances

    private String name;
    private String surname;
    private int age;
    private char gender;
    private int[] grades;

    //konstruktor pa parametra
    public Student() {
        this.name = "anonim";
        this.surname = "anonim";
        this.age = 0;
        this.gender = 'U';
        this.grades = new int[0];
    }
    //konstruktor me parametra
    public Student(String name,String surname, int age, char gender, int[] grades){
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.gender = gender;
        this.grades = grades;
    }

    public Student(String name,String surname, int age, char gender){
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.gender = gender;
    }


    public void displayData() {
        System.out.println("Name: " + name);
        System.out.println("Surname: " + surname);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
    }

}
