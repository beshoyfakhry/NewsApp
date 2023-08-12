package com.omaradev.newsapp.data.local

import androidx.room.*
import com.omaradev.newsapp.domain.model.news.TypeConverter
import com.omaradev.newsapp.domain.model.news.Article

@Database(entities = [Article::class], version = 1, exportSchema = false)
@TypeConverters(TypeConverter::class)
abstract class ArticleDB : RoomDatabase() {
    abstract val articleDao: ArticleDao
    companion object {
        const val DATABASE_NAME = "Article_db3"
    }
}