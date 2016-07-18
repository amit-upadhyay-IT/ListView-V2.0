package com.aupadhyay.listview2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    ArrayList<PersonBean> arrayList;
    ListView listView;
    PersonAdapter personAdapter;

    public void initViews()
    {
        listView = (ListView) findViewById(R.id.listView);
        arrayList = new ArrayList<>();
        PersonBean pb1 = new PersonBean(R.drawable.abc, "Amit Upadhyay", "7769942159");
        PersonBean pb2 = new PersonBean(R.drawable.lmn, "Abhishek Chaudhary", "8572100244");
        PersonBean pb3 = new PersonBean(R.drawable.pqr, "Muskan Mehta", "90074512332");
        PersonBean pb4 = new PersonBean(R.drawable.lmn, "Arman Singl", "7769945612");

        arrayList.add(pb1);
        arrayList.add(pb2);
        arrayList.add(pb3);
        arrayList.add(pb4);

        personAdapter = new PersonAdapter(this, R.layout.row_list, arrayList);

        listView.setAdapter(personAdapter);
        
        listView.setOnItemClickListener(this);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
    }
    
    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        PersonBean pb = arrayList.get(i);
        Toast.makeText(this, pb.toString(), Toast.LENGTH_LONG).show();
    }
    
}
