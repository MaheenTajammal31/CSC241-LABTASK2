public class Task2Demo {
    public static void main(String[] args) {

        Student s1 = new Student();
        Student s2 = new Student();

        s1.studentId = "BAI-028";
        s1.name = "Maheen Tajammal";
        s1.completedCredits = 12;

        s2.studentId = "BAI-036";
        s2.name = "Tajammal";
        s2.completedCredits = 15;

        System.out.println("Initial State:");
        System.out.println(s1.summary());
        System.out.println(s2.summary());

        s1.addCredits(3);
        s2.addCredits(5);

        System.out.println("\nAfter Adding Credits:");
        System.out.println(s1.summary());
        System.out.println(s2.summary());

        System.out.println("\nRemaining Credits:");
        System.out.println(s1.remainingCredits(130));
        System.out.println(s2.remainingCredits(130));
    }
}