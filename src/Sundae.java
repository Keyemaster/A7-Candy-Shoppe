/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author keyew7019
 */
public class Sundae extends IceCream {

    private String toppingName;
    private int toppingCost;

    public Sundae(String name, int cost, String toppingName, int toppingCost) {
        super(name, cost);
        this.toppingName = toppingName;
        this.toppingCost = toppingCost;
    }

    @Override
    public String toString() {
        String fromSundae = "\n" + toppingName + " with " + "\n";
        fromSundae += super.getName();
        String s = DessertShoppe.cents2dollarsAndCents(getCost()) + "";
        for (int i = 0; i < DessertShoppe.RECEIPT_WIDTH - super.getName().length() - s.length(); i++) {
            fromSundae += " ";
        }
        fromSundae += DessertShoppe.cents2dollarsAndCents(getCost());
        return fromSundae;
    }

    @Override
    public int getCost() {
        return Math.round(super.getCost() + toppingCost);
    }
}
