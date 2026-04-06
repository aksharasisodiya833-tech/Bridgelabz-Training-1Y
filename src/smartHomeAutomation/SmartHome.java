package smartHomeAutomation;

public class SmartHome implements Runnable{
    String deviceName;
    int interval;

    public SmartHome(String deviceName,int interval){
        this.deviceName=deviceName;
        this.interval=interval;
    }

    @Override
    public void run() {
        for(int i=0;i<=5;i++){
            System.out.println("which device "+deviceName + " at what interval "+interval);
            System.out.println("------------------------------------------------------------");
        }
        try {
            Thread.sleep(interval*1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
