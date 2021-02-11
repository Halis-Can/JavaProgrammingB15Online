package day38;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReversingAList {

    public static void main(String[] args) {

        // reversing an ArrayList object

        List<Integer> nums1 = new ArrayList<>(Arrays.asList(200, 100, 700, 400, 500));
        System.out.println("nums1 before reversing = " + nums1);//==>nums1 before reversing = [200, 100, 700, 400, 500]
        Collections.sort(nums1);
        Collections.reverse(nums1);
        System.out.println("nums1 after  reversing = " + nums1);//nums1 after  reversing = [500, 400, 700, 100, 200]
        Collections.sort(nums1); // OR Comparator.reverseOrder()
        System.out.println("nums1 after sorting  = " + nums1);
                          //==>nums1 after sorting  = [100, 200, 400, 500, 700]
        Collections.reverse(nums1);
        System.out.println("nums1 after sorting reverse order = "+nums1);
        //==>nums1 after sorting reverse order = [700, 500, 400, 200, 100]
        //==Example======
        List<Integer> nums2 = new ArrayList<>(Arrays.asList(222, 111, 777, 444, 555));
        Collections.sort(nums2,Collections.reverseOrder());//==>one shot!!!!!!
        System.out.println("num2 After sorting and  reverse order (one shot!!) "+nums2);
        //==>num2 After sorting and  reverse order (one shot!!) [777, 555, 444, 222, 111]

    }

}
