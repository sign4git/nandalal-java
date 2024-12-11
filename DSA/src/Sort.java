public class Sort {
    public static void main(String[] args) {
        int a[] ={8,6,9,2,4,5};
        System.out.println("Arrays before sorting");
        for(int i:a){
            System.out.print(i+" ");
        }
        System.out.println();
//        a = bubbleSort(a);
//        a = selectionSort(a);
        a = insertionSort(a);
        System.out.println("Arrays after sorting");
        for(int i:a){
            System.out.print(i+" ");
        }
    }

    private static int[] bubbleSort(int[] a) {
        int size=a.length;
        for(int i=0;i<size;i++){
            for(int j=i+1;j<size;j++){
                if(a[j]<a[i]){
                    int temp=a[j];
                    a[j]=a[i];
                    a[i]=temp;
                }
                for(int n:a){
                    System.out.print(n+" ");
                }
                System.out.println();
            }
        }
        return a;
    }

    private static int[] selectionSort(int[] a){
        int size= a.length;
        int minIndex;
        for(int i=0;i< size;i++){
            minIndex=i;
            for(int j=i+1;j< size;j++){
                if(a[minIndex]>a[j]){
                    minIndex=j;
                }
            }
            int temp=a[i];
            a[i]=a[minIndex];
            a[minIndex]=temp;
            for(int n:a){
                System.out.print(n+" ");
            }
            System.out.println();
        }
        return a;
    }

    private static int[] insertionSort(int[] a){
        int size= a.length;
        for(int i=1;i< size;i++){
            int currElement=a[i];
            for(int j=i-1;j>=0;j--){
                if(a[j]>currElement){
                    int temp=a[j];
                    a[j]=currElement;
                    a[j+1]=temp;
                }
            }
            for(int n:a){
                System.out.print(n+" ");
            }
            System.out.println();
        }
        return a;
    }
}