package org.example.pairinarray;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> intArray = new ArrayList<>();
        intArray.add(4);
        intArray.add(7);
        intArray.add(9);
        intArray.add(3);
        intArray.add(2);
        intArray.add(6);
        System.out.println(matchChecker(10,intArray));
        //ok, but with duplicates, everytime it finds all pairs

        int[] nums = { 8, 7, 2, 5, 3, 1 };
        int target = 10;

        findPair(nums, target);
        //ok, more consistent, but ends after first hit
    }

    public static String matchChecker(int value, ArrayList<Integer> listToCheck) {
        StringBuilder sb= new StringBuilder();
        for (int i = 0; i < listToCheck.size(); i++) {
            int firstValue = listToCheck.get(i);
            for (int j = 0; j < listToCheck.size(); j++) {
                if(firstValue == listToCheck.get(j)) continue;
                int sum = firstValue + listToCheck.get(j);
                if(sum == value){

                    sb.append("Pair found "+firstValue+","+(sum-firstValue));
                }
                sum = firstValue;
        }

        }
        if(sb.isEmpty()) return "Pair not found in given array";
        else return sb.toString();
    }
    public static void findPair(int[] nums, int target){
        Arrays.sort(nums);
        int low = 0;
        int high = nums.length - 1;
        while (low < high)
        {
            if (nums[low] + nums[high] == target)
            {
                System.out.printf("Pair found (%d, %d)", nums[low], nums[high]);
                return;
            }

            if (nums[low] + nums[high] < target) {
                low++;
            }
            else {
                high--;
            }
        }
        System.out.println("Pair not found");
    }
}


