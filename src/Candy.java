/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author keyew7019
 */
public class Candy extends DessertItem {
    
    private double weight;
    private int pricePerLbs;
    
    public Candy(String name, double weight, int pricePerLbs) {
        super(name);
        this.weight = weight;
        this.pricePerLbs = pricePerLbs;
    }
    
    @Override
    public String toString() {
        String fromCandy = "" + weight + " lbs. @ $" + DessertShoppe.cents2dollarsAndCents(pricePerLbs) + " /lb.";
        fromCandy += "\n" + super.getName();
        String l = DessertShoppe.cents2dollarsAndCents(getCost()) + "";
        for (int i = 0; i < DessertShoppe.RECEIPT_WIDTH - super.getName().length() - l.length(); i++) {
            fromCandy += " ";
        }
        fromCandy += DessertShoppe.cents2dollarsAndCents(getCost());
        
        return fromCandy;
    }
    
    @Override
    public int getCost() {
        return (int) Math.round(weight * pricePerLbs);
    }
}
