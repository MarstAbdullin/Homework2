package states;

import tasks.Task;

public class OpenState extends State {

    public OpenState(Task taskImpl) {
        super(taskImpl);
    }

    public void up(String... args) {
        taskImpl.setState(new AssignedState(taskImpl));
        taskImpl.setDevId(Integer.parseInt(args[0]));
    }

    public void down(String... args) {
        taskImpl.setState(new BacklogState(taskImpl));
    }

}
