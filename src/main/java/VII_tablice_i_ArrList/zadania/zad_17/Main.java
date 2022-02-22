package VII_tablice_i_ArrList.zadania.zad_17;

public class Main {

    public static void main(String[] args) {

        int[][] table = { {1,2,3} ,
                        {4,5,6} ,
                        {7,8,9}};

        System.out.println("suma w tabeli wynosi: " + getTotal(table));
        System.out.println("średnia: " + getAverage(table));
        System.out.println("wartość wiersza: " + getRowTotal(table, 0));
        System.out.println("wartość kolumny: " + getColumnTotal(table, 1));

    }

    public static int getTotal(int[][] tab){
        int sum = 0;
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[i].length; j++) {
                sum += tab[i][j];
            }
        }
        return sum;
    }

    public static double getAverage(int[][] tab){
        int sum = 0;
        int avg = 0;
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[i].length; j++) {
                sum += tab[i][j];
                avg += 1;
            }
        }
        return (double)sum/avg;
    }

    public static int getRowTotal(int[][] tab, int nrRow){
        int rowTotal = 0;
        try {
            if (nrRow < 0 || nrRow > tab.length) {
                return -1;
            } else {
                for (int i = 0; i < tab.length; i++) {
                    rowTotal += tab[nrRow][i];
                }
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("index poza rozmiarem tablicy !");
            System.exit(-1);
        }
        return rowTotal;
    }

    public static int getColumnTotal(int[][] tab, int nrCol){
        int colTotal = 0;
        try {
            if (nrCol < 0 || nrCol > tab.length) {
                return -1;
            } else {
                for (int i = 0; i < tab.length; i++) {
                    colTotal += tab[i][nrCol];
                }
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("index poza rozmiarem tablicy !");
            System.exit(-1);
        }
        return colTotal;
    }

    public static int getHighestInRow(int[][] tab, int nr){
        return 0;
    }

    public static int getLowestInRow(int[][] tab, int nr){
        return 0;
    }
}
