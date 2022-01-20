package com.zyh.leetcode.sort2.level3

import com.zyh.leetcode.sort2.base.BaseSort2
import com.zyh.leetcode.sort2.base.SortBean


/**
 * 计数排序
 */
class CountingSort(sortBeans: Array<out SortBean>) : BaseSort2(sortBeans) {

    override fun doSort() {
        //初始化计数数组
        val countArray = Array(sortBeans.size) {
            0
        }

        //每种值出现的次数  5出现3次  7出现4次  2出现一次等
        for (sortBean in sortBeans) {
            countArray[sortBean.value]++
        }

        //记录每个值前面有多少数
        var preCount = 0
        var temp = 0
        for (index in countArray.indices) {
            temp = countArray[index]
            countArray[index] = preCount
            preCount += temp
        }

        val result = arrayOfNulls<SortBean>(sortBeans.size)
        var index = 0
        for (sortBean in sortBeans) {
            index = countArray[sortBean.value]
            print("index -> $index    ")
            result[index] = sortBean
            countArray[sortBean.value]++
        }

        for (i in result.indices) {
            sortBeans[i] = result[i]
        }

    }
}