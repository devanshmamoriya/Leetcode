package MoveZeros;

public class MoveZeros1{
    public static void main(String[] args) {
        int arr[] = {0, 1, 0, 3, 12};
        int n = arr.length;
        int narr[] = new int[arr.length];
        int i=0;
        int k=0;

        while(i<n){
            if(arr[i]!=0){
                narr[k] = arr[i];
                k++;
            }
            i++;
        }

        for(int j=0;j<narr.length;j++){
            System.out.print(narr[j]+" ");
    }
}
}
