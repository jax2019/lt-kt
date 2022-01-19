package com.zyh.leetcode.sort2.level1;

import com.zyh.leetcode.sort2.base.BaseSort2;
import com.zyh.leetcode.sort2.base.SortBean;

public class SelectSort1 extends BaseSort2 {

    public SelectSort1(SortBean[] sortBeans) {
        super(sortBeans);
    }

    @Override
    public void doSort() {
        int maxIndex = 0;
        int minIndex = 0;
        for (int i = 0; i < sortBeans.length / 2; i++) {
            maxIndex = i;
            minIndex = i;
            for (int j = i + 1; j < sortBeans.length - i; j++) {
                if (compare(sortBeans, minIndex, j)) {
                    minIndex = j;
                }
                if (!compare(sortBeans, maxIndex, j)) {
                    maxIndex = j;
                }
            }

            if (maxIndex == minIndex) {
                break;
            }
            exchange(sortBeans, sortBeans.length - 1 - i, maxIndex);
            //有可能待交换的最小值 刚好在最右边，导致被交换掉了，  所以这里应该更新下最小值的位置。
            if (minIndex == sortBeans.length - i - 1) {
                minIndex = maxIndex;
            }
            exchange(sortBeans, i, minIndex);
        }
    }
}
