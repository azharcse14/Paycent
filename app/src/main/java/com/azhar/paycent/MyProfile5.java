package com.azhar.paycent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import io.card.payment.CardIOActivity;
import io.card.payment.CreditCard;

public class MyProfile5 extends AppCompatActivity {

    TextView textView;
    int MY_SCAN_REQUEST_CODE = 111;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_profile5);

        TextView button= findViewById(R.id.scanTv);
        textView = findViewById(R.id.headTv);

        LinearLayout linearLayout = findViewById(R.id.linear_one);
        linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MyProfile5.this, CardAddActivity.class);
                startActivity(intent);
            }
        });

//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                onButtonListener();
//            }
//        });


    }

//    private void onButtonListener(){
//        Intent scanIntent = new Intent(this, CardIOActivity.class);
//
//        // customize these values to suit your needs.
//        scanIntent.putExtra(CardIOActivity.EXTRA_REQUIRE_EXPIRY, true); // default: false
//        scanIntent.putExtra(CardIOActivity.EXTRA_REQUIRE_CVV, false); // default: false
//        scanIntent.putExtra(CardIOActivity.EXTRA_REQUIRE_POSTAL_CODE, false); // default: false
//        scanIntent.putExtra(CardIOActivity.EXTRA_SUPPRESS_CONFIRMATION, true);
//
//        // MY_SCAN_REQUEST_CODE is arbitrary and is only used within this activity.
//        startActivityForResult(scanIntent, MY_SCAN_REQUEST_CODE);
//    }
//
//    @Override
//    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
//        super.onActivityResult(requestCode, resultCode, data);
//
//        if (requestCode == MY_SCAN_REQUEST_CODE) {
//            String resultDisplayStr;
//
//            if (data != null && data.hasExtra(CardIOActivity.EXTRA_SCAN_RESULT)) {
//                CreditCard scanResult = data.getParcelableExtra(CardIOActivity.EXTRA_SCAN_RESULT);
//
//                // Never log a raw card number. Avoid displaying it, but if necessary use getFormattedCardNumber()
//                resultDisplayStr = "Card Number: " + scanResult.getRedactedCardNumber() + "\n";
//
//                // Do something with the raw number, e.g.:
//                // myService.setCardNumber( scanResult.cardNumber );
//
//                if (scanResult.isExpiryValid()) {
//                    resultDisplayStr += "Expiration Date: " + scanResult.expiryMonth + "/" + scanResult.expiryYear + "\n";
//                }
//
//                if (scanResult.cvv != null) {
//                    // Never log or display a CVV
//                    resultDisplayStr += "CVV has " + scanResult.cvv.length() + " digits.\n";
//                }
//
//                if (scanResult.postalCode != null) {
//                    resultDisplayStr += "Postal Code: " + scanResult.postalCode + "\n";
//                }
//            }
//            else {
//                resultDisplayStr = "Scan was canceled.";
//            }
//            // do something with resultDisplayStr, maybe display it in a textView
//            textView.setText(resultDisplayStr);
//        }
//        // else handle other activity results
//    }
}
