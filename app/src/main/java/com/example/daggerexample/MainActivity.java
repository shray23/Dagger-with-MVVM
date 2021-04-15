package com.example.daggerexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.daggerexample.di.App;
import com.example.daggerexample.model.User;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    User user;

    TextView textView;
    Button btn_submit;
    EditText firstname, lastName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       textView = findViewById(R.id.textview);
       btn_submit = findViewById(R.id.btn_submit);
       firstname = findViewById(R.id.et_firstName);
       lastName = findViewById(R.id.et_secondName);

        ((App) getApplication()).getComponent().inject(this);

        btn_submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                submitName();
                if (user != null)
                textView.setText(user.toString());
            }
        });

     //  textView.setText(user.toString());


    }

    public void submitName(){
       user = new User(firstname.getText().toString(),lastName.getText().toString()); }

}