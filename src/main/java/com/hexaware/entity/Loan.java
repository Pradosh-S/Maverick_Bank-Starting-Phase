package com.hexaware.entity;

public class Loan {

    private long loanId;
    private double loanAmount;
    private double interestRate;
    private int tenure;
    private String purpose;
    private String status;
    private long customerId;
    private long approvedByEmployeeId;

    public Loan(long loanId, double loanAmount, double interestRate, int tenure,
            String purpose, String status, long customerId, long approvedByEmployeeId) {
        this.loanId = loanId;
        this.loanAmount = loanAmount;
        this.interestRate = interestRate;
        this.tenure = tenure;
        this.purpose = purpose;
        this.status = status;
        this.customerId = customerId;
        this.approvedByEmployeeId = approvedByEmployeeId;
    }

    public long getLoanId() {
        return loanId;
    }

    public void setLoanId(long loanId) {
        this.loanId = loanId;
    }

    public double getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(double loanAmount) {
        this.loanAmount = loanAmount;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public int getTenure() {
        return tenure;
    }

    public void setTenure(int tenure) {
        this.tenure = tenure;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(long customerId) {
        this.customerId = customerId;
    }

    public long getApprovedByEmployeeId() {
        return approvedByEmployeeId;
    }

    public void setApprovedByEmployeeId(long approvedByEmployeeId) {
        this.approvedByEmployeeId = approvedByEmployeeId;
    }

    public static void main(String[] args) {
        Loan loan = new Loan(
                4L,
                100000.0,
                5.5,
                36,
                "Home Renovation",
                "Approved",
                36L,
                101L);

        System.out.println("Loan Amount: " + loan.getLoanAmount() + ", Status: " + loan.getStatus());
    }
}