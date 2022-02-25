package com.madslangkilde.movies.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import movies.feature.home.ui.HomeScreen
import movies.feature.lists.ui.ListsScreen
import movies.feature.moviesbrowser.ui.MoviesBrowserScreen
import movies.feature.uibase.navigation.AppNavItem

@Composable
fun NavigationGraph(navController: NavHostController) {
    NavHost(navController, startDestination = AppNavItem.Home.screen_route) {
        composable(AppNavItem.AddMovie.screen_route) {  }
        composable(AppNavItem.Home.screen_route) { HomeScreen(navController) }
        composable(AppNavItem.Lists.screen_route) { ListsScreen(navController) }
        composable(AppNavItem.BrowserMovies.screen_route) { MoviesBrowserScreen(navController) }
    }
}