package trap1.aggarwalarjun.quizappcustom;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class Main4Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        ImageButton ronaldoBtn = findViewById(R.id.durant);
        ImageButton coutinhoBtn = findViewById(R.id.lebron);
        final TextView text = findViewById(R.id.textBox3);

        ronaldoBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText("Correct!");
            }
        });

        coutinhoBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText("Wrong!");
            }
        });
    }

}
