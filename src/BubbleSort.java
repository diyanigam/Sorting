public class BubbleSort {  
    static void bubbleSort(int[] arr) {  
        int n = arr.length;  
        int temp = 0;  
         for(int i=0; i < n; i++){  
                 for(int j=1; j < (n-i); j++){  
                          if(arr[j-1] > arr[j]){
                                 temp = arr[j-1];  
                                 arr[j-1] = arr[j];  
                                 arr[j] = temp;  
                         }
                 }  
        }  
  
    }
    public static void main(String[] args) {  
                int arr[] ={1, 2, 4, 2, 5, 13, 32, 28, 21, 10, 2022};
                  
                bubbleSort(arr);
                 
                System.out.println("Bubble Sorted:");  
                for(int i=0; i < arr.length; i++){  
                        System.out.print(arr[i] + " ");  
                }  
   
        }  
}  