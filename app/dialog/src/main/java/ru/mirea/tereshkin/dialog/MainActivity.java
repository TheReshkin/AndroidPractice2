package ru.mirea.tereshkin.dialog;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void onOkClicked(){
        Toast.makeText(this, "Вы нажали кнопку \"Иду дальше\"!",
                Toast.LENGTH_LONG).show();
    }

    public void onCancelClicked(){
        Toast.makeText(this, "Вы нажали кнопку \"Нет\"!",
                Toast.LENGTH_LONG).show();
    }

    public void onNeutralClicked(){
        Toast.makeText(this, "Вы нажали кнопку \"На паузе\"!",
                Toast.LENGTH_LONG).show();
    }

    public void onClickShowDialog(View view){
        MyDialogFragment myDialogFragment = new MyDialogFragment();
        myDialogFragment.show(getSupportFragmentManager(), "MIREA");
    }
//work
    public void onClickTimePicker(View view){
        MyTimeDialogFragment fragment = new MyTimeDialogFragment();
        fragment.show(getSupportFragmentManager(), "timePicker");
    }

    public void onClickDatePicker(View view){
        MyDateDialogFragment fragment = new MyDateDialogFragment();
        fragment.show(getSupportFragmentManager(), "datePicker");
    }

    public void onClickProgress(View view){
        MyProgressDialogFragment fragment = new MyProgressDialogFragment();
        fragment.show(getSupportFragmentManager(), "progress");
    }
}