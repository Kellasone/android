package com.example.androidfinal.services;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.example.androidfinal.models.Order;
import com.example.androidfinal.models.OrderDAO;

@Database(entities = {Order.class}, version=2 ,exportSchema = false)
public abstract class DatabaseService extends RoomDatabase {

    public abstract OrderDAO orderDAO();

    private static DatabaseService instance;

    public static DatabaseService getOrderDatabase(Context context){
        if( instance == null) {
            instance = Room.databaseBuilder(context.getApplicationContext(), DatabaseService.class,"database").allowMainThreadQueries().build();
        }
        return instance;
    }
}
