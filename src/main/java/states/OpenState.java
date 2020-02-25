package states;

import tasks.Task;

public class OpenState extends State {

    public OpenState(Task taskImpl) {
        super(taskImpl);
    }

    public void up(String... args) {
        log("up");
        taskImpl.setState(new AssignedState(taskImpl));
        taskImpl.setDevId(Integer.parseInt(args[0]));
    }

    public void down(String... args) {
        log("down");
        taskImpl.setState(new BacklogState(taskImpl));
    }

}
