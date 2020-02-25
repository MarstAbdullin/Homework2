package states;

import tasks.Task;

public abstract class State {
    protected Task taskImpl;

    public State(Task taskImpl) {
        this.taskImpl = taskImpl;
    }

    public abstract void up(String... args);
    public abstract void down(String... args);

}
