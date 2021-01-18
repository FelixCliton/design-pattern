package com.newpi.data.state;

/**
 * @author liujie3@yidian-inc.com
 * @version 1.0
 * @date: 2021/1/18 10:54 AM
 * @desc:
 */
public class Context {

    public final static TaskState TASK_INIT = new TaskInitState();
    public final static TaskState SCALE_START = new ScaleStartState();
    public final static TaskState OLD_APP_SCALE_DOWN_START = new OldAppScaleDownState();
    public final static TaskState new_APP_SCALE_UP_START = new NewAppScaleUpState();
    public final static TaskState SCALE_FINISHED = new ScaleFinishedState();

    private Task task;

    private TaskState nextState;

    public TaskState getNextState() {
        return nextState;
    }

    public Task getTask() {
        return task;
    }

    public void setNextState(TaskState nextState) {
        this.nextState = nextState;
    }

    public void setTask(Task task) {
        this.task = task;
    }

    public void handle(){
        nextState.handle(this);
    }
}

