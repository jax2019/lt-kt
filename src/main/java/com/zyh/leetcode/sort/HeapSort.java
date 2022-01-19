package com.zyh.leetcode.sort;

import com.zyh.leetcode.sort.base.BaseSort;

public class HeapSort extends BaseSort {

    public HeapSort(int[] array) {
        super(array);
    }

    @Override
    public void doSort() {
        //构建初始最大堆
        buildMaxHeap();
        //逐个交换到尾部  并再次构建为最大堆
        for (int i = array.length - 1; i > 0; i--) {
            exchange(0, i);
            doMaxHeap(0, i);
        }
    }

    private void buildMaxHeap() {
        for (int i = array.length / 2 - 1; i >= 0; i--) {
            doMaxHeap(i, array.length);
        }
    }

    private void doMaxHeap(int i, int heapSize) {
        int left = 2 * i + 1;
        int largest = i;
        if (left < heapSize && array[left] > array[largest]) {
            largest = left;
        }

        int right = left + 1;
        if (right < heapSize && array[right] > array[largest]) {
            largest = right;
        }

        if (largest != i) {
            exchange(i, largest);
            doMaxHeap(largest, heapSize);
        }


    }
}
