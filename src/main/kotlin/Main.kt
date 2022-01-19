import com.zyh.leetcode.sort2.base.SortBean
import com.zyh.leetcode.sort2.level2.QuickSort

fun main(args: Array<String>) {
    val array = arrayOf(
        SortBean(16),
        SortBean("C", 3),
        SortBean("A", 14)
    )

    val sort = QuickSort(array)
    sort.printArray()
    sort.doSort()
    sort.printArray()
}