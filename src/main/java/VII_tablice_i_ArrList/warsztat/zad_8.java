package VII_tablice_i_ArrList.warsztat;

public class zad_8 {
    public static void main(String[] args) {

        int[][] numArr = new int[9][1];

        numArr[0][0] = 145;
        numArr[8][0] = 18;

        for (int i = 0; i < numArr.length ; i++) {
            for (int j = 0; j < numArr[i].length ; j++) {
                System.out.println(numArr[i][j]);
            }
        }
    }
}
