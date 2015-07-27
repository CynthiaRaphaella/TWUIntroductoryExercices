
public class DiamontExercise {

    public static final String SYMBOL = "*";

    public static void main(String[] args){

        DiamontExercise exercise = new DiamontExercise();

        exercise.printWithLine("Isosceles Triangle");
        exercise.drawAIsoscelesTriangle(3);
        exercise.printWithLine("");

        exercise.printWithLine("Diamond");
        exercise.drawADiamont(5);
        exercise.printWithLine("");

        exercise.printWithLine("Diamond with name");
        exercise.drawADiamontWithName(3, "Bill");
        exercise.printWithLine("");
    }

    public void drawAIsoscelesTriangle(int numberOfSymbols){
        drawASimpleTriangleWithoutBase(numberOfSymbols);
        drawTheBase(numberOfSymbols);
    }

    public void drawADiamont(int numberOfSymbols){
        drawASimpleTriangleWithoutBase(numberOfSymbols);
        drawTheBase(numberOfSymbols);
        drawAInvertedTrianguleWithoutBase(numberOfSymbols);
    }

    public void drawADiamontWithName(int numberOfSymbols, String name){
        drawASimpleTriangleWithoutBase(numberOfSymbols);
        printWithLine(name);
        drawAInvertedTrianguleWithoutBase(numberOfSymbols);
    }

    private void drawASimpleTriangleWithoutBase(int numberOfSymbols){
        int delta = numberOfSymbols - 1;
        int startRangeSymbols = numberOfSymbols;
        int endRangeSymbols = numberOfSymbols;

        for (int i = 0; i < delta; i++) {
            drawALine(numberOfSymbols + delta, startRangeSymbols, endRangeSymbols);
            startRangeSymbols--;
            endRangeSymbols++;
        }
    }

    private void drawAInvertedTrianguleWithoutBase(int numberOfSymbols){
        int delta = numberOfSymbols - 1;
        int startRangeSymbols = numberOfSymbols - delta + 1;
        int endRangeSymbols = numberOfSymbols + delta - 1;

        for (int i = 1; i < numberOfSymbols; i++) {
            drawALine(numberOfSymbols + delta, startRangeSymbols, endRangeSymbols);
            startRangeSymbols++;
            endRangeSymbols--;
        }
    }

    private void drawTheBase(int numberOfSymbols) {
        int delta = numberOfSymbols - 1;
        int numberOfSymbolsPerLine = numberOfSymbols + delta;
        drawALine(numberOfSymbolsPerLine, 0, numberOfSymbolsPerLine);
    }

    private void drawALine(int numberOfSymbolsPerLine, int startRangeSymbols, int endRangeSymbols) {
        for (int j = 1; j <= numberOfSymbolsPerLine; j++) {
            if (isOutOfRange(startRangeSymbols, endRangeSymbols, j)) {
                print(" ");
            } else {
                print(SYMBOL);
            }
        }
        printWithLine("");
    }

    private boolean isOutOfRange(int startRangeSymbols, int endRangeSymbols, int i) {
        return i < startRangeSymbols || i > endRangeSymbols;
    }

    private void print(String item){
        System.out.print(item);
    }

    private void printWithLine(String item){
        System.out.println(item);
    }
}
