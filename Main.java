class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        HashSet<Integer> set= new HashSet<>();

        //add 1st array to set
        for(int n1: nums1) set.add(n1);

        // now check with 2nd array

        for(int n2: nums2) if(set.contains(n2)) return n2;

        return -1;
    }
}