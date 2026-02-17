class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        ArrayList<Integer>arr = new ArrayList<>();
        for(int num:nums1){
            arr.add(num);
        }
        for(int num:nums2){
            arr.add(num);
        }
        Collections.sort(arr);
        int[]n = new int[arr.size()];
        int i=0;
        for(int a:arr){
            n[i++]=a;
        }
        double  med = 0;
        if(n.length%2==0){
            med = n[n.length/2]+n[n.length/2-1];
            med = med/2;
        }
        else{
            med = n[n.length/2];
        }
        return med;
    }
    
}