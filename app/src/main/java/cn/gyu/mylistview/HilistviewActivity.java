package cn.gyu.mylistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class HilistviewActivity extends AppCompatActivity {
    ListView listView;
    String[] names={"章子怡","周润发","成龙","张靓颖","刘德华","林志玲"};
    @Override


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout3);
        listView=(ListView)findViewById(R.id.hilistview);

        ArrayAdapter adapter=new ArrayAdapter(this,android.R.layout.simple_list_item_1,names);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getApplicationContext(),"I like "+names[i]+" movies.",Toast.LENGTH_SHORT).show();
            }
        });
    }
}
