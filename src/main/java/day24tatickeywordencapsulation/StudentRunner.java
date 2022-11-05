package day24tatickeywordencapsulation;

public class StudentRunner {
    public static void main(String[] args) {

        Student std1 = new Student();
        System.out.println(std1.getStdId());
        System.out.println(std1.getGpa());
        System.out.println(std1.isRitired());
        std1.setStdId("AB");
        System.out.println(std1.getStdId());
        std1.setGpa(4.0);
        System.out.println(std1.getGpa());
        std1.setRitired(true);
        System.out.println(std1.isRitired());

    }
}
