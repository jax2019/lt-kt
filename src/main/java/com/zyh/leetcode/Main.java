package com.zyh.leetcode;


import com.zyh.leetcode.sort2.base.BaseSort2;
import com.zyh.leetcode.sort2.base.SortBean;
import com.zyh.leetcode.sort2.level2.MergeSort;
import com.zyh.leetcode.sort2.level3.CountingSort;

public class Main {

    private static final int[] array = {16, 3, 14, 19, 0, 1, 5, 10, 18, 8, 4, 15, 2, 17, 11, 9, 12, 7, 13, 6, 11, 17, 20};

    private static final SortBean[] arrayBean = {
            new SortBean(16),
            new SortBean("C", 3),
            new SortBean("A", 14),
            new SortBean(19),
            new SortBean(0),
            new SortBean("A", 10),
            new SortBean("B", 3),
            new SortBean("C", 14),
            new SortBean("A", 3),
            new SortBean("B", 14),
            new SortBean(1),
            new SortBean(5),
            new SortBean("B", 10),
            new SortBean(18),
            new SortBean(8),
            new SortBean("B", 11),
            new SortBean(4),
            new SortBean(15),
            new SortBean(2),
            new SortBean("A", 17),
            new SortBean("A", 11),
            new SortBean(9),
            new SortBean(12),
            new SortBean(7),
            new SortBean(13),
            new SortBean(6),
            new SortBean("B", 17),
            new SortBean(20)};

    public static void main(String[] args) {
        BaseSort2 sort = new CountingSort(arrayBean);
        sort.printArray();
        sort.doSort();
        sort.printArray();
        sort.printPerformanceData();


        //bubble  ->    比较次数：378,   交换次数：159
        //              比较次数：333,   交换次数：159
        //              比较次数：301,   交换次数：159

        //select  ->    比较次数：351,   交换次数：24
        //              比较次数：392,   交换次数：28    二元交换，为什么性能并没有变好

        //insert交换  ->  比较次数：184,   交换次数：159

        //shell     ->  比较次数：130,   交换次数：54
        //shell2    ->  比较次数：130,   交换次数：54
        //heap      ->  比较次数：183,   交换次数：111

        //quick     ->  比较次数：122,   交换次数：39
        //quick2    ->  比较次数：114,   交换次数：32

        //merge     ->  比较次数：106,   交换次数：0
    }

}













