package com.zyh.leetcode.sort2.level2;

import com.zyh.leetcode.sort2.base.BaseSort2;
import com.zyh.leetcode.sort2.base.SortBean;

/**
 * 非递归实现
 */
public class HeapSort2 extends BaseSort2 {

    public HeapSort2(SortBean[] sortBeans) {
        super(sortBeans);
    }

    @Override
    public void doSort() {
        buildMaxHeap();
        for (int i = sortBeans.length - 1; i > 0; i--) {
            exchange(sortBeans, 0, i);
            adjustMaxHeap(0, i);
        }
    }

    private void buildMaxHeap() {
        for (int i = sortBeans.length / 2 - 1; i >= 0; i--) {
            adjustMaxHeap(i, sortBeans.length);
        }
    }

    private void adjustMaxHeap(int parentIndex, int heapSize) {
        SortBean temp = sortBeans[parentIndex];
        int childIndex = parentIndex * 2 + 1;
        while (childIndex < heapSize) {
            if (childIndex + 1 < heapSize && compare(sortBeans, childIndex + 1, childIndex)) {
                childIndex++;
            }

            if (compare(temp, sortBeans[childIndex])) {
                break;
            }
            sortBeans[parentIndex] = sortBeans[childIndex];
            parentIndex = childIndex;
            childIndex = parentIndex * 2 + 1;
        }
        sortBeans[parentIndex] = temp;
    }
}
