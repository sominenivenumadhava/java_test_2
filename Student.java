package test1.com;

public class Student {
    private String name;
    private int marksObtained;
    static String collageName = "lpu";
    static final int MAX_MARKS = 100;

    Student(String name, int marksObtained, String collageName) {
        this.name = name;
        this.marksObtained = marksObtained;
        Student.collageName = collageName;
    }
    void result(){
        System.out.println("Name: " + name);
        System.out.println("Collage: " + collageName);
        System.out.println("marks Obtained:" + marksObtained);

        double d = (marksObtained * 100 ) / MAX_MARKS;
        System.out.println("percentage: " + d + "%");

    }
}
class StaticFinal{
public static void main(String[] args) {
    Student s = new Student("venu", 90,"lpu");
    s.result();
}
}
