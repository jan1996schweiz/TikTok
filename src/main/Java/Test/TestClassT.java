package Test;

import java.util.Scanner;

public class TestClassT {

    public static void main(String[] args) {

        System.out.println("Hallo");

        Field fielde = new Field();
        fielde.buildField();


        Player player = new Player(fielde);
        fielde.buildField();
        fielde.printField();

        player.xOne(fielde);
        player.xTwo(fielde);
        player.yThree(fielde);


        int positon;
        int temp = 0;

        Scanner sc = new Scanner(System.in);

        while (temp == 0) {


            System.out.println("Geben Sie eine Zahl von 1-10 ein: ");
            positon = sc.nextInt();


            switch (positon) {
                case 1:System.out.println("Hallo echo"); break;

            }
        }

    }

}









