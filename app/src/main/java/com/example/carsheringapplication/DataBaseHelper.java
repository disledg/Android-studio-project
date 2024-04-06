package com.example.carsheringapplication;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DataBaseHelper extends SQLiteOpenHelper {
    private Context context;
    public static final String DATABASE_NAME = "Users.db";
    public static final int DATABASE_VERSION = 1;
    public static final String TABLE_NAME = "UnP";
    public static final String COLUMN_ID = "_id";
    public static final String COLUMN_USERNAMES = "Usernames";
    public static final String COLUMN_PASSWORD = "Passwords";
    public static final String COLUMN_VERIFICATION = "Verif";
    public DataBaseHelper(@Nullable Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
            String query = "CREATE TABLE " + TABLE_NAME +
                            " (" + COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                            COLUMN_USERNAMES + " TEXT, " +
                            COLUMN_PASSWORD + " TEXT, " +
                            COLUMN_VERIFICATION + " INTEGER);";
            db.execSQL(query);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
        onCreate(db);
    }
    public void addData(String username, String password) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(COLUMN_USERNAMES, username); // Поле "username"
        values.put(COLUMN_PASSWORD, password); // Поле "password"

        // Вставляем данные в таблицу
        long result = db.insert(TABLE_NAME, null, values);
        db.close();

        if (result == -1) {
            // Если вставка не удалась
            // Обработка ошибки или вывод сообщения об ошибке
        } else {
            // Вставка успешна
            // Можно выполнить какие-то действия при успешной вставке
        }
    }
    public boolean checkLogin(String username, String password) {
        SQLiteDatabase db = this.getReadableDatabase();
        String[] columns = {"Usernames"};
        String selection = "Usernames = ? AND Passwords = ?";
        String[] selectionArgs = {username, password};

        Cursor cursor = db.query(TABLE_NAME, columns, selection, selectionArgs, null, null, null);
        int count = cursor.getCount();
        cursor.close();
        db.close();

        return count > 0;
    }
}
