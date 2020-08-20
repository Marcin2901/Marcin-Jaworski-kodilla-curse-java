package com.kodilla.patterns.factory.tasks;

public final class ShoppingTask implements Task {
    final String taskName;
    final String whtaToBuy;
    final double quantity;
    private boolean execute = false;

    public ShoppingTask(final String taskName, final String whtaToBuy, final double quantity) {
        this.taskName = taskName;
        this.whtaToBuy = whtaToBuy;
        this.quantity = quantity;
    }
    @Override
    public void executeTask() {
        this.execute = true;
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public boolean isTaskExecuted() {
        return execute;
    }
}
