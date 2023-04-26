package school.mjc.stage0.conditions.task4;

public class TernaryMaxNumberPrinter {
    public void printGreatest(int first, int second, int third) {
        int biggest = first >= second ? first : second;
        biggest = biggest >= third ? biggest : third;
        System.out.println(biggest);
    }
}
