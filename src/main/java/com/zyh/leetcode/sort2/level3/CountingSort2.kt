package com.zyh.leetcode.sort2.level3

import com.zyh.leetcode.sort2.base.BaseSort2
import com.zyh.leetcode.sort2.base.SortBean

class CountingSort2(sortBeans: Array<out SortBean>) : BaseSort2(sortBeans) {

    override fun doSort() {
        if (sortBeans.size == 1) {
            return
        }

        var min = sortBeans[0].value
        var max = sortBeans[0].value

        for (index in sortBeans.indices) {
            if (sortBeans[index].value > max) {
//                max = sortBeans[index]
            }
        }
    }
}