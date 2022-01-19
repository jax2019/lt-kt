package com.zyh.leetcode.sort2.base;

public abstract class BaseSort2 implements SortAction {

    protected final SortBean[] sortBeans;

    public BaseSort2(SortBean[] sortBeans) {
        if (sortBeans == null) {
            this.sortBeans = new SortBean[]{};
        } else {
            this.sortBeans = sortBeans;
        }

    }

    /**
     * 比较次数
     */
    protected int compareTimes;

    protected int exchangeTimes;

    @Override
    public boolean compare(SortBean[] array, int front, int rear) {
        compareTimes++;
        return array[front].value > array[rear].value;
    }

    @Override
    public boolean compare(SortBean frontBean, SortBean rearBean) {
        compareTimes++;
        return frontBean.value > rearBean.value;
    }

    @Override
    public void exchange(SortBean[] array, int from, int to) {
        exchangeTimes++;
        SortBean tempBean = array[from];
        array[from] = array[to];
        array[to] = tempBean;
    }

    protected void printArray(SortBean[] array) {
        for (int i = 0; i < array.length; i++) {
            SortBean sortBean = array[i];
            if (sortBean.name == null) {
                System.out.printf("%5s", sortBean.value);
            } else {
                System.out.printf("%5s", sortBean.value + "" + sortBean.name);
            }
            if (i % 10 == 0 && i > 100) {
                System.out.println("");
            }
        }
        System.out.println("");
    }

    public void printArray() {
        printArray(sortBeans);
    }

    public void printPerformanceData() {
        System.out.printf("比较次数：%d,   交换次数：%d%n", compareTimes, exchangeTimes);
    }
}
