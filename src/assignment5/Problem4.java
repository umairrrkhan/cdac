package assignment5;

public class Problem4 {

    static class Student {
        String name;
        int id;
        double grade;

        public Student(String name, int id, double grade) {
            this.name = name;
            this.id = id;
            this.grade = grade;
        }

        public void displayStudent() {
            System.out.println("ID: " + id + " Name: " + name + " Grade: " + grade);
        }
    }

    public static void sortStudents(Student[] students) {
        int n = 0;

        // count actual students
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null) {
                n++;
            }
        }

        // bubble sort by grade
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (students[j].grade > students[j + 1].grade) {
                    Student temp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = temp;
                }
            }
        }
    }

    public static void displayStudents(Student[] students) {
        System.out.println("Students:");

        for (int i = 0; i < students.length; i++) {
            if (students[i] != null) {
                System.out.print((i + 1) + ". ");
                students[i].displayStudent();
            }
        }
    }

    public static void main(String[] args) {

        Student[] studentArray = new Student[10];

        studentArray[0] = new Student("Alice Johnson", 101, 85.5);
        studentArray[1] = new Student("Bob Smith", 102, 92.0);
        studentArray[2] = new Student("Charlie Brown", 103, 78.5);
        studentArray[3] = new Student("Diana Prince", 104, 88.0);
        studentArray[4] = new Student("Evan Wright", 105, 91.5);
        studentArray[5] = new Student("Fiona Green", 106, 76.0);

        System.out.println("Before Sorting:");
        displayStudents(studentArray);

        sortStudents(studentArray);

        System.out.println("\nAfter Sorting (by grade):");
        displayStudents(studentArray);
    }
}