package com.hexaware.entity;

import java.time.LocalDate;

public class Customer {

    private long customerId;
    private String name;
    private String email;
    private String password;
    private String gender;
    private String contactNumber;
    private String address;
    private LocalDate dateOfBirth;
    private int age;
    private String aadharNumber;
    private String panNumber;
    private String accountIds;
    private String loanIds;
    private String beneficiaryIds;
    private String status;

    public Customer(long customerId, String name, String email, String password, String gender,
            String contactNumber, String address, LocalDate dateOfBirth, int age,
            String aadharNumber, String panNumber, String accountIds, String loanIds,
            String beneficiaryIds, String status) {
        this.customerId = customerId;
        this.name = name;
        this.email = email;
        this.password = password;
        this.gender = gender;
        this.contactNumber = contactNumber;
        this.address = address;
        this.dateOfBirth = dateOfBirth;
        this.age = age;
        this.aadharNumber = aadharNumber;
        this.panNumber = panNumber;
        this.accountIds = accountIds;
        this.loanIds = loanIds;
        this.beneficiaryIds = beneficiaryIds;
        this.status = status;
    }

    public long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(long customerId) {
        this.customerId = customerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAadharNumber() {
        return aadharNumber;
    }

    public void setAadharNumber(String aadharNumber) {
        this.aadharNumber = aadharNumber;
    }

    public String getPanNumber() {
        return panNumber;
    }

    public void setPanNumber(String panNumber) {
        this.panNumber = panNumber;
    }

    public String getAccountIds() {
        return accountIds;
    }

    public void setAccountIds(String accountIds) {
        this.accountIds = accountIds;
    }

    public String getLoanIds() {
        return loanIds;
    }

    public void setLoanIds(String loanIds) {
        this.loanIds = loanIds;
    }

    public String getBeneficiaryIds() {
        return beneficiaryIds;
    }

    public void setBeneficiaryIds(String beneficiaryIds) {
        this.beneficiaryIds = beneficiaryIds;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public static void main(String[] args) {
        Customer customer = new Customer(
                36,
                "Pradosh",
                "pradosh@123",
                "1234",
                "Male",
                "88956225",
                "ppm",
                LocalDate.of(1995, 6, 8),
                30,
                "12896789012",
                "ABCDE1234F",
                "1,2,3",
                "4,5",
                "20,21",
                "Active");

        System.out.println("Customer: " + customer.getName() + ", Email: " +
                customer.getEmail());
    }
}