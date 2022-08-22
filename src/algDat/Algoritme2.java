package algDat;

public class Algoritme2 {
    public static void main(String[] args) {
        Array numbers = new Array(3);
        numbers.insert(10);
        numbers.insert(20);
        numbers.insert(30);
        numbers.insert(40);
        numbers.insert(50);
        numbers.delete(1);
        // System.out.println(numbers.indexOf(20));
        numbers.print();
    }
}
