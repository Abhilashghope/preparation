package DSA;

import java.util.*;
import java.util.stream.Collectors;

public class ThreeSum {

        public static List<List<Integer>> threeSum(int[] nums) {

            Arrays.sort(nums);

            Set<List<Integer>> res = new HashSet<>();

            for(int i=0;i<nums.length;i++){
                int target = 0 - nums[i];

                int j= 0 ;
                int k =nums.length-1;
                while(j<=k)
                {
                    List<Integer> temp = new ArrayList<>();
                    if(j==i) j++;
                    if(k==i) k--;
                    if(j>=k) break;
                    if(nums[j]+nums[k] == target)
                    {
                        temp.add(nums[i]);
                        temp.add(nums[j]);
                        temp.add(nums[k]);
                        j++;
                        k--;
                    }
                    else if(nums[j]+nums[k]<target){
                        j++;
                    }
                    else{
                        k--;
                    }
                    if(!temp.isEmpty()){
                        Collections.sort(temp);
                        res.add(temp);
                    }
                }

            }
            return res.stream().collect(Collectors.toList());
        }
    }


