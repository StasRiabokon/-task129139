package student;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class RunStudent {

    public static void main(String[] args) throws IOException {
        List<Student> studentsList = createListStudents();
        System.out.println("The Student that has the highest gpa: ");
        searchStudents(studentsList);
        System.out.println();
        System.out.println("Enter an id");

        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
        String idOfStudent = buff.readLine();
        buff.close();
        if (idOfStudent.isEmpty()) {
            System.out.println("Err");
        }
        int id = Integer.parseInt(idOfStudent);
        Student testStudent = searchId(studentsList, id);
        if (testStudent == null) {
            System.out.println("Not found");
        }
        testStudent.displayStudent();

    }

    public static void searchStudents(List<Student> studentsList) {
        double maxGpa = studentsList.get(0).getGpa();
        int j = 0;
        for (int i = 0; i < studentsList.size(); i++) {
            if (studentsList.get(i).getGpa() > maxGpa) {
                maxGpa = studentsList.get(i).getGpa();
                j = i;
            }

        }
        System.out.println("Gpa=" + studentsList.get(j).getGpa() + ";" + " Id=" + studentsList.get(j).getId());
    }

    public static Student searchId(List<Student> studentsList, int id) {
        for (int i = 0; i < studentsList.size(); i++) {
            if (studentsList.get(i).getId() == id) {
                return studentsList.get(i);
            }
        }
        return null;
    }

    public static List<Student> createListStudents() {
        List<Student> studentsList = new ArrayList<>();
        Student student1 = new Student("Bob", "Adamson", 13113, 95.25);
        studentsList.add(student1);
        Student student2 = new Student("Jack", "Oldman", 45544, 86.1);
        studentsList.add(student2);
        Student student3 = new Student("Ethan", "Paterson", 79875, 90);
        studentsList.add(student3);
        Student student4 = new Student("Jason", "Fisher", 12354, 74.5);
        studentsList.add(student4);
        Student student5 = new Student("Carlos", "Fisher", 35554, 60);
        studentsList.add(student5);
        return studentsList;
    }

}
