package ch.tiktok;


public class Field {

    //Attribute
    private char[][] field;

    //Konstruktor
    Field() {
        field = new char[3][5];
    }

    //Methoden


    //GetterSetter

    public char[][] getField() {
        return field;
    }

    public void setField(char[][] field) {
        this.field = field;
    }

    public void buildField() {
        //Abgrenzung an denn Seiten
        for(int i = 0; i < field.length; i++) {
            field[i][0] = '_';
            field[i][1] = '|';
            field[i][2] = '_';
            field[i][3] = '|';
            field[i][4] = '_';
        }
           // for(int t = 1; t < (field.length - 1); t++) {
            //    field[i][t] = ' ';
            //}
        /*
        //Abgrenzung oben
        for(int i = 0; i < field[0].length; i++) {
            if(i > 0 && i < (field[0].length - 1)) {
                field[0][i] = '_';
            }
        }
        //Abgrenzung unten
        for(int i = 0; i < field[2].length; i++) {
            if(i > 0 && i < (field[2].length - 1)) {
                field[2][i] = '_';
            }
        }
        */
    }

        public void printField() {

            for(int i = 0; i < field.length; i++) {
                for(int j = 0; j < field[i].length; j++) {
                    System.out.print(field[i][j]);
                }
                System.out.println();
            }

        }



}