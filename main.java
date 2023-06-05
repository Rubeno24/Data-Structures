import java.util.Random;

public class main {
        
        public static void main(String[] args) {
                int[] arr= new int[100];
                for(int i = 0; i<=arr.length-1; i++){
                        Random rand = new Random();
                        int random = rand.nextInt(1000);
                        arr[i]=random;

                }
        
        selectionSort sort = new selectionSort();
        arr=sort.SelectionSort(arr);
        for(int i =0; i<arr.length-1;i++){
                System.out.println(arr[i]);
        }
        
        }
       
        
        
        
        
}