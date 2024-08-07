public class Game {
    private String player;
    private String damage;
    private int hp;
    public Game(String player, String damage, int hp) {
        this.player = player; //Baska bir sınıfın veya kodun bir instance (nesne) elde etmesine
        this.damage = damage; //izin vermesinin geleneksel yolu, public bir constructorla tanımlamaktır.
        this.hp = hp;
    }
    public String getPlayer()
    {
        return player;
    }
    public String getDamage()
    {
        return damage;
    }
    public int getHp()
    {
        return hp;
    }
    public void displayInfo(){
        System.out.println("Player: " + player);
        System.out.println("Damage: " + damage);
        System.out.println("HP: " + hp);
    }

}
