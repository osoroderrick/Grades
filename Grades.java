package checkgrades;

public class Grades {

    public static void main(String[] args) {

        int grade = (int) Math.floor(Math.random() * 100);

        System.out.println("Your grade is"+ " " + grade);

        if (grade >= 90) {
            System.out.println("You got an A");
        } else if (grade >= 80){
            System.out.println("you got a b");
        } else if( grade >= 70 ){
            System.out.println("you got a c");
        } else if ( grade >= 60){
            System.out.println("You got a d");
        } else {
            System.out.println("You got an f");
        }





    }
}