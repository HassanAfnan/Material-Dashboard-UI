package change.com.materialdashboardui;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button profile,education,health,goal,finance,comfort;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        profile = findViewById(R.id.buttonProfile);
        education = findViewById(R.id.buttonEducation);
        health = findViewById(R.id.buttonHealth);
        goal = findViewById(R.id.buttonGoal);
        finance = findViewById(R.id.buttonFinance);
        comfort = findViewById(R.id.buttonComfort);

        profile.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(MainActivity.this,"Profile",Toast.LENGTH_LONG).show();
                    }
                }
        );

        education.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(MainActivity.this,"Education",Toast.LENGTH_LONG).show();
                    }
                }
        );

        health.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(MainActivity.this,"Health",Toast.LENGTH_LONG).show();
                    }
                }
        );

        goal.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(MainActivity.this,"Goal",Toast.LENGTH_LONG).show();
                    }
                }
        );

        finance.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(MainActivity.this,"Finance",Toast.LENGTH_LONG).show();
                    }
                }
        );

        comfort.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(MainActivity.this,"Comfort",Toast.LENGTH_LONG).show();
                    }
                }
        );
    }
}
