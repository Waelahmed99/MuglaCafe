package MuglaCaffe;

import MuglaCaffe.Beverages.*;

class Order {
    private double cost;
    private String receiptMessage;

    Order() {
        cost = 0;
        receiptMessage = "";
    }

    double totalCost() {
        return cost;
    }

    @Override
    public String toString() {
        return receiptMessage + "Total : " + cost;
    }

    void add(OrderItem item) {
        cost += (item.beverage.cost() * item.amount);
        receiptMessage += (String.valueOf(item.amount) + " ");
        if (item.beverage.size == 0)
            receiptMessage += "Small ";
        else if (item.beverage.size == 1)
            receiptMessage += "Medium ";
        else
            receiptMessage += "Large ";
        receiptMessage += item.beverage.name;
        if (item.beverage instanceof CaffeineBeverage) {
            CaffeineBeverage beverage = (CaffeineBeverage) item.beverage;
            if (beverage.hasMilk)
                receiptMessage += " with Milk ";
            else
                receiptMessage += " without Milk ";
        } else {
            TeaBeverage beverage = (TeaBeverage) item.beverage;
            if (beverage.hasLemon)
                receiptMessage += " with Lemon ";
            else
                receiptMessage += " without Lemon ";
        }
        receiptMessage += String.valueOf(item.beverage.cost() * item.amount);
        receiptMessage += " TL\n";
    }
}

class OrderItem {
    Beverage beverage;
    int amount;

    OrderItem(Beverage beverage, int amount) {
        this.beverage = beverage;
        this.amount = amount;
    }
}