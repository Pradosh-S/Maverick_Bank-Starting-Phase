package com.hexaware.entity;

public class BankEmployee {

    private long employeeId;
    private String name;
    private String email;
    private String password;
    private String role;
    private String approvedAccountIds;
    private String approvedLoanIds;
    private String status;

    public BankEmployee(long employeeId, String name, String email, String password, String role,
            String approvedAccountIds, String approvedLoanIds, String status) {
        this.employeeId = employeeId;
        this.name = name;
        this.email = email;
        this.password = password;
        this.role = role;
        this.approvedAccountIds = approvedAccountIds;
        this.approvedLoanIds = approvedLoanIds;
        this.status = status;
    }

    public long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(long employeeId) {
        this.employeeId = employeeId;
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

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getApprovedAccountIds() {
        return approvedAccountIds;
    }

    public void setApprovedAccountIds(String approvedAccountIds) {
        this.approvedAccountIds = approvedAccountIds;
    }

    public String getApprovedLoanIds() {
        return approvedLoanIds;
    }

    public void setApprovedLoanIds(String approvedLoanIds) {
        this.approvedLoanIds = approvedLoanIds;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public static void main(String[] args) {
        BankEmployee employee = new BankEmployee(
                101L,
                "Alice Smith",
                "alice@bank.com",
                "secure123",
                "Loan Officer",
                "1,2,3",
                "4,5",
                "Active");

        System.out.println("Employee: " + employee.getName() + ", Role: " + employee.getRole());
    }
}