package com.example.android.json;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.List;

public class OrgsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_orgs);

        List<OrgsViewer> orgs = QueryUtils.extractOrgs(this);
        ListView orgsListView = (ListView) findViewById(R.id.list);
        final OrgsAdapter adapter = new OrgsAdapter(this, orgs);
        orgsListView.setAdapter(adapter);
    }
}
