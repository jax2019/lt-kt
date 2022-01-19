package com.zyh.leetcode.sort2.level2;

import com.zyh.leetcode.sort2.base.BaseSort2;
import com.zyh.leetcode.sort2.base.SortBean;

public class MergeSort extends BaseSort2 {

    public MergeSort(SortBean[] sortBeans) {
        super(sortBeans);
    }

    @Override
    public void doSort() {
        if (sortBeans.length == 0) {
            return;
        }
        SortBean[] resultBeans = new SortBean[this.sortBeans.length];
        mergeSort(sortBeans, 0, sortBeans.length - 1, resultBeans);
    }

    private void mergeSort(SortBean[] sortBeans, int start, int end, SortBean[] result) {
        if (start == end) {
            return;
        }
        int middle = (start + end) / 2;
        mergeSort(sortBeans, start, middle, result);
        mergeSort(sortBeans, middle + 1, end, result);
        doMerge(sortBeans, start, end, result);
    }

    private void doMerge(SortBean[] sourceArray, int start, int end, SortBean[] result) {
        int end1 = (start + end) / 2;
        int start2 = end1 + 1;

        int index1 = start;
        int index2 = start2;
        int resultIndex = start;
        while (index1 <= end1 && index2 <= end) {
            if (compare(sourceArray, index2, index1)) {
                result[resultIndex++] = sourceArray[index1++];
            } else {
                result[resultIndex++] = sourceArray[index2++];
            }
        }
        while (index1 <= end1) {
            result[resultIndex++] = sourceArray[index1++];
        }
        while (index2 <= end) {
            result[resultIndex++] = sourceArray[index2++];
        }
        // 将 result 操作区间的数字拷贝到 arr 数组中，以便下次比较
        for (int i = start; i <= end; i++) {
            sourceArray[i] = result[i];
        }
    }
}
