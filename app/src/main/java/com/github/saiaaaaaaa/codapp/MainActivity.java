package com.github.saiaaaaaaa.codapp;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.github.saiaaaaaaa.cod.EasySQL;
import com.github.saiaaaaaaa.codapp.fragments.CheckExampleFragment;
import com.github.saiaaaaaaa.codapp.fragments.ConvertExampleFragment;
import com.github.saiaaaaaaa.codapp.fragments.EasySQLExampleFragment;
import com.github.saiaaaaaaa.codapp.fragments.FullscreenExampleFragment;

public class MainActivity extends AppCompatActivity {

    public static final String DATABASE_NAME = "sample_db";
    public static final String TABLE_NAME = "sample_table";
    final String[] TABLE_COLUMNS = {"sample_text:text"};
    public static MainActivity mainActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainActivity = this;

        EasySQL easySQL = new EasySQL(this);
        if (!easySQL.doesTableExist(DATABASE_NAME, TABLE_NAME)){
            easySQL.createTable(DATABASE_NAME, TABLE_NAME, TABLE_COLUMNS);
            easySQL.insertToTable(DATABASE_NAME, TABLE_NAME, new String[]{"sample_text:Apple"});
            easySQL.insertToTable(DATABASE_NAME, TABLE_NAME, new String[]{"sample_text:Banana"});
            easySQL.insertToTable(DATABASE_NAME, TABLE_NAME, new String[]{"sample_text:Cherry"});
            easySQL.insertToTable(DATABASE_NAME, TABLE_NAME, new String[]{"sample_text:Durian"});
            easySQL.insertToTable(DATABASE_NAME, TABLE_NAME, new String[]{"sample_text:Eggplant"});
            easySQL.insertToTable(DATABASE_NAME, TABLE_NAME, new String[]{"sample_text:Fruitcake"});
        }

        getSupportFragmentManager().beginTransaction().replace(R.id.mainFrame, new EasySQLExampleFragment()).commit();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.options, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == R.id.option_easysql){
            getSupportFragmentManager().beginTransaction().replace(R.id.mainFrame, new EasySQLExampleFragment()).commit();
        }
        if (item.getItemId() == R.id.option_fullscreen){
            getSupportFragmentManager().beginTransaction().replace(R.id.mainFrame, new FullscreenExampleFragment()).commit();
        }
        if (item.getItemId() == R.id.option_check){
            getSupportFragmentManager().beginTransaction().replace(R.id.mainFrame, new CheckExampleFragment()).commit();
        }
        if (item.getItemId() == R.id.option_convert){
            getSupportFragmentManager().beginTransaction().replace(R.id.mainFrame, new ConvertExampleFragment()).commit();
        }
        return super.onOptionsItemSelected(item);
    }
}