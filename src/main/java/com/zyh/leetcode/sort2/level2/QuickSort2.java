package com.zyh.leetcode.sort2.level2;

import com.zyh.leetcode.sort2.base.BaseSort2;
import com.zyh.leetcode.sort2.base.SortBean;

public class QuickSort2 extends BaseSort2 {

    public QuickSort2(SortBean[] sortBeans) {
        super(sortBeans);
    }

    @Override
    public void doSort() {
        quickSort(0, sortBeans.length - 1);
    }

    public void quickSort(int start, int end) {
        if (start >= end) {
            return;
        }
        int middle = partition(start, end);
        quickSort(start, middle - 1);
        quickSort(middle + 1, end);
    }

    private int partition(int start, int end) {
        int left = start + 1;
        int right = end;

        while (left < right) {
            while (left < right && compare(sortBeans, start, left)) {
                left++;
            }
            while (left < right && compare(sortBeans, right, start)) {
                right--;
            }
            if (left != right) {
                exchange(sortBeans, left, right);
                left++;
                right--;
            }
        }

        if (left == right && compare(sortBeans, right, start)) {
            right--;
        }
        exchange(sortBeans, start, right);
        return right;
    }
}
