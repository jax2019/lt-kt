package com.zyh.leetcode.sort2.level2;

import com.zyh.leetcode.sort2.base.BaseSort2;
import com.zyh.leetcode.sort2.base.SortBean;

public class ShellSort extends BaseSort2 {

    public ShellSort(SortBean[] sortBeans) {
        super(sortBeans);
    }

    @Override
    public void doSort() {

        SortBean currentBean;
        int targetIndex;

        //增量序列  间隔
        for (int gap = sortBeans.length / 2; gap >= 1; gap /= 2) {
            //通过增量序列分割的组
            for (int groupIndex = 0; groupIndex < gap; groupIndex++) {
                //组为初始值， 每次循环  增加gap
                for (int index = groupIndex + gap; index < sortBeans.length; index += gap) {
                    currentBean = sortBeans[index];
                    targetIndex = index - gap;
                    while (targetIndex >= 0 && compare(sortBeans[targetIndex], currentBean)) {
                        exchangeTimes++;
                        sortBeans[targetIndex + gap] = sortBeans[targetIndex];
                        targetIndex -= gap;
                    }
                    sortBeans[targetIndex + gap] = currentBean;
                }
            }
        }
    }
}
