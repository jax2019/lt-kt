package com.zyh.leetcode.sort;

import com.zyh.leetcode.sort.base.BaseSort;

/**
 * 交换排序
 */
public class SwapSort extends BaseSort {

    public SwapSort(int[] array) {
        super(array);
    }

    @Override
    public void doSort() {
        if (array == null || array.length <= 1) {
            return;
        }
        int minIndex;
        for (int i = 0; i < array.length - 1; i++) {
            minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (compare(minIndex, j)) {
                    minIndex = j;
                }
            }
            exchange(minIndex, i);
        }
    }
}
