package com.zyh.leetcode.sort.base;

public abstract class BaseSort {

    protected int[] array;

    private int exchangeTimes;
    private int compareTimes;

    public BaseSort(int[] array) {
        this.array = array;
    }

    public abstract void doSort();

    protected void exchange(int from, int to) {
        if (from != to) {
            array[from] = array[from] ^ array[to];
            array[to] = array[from] ^ array[to];
            array[from] = array[from] ^ array[to];
            exchangeTimes++;
        }
    }

    protected boolean compare(int front, int rear) {
        compareTimes++;
        return array[front] > array[rear];
    }

    protected boolean compareWithValue(int frontValue, int behindValue) {
        compareTimes++;
        return frontValue > behindValue;
    }

    public void print() {
        if (array != null) {
            for (int i : array) {
                System.out.print(i + " ");
            }
            System.out.println("");
        }
    }

    public void start() {
        System.out.println("比较前---->");
        print();
        doSort();
        System.out.println("比较后-->");
        print();
        System.out.println("性能数据-->");
        System.out.println("比较次数 = " + compareTimes + "\n");
        System.out.println("交换次数 = " + exchangeTimes + "\n");
    }

}
