package id.putraprima.skorbola;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.mobsandgeeks.saripaar.annotation.NotEmpty;

public class ScorerActivity extends AppCompatActivity {

    @NotEmpty
    private EditText playerGoals;
    @NotEmpty
    private EditText minutes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scorer);
    }

    public void handleSubmit(View view) {
        playerGoals = findViewById(R.id.editTextPlayer);
        minutes = findViewById(R.id.editTextMinutes);
        String stringToPassBack1 = playerGoals.getText().toString();
        String stringToPassBack2 = minutes.getText().toString();

        // Put the String to pass back into an Intent and close this activity
        Intent intent = new Intent();
        intent.putExtra("player", stringToPassBack1);
        intent.putExtra("minutes", stringToPassBack2);
        setResult(RESULT_OK, intent);
        finish();
    }
}
