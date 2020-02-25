package states;

import tasks.Task;

public class InProgressState extends State {

    public InProgressState(Task taskImpl) {
        super(taskImpl);
    }

    public void up(String... args) {
        taskImpl.setState(new ResolvedState(taskImpl));
    }

    public void down(String... args) {
        taskImpl.setState(new AssignedState(taskImpl));
    }


}
