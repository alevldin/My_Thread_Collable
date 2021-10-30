import java.util.concurrent.Callable;

class MyCall implements Callable<Integer> {
    private final int count;

    public MyCall(int flow) {
        this.count = flow;
    }

    @Override
    public Integer call() {
        int value = 0;
        try {
            while (value < 3) {
                Thread.sleep(2500);
                System.out.println(Thread.currentThread().getName());
                value++;
            }
        } catch (InterruptedException err) {
        }
        return count;
    }
}

