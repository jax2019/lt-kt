package com.zyh.leetcode.sort2.level1;

import com.zyh.leetcode.sort2.base.BaseSort2;
import com.zyh.leetcode.sort2.base.SortBean;

public class InsertSort2 extends BaseSort2 {

    public InsertSort2(SortBean[] sortBeans) {
        super(sortBeans);
    }

    @Override
    public void doSort() {
        int j;
        SortBean currentBean;
        for (int i = 1; i < sortBeans.length; i++) {
            j = i - 1;
            currentBean = sortBeans[i];
            while (j >= 0 && compare(sortBeans[j], currentBean)) {
                sortBeans[j + 1] = sortBeans[j];
                j--;
            }
            sortBeans[j + 1] = currentBean;
        }
    }
}
