package algDat;

// Finn største tall i en Array data struktur.

public class Algoritme1 {
    public static void main(String[] args) {
        int[] a = {2, 7, 4, 11, 6, 18, 23, 1};
        int størstTall = 0;
        for(int i = 0; i < a.length; i++){
            if(a[i] > størstTall){
                størstTall = a[i];
            }
        }
        System.out.println(størstTall);
    }
}
