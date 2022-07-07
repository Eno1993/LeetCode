import java.util.*;

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
        List<Integer> list = new ArrayList<>();
        
        int npoint =0;
        int mpoint =0;
        
        while(true){
            if(npoint==nums1.length&&mpoint<nums2.length){
                for(; mpoint<nums2.length; mpoint++){
                    list.add(nums2[mpoint]);
                }
            }else if(npoint<nums1.length&&mpoint==nums2.length){
                for(; npoint<nums1.length; npoint++){
                    list.add(nums1[npoint]);
                }
            }else if(npoint<nums1.length&&mpoint<nums2.length){
                if(nums1[npoint]==nums2[mpoint]){
                    list.add(nums1[npoint]);
                    list.add(nums2[mpoint]);
                    npoint++;
                    mpoint++;
                }else if(nums1[npoint]<nums2[mpoint]){
                    list.add(nums1[npoint]);
                    npoint++;
                }else{
                    list.add(nums2[mpoint]);
                    mpoint++;
                }
            }else{
                break;
            }
        }
        
        int size = list.size();
        if(size%2==0){//짝수
            return (double)(list.get((size/2)-1)+list.get(size/2))/2;
        }else{//홀수
            return (double)list.get(size/2);
        }
    }
}