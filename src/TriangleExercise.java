/**
 * Created by craphael on 7/22/15.
 */
public class TriangleExercise {

    public static final String SYMBOL = "*";

    public static void main(String[] args){

        TriangleExercise exercise = new TriangleExercise();

        exercise.printWithLine("Easiest exercise ever");
        exercise.printOne();
        exercise.printWithLine("");

        exercise.printWithLine("Draw a horizontal line");
        exercise.drawAHorizontalLine(8);
        exercise.printWithLine("");

        exercise.printWithLine("Draw a vertical line");
        exercise.drawAVerticalLine(3);
        exercise.printWithLine("");

        exercise.printWithLine("Draw a right triangle");
        exercise.drawARightTriangle(3);
        exercise.printWithLine("");

    }


    public void printOne(){
        print();
    }

    public void drawAHorizontalLine(int numberOfAsterisks){
        for (int i = 0; i < numberOfAsterisks; i++) {
            print();
        }
    }

    public void drawAVerticalLine(int numberOfAsterisks){
        for (int i = 0; i < numberOfAsterisks; i++) {
            printWithLine();
        }
    }
    
    public void drawARightTriangle(int numberOfAsterisks){
        for (int i = 0; i < numberOfAsterisks; i++) {
            for (int j = 0; j < i; j++) {
                print();
            }
            printWithLine();
        }
    }

    private void print(){
        System.out.print(SYMBOL);
    }

    private void printWithLine(){
        System.out.println(SYMBOL);
    }

    private void printWithLine(String text){
        System.out.println(text);
    }
}