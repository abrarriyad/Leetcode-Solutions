class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
        int len1 = nums1.length;
        int len2 = nums2.length;
        int len = len1+len2;
        
        int[] sorted = new int[len];
        int i=0,j=0,k=0;
        while(i<len1 && j<len2){
            if(nums1[i]<=nums2[j]){
                sorted[k++]=nums1[i++];
            }
            else{
                sorted[k++]=nums2[j++];
            }
        }
        
        while(i<len1){
            sorted[k++]=nums1[i++];
        }
        
        while(j<len2){
            sorted[k++]=nums2[j++];
        }
        
        if(len%2!=0)
            return sorted[len/2];
        else{
            int x = len/2;
            double a = sorted[x];
            double b = sorted[x-1];
            
            return (a+b)/2;
        }
            
        
    }
}