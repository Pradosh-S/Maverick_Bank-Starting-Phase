package com.hexaware.entity;

public class Administrator {

    private long adminId;
    private String name;
    private String email;
    private String password;
    private String managedCustomerIds;
    private String managedEmployeeIds;

    public Administrator(long adminId, String name, String email, String password,
            String managedCustomerIds, String managedEmployeeIds) {
        this.adminId = adminId;
        this.name = name;
        this.email = email;
        this.password = password;
        this.managedCustomerIds = managedCustomerIds;
        this.managedEmployeeIds = managedEmployeeIds;
    }

    public long getAdminId() {
        return adminId;
    }

    public void setAdminId(long adminId) {
        this.adminId = adminId;
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

    public String getManagedCustomerIds() {
        return managedCustomerIds;
    }

    public void setManagedCustomerIds(String managedCustomerIds) {
        this.managedCustomerIds = managedCustomerIds;
    }

    public String getManagedEmployeeIds() {
        return managedEmployeeIds;
    }

    public void setManagedEmployeeIds(String managedEmployeeIds) {
        this.managedEmployeeIds = managedEmployeeIds;
    }

    public static void main(String[] args) {
        Administrator admin = new Administrator(
                201L,
                "Bob Johnson",
                "bob@bank.com",
                "admin123",
                "36L",
                "101L");

        System.out.println("Administrator: " + admin.getName() + ", Email: " + admin.getEmail());
    }
}