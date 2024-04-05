package day03;

public class Work {
    // Bubble Sort Pair Programming
    public static void main(String[] args) {
        int[] a = {2 ,1, 3, 5, 4};
        for (int i = 0; i < a.length-1; i++) {
            for (int j = 1; j < a.length - i; j++) {
                if (a[j -1] > a[j]) {
                    a = swap(a, j-1);
                }
            }
        }
        for(int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
    static int[] swap(int[] b, int index){
        int temp = b[index];
        b[index] = b[index+1];
        b[index+1] = temp;

        return  b;
    }
}
