public class Droid {
    // instance variables
    String name;
    int batteryLevel;

    //constructor
    public Droid(String droidName) {
        name = droidName;
        batteryLevel = 100;
    }

    // methods
    public void performTask(String task) {
        System.out.println(name + " is performing task: " + task);
        batteryLevel = batteryLevel - 10;
    }

    public String toString() {
        return "Hello, Im the droid " + name;
    }

    public void energyReport(){
        System.out.println( name+ " battery level is: " +batteryLevel);
    }

    public void energyTransfer(Droid from, Droid to, int amount){
        from.batteryLevel =  from.batteryLevel - amount;
        to.batteryLevel = to.batteryLevel + amount;
    }

    public static void main(String[] args) {
        Droid d0 = new Droid("Mei");
        System.out.println(d0);
        d0.energyReport();
        d0.performTask("dancing");
        d0.energyReport();
        d0.performTask("studying");
        d0.energyReport();
        d0.performTask("playing");
        d0.energyReport(); //70%

        System.out.println();

        Droid d1 = new Droid("wini");
        System.out.println(d1);
        d1.energyReport();
        d1.performTask("coding");
        d1.energyReport();
        d1.performTask("training");
        d1.energyReport();//90%

        System.out.println();
        System.out.println("Mei's battery before transfer is "+d0.batteryLevel);
        System.out.println("Wini's battery before transfer is "+d1.batteryLevel);
        d1.energyTransfer(d0, d1,10);
        d1.energyReport();
        System.out.println("Mei's battery after transfer is "+d0.batteryLevel);
        System.out.println("Wini's battery after transfer is "+d1.batteryLevel);
    }
}