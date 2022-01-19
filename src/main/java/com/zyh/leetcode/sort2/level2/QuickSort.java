package com.zyh.leetcode.sort2.level2;

import com.zyh.leetcode.sort2.base.BaseSort2;
import com.zyh.leetcode.sort2.base.SortBean;

public class QuickSort extends BaseSort2 {

    public QuickSort(SortBean[] sortBeans) {
        super(sortBeans);
    }

    @Override
    public void doSort() {
        int length = sortBeans.length;
        quickSort(0, length - 1);
    }

    private void quickSort(int left, int right) {
        if (left >= right) {
            return;
        }
        int middle = partition(left, right);
        quickSort(left, middle - 1);
        quickSort(middle + 1, right);
    }

    private int partition(int start, int end) {
        SortBean pivotBean = sortBeans[start];
        int left = start + 1;
        int right = end;

        while (left < right) {
            while (left < right && compare(pivotBean, sortBeans[left])) {
                left++;
            }
            if (left != right) {
                exchange(sortBeans, left, right);
                right--;
            }
        }
        if (left == right && compare(sortBeans[right], pivotBean)) {
            right--;
        }
        if (compare(pivotBean, sortBeans[right])) {
            exchange(sortBeans, start, right);
        }

        return right;
    }


}
