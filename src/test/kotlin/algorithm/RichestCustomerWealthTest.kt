package algorithm

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class RichestCustomerWealthTest {
    @Test fun single(){
        assertEquals(1, maximumWealth(arrayOf(intArrayOf(1))))
    }
    @Test fun singleSum(){
        assertEquals(3, maximumWealth(arrayOf(intArrayOf(1,2))))
    }
    @Test fun maxOfMultiple(){
        assertEquals(3, maximumWealth(arrayOf(intArrayOf(1,2), intArrayOf(1,1))))
    }
    @Test fun givenInput(){
        assertEquals(6, maximumWealth(arrayOf(intArrayOf(1,2,3), intArrayOf(3,2,1))))
        assertEquals(10, maximumWealth(arrayOf(intArrayOf(1,5), intArrayOf(7,3), intArrayOf(3,5))))
        assertEquals(17, maximumWealth(arrayOf(intArrayOf(2,8,7), intArrayOf(7,1,3), intArrayOf(1,9,5))))
    }
}
fun maximumWealth(accounts: Array<IntArray>): Int {
    return accounts.map { it.sum() }.max()
}