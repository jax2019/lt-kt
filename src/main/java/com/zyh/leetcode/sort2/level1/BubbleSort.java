package com.zyh.leetcode.sort2.level1;

import com.zyh.leetcode.sort2.base.BaseSort2;
import com.zyh.leetcode.sort2.base.SortBean;

public class BubbleSort extends BaseSort2 {

    public BubbleSort(SortBean[] sortBeans) {
        super(sortBeans);
    }

    @Override
    public void doSort() {
        for (int i = 0; i < sortBeans.length - 1; i++) {
            for (int j = 0; j < sortBeans.length - 1 - i; j++) {
                if (compare(sortBeans, j, j + 1)) {
                    exchange(sortBeans, j, j + 1);
                }
            }
        }
    }
}
