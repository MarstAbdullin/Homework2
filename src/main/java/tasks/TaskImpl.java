package tasks;

import states.State;

public class TaskImpl implements Task{
    private State state = null;
    private String text = null;
    private String error = null;
    private Integer devId = null;
    private Integer testerId = null;

    public TaskImpl() {
    }

    public TaskImpl(String text) {
        this.text = text;
    }

    public TaskImpl(State state, String text, String error, Integer devId, Integer testerId) {
        this.state = state;
        this.text = text;
        this.error = error;
        this.devId = devId;
        this.testerId = testerId;
    }

    public Task copy(){
        return new TaskImpl(this.state, this.text, this.error, this.devId, this.testerId);
    }

    public Integer getTesterId() {
        return testerId;
    }

    public void setTesterId(Integer testerId) {
        this.testerId = testerId;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public Integer getDevId() {
        return devId;
    }

    public void setDevId(Integer devId) {
        this.devId = devId;
    }

}
