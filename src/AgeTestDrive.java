import jdk.dynalink.beans.MissingMemberHandlerFactory;

public class AgeTestDrive {
    public static void main(String[] args) {
        Age petya = new Age();
        petya.setDate("Петя", 15);

        Age misha = new Age();
        misha.setDate("Миша", 20);

        petya.print();
        misha.print();
    }

}
