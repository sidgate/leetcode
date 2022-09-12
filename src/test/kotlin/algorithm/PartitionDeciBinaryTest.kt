package algorithm

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class PartitionDeciBinaryTest {
    @Test
    fun allDesiBinary(){
        //assertEquals(1, minPartitions("0"))
        assertEquals(1, minPartitions("1"))
        assertEquals(1, minPartitions("01"))
        assertEquals(1, minPartitions("10"))
        assertEquals(1, minPartitions("1111111"))
        assertEquals(1, minPartitions("1111111000"))
    }

    @Test
    fun notDesiBinary(){
        assertEquals(2, minPartitions("20"))
        assertEquals(3, minPartitions("32"))
        assertEquals(3, minPartitions("23"))
    }

    @Test
    fun givenInput(){
        assertEquals(8, minPartitions("82734"))
        assertEquals(9, minPartitions("27346209830709182346"))
    }
}

fun minPartitions(n: String): Int {
    val map = mapOf('1' to 1, '2' to 2, '3' to 3, '4' to 4, '5' to 5, '6' to 6, '7' to 7, '8' to 8, '9' to 9, '0' to 0)
    return n.map { map[it]!! }.max()
}