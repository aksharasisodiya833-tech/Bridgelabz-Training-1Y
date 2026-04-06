package smartHomeAutomation;

public class Runner {
    public static void main(String[] args) {
        SmartHome TempSensor = new SmartHome("Temperature Sensor", 5);
        SmartHome SecCamera = new SmartHome("Security Camera", 3);
        SmartHome Lightcontroller = new SmartHome("Light Controller", 4);
        SmartHome Doorlock = new SmartHome("Door Lock Monitor", 6);


        Thread t1 = new Thread(TempSensor);
        Thread t2 = new Thread(SecCamera);
        Thread t3 = new Thread(Lightcontroller);
        Thread t4 = new Thread(Doorlock);

        t1.setPriority(10);
        t2.setPriority(7);
        t3.setPriority(5);
        t4.setPriority(5);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
