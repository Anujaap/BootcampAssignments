package Intro_to_Multi_Thread;
import java.util.*;
import java.util.concurrent.*;

//Submit List of tasks to ExecutorService and wait for the completion of all the tasks.
public class AssignSev {
    public static void main(String[] args) throws InterruptedException {
        List<Callable<Integer>> runnableList = new ArrayList<>();

        runnableList.add(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                return 1;
            }
        });
        runnableList.add(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                return 2;
            }
        });
        runnableList.add(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                return 3;
            }
        });
        runnableList.add(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                return 4;
            }
        });

        ExecutorService executorService = Executors
                .newSingleThreadExecutor();

        List<Future<Integer>> futureList = executorService.invokeAll(runnableList);
        futureList.forEach((e)->{
            if(e.isDone()){
                try {
                    System.out.println(e.get());
                } catch (InterruptedException e1) {
                    e1.printStackTrace();
                } catch (ExecutionException e1) {
                    e1.printStackTrace();
                }
            }
        });

    }
}
