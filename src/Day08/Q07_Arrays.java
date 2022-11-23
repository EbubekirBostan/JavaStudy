package Day08;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Q07_Arrays {
    public static void main(String[] args) {
        /*
         * {{1,2,3}, {2,3,1} , {5,5,5} , {2,1,3}} int 2D arrayini  olustur
         *  2D arrayinden min number print et
         */
        int nums[][]={{1,2,3}, {2,3,1} , {5,5,5} , {2,1,3}};
        List<Integer> numList=new ArrayList<>();
        for (int i = 0; i < nums.length ; i++) {
            for (int j = 0; j <nums[i].length ; j++) {
                numList.add(nums[i][j]);

                }
            }
        System.out.println("numList = " + numList);
        Collections.sort(numList);
        System.out.println("Min number = " + numList.get(0));
    }
}

