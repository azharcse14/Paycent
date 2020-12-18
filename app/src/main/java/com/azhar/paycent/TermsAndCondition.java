package com.azhar.paycent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class TermsAndCondition extends AppCompatActivity {

    //int myColor = Color.parseColor("#3F51B5");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_treams_and_condition);

        TextView importantTV = findViewById(R.id.important);
        String text = "Important: If you lose your device after edifying your information, send an email to cit@mail.com (with subject LOST DEVICE) from the email address you registered with.";
        SpannableString ss = new SpannableString(text);
        SpannableStringBuilder ssb = new SpannableStringBuilder(text);
        ForegroundColorSpan fcsRed = new ForegroundColorSpan(Color.RED);
        ssb.setSpan(fcsRed, 0, 10, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        importantTV.setText(ssb);

        TextView textView = findViewById(R.id.note);
        String textNote = "Note: All information is successfully encrypted and only store on your device. We never stores payments or password information on our servers.";
        SpannableString ssn = new SpannableString(textNote);
        SpannableStringBuilder ssbn = new SpannableStringBuilder(textNote);
        ForegroundColorSpan fcsn = new ForegroundColorSpan(Color.parseColor("#3F51B5"));
        ssbn.setSpan(fcsn, 0, 5, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        textView.setText(ssbn);

        Button button = findViewById(R.id.acceptBtn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TermsAndCondition.this, MyProfile.class);
                startActivity(intent);
            }
        });
    }

}