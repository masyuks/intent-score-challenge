package id.putraprima.skorbola;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.mobsandgeeks.saripaar.annotation.NotEmpty;

import id.putraprima.skorbola.model.Score;

public class ScorerActivity extends AppCompatActivity {

    public static final String EXTRA_SCORER = "EXTRA_SCORER";
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
        String scorer = playerGoals.getText().toString();
        int minute = Integer.parseInt(minutes.getText().toString());
        Intent intent = new Intent();
        intent.putExtra(EXTRA_SCORER, scorer);
        intent.putExtra(EXTRA_SCORER, new Score(scorer, minute));
        setResult(Activity.RESULT_OK, intent);
        finish();
    }
}
