
public class FizzBuzzExercise {

    public static void main(String[] args){
        new FizzBuzzExercise().fizzBuzz(1, 100);
    }

    public void fizzBuzz(int start, int end){
        for (int i = start; i <= end; i++) {
            String result = "";

            if(isDivisibleByThree(i)){
                result = result + "Fizz";
            }
            if(isDivisibleByFive(i)){
                result = result + "Buzz";
            }

            if(result.equals("")){
                result = i + "";
            }

            System.out.println(result);
        }
    }

    private boolean isDivisibleByThree(int number){
        return isDivisible(number, 3);
    }

    private boolean isDivisibleByFive(int number){
        return isDivisible(number, 5);
    }

    private boolean isDivisible(int number, int divider){
        return number % divider == 0;
    }
}
