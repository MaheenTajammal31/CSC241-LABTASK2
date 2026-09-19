public class Task1Demo {
    public static void main(String[] args) {

        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();

        s1.studentId = "BAI-028";
        s1.name = "Maheen Tajammal";
        s1.completedCredits = 12;

        s2.studentId = "BAI-001";
        s2.name = "Aamna Basit";
        s2.completedCredits = 15;

        s3.studentId = "BAI-046";
        s3.name = "Swera Kamran";
        s3.completedCredits = 10;

        System.out.println("Before Change:");
        System.out.println(s1.studentId + " " + s1.name + " " + s1.completedCredits);
        System.out.println(s2.studentId + " " + s2.name + " " + s2.completedCredits);
        System.out.println(s3.studentId + " " + s3.name + " " + s3.completedCredits);

        s2.completedCredits = 20;

        System.out.println("\nAfter Changing s2:");
        System.out.println(s1.studentId + " " + s1.name + " " + s1.completedCredits);
        System.out.println(s2.studentId + " " + s2.name + " " + s2.completedCredits);
        System.out.println(s3.studentId + " " + s3.name + " " + s3.completedCredits);

        /*
         * Only s2 changed because s1, s2, and s3 are separate Student objects.
         * Each object has its own completedCredits value.
         */
    }
}