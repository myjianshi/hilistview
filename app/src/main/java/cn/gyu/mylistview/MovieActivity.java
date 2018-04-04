package cn.gyu.mylistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MovieActivity extends AppCompatActivity {
    int[] headimgs={R.drawable.cl,R.drawable.ldh,R.drawable.zrf,R.drawable.fbb,R.drawable.zmy};
    String[] names={"成龙","刘德华","周润发","范冰冰","张曼玉"};
    String[] infos={"中华有条龙","影坛常青树","英雄本色","范爷谁敢惹","花样年华"};
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout3);
        ListView listView=(ListView)findViewById(R.id.hilistview);

        List<Map<String,Object>> data=new ArrayList<>();
        for(int i=0;i<headimgs.length;i++){
            HashMap<String,Object> map=new HashMap<>();
            map.put("head",headimgs[i]);
            map.put("name",names[i]);
            map.put("info",infos[i]);
            data.add(map);
        }

        SimpleAdapter simpleAdapter=new SimpleAdapter(this,data,R.layout.item,
                new String[]{"head","name","info"},new int[]{R.id.headimageview,R.id.nametextview,R.id.infotextview});

        listView.setAdapter(simpleAdapter);
    }
}
