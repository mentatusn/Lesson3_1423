package calculator.calulation.lesson3;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivityListener extends AppCompatActivity implements View.OnClickListener {


    static String TAG = "counters";
    TextView textView1;
    TextView textView2;
    TextView textView3;
    TextView textView4;
    TextView textView5;
    TextView textView6;

    Button button2;
    Button button3;
    Button button4;
    Button button5;
    Button button6;

    Counters counters;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_listener);
        initView();
        initListeners();
        counters = new Counters();
        setContent();
    }


    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putParcelable(TAG,counters);
    }

    @Override
    public void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        counters = savedInstanceState.getParcelable(TAG);
        setContent();
    }

    private void initListeners() {
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counters.incCounter2();
                textView2.setText(String.valueOf(counters.getCounter2()));
            }
        });
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(listener);
        button6.setOnClickListener(listener);
    }


    View.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.button5:
                    counters.incCounter5();
                    textView5.setText(String.valueOf(counters.getCounter5()));
                    break;
                case R.id.button6:
                    counters.incCounter6();
                    textView6.setText(String.valueOf(counters.getCounter6()));
                    break;
                default: break;
            }
        }
    };

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button3:
                counters.incCounter3();
                textView3.setText(String.valueOf(counters.getCounter3()));
                break;
            case R.id.button4:
                counters.incCounter4();
                textView4.setText(String.valueOf(counters.getCounter4()));
                break;
            default: break;
        }
    }

    public void onBadClick(View view) {
        if (view.getId() == R.id.button1) {
            onToast("button1");
            counters.incCounter1();
            textView1.setText(String.valueOf(counters.getCounter1()));
        }
    }

    public void onToast(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
        Log.d("mylogs", message);
    }


    private void setContent() {
        textView1.setText(String.valueOf(counters.getCounter1()));
        textView2.setText(String.valueOf(counters.getCounter2()));
        textView3.setText(String.valueOf(counters.getCounter3()));
        textView4.setText(String.valueOf(counters.getCounter4()));
        textView5.setText(String.valueOf(counters.getCounter5()));
        textView6.setText(String.valueOf(counters.getCounter6()));
    }

    private void initView() {
        textView1 = findViewById(R.id.textView1);
        textView2 = findViewById(R.id.textView2);
        textView3 = findViewById(R.id.textView3);
        textView4 = findViewById(R.id.textView4);
        textView5 = findViewById(R.id.textView5);
        textView6 = findViewById(R.id.textView6);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);
        button6 = findViewById(R.id.button6);
    }

}