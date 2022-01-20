import com.zyh.leetcode.sort2.base.SortBean
import com.zyh.leetcode.sort2.level2.QuickSort
import com.zyh.leetcode.sort2.level3.CountingSort


fun main() {

    val array = getData()
    val sort = CountingSort(array)
    sort.printArray()
    sort.doSort()
    sort.printArray()

    //bubble  ->    比较次数：378,   交换次数：159
    //              比较次数：333,   交换次数：159
    //              比较次数：301,   交换次数：159

    //select  ->    比较次数：351,   交换次数：24
    //              比较次数：392,   交换次数：28    二元交换，为什么性能并没有变好

    //insert交换  ->  比较次数：184,   交换次数：159

    //shell     ->  比较次数：130,   交换次数：54
    //shell2    ->  比较次数：130,   交换次数：54
    //heap      ->  比较次数：183,   交换次数：111

    //quick     ->  比较次数：122,   交换次数：39
    //quick2    ->  比较次数：114,   交换次数：32

    //merge     ->  比较次数：106,   交换次数：0
}

fun getData(): Array<SortBean> {
    return arrayOf(
        SortBean(16),
        SortBean("C", 3),
        SortBean(22),
        SortBean(19),
        SortBean(21),
        SortBean("A", 10),
        SortBean("B", 3),
        SortBean("C", 14),
        SortBean("A", 3),
        SortBean("B", 14),
        SortBean(23),
        SortBean(5),
        SortBean("B", 10),
        SortBean(18),
        SortBean(8),
        SortBean("B", 11),
        SortBean(4),
        SortBean(15),
        SortBean(2),
        SortBean("A", 17),
        SortBean("A", 11),
        SortBean(9),
        SortBean(12),
        SortBean(7),
        SortBean(13),
        SortBean(6),
        SortBean("B", 17),
        SortBean(20)
    )
}