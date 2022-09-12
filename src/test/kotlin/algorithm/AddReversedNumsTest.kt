package algorithm

import kotlin.test.Test
import kotlin.test.assertEquals

class AddReversedNumsTest {
    @Test
    fun single(){
        assertEquals(ListNode(2), addTwoNumbers(ListNode(1), ListNode(1)))
    }

    @Test
    fun oneAndTwoDigit(){
        assertEquals(ListNode(2,ListNode(1)), addTwoNumbers(ListNode(1, ListNode(1)), ListNode(1)))
    }

    @Test
    fun given3Digits(){
        assertEquals(ListNode(7, ListNode(0, ListNode(8))), addTwoNumbers(
            ListNode(2,ListNode(4,ListNode(3))),
            ListNode(5, ListNode(6, ListNode(4)))
        )
        )
    }
    @Test fun givenDiffDigits(){
        assertEquals(ListNode(8,
            ListNode(9, ListNode(9, ListNode(9, ListNode(0, ListNode(0, ListNode(0, ListNode(1)))))))
        ),
            addTwoNumbers(
                ListNode(9, ListNode(9, ListNode(9, ListNode(9, ListNode(9, ListNode(9 ,ListNode(9))))))),
                ListNode(9,ListNode(9,ListNode(9,ListNode(9))))
                ))
    }
}


data class ListNode(var `val`: Int, var next: ListNode? = null) {

}

fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
    val root = ListNode(0)
    var next = root
    var first = l1
    var second = l2
    var carry = 0
    while(first != null || second !=null){
        var dsum = (first?.`val` ?:0) + (second?.`val` ?:0) + carry
        if(dsum>=10) {
            dsum -= 10
            carry = 1
        } else carry = 0
        next.next = ListNode(dsum)
        first = first?.next
        second = second?.next
        next = next.next!!
    }
    if(carry == 1) next.next = ListNode(1)
    return root.next
}