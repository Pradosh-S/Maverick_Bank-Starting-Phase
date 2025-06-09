package com.hexaware.entity;

import java.time.LocalDateTime;

public class Transaction {

    private long transactionId;
    private String transactionType;
    private double amount;
    private LocalDateTime timestamp;
    private long accountId;
    private long customerId;
    private String destinationAccountId;

    public Transaction(long transactionId, String transactionType, double amount, LocalDateTime timestamp,
            long accountId, long customerId, String destinationAccountId) {
        this.transactionId = transactionId;
        this.transactionType = transactionType;
        this.amount = amount;
        this.timestamp = timestamp;
        this.accountId = accountId;
        this.customerId = customerId;
        this.destinationAccountId = destinationAccountId;
    }

    public long getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(long transactionId) {
        this.transactionId = transactionId;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    public long getAccountId() {
        return accountId;
    }

    public void setAccountId(long accountId) {
        this.accountId = accountId;
    }

    public long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(long customerId) {
        this.customerId = customerId;
    }

    public String getDestinationAccountId() {
        return destinationAccountId;
    }

    public void setDestinationAccountId(String destinationAccountId) {
        this.destinationAccountId = destinationAccountId;
    }

    public static void main(String[] args) {
        Transaction transaction = new Transaction(
                10L,
                "Transfer",
                1000.0,
                LocalDateTime.of(2025, 6, 8, 19, 51),
                1L,
                36L,
                "2");

        System.out.println(
                "Transaction Type: " + transaction.getTransactionType() + ", Amount: " + transaction.getAmount());
    }
}