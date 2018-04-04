package cn.gyu.mylistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {
    RadioGroup radioGroup;
    RadioButton radioButton;
     TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout2);

        radioGroup=(RadioGroup)findViewById(R.id.myradiogroup);
        tv=(TextView)findViewById(R.id.msgTv);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int id) {
                RadioButton button=(RadioButton)findViewById(id);
                tv.setText("You pick "+button.getText());
                Toast.makeText(getApplicationContext(),"You select "+button.getText(),Toast.LENGTH_SHORT).show();
            }
        });
    }
}
