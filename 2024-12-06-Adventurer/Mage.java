public class Mage extends Adventurer {
  private String specialName = "Mana";
  private int special, specialMAX;

  public Mage(String name) {
    super(name);
    this.special = 20;
    this.specialMAX = 20;
  }

  public Mage(String name, int hp) {
    super(name, hp);
    this.special = 20;
    this.specialMAX = 20;
  }

  public Mage(String name, int hp, int power) {
    super(name, hp);
    this.special = power;
    this.specialMAX = power;
  }

  public String getSpecialName() {
    return specialName;
  }
  //accessor methods
  public int getSpecial() {
    return special;
  }
  public int getSpecialMax() {
    return specialMAX;
  }

  //mutator method
  public void setSpecial(int n) {
    if (n < 0 || n > specialMAX) {
      System.out.println("Value for special is not within the range 0 to " + specialMAX + "; no change was made!");
      n = special;
    }
    special = n;
  }

  //hurt or hinder the target adventurer
  public String attack(Adventurer other) {
    other.applyDamage(2);
    return getName() + " attacked " + other.getName() + " and dealt 2 damage!";
  }

  //heal or buff the target adventurer
  public String support(Adventurer other) {
    if (other.getHP() == other.getmaxHP()) {
      return other.getName() + " is already at full health!";
    }
    other.setHP(other.getHP() + 1);
    return getName() + " healed " + other.getName() + " 1 hp!";
  }

  //heal or buff self
  public String support() {
    if (getHP() == getmaxHP()) {
      return getName() + " is already at full health!";
    }
    setHP(getHP() + 1);
    return getName() + " healed themself 1 hp!";
  }

  //hurt or hinder the target adventurer, consume some special resource
  public String specialAttack(Adventurer other) {
    if (getSpecial() - 8 < 0) {
      return getName() + " does not have enough " + getSpecialName() + ": " + getSpecial() + "/8";
    }
    other.applyDamage(5);
    setSpecial(getSpecial() - 8);
    return getName() + " applied 5 damage to " + other.getName() + " and used 8 " + getSpecialName() + "!";
  }


}
