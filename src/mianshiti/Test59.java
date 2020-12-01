package mianshiti;

import java.util.Collections;
import java.util.LinkedList;

//此题没有做出来
public class Test59 {
    public static void main(String[] args) {

    }


}

class MaxQueue {
    LinkedList<Integer> linkedList;
    public MaxQueue() {
        linkedList = new LinkedList<>();
    }

    public int max_value() {
        if (linkedList.isEmpty())
            return -1;
        Collections.sort(linkedList);
        return linkedList.getFirst();
    }

    public void push_back(int value) {
        linkedList.addLast(value);
    }

    public int pop_front() {
        if (linkedList.isEmpty())
            return -1;
        return linkedList.removeFirst();
    }
}
