package com.zyh.leetcode.sort2.level1;

import com.zyh.leetcode.sort2.base.BaseSort2;
import com.zyh.leetcode.sort2.base.SortBean;

public class BubbleSort1 extends BaseSort2 {

    public BubbleSort1(SortBean[] sortBeans) {
        super(sortBeans);
    }

    @Override
    public void doSort() {
        boolean isExchange;
        for (int i = 0; i < sortBeans.length - 1; i++) {
            isExchange = false;
            for (int j = 0; j < sortBeans.length - 1 - i; j++) {
                if (compare(sortBeans, j, j + 1)) {
                    exchange(sortBeans, j, j + 1);
                    isExchange = true;
                }
            }
            if (!isExchange) {
                break;
            }
        }
    }
}
