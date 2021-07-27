package sg.edu.rp.c346.id19011909.demoandroidlist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    //Creating Variable,
    ListView LV;
    ArrayList<AndroidVersion> List;
    CustomAdapter adapter;
    //ArrayAdapter<AndroidVersion> ArrayAdapterList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Linking Variable,
        LV = findViewById(R.id.ListView);

        //Setting Action,
        List = new ArrayList<>();

        AndroidVersion item1 = new AndroidVersion("Pie", "9.0");
        AndroidVersion item2 = new AndroidVersion("Oreo", "8.0 - 8.1");
        AndroidVersion item3 = new AndroidVersion("Nougat", "7.0 - 7.1.2");

        List.add(item1);
        List.add(item2);
        List.add(item3);

        adapter = new CustomAdapter(this, R.layout.row, List);
        LV.setAdapter(adapter);

        //ArrayAdapterList = new ArrayAdapter<AndroidVersion>(this, android.R.layout.simple_list_item_1, List);
        //LV.setAdapter(ArrayAdapterList);


    }
}