package Intro_to_Multi_Thread;
import java.util.concurrent.*;

////Schedule task using scheduleAtFixedDelay() and scheduleAtFixedRate()
public class AssignEight1 {
    public static void main(String[] args){

        ScheduledExecutorService executorService = Executors.newSingleThreadScheduledExecutor();


        executorService
                .scheduleWithFixedDelay(new Runnable() {
                                            @Override
                                            public void run() {
                                                try {
                                                    Thread.sleep(2000L);
                                                    System.out.println("ScheduleWithFixedDelay Scheduled Task to executed after fixed interval");
                                                } catch (InterruptedException e) {
                                                    e.printStackTrace();
                                                }

                                            }
                                        }
                        ,
                        0,
                        1,
                        TimeUnit.SECONDS);

        executorService
                .scheduleAtFixedRate(new Runnable() {
                                         @Override
                                         public void run() {
                                             try {
                                                 Thread.sleep(2000L);
                                                 System.out.println("ScheduleAtFixedRate Scheduled Task to executed after fixed interval");
                                             } catch (InterruptedException e) {
                                                 e.printStackTrace();
                                             }
                                         }
                                     }
                        ,
                        0,
                        1,
                        TimeUnit.SECONDS);



    }
}
