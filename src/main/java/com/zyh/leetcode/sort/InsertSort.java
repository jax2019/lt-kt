package com.zyh.leetcode.sort;

import com.zyh.leetcode.sort.base.BaseSort;

/**
 * 插入排序
 */
public class InsertSort extends BaseSort {

    public InsertSort(int[] array) {
        super(array);
    }

    @Override
    public void doSort() {
        for (int i = 1; i < array.length; i++) {
            for (int j = i; j > 0 && compare(j - 1, j); j--) {
                exchange(j - 1, j);
            }
        }
    }
}
