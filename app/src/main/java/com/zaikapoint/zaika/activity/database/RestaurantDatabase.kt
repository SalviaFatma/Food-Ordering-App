package com.zaikapoint.zaika.activity.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.zaikapoint.zaika.activity.database.RestaurantDao
import com.zaikapoint.zaika.activity.database.RestaurantEntity

@Database(entities = [RestaurantEntity::class], version = 1)
abstract class RestaurantDatabase:RoomDatabase() {

    abstract fun restaurantDao(): RestaurantDao
}