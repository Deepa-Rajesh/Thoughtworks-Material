public class Arraysum {
    public static void main(String[] args) {
        int[] array = new int[10];
        int sum = 0;
        for (int i = 0; i <10; i++){
         array[i]  = i;
        }
        for (int i = 1; i <10; i++){
            sum  = sum + array[i];
        }
        System.out.println(sum );
    }
}
