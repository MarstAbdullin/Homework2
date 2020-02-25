package states;

import tasks.Task;
import tasks.TaskImpl;

public class ClosedState extends State {

    public ClosedState(Task taskImpl) {
        super(taskImpl);
    }

    @Override
    public void up(String... args) {
    }

    @Override
    public void down(String... args) {
    }

}
