public class ArrayListUser {
    private int arr[];
    private int counter = 0;

    public ArrayListUser() {
        arr = new int[10];
    }
     
    public void add(int x){
        if(arr[counter]==0){
            arr[counter]=x;
            counter++;
        }
        else{
            arr[counter]=x;
        }
    }


    public String toString() {
        int j = counter;
        String s = "";
        for (int i = 0; i <j; i++) {
            s += arr[i] +" ";
        }
        return s;
    }

}
