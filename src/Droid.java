public class Droid {
  int batteryLevel;
  String name;

  public Droid(String droidName) {
    name = droidName;
    batteryLevel = 100;
  }

  public String toString() {
    String droid = "Zimri";
    return "Hello, I am a droid. " + "My name is " + name + ".";
  }

  public void performTask(String task) {
    System.out.println(name + " is performing: " + task);
    batteryLevel = batteryLevel - 10;
    System.out.println("The current battery level is "+ batteryLevel);
  }

  public int energyReport() {
  return batteryLevel;
}

  public int energyTransfer() {
  return batteryLevel = 100;
}

  public static void main(String args[]) {
    Droid zimri = new Droid ("Zimri");
    System.out.println(zimri);
    zimri.performTask("dancing");
    zimri.performTask("vacuuming");
    zimri.performTask("dusting");
    zimri.performTask("playing music");
    zimri.performTask("answering the door");
    System.out.println(zimri.energyReport());
    System.out.println(zimri.energyTransfer());
    System.out.println("Success! Battery is now fully charged.");
  }
}