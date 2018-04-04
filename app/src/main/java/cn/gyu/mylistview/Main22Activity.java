package cn.gyu.mylistview;

import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Main22Activity extends AppCompatActivity {
    private ImageView img_pgbar;
    private AnimationDrawable animationDrawable;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main22);
        img_pgbar=(ImageView)findViewById(R.id.myiv);
        img_pgbar.setBackgroundResource(R.drawable.amin_pgbar);
        animationDrawable=(AnimationDrawable)img_pgbar.getBackground();// 获取AnimationDrawable对象

        button=(Button)findViewById(R.id.startBt);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
// 动画是否正在运行
                if(animationDrawable.isRunning()){
                    animationDrawable.stop();
                }else {
//开始或者继续动画播放
                    animationDrawable.start();
                }
            }
        });
    }

}
