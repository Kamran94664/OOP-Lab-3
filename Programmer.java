package Task5;

public class Programmer {

          private int id;
        private String name;
        private String preferredLanguage;
        private int problemsSolved;

       public Programmer(int id, String name, String preferredLanguage, int problemsSolved) {
            this.id = id;
            this.name = name;
            this.preferredLanguage = preferredLanguage;
            this.problemsSolved = problemsSolved;
        }
        public void solveProblem(int count) {
            problemsSolved += count;
        }
        public void displayDetails() {
            System.out.println("ID: " + id + "Name: " + name + "Preferred Language: " + preferredLanguage + "Problems Solved: " + problemsSolved);

        }
        public static void main(String[] args) {

            Programmer p1 = new Programmer(1, "Ali", "Java", 50);
            Programmer p2 = new Programmer(2, "Sarfraz", "Python", 30);
            p1.solveProblem(5);
            p2.solveProblem(10);
            p1.displayDetails();
            p2.displayDetails();
        }
    }


