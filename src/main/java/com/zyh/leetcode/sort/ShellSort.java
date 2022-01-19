package com.zyh.leetcode.sort;

import com.zyh.leetcode.sort.base.BaseSort;

public class ShellSort extends BaseSort {

    public ShellSort(int[] array) {
        super(array);
    }

    @Override
    public void doSort() {
        sort2();
    }

    /**
     * 一组一组的处理
     */
    private void sort1() {
        //增量序列
        for (int gap = array.length / 2; gap > 0; gap /= 2) {
            //每一组来一次插入
            for (int groupIndex = 0; groupIndex < gap; groupIndex++) {
                //插入排序
                for (int index = groupIndex + gap; index < array.length; index += gap) {
                    int current = array[index];
                    int preIndex = index - gap;
                    while (preIndex >= groupIndex && current < array[preIndex]) {
                        array[preIndex + gap] = array[preIndex];
                        preIndex -= gap;
                    }
                    array[preIndex + gap] = current;
                }
            }
        }
    }


    /**
     * 在数组中一个一个 跳跃式插入
     */
    private void sort2() {
        //增量序列
        for (int gap = array.length / 2; gap > 0; gap /= 2) {
            //从gap开始一个一个尝试往前插入
            for (int i = gap; i < array.length; i++) {
                int currentValue = array[i];
                int preIndex = i - gap;
                while (preIndex >= 0 && compareWithValue(array[preIndex], currentValue)) {
                    array[preIndex + gap] = array[preIndex];
                    preIndex -= gap;
                }
                if (preIndex + gap != i) {
                    array[preIndex + gap] = currentValue;
                }
            }
        }
    }
}
