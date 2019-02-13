package com.example.week6day2analytics;

import com.example.week6day2analytics.model.CalculatePayroll;
import com.example.week6day2analytics.pojos.Address;
import com.example.week6day2analytics.pojos.Employee;
import com.example.week6day2analytics.pojos.Name;
import com.example.week6day2analytics.pojos.Timesheet;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.HashMap;

@RunWith(MockitoJUnitRunner.class)
public class MainDisplayTest {

    CalculatePayroll calculatePayroll = new CalculatePayroll();
    HashMap<String, String> testHashMap;

    @Mock
    Name mockName;
    @Mock
    Address mockAddress;
    @Mock
    Timesheet mockTimesheet;




    @Before
    public void setup() {
        Mockito.when(mockName.getFirst()).thenReturn("You");
        Mockito.when(mockName.getLast()).thenReturn("Guy");
        Mockito.when(mockAddress.getCity()).thenReturn("DumbAssVille");
        Mockito.when(mockAddress.getState()).thenReturn("GA");
        Mockito.when(mockAddress.getPostal()).thenReturn("30067");
        Mockito.when(mockTimesheet.getCurrentHours()).thenReturn((float)37);
        Mockito.when(mockTimesheet.getPayRate()).thenReturn((float)7.25);
        Mockito.when(mockTimesheet.isHourly()).thenReturn(true);
        Employee mockEmployee = new Employee(mockName, mockAddress, mockTimesheet);
        testHashMap = calculatePayroll.calculatePay(mockEmployee);


    }

    @Test
    public void testAutoInfo() {

        //onView(withId(R.id.btnShowPay)).perform(ViewActions.click());
        assertEquals("You Guy", testHashMap.get("name"));
        assertEquals("DumbAssVille GA 30067", testHashMap.get("address"));
        assertEquals("268.25", testHashMap.get("pay"));
    }
}

