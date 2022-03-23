package algorithm.linkedlist

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class MiddleOfLinkedListKtTest{
    @Test
    fun `middle node of single node`(){
        val listNode = ListNode(1)
        assertEquals(1, middleNode(listNode)?.`val`)
    }
    @Test
    fun `middle node of two nodes`(){
        val listNode = ListNode(1, ListNode(2))
        assertEquals(2, middleNode(listNode)?.`val`)
    }

    @Test
    fun `middle node of three nodes`(){
        val listNode = ListNode(1,ListNode(2, ListNode(3)))
        assertEquals(2, middleNode(listNode)?.`val`)
    }

    @Test
    fun `middle node of 4 nodes`(){
        val listNode = ListNode(1,ListNode(2, ListNode(3, ListNode(4))))
        assertEquals(3, middleNode(listNode)?.`val`)
    }
}