public class MyRunnableImplementation implements Runnable {

    // We are creating anew class that implements the Runnable interface,
    // so we need to override and implement it's only method, run().

    @Override
   public void run() {
       

        for (int i = 0; i < 5; i++) {            

            System.out.println(Thread.currentThread().getName() +

                    "\twith Runnable: MyRunnableImplementation runs..." + i);

        }

    }

}
