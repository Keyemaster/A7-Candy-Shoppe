/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author keyew7019
 */
public class IceCream extends DessertItem {

    private int cost;

    public IceCream(String name, int cost) {
        super(name);
        this.cost = cost;
    }

    @Override
    public String toString() {
        String fromIceCream = "" + super.getName();
        String e = DessertShoppe.cents2dollarsAndCents(getCost()) + "";
        for (int i = 0; i < DessertShoppe.RECEIPT_WIDTH - super.getName().length() - e.length(); i++) {
            fromIceCream += " ";
        }
        fromIceCream += DessertShoppe.cents2dollarsAndCents(getCost());
        return fromIceCream;

    }

    @Override
    public int getCost() {
        return Math.round(cost);
    }
}
