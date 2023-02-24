 class selectionSort {

    public static void Sorting(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            int minPos=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[minPos]<arr[j]){
                  minPos=j;
                }
            }
            // Swap the Element .
            int temp=arr[minPos];
            arr[minPos]=arr[i];
            arr[i]=temp;
        }
    }
    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        int arr[]={5,4,1,3,2};
        Sorting(arr);
        printArray(arr);
    }
}