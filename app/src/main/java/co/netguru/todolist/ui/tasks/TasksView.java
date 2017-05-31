package co.netguru.todolist.ui.tasks;

import java.util.List;

import co.netguru.todolist.domain.Task;
import co.netguru.todolist.ui.base.MvpView;

public interface TasksView extends MvpView {

    void displayTasks(List<Task> tasks);
}