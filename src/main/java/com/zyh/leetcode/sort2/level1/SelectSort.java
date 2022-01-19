package com.zyh.leetcode.sort2.level1;

import com.zyh.leetcode.sort2.base.BaseSort2;
import com.zyh.leetcode.sort2.base.SortBean;

public class SelectSort extends BaseSort2 {

    public SelectSort(SortBean[] sortBeans) {
        super(sortBeans);
    }

    @Override
    public void doSort() {
        int minIndex;
        for (int i = 0; i < sortBeans.length - 1; i++) {
            minIndex = i;
            for (int j = i + 1; j < sortBeans.length - 1; j++) {
                if (compare(sortBeans, minIndex, j)) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                exchange(sortBeans, minIndex, i);
            }
        }
    }
}
