package com.zyh.leetcode.sort2.level1;

import com.zyh.leetcode.sort2.base.BaseSort2;
import com.zyh.leetcode.sort2.base.SortBean;

public class InsertSort extends BaseSort2 {

    public InsertSort(SortBean[] sortBeans) {
        super(sortBeans);
    }

    @Override
    public void doSort() {
        //从第一个开始比较，  只有一个元素时，不需要比价
        int j;
        for (int i = 1; i < sortBeans.length; i++) {
            j = i;
            while (j >= 1 && compare(sortBeans, j - 1, j)) {
                exchange(sortBeans, j - 1, j);
                j--;
            }
        }
    }
}
