package org.example;

public enum Weapon {
    SWORD(20,3.2),
    AXE(40,2.0),
    BOW(15,3.9);

    int damage;
    double attackSpeed;

    Weapon(int damage,double attackSpeed) {
        this.damage = damage;
        this.attackSpeed = attackSpeed;

    }

    public int getDamage() {
        return damage;
    }

    public double getAttackSpeed() {
        return attackSpeed;
    }



}
