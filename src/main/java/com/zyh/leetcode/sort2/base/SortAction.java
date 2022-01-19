package com.zyh.leetcode.sort2.base;

public interface SortAction {

    boolean compare(SortBean[] array, int front, int rear);

    boolean compare(SortBean frontBean, SortBean rearBean);

    void exchange(SortBean[] array, int front, int rear);

    void doSort();
}
