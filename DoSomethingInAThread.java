import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class DoSomethingInAThread implements Runnable
{
   static int i=0;
   public static void main(String[] args) throws ExecutionException, InterruptedException
   {
	 
      //limit the number of actual threads
      int poolSize = 10;
      ExecutorService service = Executors.newFixedThreadPool(poolSize);
      List<Future<Runnable>> futures = new ArrayList<Future<Runnable>>();

      for (int n = 0; n < 1000; n++)
      {
         Future f = service.submit(new DoSomethingInAThread());
         futures.add(f);
      }

      // wait for all tasks to complete before continuing
      for (Future<Runnable> f : futures)
      {
         f.get();
      }

      //shut down the executor service so that this thread can exit
      service.shutdownNow();
   }

   public void run()
   {
      System.out.println("Thread =>"+ (i++));
   }
}