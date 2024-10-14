public class MergeSortedArray{
    public static void merge(int[] nums1, int m, int[] nums2, int n){
        if(n == 0){
            return;
        }else if(m == 0){
            for(int i = 0; i < n; i++){
                nums1[i] = nums2[i];
            }
            return;
        }

        int pointer = (m + n) - 1;
        int nums1Pointer = m - 1;
        int nums2Pointer = n - 1;

        while(nums1Pointer >= 0 && nums2Pointer >= 0){
            if(nums1[nums1Pointer] >= nums2[nums2Pointer]){
                nums1[pointer] = nums1[nums1Pointer];
                pointer--;
                nums1Pointer--;
            }else{
                nums1[pointer] = nums2[nums2Pointer];
                pointer--;
                nums2Pointer--;
            }
        }

        while(nums2Pointer >= 0){
            nums1[pointer] = nums2[nums2Pointer];
            pointer--;
            nums2Pointer--;
        }
    }
}