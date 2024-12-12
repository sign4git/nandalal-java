public class BinarySearch {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6,7,19,25,32};
        int target =1;
        int index = binarySearch(a,target);
        if(index!=-1){
            System.out.println("Element Found at index "+index);
        }else{
            System.out.println("Element not found");
        }
    }

    private static int binarySearch(int[] a, int target) {
        int left=0;
        int right=a.length-1;
        int mid;
        int count=0;
        while(left<=right){
            System.out.println("step "+ ++count);
            mid=(left+right)/2;
            if(target>a[mid]){
                left=mid+1;
            }else if(target<a[mid]){
                right=mid-1;
            }else{
                return mid;
            }

        }
        return -1;
    }
}
