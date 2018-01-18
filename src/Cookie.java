/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author keyew7019
 */
public class Cookie extends DessertItem {

    private double number;
    private int pricePer12;

    public Cookie(String name, int number, int pricePer12) {
        super(name);
        this.number = number;
        this.pricePer12 = pricePer12;
    }

    @Override
    public String toString() {
        String fromCookie = "" + number + " @ $" + DessertShoppe.cents2dollarsAndCents(pricePer12) + " /dz";
        fromCookie += "\n" + super.getName();
        String c = DessertShoppe.cents2dollarsAndCents(getCost()) + "";
        for (int i = 0; i < DessertShoppe.RECEIPT_WIDTH - super.getName().length() - c.length(); i++) {
            fromCookie += " ";
        }
        fromCookie += DessertShoppe.cents2dollarsAndCents(getCost());
        return fromCookie;
    }

    @Override
    public int getCost() {
        return (int) Math.round((number * pricePer12) / 12);
    }
}
