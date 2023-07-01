public class practice {
    float salary = 40000;
}

class Program extends practice {
    int bonus = 10000;

    public static void main(String[] args) {
        Program p = new Program();

        System.out.println("Programmer Salary" + p.salary);
        System.out.println("Bonus of the programmer " + p.bonus);
    }
}
