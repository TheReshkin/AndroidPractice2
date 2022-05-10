package ru.mirea.tereshkin.intentfilter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button1 = (Button) findViewById(R.id.button);

        View.OnClickListener url_open = new View.OnClickListener(){
            public void onClick(View v){
                Uri address = Uri.parse("https://www.mirea.ru/");
                Intent openLinkIntent = new Intent(Intent.ACTION_VIEW, address);

                if (openLinkIntent.resolveActivity(getPackageManager()) != null) {
                    startActivity(openLinkIntent);
                } else {
                    Log.d("Intent", "Не получается обработать намерение!");
                }
            }
        };
        button1.setOnClickListener(url_open);

        View.OnClickListener message = new View.OnClickListener(){
            public void onClick(View v){
                Intent shareIntent = new Intent(Intent.ACTION_SEND);
                shareIntent.setType("text/plain");
                shareIntent.putExtra(Intent.EXTRA_SUBJECT, "MIREA");
                shareIntent.putExtra(Intent.EXTRA_TEXT, "Терешкин Максим Васильевич");
                startActivity(Intent.createChooser(shareIntent, "Мои ФИО"));
            }
        };

        Button button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(message);


    }
}