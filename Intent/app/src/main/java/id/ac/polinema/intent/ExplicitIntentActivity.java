package id.ac.polinema.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class ExplicitIntentActivity extends AppCompatActivity {

    private EditText input;
    private TextView view_output;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explicit_intent);
        input = findViewById(R.id.input_name);
        view_output = findViewById(R.id.text_output);
    }

    public void handleSubmit(View view) {
        view_output.setText("Nama : " +input.getText().toString());
    }
}
