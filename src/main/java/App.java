import states.DraftState;
import states.State;
import tasks.Task;
import tasks.TaskImpl;

import java.util.ArrayList;

public class App {
    public void handle (String query, ArrayList<Task> tasks) {
        String[] parsedQuery = query.split("");
        if (parsedQuery[0].equals("new") && parsedQuery[1].equals("task")){
            StringBuilder builder = new StringBuilder();
            String[] string = deleteFirstElements(parsedQuery, 2);
            for (int i = 1; i < string.length; i++) {
                builder.append(string[i]);
            }
            String str = builder.toString();
            Task task = new TaskImpl(str);
            State state = new DraftState(task);
            tasks.add(task);
        } else {
            State state = tasks.get(Integer.parseInt(parsedQuery[1])).getState();
            if (parsedQuery[0].equals("up")) {
                state.up(deleteFirstElements(parsedQuery, 2));
            }
            if (parsedQuery[0].equals("down")) {
                state.down(deleteFirstElements(parsedQuery, 2));
            }
            if (parsedQuery[0].equals("copy")) {
                tasks.add(tasks.get(Integer.parseInt(parsedQuery[1])).copy());
            }
        }
    }

    private String[] deleteFirstElements(String[] arr, Integer num){
        String[] someArr = new String[arr.length - num];
        for (int i = num; i < arr.length; i++) {
            someArr[i - num] = arr[i];
        }
        return someArr;
    }
}
