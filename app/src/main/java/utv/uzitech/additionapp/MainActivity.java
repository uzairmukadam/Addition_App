package utv.uzitech.additionapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText num1_in, num2_in;
    float num1, num2, result;
    TextView res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1_in = findViewById(R.id.num1);
        num2_in = findViewById(R.id.num2);
        res = findViewById(R.id.result);
    }

    public void add(View view){
        num1 = Float.parseFloat(num1_in.getText().toString());
        num2 = Float.parseFloat(num2_in.getText().toString());

        result = num1 + num2;

        res.setText(String.valueOf(result));
    }
}