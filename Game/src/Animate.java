public class Animate implements Runnable {
    BlockBreakerPanel bp;
    Animate(BlockBreakerPanel b){
        bp=b;
    }
    @Override
    public void run() {
        while(true){
            bp.update();
            try {
                Thread.sleep(10);
            } catch (InterruptedException e){
                e.printStackTrace();
            }

        }
    }
}
