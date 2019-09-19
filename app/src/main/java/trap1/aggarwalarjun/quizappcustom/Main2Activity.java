package trap1.aggarwalarjun.quizappcustom;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        ImageButton kanyeBtn = findViewById(R.id.kanye);
        ImageButton foxxBtn = findViewById(R.id.foxx);
        final TextView text = findViewById(R.id.textBox);
        final Intent newScreen2 = new Intent(getApplicationContext(),Main3Activity.class);
        kanyeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText("Correct!");
                startActivity(newScreen2);
            }
        });

        foxxBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText("Wrong!");
                startActivity(newScreen2);
            }
        });
    }

}
