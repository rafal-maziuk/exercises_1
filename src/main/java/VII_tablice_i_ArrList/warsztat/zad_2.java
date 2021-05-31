package VII_tablice_i_ArrList.warsztat;

public class zad_2 {
    public static void main(String[] args) {

        int[] numArray1 = new int[100];
        int[] numArray2 = new int[100];

        for (int i = 0; i < numArray1.length ; i++) {
            numArray1[i] = i + 100;
            int num;
            num = numArray1[i];
            System.out.println("START!");
            System.out.println("arr1 : " + numArray1[i]);
            System.out.println("aktualne arr2 : " + numArray2[i]);
            System.out.println("===== kopiowanie nr " + i + " ====");
            numArray2[i] = num;
            System.out.println("wynik koncowy arr2: " + numArray2[i]);
            System.out.println();
        }
    }
}
