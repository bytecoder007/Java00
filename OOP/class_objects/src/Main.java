//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        car c1 = new car();
        c1.color = "Red";
        c1.engine = "M60B40";
        c1.model = "E34";
        c1.infoCar();
        c1.startEngine();
        c1.stopEngine();
        Game myGame = new Game("WT","3000",1000);
        }
    }
