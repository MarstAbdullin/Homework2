package tasks;

import states.State;

public interface Task {
    public Integer getTesterId();

    public void setTesterId(Integer testerId);

    public State getState();

    void setState(State state);

    public String getText();

    void setText(String text);

    public String getError();

    void setError(String error);

    public void setDevId(Integer devId);

    public Integer getDevId();

    public Task copy();
}
