package com.zyh.leetcode.sort2.level1;

import com.zyh.leetcode.sort2.base.BaseSort2;
import com.zyh.leetcode.sort2.base.SortBean;

public class BubbleSort2 extends BaseSort2 {

    public BubbleSort2(SortBean[] sortBeans) {
        super(sortBeans);
    }

    @Override
    public void doSort() {
        boolean isExchange = true;

        int maxCompareIndex = sortBeans.length - 1;
        int lastCompareIndex = -1;
        while (isExchange) {
            isExchange = false;
            for (int j = 0; j < maxCompareIndex; j++) {
                if (compare(sortBeans, j, j + 1)) {
                    exchange(sortBeans, j, j + 1);
                    isExchange = true;
                    lastCompareIndex = j;
                }
            }
            maxCompareIndex = lastCompareIndex;
        }

    }
}
