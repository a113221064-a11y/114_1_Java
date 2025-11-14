public class Magician extends Role {

    private int healPower ;

    public Magician(String name, int health, int attackPower) {
      super(name, health,attackPower);
      this.healPower = healPower;
    }

    public int getHealPower() {
        return healPower;
    }
    public void attack(Magician opponent) {
        opponent.setHealth(opponent.getHealth() - this.getAttackPower());
        System.out.println(this.getName() + " attacks " + opponent.getName() + " for " + this.getAttackPower() + " damage.");
    }

    public void healpower(SwordsMan ally){
        ally.setHealth(ally.getHealth() + this.healPower);
        System.out.println(this.getName() + " heals " + ally.getName() + " for " + this.healPower + " health.");
    }
        public boolean isAlive() {
        return this.getHealth() > 0;
    }

    public String toString() {
        return "Name: " + getName() + ", Health: " + getHealth() + ", Attack Power: " + getAttackPower() + ", Heal Power: " + healPower;
    }
}
