package VII_tablice_i_ArrList.zadania.zad_3;

public class Main {
    public static void main(String[] args) {
        int num1 = 7576651;
        int num2 = 13;

        int[][] number = {{5658845, 4520125, 7895122, 8777541, 8451277, 1302850},
                {8080152, 4562555, 5552012, 5050552, 7825877, 1250255},
                {1005231, 6545231, 3852085, 7576651, 7881200, 4581002}};

        System.out.println(searchingAccNum(number, num1));  // expecting true
        System.out.println(searchingAccNum(number, num2));  // expecting false
    }

    public static boolean searchingAccNum(int[][] tabl, int n){

        boolean decision = false;

        for (int i = 0; i < tabl.length; i++) {
            for (int j = 0; j < tabl[i].length ; j++) {
                if (n == tabl[i][j]){
                    return true;
                }
            }
        }
        return decision;
    }
}
