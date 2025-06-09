package com.hexaware.entity;

public class Account {

    private long accountId;
    private String accountNumber;
    private String accountType;
    private double balance;
    private String ifscCode;
    private String branchName;
    private String branchAddress;
    private long customerId;
    private String transactionIds;
    private String status;
    private long approvedByEmployeeId;

    public Account(long accountId, String accountNumber, String accountType, double balance,
            String ifscCode, String branchName, String branchAddress, long customerId,
            String transactionIds, String status, long approvedByEmployeeId) {
        this.accountId = accountId;
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.balance = balance;
        this.ifscCode = ifscCode;
        this.branchName = branchName;
        this.branchAddress = branchAddress;
        this.customerId = customerId;
        this.transactionIds = transactionIds;
        this.status = status;
        this.approvedByEmployeeId = approvedByEmployeeId;
    }

    public long getAccountId() {
        return accountId;
    }

    public void setAccountId(long accountId) {
        this.accountId = accountId;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getIfscCode() {
        return ifscCode;
    }

    public void setIfscCode(String ifscCode) {
        this.ifscCode = ifscCode;
    }

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public String getBranchAddress() {
        return branchAddress;
    }

    public void setBranchAddress(String branchAddress) {
        this.branchAddress = branchAddress;
    }

    public long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(long customerId) {
        this.customerId = customerId;
    }

    public String getTransactionIds() {
        return transactionIds;
    }

    public void setTransactionIds(String transactionIds) {
        this.transactionIds = transactionIds;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public long getApprovedByEmployeeId() {
        return approvedByEmployeeId;
    }

    public void setApprovedByEmployeeId(long approvedByEmployeeId) {
        this.approvedByEmployeeId = approvedByEmployeeId;
    }

    public static void main(String[] args) {
        Account account = new Account(
                1L,
                "1234567890",
                "Savings",
                5000.0,
                "IFSC0001234",
                "Main Branch",
                "123 Main St, City",
                36L,
                "10,11,12",
                "Approved",
                101L);

        System.out.println("Account Number: " + account.getAccountNumber() + ",Balance: " + account.getBalance());
    }
}