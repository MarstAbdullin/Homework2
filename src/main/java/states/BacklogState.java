package states;

import tasks.Task;
import tasks.TaskImpl;

public class BacklogState extends State {

    public BacklogState(Task taskImpl) {
        super(taskImpl);
    }

    public void up(String... args) {
        taskImpl.setState(new OpenState(taskImpl));
    }

    public void down(String... args) {
    }

}
