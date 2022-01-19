package com.zyh.leetcode.sort2.level2;

import com.zyh.leetcode.sort2.base.BaseSort2;
import com.zyh.leetcode.sort2.base.SortBean;

public class HeapSort extends BaseSort2 {

    public HeapSort(SortBean[] sortBeans) {
        super(sortBeans);
    }

    @Override
    public void doSort() {
        buildMaxHeap(sortBeans);
        for (int i = sortBeans.length - 1; i > 0; i--) {
            exchange(sortBeans, 0, i);
            adjustMaxHeap(sortBeans, 0, i);
        }
    }

    private void buildMaxHeap(SortBean[] sortBeans) {
        for (int i = sortBeans.length / 2 - 1; i >= 0; i--) {
            adjustMaxHeap(sortBeans, i, sortBeans.length);
        }
    }

    /**
     * 调整堆
     *
     * @param sortBeans
     * @param index
     * @param heapMax
     */
    private void adjustMaxHeap(SortBean[] sortBeans, int index, int heapMax) {
        int left = index * 2 + 1;
        int right = left + 1;
        int largest = index;

        if (left < heapMax && compare(sortBeans, left, largest)) {
            largest = left;
        }

        if (right < heapMax && compare(sortBeans, right, largest)) {
            largest = right;
        }

        if (largest != index) {
            exchange(sortBeans, index, largest);
            adjustMaxHeap(sortBeans, largest, heapMax);
        }
    }

}
