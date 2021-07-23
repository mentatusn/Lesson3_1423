package calculator.calulation.lesson3;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    private static String KEY_PASS_1 = "пассажир_1";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (savedInstanceState != null) {
            pass = savedInstanceState.getInt(KEY_PASS_1);
        }
        onToast("onCreate() pass " + pass);
        onToast("onCreate() savedInstanceState " + (savedInstanceState == null));
    }


    @Override
    public void onRestoreInstanceState(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onRestoreInstanceState(savedInstanceState, persistentState);
        onToast("onRestoreInstanceState 2s ");
    }

    public void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        if (savedInstanceState != null) {
            pass = savedInstanceState.getInt(KEY_PASS_1);
        }
        onToast("onRestoreInstanceState() pass " + pass);
    }

    int pass = 1;
    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        onToast("onSaveInstanceState");
        pass = 2;
        outState.putInt(KEY_PASS_1, pass);
    }

    //готовность к взаимодействию
    @Override
    protected void onResume() {
        super.onResume();
        onToast("onResume()");
        // фоновая музыка ВыКЛ
    }


    @Override
    protected void onPause() {
        super.onPause();
        onToast("onPause()");
        // фоновая музыка ВКЛ
    }


    // готовность к отображению
    @Override
    protected void onStart() {
        super.onStart();
        onToast("onStart()");

    }

    @Override
    protected void onStop() {
        super.onStop();
        onToast("onStop()");

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        onToast("onRestart()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        onToast("onDestroy()");
    }

    public void onToast(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
        Log.d("mylogs", message);
    }
}