package com.kodill.good.patterns.flights;

public class ChangeFly {
    Flight first;
    Flight second;

    public ChangeFly(Flight first, Flight second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public String toString() {
        return "Fly from " + first.departure +" to " + second.arrival + " with stop at " + first.arrival +"\n";
    }
}
