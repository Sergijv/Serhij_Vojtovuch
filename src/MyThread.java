public class MyThread extends Thread{
    int waitTime;
    int reapitTimes;
    String measege;

    public MyThread(int waitTime, int reapitTimes, String measege) {
        this.waitTime = waitTime;
        this.reapitTimes = reapitTimes;
        this.measege = measege;
    }

    @Override
        public void run() {
            for (int i = 0; i < reapitTimes; i++) {
                System.out.println(measege);
                try {
                    super.sleep(waitTime);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
}
