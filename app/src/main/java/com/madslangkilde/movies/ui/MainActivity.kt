package com.madslangkilde.movies

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.compose.setContent
import com.madslangkilde.movies.ui.MainScreenView
import movies.feature.uibase.theme.MoviesTheme


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MoviesTheme {
                MainScreenView()
            }
        }
    }
}