package com.github.saiaaaaaaa.cod.normal;

import android.content.Context;

import com.github.saiaaaaaaa.cod._a;

import java.util.List;

public class EasySQL {

    _a _a;

    public EasySQL(Context context){
        _a = new _a(context);
    }

    public void createTable(String databaseName, String tableName, String[] columns){
        _a._a9(databaseName, tableName, columns);
    }

    public boolean doesTableExist(String databaseName, String tableName){
        return _a._a16(databaseName, tableName);
    }

    public void deleteTable(String databaseName, String tableName){
        _a._a21(databaseName, tableName);
    }

    public void clearTable(String databaseName, String tableName){
        _a._a25(databaseName, tableName);
    }

    public void insertToTable(String databaseName, String tableName, String[] values){
        _a._a29(databaseName, tableName, values);
    }

    public void deleteFromTable(String databaseName, String tableName, String columnValuePair){
        _a._a36(databaseName, tableName, columnValuePair);
    }

    public List<String> getTableValues(String databaseName, String tableName){
        return _a._a43(databaseName, tableName);
    }
}
