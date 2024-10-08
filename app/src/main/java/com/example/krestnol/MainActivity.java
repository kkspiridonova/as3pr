package com.example.krestnol;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Button button1, button2, button3, button4, button5, button6, button7, button8, button9, buttonNew, playWithFriend, playWithPC;
    String krest, nol, schet;
    TextView textView, FirstPlayer, SecondPlayer, PC;
    int pointsFirstPlayer, pointsSecondPlayer, pointsPC;
    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;
    SharedPreferences themeSettings;
    SharedPreferences.Editor settingsEditor;
    ImageButton imageTheme;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        themeSettings = getSharedPreferences("SETTINGS", MODE_PRIVATE);
        if (!themeSettings.contains("MODE_NIGHT_ON")) {
            settingsEditor = themeSettings.edit();
            settingsEditor.putBoolean("MODE_NIGHT_ON", false);
            settingsEditor.apply();
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
            Toast.makeText(this, "Запуск", Toast.LENGTH_SHORT).show();
        } else {
            setCurrentTheme();
        }
        setContentView(R.layout.activity_main);
        imageTheme = findViewById(R.id.Ing);
        updateImageButton();




        textView = findViewById(R.id.textView);

        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);
        button6 = findViewById(R.id.button6);
        button7 = findViewById(R.id.button7);
        button8 = findViewById(R.id.button8);
        button9 = findViewById(R.id.button9);
        buttonNew = findViewById(R.id.buttonNew);

        FirstPlayer = findViewById(R.id.FirstPlayer);
        SecondPlayer = findViewById(R.id.SecondPlayer);
        PC = findViewById(R.id.Pc);

        sharedPreferences = this.getSharedPreferences("krestikinoliki", Context.MODE_PRIVATE);
        editor = sharedPreferences.edit();

        pointsFirstPlayer = sharedPreferences.getInt("pointsFirstPlayer", 0);
        FirstPlayer.setText(""+pointsFirstPlayer);
        pointsSecondPlayer = sharedPreferences.getInt("pointsSecondPlayer", 0);
        SecondPlayer.setText(""+pointsSecondPlayer);
        pointsPC = sharedPreferences.getInt("pointsPC", 0);
        PC.setText(""+pointsPC);

        krest = "X";
        nol = "O";
        textView.setText("");

        imageTheme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (themeSettings.getBoolean("MODE_NIGHT_ON", false))
                {
                    AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
                    settingsEditor = themeSettings.edit();
                    settingsEditor.putBoolean("MODE_NIGHT_ON", false);
                    settingsEditor.apply();
                    AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
                    Toast.makeText(MainActivity.this, "Темная тема отключена", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
                    settingsEditor = themeSettings.edit();
                    settingsEditor.putBoolean("MODE_NIGHT_ON", true);
                    settingsEditor.apply();
                    AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
                    Toast.makeText(MainActivity.this, "Темная тема включена", Toast.LENGTH_SHORT).show();
                }
                updateImageButton();
            }
        });

    }

    private void updateImageButton() {
        if (themeSettings.getBoolean("MODE_NIGHT_ON", false)){
            imageTheme.setImageResource(R.drawable.icon2);
        } else{
            imageTheme.setImageResource((R.drawable.icon));
        }
    }

    private void setCurrentTheme() {
        if(themeSettings.getBoolean("MODE_NIGHT_ON",false )){
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
        }else{
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);

        }

    }

    public void clcBtn1(View view) {
        if (button1.getText()=="" && textView.getText() == ""){
        button1.setText(krest);
        isPlayerWiner();
        if (textView.getText() == "")
        {
        hodPc();
        isPCWiner();
        }
        }
    }
    public void clcBtn2(View view) {
        if (button2.getText()=="" && textView.getText() == ""){
        button2.setText(krest);
        isPlayerWiner();
            if (textView.getText() == "")
            {
                hodPc();
                isPCWiner();
            }
        }


    }
    public void clcBtn3(View view) {
        if (button3.getText()=="" && textView.getText() == ""){
        button3.setText(krest);
        isPlayerWiner();
            if (textView.getText() == "")
            {
                hodPc();
                isPCWiner();
            }
        }

    }
    public void clcBtn4(View view) {
        if (button4.getText()=="" && textView.getText() == ""){
        button4.setText(krest);
        isPlayerWiner();
            if (textView.getText() == "")
            {
                hodPc();
                isPCWiner();
            }
        }

    }
    public void clcBtn5(View view) {
        if (button5.getText()=="" && textView.getText() == ""){
        button5.setText(krest);
        isPlayerWiner();
            if (textView.getText() == "")
            {
                hodPc();
                isPCWiner();
            }
        }

    }
    public void clcBtn6(View view) {
        if (button6.getText()=="" && textView.getText() == ""){
        button6.setText(krest);
        isPlayerWiner();
            if (textView.getText() == "")
            {
                hodPc();
                isPCWiner();
            }
        }


    }
    public void clcBtn7(View view) {
        if (button7.getText()=="" && textView.getText() == ""){
        button7.setText(krest);
        isPlayerWiner();
            if (textView.getText() == "")
            {
                hodPc();
                isPCWiner();
            }
        }

    }
    public void clcBtn8(View view) {
        if (button8.getText()=="" && textView.getText() == ""){
        button8.setText(krest);
        isPlayerWiner();
            if (textView.getText() == "")
            {
                hodPc();
                isPCWiner();
            }
        }

    }
    public void clcBtn9(View view) {
        if (button9.getText()=="" && textView.getText() == ""){
        button9.setText(krest);
        isPlayerWiner();
            if (textView.getText() == "")
            {
                hodPc();
                isPCWiner();
            }
        }


    }

    public void isPlayerWiner(){
        if(button1.getText() == krest && button2.getText() == krest &&button3.getText() == krest){
         textView.setText("Победа!");
         pointsFirstPlayer++;
         FirstPlayer.setText(""+pointsFirstPlayer);
         editor.putInt("pointsFirstPlayer",pointsFirstPlayer);
         editor.apply();
        }
        else if(button1.getText() == krest && button5.getText() == krest &&button9.getText() == krest){
            textView.setText("Победа!");
            pointsFirstPlayer++;
            FirstPlayer.setText(""+pointsFirstPlayer);
            editor.putInt("pointsFirstPlayer",pointsFirstPlayer);
            editor.apply();
        }
        else if(button1.getText() == krest && button4.getText() == krest &&button7.getText() == krest){
            textView.setText("Победа!");
            pointsFirstPlayer++;
            FirstPlayer.setText(""+pointsFirstPlayer);
            editor.putInt("pointsFirstPlayer",pointsFirstPlayer);
            editor.apply();
        }
        else if(button2.getText() == krest && button5.getText() == krest &&button8.getText() == krest){
            textView.setText("Победа!");
            pointsFirstPlayer++;
            FirstPlayer.setText(""+pointsFirstPlayer);
            editor.putInt("pointsFirstPlayer",pointsFirstPlayer);
            editor.apply();
        }
        else if(button3.getText() == krest && button6.getText() == krest &&button9.getText() == krest){
            textView.setText("Победа!");
            pointsFirstPlayer++;
            FirstPlayer.setText(""+pointsFirstPlayer);
            editor.putInt("pointsFirstPlayer",pointsFirstPlayer);
            editor.apply();
        }
        else if(button4.getText() == krest && button5.getText() == krest &&button6.getText() == krest){
            textView.setText("Победа!");
            pointsFirstPlayer++;
            FirstPlayer.setText(""+pointsFirstPlayer);
            editor.putInt("pointsFirstPlayer",pointsFirstPlayer);
            editor.apply();
        }
        else if(button7.getText() == krest && button8.getText() == krest &&button9.getText() == krest){
            textView.setText("Победа!");
            pointsFirstPlayer++;
            FirstPlayer.setText(""+pointsFirstPlayer);
            editor.putInt("pointsFirstPlayer",pointsFirstPlayer);
            editor.apply();
        }
        else if(button3.getText() == krest && button5.getText() == krest &&button7.getText() == krest){
            textView.setText("Победа!");
            pointsFirstPlayer++;
            FirstPlayer.setText(""+pointsFirstPlayer);
            editor.putInt("pointsFirstPlayer",pointsFirstPlayer);
            editor.apply();
        }
        else if(button1.getText() != "" && button2.getText() != "" && button3.getText() != "" &&
        button4.getText() != "" && button5.getText() != "" && button6.getText() != "" &&
        button7.getText() != "" && button8.getText() != "" && button9.getText() != ""){
            textView.setText("Ничья!");
            pointsSecondPlayer++;
            SecondPlayer.setText(""+pointsSecondPlayer);
            editor.putInt("pointsSecondPlayer",pointsSecondPlayer);
            editor.apply();
        }
    }
    public void isPCWiner(){
        if(button1.getText() == nol && button2.getText() == nol &&button3.getText() == nol){
            textView.setText("Проигрыш!");
            pointsPC++;
            PC.setText(""+pointsPC);
            editor.putInt("pointsPC",pointsPC);
            editor.apply();
        }
        else if(button1.getText() == nol && button5.getText() == nol &&button9.getText() == nol){
            textView.setText("Проигрыш!");
            pointsPC++;
            PC.setText(""+pointsPC);
            editor.putInt("pointsPC",pointsPC);
            editor.apply();
        }
        else if(button1.getText() == nol && button4.getText() == nol &&button7.getText() == nol){
            textView.setText("Проигрыш!");
            pointsPC++;
            PC.setText(""+pointsPC);
            editor.putInt("pointsPC",pointsPC);
            editor.apply();
        }
        else if(button2.getText() == nol && button5.getText() == nol &&button8.getText() == nol){
            textView.setText("Проигрыш!");
            pointsPC++;
            PC.setText(""+pointsPC);
            editor.putInt("pointsPC",pointsPC);
            editor.apply();
        }
        else if(button3.getText() == nol && button6.getText() == nol &&button9.getText() == nol){
            textView.setText("Проигрыш!");
            pointsPC++;
            PC.setText(""+pointsPC);
            editor.putInt("pointsPC",pointsPC);
            editor.apply();
        }
        else if(button4.getText() == nol && button5.getText() == nol &&button6.getText() == nol){
            textView.setText("Проигрыш!");
            pointsPC++;
            PC.setText(""+pointsPC);
            editor.putInt("pointsPC",pointsPC);
            editor.apply();
        }
        else if(button7.getText() == nol && button8.getText() == nol &&button9.getText() == nol){
            textView.setText("Проигрыш!");
            pointsPC++;
            PC.setText(""+pointsPC);
            editor.putInt("pointsPC",pointsPC);
            editor.apply();
        }
        else if(button3.getText() == nol && button5.getText() == nol &&button7.getText() == nol){
            textView.setText("Проигрыш!");
            pointsPC++;
            PC.setText(""+pointsPC);
            editor.putInt("pointsPC",pointsPC);
            editor.apply();
        }
    }


    private void hodPc() {
        Random random = new Random();
        int buttonPcClick = 1 + random.nextInt(9);
        switch(buttonPcClick){
            case (1):
                if(button1.getText()=="")
                {
                button1.setText(nol);
                }
                else
                {
                    hodPc();
                };
                break;
            case (2):
                if(button2.getText()=="")
            {
                button2.setText(nol);
            }
            else
            {
                hodPc();
            };
                break;
            case (3):
                if(button3.getText()=="")
            {
                button3.setText(nol);
            }
            else
            {
                hodPc();
            };
                break;
            case (4):
                if(button4.getText()=="")
            {
                button4.setText(nol);
            }
            else
            {
                hodPc();
            };
                break;
            case (5):
                if(button5.getText()=="")
            {
                button5.setText(nol);
            }
            else
            {
                hodPc();
            };
                break;
            case (6): if(button6.getText()=="")
            {
                button6.setText(nol);
            }
            else
            {
                hodPc();
            };
                break;
            case (7): if(button7.getText()=="")
            {
                button7.setText(nol);
            }
            else
            {
                hodPc();
            };
                break;
            case (8): if(button8.getText()=="")
            {
                button8.setText(nol);
            }
            else
            {
                hodPc();
            };
                break;
            case (9): if(button9.getText()=="")
            {
                button9.setText(nol);
            }
            else
            {
                hodPc();
            };
                break;

        }
    }

    public void clcBtnNew(View view) {
        button1.setText("");
        button2.setText("");
        button3.setText("");
        button4.setText("");
        button5.setText("");
        button6.setText("");
        button7.setText("");
        button8.setText("");
        button9.setText("");
        textView.setText("");
    }


}