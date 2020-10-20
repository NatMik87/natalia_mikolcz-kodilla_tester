import java.util.Arrays;

public class Grades {
    private int[] grades;
    private int size;

    public Grades() {
        this.grades = new int[10];
        this.size = 0;
    }

    public void add(int value){
        if (this.size == 10) {
            return;
        }
        this.grades[this.size] = value;
        this.size++;
    }

    public int getLastGrade() {
        return this.grades[this.size - 1];
    }

    public double calculateAverage() {
        double sumaElementowTablicy = 0;

        for (int i: this.grades) {
            sumaElementowTablicy += i;
        }
        return (size == 0) ? 0 : sumaElementowTablicy/this.size;
    }

    public static void main(String[] args) {
        Grades grades = new Grades();
        grades.add(4);
        grades.add(5);
        grades.add(3);
        System.out.println((("Średnia ocen wychodzi:") + (grades.calculateAverage())));
        System.out.println(grades.getLastGrade());
    }
}
