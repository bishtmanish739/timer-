package in.technicalkeeda.timer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
//import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //Button btn;
    TextView textView;
    int n=0;
    public  void btn(View view){
        new CountDownTimer(30000,1000){
            @Override
            public void onTick(long millisUntilFinished) {
                textView.setText("sec "+n++);



            }

            @Override
            public void onFinish() {
                String s="time up";
                textView.setText(s);
               // Toast.makeText(MainActivity.this, s, Toast.LENGTH_SHORT).show();
            }
        }.start();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
      //  btn= findViewById(R.id.timerbutton);
        textView =findViewById(R.id.textView);


    }
}
