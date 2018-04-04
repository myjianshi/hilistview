package cn.gyu.mylistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    String[] names = {"章子怡", "周润发", "成龙", "张靓颖", "刘德华", "林志玲"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = (ListView) findViewById(R.id.mylistview);
        ArrayAdapter arrayAdapter = new ArrayAdapter(
                getApplicationContext(),
                android.R.layout.simple_expandable_list_item_1,
                names);
        listView.setAdapter(arrayAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            String s = "";

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                s = s + names[position];
                Toast.makeText(getApplicationContext(), s, Toast.LENGTH_SHORT).show();
            }

        });

    }
}