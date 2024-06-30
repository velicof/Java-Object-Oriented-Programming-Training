package lab5.task2;

import lab5.task1.CounterOutTask;
import lab5.task1.Task;

import java.util.ArrayList;
import java.util.List;

public class Queue implements Container{
    private List<Task> taskList = new ArrayList<>();
    @Override
    public Task pop() {
        if(isEmpty()) {
            return null;
        }else{
            return taskList.remove(0);
        }
    }

    @Override
    public void push(Task task) {
        taskList.add(task);
    }

    @Override
    public int size() {
        return taskList.size();
    }

    @Override
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override
    public void transferFrom(Container container) {
        while(!container.isEmpty()){
            push(container.pop());
        }
    }


}
