import java.util.ArrayList;

public class PrimeFactorsExercise {

    public static void main(String args[]){
        new PrimeFactorsExercise().generate(30);
    }

    public void generate(int number){
        ArrayList<String> primesFactor = new ArrayList<String>();
        for (int i = 2; i <= number ; i++) {
            if(number % i == 0){
                if(isPrime(i)){
                    primesFactor.add(i + "");
                }
            }
        }
        printList(primesFactor);
    }

    private boolean isPrime(int number){
        for (int i = 2; i < number; i++) {
            if(number % i == 0){
                return false;
            }
        }
        return true;
    }

    private void printList(ArrayList<String> list){
        StringBuffer buffer = new StringBuffer();
        for (int i = 0; i < list.size(); i++) {
            buffer.append(list.get(i));
            if(i < list.size() - 1){
                buffer.append(",");
            }
            else {
                buffer.append(".");
            }
        }
        System.out.println(buffer);
    }
}
