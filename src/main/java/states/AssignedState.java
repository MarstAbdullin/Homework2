package states;

import tasks.Task;

public class AssignedState extends State {

    public AssignedState(Task taskImpl) {
        super(taskImpl);
    }

    public void up(String... args) {
        log("up");
        taskImpl.setState(new InProgressState(taskImpl));
    }

    public void down(String... args) {
        log("down");
        taskImpl.setState(new OpenState(taskImpl));
        taskImpl.setDevId(null);
    }

}
