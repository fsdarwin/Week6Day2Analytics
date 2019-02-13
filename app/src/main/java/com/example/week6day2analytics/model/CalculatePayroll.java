package com.example.week6day2analytics.model;


import com.example.week6day2analytics.pojos.Employee;

import java.util.HashMap;

public class CalculatePayroll {

    private String fullName;
    private String fullAddress;
    private String pay;

    public CalculatePayroll() {

    }

    public HashMap<String, String> calculatePay(Employee employee) {
        if (employee.getTimesheet().isHourly()) {
            pay = employee.getTimesheet().getPayRate()
                    * employee.getTimesheet().getCurrentHours() + "";
        } else {
            pay = employee.getTimesheet().getPayRate() * 40 + "";
        }
        fullName = employee.getName().getFirst() + " " + employee.getName().getLast();
        fullAddress = employee.getAddress().getCity() + " " +
                employee.getAddress().getState() + " " +
                employee.getAddress().getPostal();
        HashMap hashMap = new HashMap();
        hashMap.put("pay", pay);
        hashMap.put("name", fullName);
        hashMap.put("address", fullAddress);

        return hashMap;
    }
}
