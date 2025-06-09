package com.hexaware.entity;

public class Beneficiary {

    private long beneficiaryId;
    private String accountName;
    private String accountNumber;
    private String bankName;
    private String branchName;
    private String ifscCode;
    private long customerId;

    public Beneficiary(long beneficiaryId, String accountName, String accountNumber, String bankName,
            String branchName, String ifscCode, long customerId) {
        this.beneficiaryId = beneficiaryId;
        this.accountName = accountName;
        this.accountNumber = accountNumber;
        this.bankName = bankName;
        this.branchName = branchName;
        this.ifscCode = ifscCode;
        this.customerId = customerId;
    }

    public long getBeneficiaryId() {
        return beneficiaryId;
    }

    public void setBeneficiaryId(long beneficiaryId) {
        this.beneficiaryId = beneficiaryId;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public String getIfscCode() {
        return ifscCode;
    }

    public void setIfscCode(String ifscCode) {
        this.ifscCode = ifscCode;
    }

    public long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(long customerId) {
        this.customerId = customerId;
    }

    public static void main(String[] args) {
        Beneficiary beneficiary = new Beneficiary(
                20L,
                "John Doe",
                "9876543210",
                "Other Bank",
                "Other Branch",
                "OTHR0005678",
                36L);

        System.out.println(
                "Beneficiary: " + beneficiary.getAccountName() + ", Account Number: " + beneficiary.getAccountNumber());
    }
}