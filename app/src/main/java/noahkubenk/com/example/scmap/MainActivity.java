package noahkubenk.com.example.scmap;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void toastMsg(String msg) { //creates a pop up message
        Toast toast = Toast.makeText(this, msg, Toast.LENGTH_LONG);
        toast.show();
    }

    public void onClick(View view) {

        //toastMsg("Going to page 2");
        EditText editPassword = findViewById(R.id.editTextPassword);

        TextView textPassword = findViewById(R.id.textViewPassword);
        String content = editPassword.getText().toString();

        if (content.equals("Password")) { //takes you to the next page (activity)
            startActivity(new Intent(MainActivity.this,Details1.class));
        } else {
            toastMsg("Wrong PW Bruv!!!");
        }
    }

}