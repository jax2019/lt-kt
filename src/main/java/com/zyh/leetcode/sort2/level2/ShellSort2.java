package com.zyh.leetcode.sort2.level2;

import com.zyh.leetcode.sort2.base.BaseSort2;
import com.zyh.leetcode.sort2.base.SortBean;

public class ShellSort2 extends BaseSort2 {

    public ShellSort2(SortBean[] sortBeans) {
        super(sortBeans);
    }

    @Override
    public void doSort() {
        SortBean currentBean;
        int preIndex;
        for (int gap = sortBeans.length >> 2; gap > 0; gap >>= 2) {
            for (int index = gap; index < sortBeans.length; index++) {
                currentBean = sortBeans[index];
                preIndex = index - gap;
                while (preIndex >= 0 && compare(sortBeans[preIndex], currentBean)) {
                    exchangeTimes++;
                    sortBeans[preIndex + gap] = sortBeans[preIndex];
                    preIndex -= gap;
                }
                sortBeans[preIndex + gap] = currentBean;
            }
        }
    }
}
