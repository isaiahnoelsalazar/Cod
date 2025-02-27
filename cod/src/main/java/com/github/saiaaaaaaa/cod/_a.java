package com.github.saiaaaaaaa.cod;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;
import java.util.List;

public class _a {
    Context _a0;
    public _a(Context _a1){
        _a0 = _a1;
    }
    SQLiteDatabase _a2(String _a3){
        try {
            SQLiteOpenHelper _a4 = new SQLiteOpenHelper(_a0, _a3, null, 1) {
                @Override
                public void onCreate(SQLiteDatabase _a5) {
                }
                @Override
                public void onUpgrade(SQLiteDatabase _a6, int _a7, int _a8) {
                }
            };
            return _a4.getWritableDatabase();
        } catch (Exception ignored){
        }
        return null;
    }
    public void _a9(String _a10, String _a11, String[] _a12){
        try {
            SQLiteDatabase _a13 = _a2(_a10);
            String _a14 = "CREATE TABLE " + _a11 + "(";
            for (int _a15 = 0; _a15 < _a12.length; _a15++){
                if (_a15 != _a12.length - 1){
                    _a14 += _a12[_a15].split(":")[0] + " " + _a12[_a15].split(":")[1] + ",";
                } else {
                    _a14 += _a12[_a15].split(":")[0] + " " + _a12[_a15].split(":")[1];
                }
            }
            _a14 += ")";
            if (!_a16(_a10, _a11)){
                _a13.execSQL(_a14);
            }
            _a13.close();
        } catch (Exception ignored){
        }
    }
    public boolean _a16(String _a17, String _a18){
        try {
            SQLiteDatabase _a19 = _a2(_a17);
            Cursor _a20 = _a19.rawQuery("SELECT * FROM " + _a18, null);
            _a20.close();
            _a19.close();
            return true;
        } catch (Exception ignored){
        }
        return false;
    }
    public void _a21(String _a22, String _a23){
        try {
            SQLiteDatabase _a24 = _a2(_a22);
            if (_a16(_a22, _a23)){
                _a24.execSQL("DROP TABLE " + _a23);
            }
            _a24.close();
        } catch (Exception ignored){
        }
    }
    public void _a25(String _a26, String _a27){
        try {
            SQLiteDatabase _a28 = _a2(_a26);
            if (_a16(_a26, _a27)){
                _a28.execSQL("DELETE FROM " + _a27);
            }
            _a28.close();
        } catch (Exception ignored){
        }
    }
    public void _a29(String _a30, String _a31, String[] _a32){
        try {
            SQLiteDatabase _a33 = _a2(_a30);
            if (_a16(_a30, _a31)){
                ContentValues _a34 = new ContentValues();
                for (String _a35 : _a32){
                    _a34.put(_a35.split(":")[0], _a35.substring(_a35.split(":")[0].length() + 1));
                }
                _a33.insert(_a31, null, _a34);
            }
            _a33.close();
        } catch (Exception ignored){
        }
    }
    public void _a36(String _a37, String _a38, String _a39){
        try {
            SQLiteDatabase _a40 = _a2(_a37);
            if (_a16(_a37, _a38)){
                Cursor _a41 = _a40.rawQuery("SELECT " + _a39.split(":")[0] + " FROM " + _a38, null);
                _a41.moveToNext();
                int _a42 = _a41.getType(0);
                _a41.close();
                if (_a42 == Cursor.FIELD_TYPE_INTEGER || _a42 == Cursor.FIELD_TYPE_FLOAT){
                    _a40.execSQL("DELETE FROM " + _a38 + " WHERE " + _a39.split(":")[0] + "=" + _a39.split(":")[1]);
                } else {
                    _a40.execSQL("DELETE FROM " + _a38 + " WHERE " + _a39.split(":")[0] + "='" + _a39.split(":")[1] + "'");
                }
            }
            _a40.close();
        } catch (Exception ignored){
        }
    }
    public List<String> _a43(String _a44, String _a45){
        List<String> _a46 = new ArrayList<>();
        try {
            SQLiteDatabase _a47 = _a2(_a44);
            if (_a16(_a44, _a45)){
                Cursor _a48 = _a47.rawQuery("SELECT * FROM " + _a45, null);
                while (_a48.moveToNext()){
                    for (int _a49 = 0; _a49 < _a48.getColumnCount(); _a49++){
                        int _a50 = _a48.getType(_a49);
                        if (_a50 == Cursor.FIELD_TYPE_INTEGER || _a50 == Cursor.FIELD_TYPE_FLOAT){
                            _a46.add(_a48.getColumnName(_a49) + ":" + _a48.getString(_a49));
                        } else {
                            _a46.add(_a48.getColumnName(_a49) + ":'" + _a48.getString(_a49) + "'");
                        }
                    }
                }
                _a48.close();
            }
            _a47.close();
        } catch (Exception ignored){
        }
        return _a46;
    }
}
