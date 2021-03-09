package Test;

public class Player {

    private char[] playerSign;
    private int currentRow;
    private int currentColumn;
    private int counter;



    Player(Field field) {
        playerSign = new char[2];
        playerSign[0] = 'x';
        playerSign[1] = 'y';

        currentRow = 0;
        currentColumn = 0;
        counter = 0;

        field.getField()[currentRow][currentColumn] = playerSign[counter];
    }

    public void xOne(Field field) {

        field.getField()[0][0] = playerSign[0];
        field.printField();

    }

    public void xTwo(Field field) {

        field.getField()[0][5] = playerSign[0];
        field.printField();

    }

    public void xThree(Field field) {

        field.getField()[0][10] = playerSign[0];
        field.printField();

    }

    public void xFour(Field field) {

        field.getField()[2][0] = playerSign[0];
        field.printField();

    }
    public void xFife(Field field) {

        field.getField()[2][5] = playerSign[0];
        field.printField();

    }
    public void xSix(Field field) {

        field.getField()[2][10] = playerSign[0];
        field.printField();

    }
    public void xSeven(Field field) {

        field.getField()[4][0] = playerSign[0];
        field.printField();

    }
    public void xEight(Field field) {

        field.getField()[4][5] = playerSign[0];
        field.printField();

    }
    public void xNine(Field field) {

        field.getField()[4][10] = playerSign[0];
        field.printField();

    }

    public void yOne(Field field) {

        field.getField()[0][0] = playerSign[1];
        field.printField();

    }

    public void yTwo(Field field) {

        field.getField()[0][5] = playerSign[1];
        field.printField();

    }

    public void yThree(Field field) {

        field.getField()[0][10] = playerSign[1];
        field.printField();

    }

    public void yFour(Field field) {

        field.getField()[2][0] = playerSign[1];
        field.printField();

    }
    public void yFife(Field field) {

        field.getField()[2][5] = playerSign[1];
        field.printField();

    }
    public void ySix(Field field) {

        field.getField()[2][10] = playerSign[1];
        field.printField();

    }
    public void ySeven(Field field) {

        field.getField()[4][0] = playerSign[1];
        field.printField();

    }
    public void yEight(Field field) {

        field.getField()[4][5] = playerSign[1];
        field.printField();

    }
    public void yNine(Field field) {

        field.getField()[4][10] = playerSign[1];
        field.printField();

    }



}