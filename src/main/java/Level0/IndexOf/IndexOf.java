package Level0.IndexOf;

// return the index of a value n from array arr.
// if no value exists, return -1

public class IndexOf {
    public int getIndex(int[] arr, int n){

        int result = -1;

        for (int i = 0; i < arr.length; i++){
            if(arr[i] == n){
                return i;
            }
        }
        return result;
    }
}
