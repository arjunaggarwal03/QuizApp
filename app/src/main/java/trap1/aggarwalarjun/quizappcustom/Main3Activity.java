package trap1.aggarwalarjun.quizappcustom;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        ImageButton ronaldoBtn = findViewById(R.id.ronaldo);
        ImageButton coutinhoBtn = findViewById(R.id.coutinho);
        final TextView text = findViewById(R.id.textBox2);
        final Intent newScreen3 = new Intent(getApplicationContext(),Main4Activity.class);

        ronaldoBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText("Correct!");
                startActivity(newScreen3);
            }
        });

        coutinhoBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText("Wrong!");
                startActivity(newScreen3);
            }
        });
    }

}
