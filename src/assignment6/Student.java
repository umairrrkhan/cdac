package assignment6;

public class Student {

    void addStudent() {

        class MtechStudent implements Admission {
            public void registration() {
                System.out.println("MtechStudent registration done using local class.");
            }
        }

        MtechStudent mtech = new MtechStudent();
        mtech.registration();

        Admission anon = new Admission() {
            public void registration() {
                System.out.println("Anonymous class registration done.");
            }
        };

        anon.registration();
    }

    public static void main(String[] args) {
        Student s = new Student();
        s.addStudent();
    }
}

