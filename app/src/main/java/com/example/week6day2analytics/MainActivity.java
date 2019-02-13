package com.example.week6day2analytics;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.week6day2analytics.model.CalculatePayroll;
import com.example.week6day2analytics.pojos.Address;
import com.example.week6day2analytics.pojos.Employee;
import com.example.week6day2analytics.pojos.Name;
import com.example.week6day2analytics.pojos.Timesheet;
import com.flurry.android.FlurryAgent;
import com.google.firebase.analytics.FirebaseAnalytics;

import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    private FirebaseAnalytics mFirebaseAnalytics;

    TextView tvVName;
    TextView tvVAddress;
    TextView tvVPay;
    HashMap employeePay;
    String name;
    String address;
    String pay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mFirebaseAnalytics = FirebaseAnalytics.getInstance(this);

        tvVName = findViewById(R.id.tvName);
        tvVAddress = findViewById(R.id.tvAddress);
        tvVPay = findViewById(R.id.tvPay);

        Name name = new Name("You", "Dumb", "Guy", "Mr.");

        Address address = new Address("38 Stupid Way", "DumbAssVille", "GA", "30067", "USA");

        Timesheet timesheet = new Timesheet((float) 7.25, true, (float) 37);

        Employee employee = new Employee(name, address, timesheet);

        CalculatePayroll calculatePayroll = new CalculatePayroll();

        employeePay = calculatePayroll.calculatePay(employee);

    }

    public void onClick(View view) {
        name = employeePay.get("name").toString();
        address = employeePay.get("address").toString();
        pay = employeePay.get("pay").toString();
        tvVName.setText(name);
        tvVAddress.setText(address);
        tvVPay.setText(pay);
        new FlurryAgent.Builder()
                .withLogEnabled(true)
                .build(this, "MKXM2MPVFYJ38CQGB43N");

        Bundle bundle = new Bundle();
        bundle.putString(FirebaseAnalytics.Param.ITEM_ID, pay);
        bundle.putString(FirebaseAnalytics.Param.ITEM_NAME, name);
        bundle.putString(FirebaseAnalytics.Param.CONTENT_TYPE, "image");
        mFirebaseAnalytics.logEvent(FirebaseAnalytics.Event.SELECT_CONTENT, bundle);
    }
}
