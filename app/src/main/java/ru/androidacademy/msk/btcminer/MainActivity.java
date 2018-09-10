package ru.androidacademy.msk.btcminer;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

  private TextView btcText;

  private int btcCounter;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    btcText = findViewById(R.id.btc_text);
    btcText.setText(R.string.initial_btc);

    final Button addBtcButton = findViewById(R.id.add_btc_button);
    addBtcButton.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        btcCounter++;
        final String btc = String.valueOf(btcCounter);
        btcText.setText(btc);

        if (btcCounter % 5 == 0) {
          SecondActivity.start(MainActivity.this, btcCounter);
        }
      }
    });
  }
}
