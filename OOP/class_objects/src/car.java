public class car {
    //ATTRIBUTES
    String color;
    String model;
    String engine;
    int year;
    public void infoCar()
    {
        System.out.println("Car model is " + model +"Car Engine is " + engine + " Car color: " + color);
    }
    public void startEngine()
    {
        System.out.println("Engine started.");
    }
    public void stopEngine(){
        System.out.println("Engine Stopped.");
    }

}
