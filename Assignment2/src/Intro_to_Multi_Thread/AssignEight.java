package Intro_to_Multi_Thread;
import java.util.concurrent.*;

//Schedule task using schedule()
public class AssignEight {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ScheduledExecutorService executorService = Executors.newSingleThreadScheduledExecutor();

        executorService
                .schedule(new Runnable() {
                              @Override
                              public void run() {
                                  System.out.println("Task executed after 1 second");
                              }
                          },
                        1,
                        TimeUnit.SECONDS);

        executorService.shutdown();

    }
}
