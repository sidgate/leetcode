package algorithm.linkedlist

fun middleNode(head: ListNode): ListNode? {
    var i: ListNode? = head
    var j = head.next
    while(j!=null){
        j = j.next?.next
        i = i?.next
    }
    return i
}

class ListNode(val `val`: Int, val next: ListNode? = null)