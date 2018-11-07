package com.example.a300288675.bargraphmemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.interfaces.datasets.IBarDataSet;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    BarChart chart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        chart = (BarChart)findViewById(R.id.bar1);

        ArrayList<BarEntry> entries = new ArrayList<>();
        entries.add(new BarEntry(124,0));
        entries.add(new BarEntry(150,1));
        entries.add(new BarEntry(200,2));
        entries.add(new BarEntry(-200,3));
        entries.add(new BarEntry(-57,4));
        entries.add(new BarEntry(60,5));
        entries.add(new BarEntry(-83,6));
        entries.add(new BarEntry(-170,7));

        BarDataSet barDataSet = new BarDataSet(entries,"Savings (+ve savings and -ve debt");

        ArrayList<String> labels = new ArrayList<>();
        labels.add("Jan");
        labels.add("Feb");
        labels.add("March");
        labels.add("April");
        labels.add("May");
        labels.add("June");
        labels.add("July");
        labels.add("Aug");

        BarData data = new BarData(labels,barDataSet);
        chart.setData(data);

        chart.setDescription("Savings/Debt");

        barDataSet.setColors(ColorTemplate.COLORFUL_COLORS);

        chart.animateY(2000);

    }
}
