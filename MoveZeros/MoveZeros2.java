package MoveZeros;

public class MoveZeros2 {
    public static void main(String[] args) {
        int arr[] = {0, 1, 0, 3, 12};
        int n = arr.length;

        int i=0;
        for(int j=0; j<n; j++){
            if(arr[j] != 0){
                arr[i] = arr[j];
                i++;
            }
        
        while(i<n){
            arr[i] = 0;
            i++;
        }
        
        for(int k=0; k<n; k++){
            System.out.print(arr[k] + " ");
        }
        
        
    }
}
