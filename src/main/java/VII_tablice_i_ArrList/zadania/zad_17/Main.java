package VII_tablice_i_ArrList.zadania.zad_17;

public class Main {

    public static void main(String[] args) {

        int[][] table = { {1,2,3} , {4,5,6} , {7,8,9}};

        System.out.println("suma w tabeli wynosi: " + getTotal(table));

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

    public static int getAverage(int[][] tab){
        return 0;
    }

    public static int getRowTotal(int[][] tab, int nr){
        return 0;
    }

    public static int getColumnTotal(int[][] tab, int nr){
        return 0;
    }

    public static int getHighestInRow(int[][] tab, int nr){
        return 0;
    }

    public static int getLowestInRow(int[][] tab, int nr){
        return 0;
    }
}
