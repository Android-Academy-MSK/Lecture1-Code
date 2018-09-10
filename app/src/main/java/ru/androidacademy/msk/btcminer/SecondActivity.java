package ru.androidacademy.msk.btcminer;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

  private static final String EXTRA_BTC = "EXTRA_BTC";

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_second);

    final int btcCounter = getIntent().getIntExtra(EXTRA_BTC, 0);

    final TextView statusText = findViewById(R.id.status_text);
    statusText.setText(getString(R.string.btc_status, btcCounter));
  }

  public static void start(Activity activity, int btcCounter) {
    final Intent intent = new Intent(activity, SecondActivity.class);
    intent.putExtra(EXTRA_BTC, btcCounter);
    activity.startActivity(intent);
  }
}
