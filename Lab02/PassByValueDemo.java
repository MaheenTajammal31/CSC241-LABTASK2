public class PassByValueDemo {

    void changeNumber(int x) {
        System.out.println("Inside changeNumber before: " + x);
        x = 99;
        System.out.println("Inside changeNumber after: " + x);
    }

    void changeStudent(Student st) {
        System.out.println("Inside changeStudent before: " + st.completedCredits);
        st.completedCredits = 99;
        System.out.println("Inside changeStudent after: " + st.completedCredits);
    }

    void replaceStudent(Student st) {
        st = new Student();
        st.name = "Temporary";
        st.completedCredits = 500;

        System.out.println("Inside replaceStudent: " + st.name);
        System.out.println("Inside replaceStudent credits: " + st.completedCredits);
    }

    public static void main(String[] args) {

        PassByValueDemo demo = new PassByValueDemo();

        // Experiment A
        int number = 10;

        System.out.println("Experiment A");
        System.out.println("Before method: " + number);

        demo.changeNumber(number);

        System.out.println("After method: " + number);

        // Experiment B
        Student s1 = new Student();
        s1.name = "Abeer";
        s1.completedCredits = 20;

        System.out.println("\nExperiment B");
        System.out.println("Before method: " + s1.completedCredits);

        demo.changeStudent(s1);

        System.out.println("After method: " + s1.completedCredits);

        // Experiment C
        System.out.println("\nExperiment C");
        System.out.println("Before method: " + s1.name);

        demo.replaceStudent(s1);

        System.out.println("After method: " + s1.name);
    }
}