package Test;

import java.util.Scanner;

public class TestClassT {

    public static void main(String[] args) {



        Scanner sc = new Scanner(System.in);

        System.out.println("x beginnt");

        SetX = setX();

        //char[][] fieldG = fieldGame();



    }


    public void setX() {
        char[][] fieldG = fieldGame();
        char player1 = 'x';






    }


    public static char[][] fieldGame() {


        char[][] field = new char[6][11];


        field[0][0] = '1';
        field[1][0] = '_';
        field[2][0] = '4';
        field[3][0] = '_';
        field[4][0] = '7';
        field[5][0] = ' ';

        field[0][1] = ' ';
        field[1][1] = '_';
        field[2][1] = ' ';
        field[3][1] = '_';
        field[4][1] = ' ';
        field[5][1] = ' ';

        field[0][2] = ' ';
        field[1][2] = '_';
        field[2][2] = ' ';
        field[3][2] = '_';
        field[4][2] = ' ';
        field[5][2] = ' ';

        field[0][3] = '|';
        field[1][3] = '|';
        field[2][3] = '|';
        field[3][3] = '|';
        field[4][3] = '|';
        field[5][3] = '|';

        field[0][4] = ' ';
        field[1][4] = '_';
        field[2][4] = ' ';
        field[3][4] = '_';
        field[4][4] = ' ';
        field[5][4] = ' ';

        field[0][5] = '2';
        field[1][5] = '_';
        field[2][5] = '5';
        field[3][5] = '_';
        field[4][5] = '8';
        field[5][5] = ' ';

        field[0][6] = ' ';
        field[1][6] = '_';
        field[2][6] = ' ';
        field[3][6] = '_';
        field[4][6] = ' ';
        field[5][6] = ' ';

        field[0][7] = '|';
        field[1][7] = '|';
        field[2][7] = '|';
        field[3][7] = '|';
        field[4][7] = '|';
        field[5][7] = '|';

        field[0][8] = ' ';
        field[1][8] = '_';
        field[2][8] = ' ';
        field[3][8] = '_';
        field[4][8] = ' ';
        field[5][8] = ' ';

        field[0][9] = ' ';
        field[1][9] = '_';
        field[2][9] = ' ';
        field[3][9] = '_';
        field[4][9] = ' ';
        field[5][9] = ' ';

        field[0][10] = '3';
        field[1][10] = '_';
        field[2][10] = '6';
        field[3][10] = '_';
        field[4][10] = '9';
        field[5][10] = ' ';


        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                System.out.print(field[i][j]);
            }
            System.out.println();
        }
    return field;
    }


}
