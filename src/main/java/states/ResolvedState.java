package states;

import tasks.Task;
import tasks.TaskImpl;

public class ResolvedState extends State {

    public ResolvedState(Task taskImpl) {
        super(taskImpl);
    }

    @Override
    public void up(String... args) {
        taskImpl.setState(new TestingState(taskImpl));
        taskImpl.setTesterId(Integer.parseInt(args[0]));
    }

    @Override
    public void down(String... args) {
        taskImpl.setState(new InProgressState(taskImpl));
    }

}
