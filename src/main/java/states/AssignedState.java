package states;

import tasks.Task;

public class AssignedState extends State {

    public AssignedState(Task taskImpl) {
        super(taskImpl);
    }

    public void up(String... args) {
        taskImpl.setState(new InProgressState(taskImpl));
    }

    public void down(String... args) {
        taskImpl.setState(new OpenState(taskImpl));
        taskImpl.setDevId(null);
    }

}
