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
	return getName() + " attacked " + other + " and dealt 2 damage!" + stillAlive(other);
  }

  //heal or buff the target adventurer
  public String support(Adventurer other) {
    if (other.getHP() == other.getmaxHP()) {
      return getName() + " tried to heal " + other + ", but they were already at full health!";
    }
    other.setHP(other.getHP() + 1);
    return getName() + " healed " + other + " 1 hp! They are now at " + other.getHP() + "/" + other.getmaxHP() + " health!";
  }

  //heal or buff self
  public String support() {
    if (getHP() == getmaxHP() && getSpecial() == getSpecialMax()) {
      return getName() + " tried to support themself, but they were already at full health and " + getSpecialName() + "!";
    }
	int addHP = 2 - (getmaxHP() - getHP());
	if (addHP < 0) {
	  addHP = 0;
	}
    setHP(getHP() + addHP);
	restoreSpecial(4);
    return getName() + " healed themself and/or restored some " + getSpecialName() + "! They are now at " + getHP() + "/" + getmaxHP() + " health and " + getSpecial() + " " + getSpecialName() + "!";
  }

  //hurt or hinder the target adventurer, consume some special resource
  public String specialAttack(Adventurer other) {
    if (getSpecial() - 8 < 0) {
      return getName() + " tried to use a specialAttack, but does not have enough " + getSpecialName() + ": " + getSpecial() + "/8";
    }
	setSpecial(getSpecial() - 8);
    other.applyDamage(5);
    return getName() + " applied 5 damage to " + other + " and used 8 " + getSpecialName() + "!" + stillAlive(other)
	  + "\n" + getName() + " has " + getSpecial() + " " + getSpecialName() + " left!";
  }
  
  
  //helper method
  public static String stillAlive(Adventurer wounded) {
	if (wounded.getHP() <= 0) {
	  wounded.setHP(0);
	  return "\n" + wounded + " has lost the battle!";
	}
	return "";
  }

}
