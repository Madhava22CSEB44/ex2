import java.util.Scanner;

class Student {
    private String name;
    private double[] marks;
    private double totalMarks;
    private double averageMarks;

    public Student(String name, double[] marks) {
        this.name = name;
        this.marks = marks;
        calculateTotalAndAverage();
    }

    private void calculateTotalAndAverage() {
        for (double mark : marks) {
            totalMarks += mark;
        }
        averageMarks = totalMarks / marks.length;
    }

    public void displayResults() {
        System.out.println("Student Name: " + name);
        System.out.println("Marks: ");
        for (int i = 0; i < marks.length; i++) {
            System.out.println("Subject " + (i + 1) + ": " + marks[i]);
        }
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Marks: " + averageMarks);
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= 5; i++) {
            System.out.println("Enter details for Student " + i + ":");
            System.out.print("Name: ");
            String name = scanner.nextLine();

            double[] marks = new double[5];
            for (int j = 0; j < 5; j++) {
                System.out.print("Enter marks for Subject " + (j + 1) + ": ");
                marks[j] = scanner.nextDouble();
            }
            scanner.nextLine(); 

            Student student = new Student(name, marks);
            student.displayResults();
            System.out.println();

        }
        scanner.close();
    }
       
 


}
