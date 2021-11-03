package noahkubenk.com.example.scmap;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;

public class MainActivity extends AppCompatActivity {
    //FirebaseDatabase database = FirebaseDatabase.getInstance();
    MediaPlayer mp;
    MediaPlayer mp1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mp = MediaPlayer.create(MainActivity.this, R.raw.clap);
        mp1 = MediaPlayer.create(MainActivity.this, R.raw.creativeminds);
    }

    public void toastMsg(String msg) { //creates a pop up message
        Toast toast = Toast.makeText(this, msg, Toast.LENGTH_LONG);
        toast.show();
    }

    public void onClick(View view) {

        mp1.start();
              //toastMsg("Going to page 2");
       // EditText editPassword = findViewById(R.id.editTextPassword);

        //TextView textPassword = findViewById(R.id.textViewPassword);
        //String content = editPassword.getText().toString();

       // if (content.equals("Password")) { //takes you to the next page (activity)
            //startActivity(new Intent(MainActivity.this, Details1.class));
        //} else {
            //toastMsg("Wrong PW Bruv!!!");
        }


    public void onClick2(View view) {
        //DatabaseReference myRef = database.getReference(path:"message"):
        //myRef.setValue("Goodbye, World");
        mp.start();
    }
    public void onClick3(View view){
        mp.stop();
        mp1.stop();
    }
    public void onClick4(View view){

    }

}