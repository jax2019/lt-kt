package com.zyh.leetcode.sort;

import com.zyh.leetcode.sort.base.BaseSort;

public class QuickShort extends BaseSort {

    public QuickShort(int[] array) {
        super(array);
    }

    @Override
    public void doSort() {
        doQuickSort(array, 0, array.length - 1);
    }

    private void doQuickSort(int[] array, int start, int end) {
        if (start >= end) {
            return;
        }
        int middle = partition(array, start, end);
        doQuickSort(array, start, middle - 1);
        doQuickSort(array, middle + 1, end);
    }

    private int partition(int[] array, int start, int end) {
        int pivot = array[start];
        int left = start + 1;
        int right = end;

        while (left < right) {
            while (left < right && array[left] <= pivot) {
                left++;
                
                
            }
            if (left != right) {
                exchange(left, right);
                right--;
            }
        }

        if (left == right && array[right] > pivot) {
            right--;
        }
        if (right != start) {
            exchange(right, start);
        }

        return right;
    }
}
