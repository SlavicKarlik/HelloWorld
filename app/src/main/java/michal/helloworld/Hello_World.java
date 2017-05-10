package michal.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Hello_World extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello__world);

        //Initialize button
        Button bToast = (Button) findViewById(R.id.button);

        //Listener on button
        bToast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast toast = Toast.makeText(getApplicationContext(), "Hello World! This is a Toast message!", Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.CENTER, 0,0);
                toast.show();
            }
        });

    }


}
