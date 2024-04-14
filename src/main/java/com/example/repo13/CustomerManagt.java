package com.example.repo13;

import java.util.Map;

public class CustomerManagt {


    // Enum for lead status
    enum LeadStatus {
        NEW, CONTACTED, QUALIFIED, LOST, WON
    }

    // Class representing a customer
    class Customer {
        private String customerId;
        private String name;
        private String email;
        private String phoneNumber;

        public Customer(String customerId, String name, String email, String phoneNumber) {
            this.customerId = customerId;
            this.name = name;
            this.email = email;
            this.phoneNumber = phoneNumber;
        }

        // Getters and setters
    }

    // Class representing a lead
    class Lead {
        private String leadId;
        private String name;
        private String email;
        private String phoneNumber;
        private LeadStatus status;

        public Lead(String leadId, String name, String email, String phoneNumber, LeadStatus status) {
            this.leadId = leadId;
            this.name = name;
            this.email = email;
            this.phoneNumber = phoneNumber;
            this.status = status;
        }

        // Getters and setters
    }

    // Class representing the CRM system
    public class CRMSystem {
        private Map<String, Customer> customers;
        private Map<String, Lead> leads;

        public CRMSystem() {
            this.customers = new HashMap<>();
            this.leads = new HashMap<>();
        }

        public void addCustomer(String customerId, String name, String email, String phoneNumber) {
            customers.put(customerId, new Customer(customerId, name, email, phoneNumber));
        }

        public void editCustomer(String customerId, String name, String email, String phoneNumber) {
            Customer customer = customers.get(customerId);
            if (customer != null) {
                customer.setName(name);
                customer.setEmail(email);
                customer.setPhoneNumber(phoneNumber);
            }
        }

        public void deleteCustomer(String customerId) {
            customers.remove(customerId);
        }

        public void addLead(String leadId, String name, String email, String phoneNumber, LeadStatus status) {
            leads.put(leadId, new Lead(leadId, name, email, phoneNumber, status));
        }

        public void editLeadStatus(String leadId, LeadStatus status) {
            Lead lead = leads.get(leadId);
            if (lead != null) {
                lead.setStatus(status);
            }
        }

        // Other methods for sales pipeline management, reporting, analytics, etc.

        public static void main(String[] args) {
            CRMSystem crm = new CRMSystem();
            crm.addCustomer("C001", "John Doe", "john@example.com", "1234567890");
            crm.addCustomer("C002", "Alice Smith", "alice@example.com", "9876543210");

            crm.addLead("L001", "Bob Johnson", "bob@example.com", "4567890123", LeadStatus.NEW);
            crm.addLead("L002", "Emily Brown", "emily@example.com", "7890123456", LeadStatus.CONTACTED);

            // Example usage:
            crm.editLeadStatus("L001", LeadStatus.QUALIFIED);
            crm.editCustomer("C001", "John Doe", "john.doe@example.com", "5555555555");
            crm.deleteCustomer("C002");
        }
    }

}
