import java.util.*;
class Main {
   public static void main(String[]args){
       LinkedHashSet hs=new LinkedHashSet();
      int nums1[]={1,2,3,4,5};
      int nums2[]={1,2,7};
      int[]res=new int[nums1.length+nums2.length];
      for(int i=0,x=0,y=0;i<res.length;i++){
        if(x<nums1.length){
            res[i]=nums1[x++];
        }
        else if(y<nums2.length){
            res[i]=nums2[y++];
        }
      }
     for(int arr:res){
          hs.add(arr);
      }
       System.out.print(hs);
 }
}

