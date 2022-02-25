package movies.feature.uibase.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.List
import androidx.compose.ui.graphics.vector.ImageVector
import movies.feature.uibase.theme.R

sealed class AppNavItem(var title: Int, var icon: ImageVector, var screen_route: String) {
    object AddMovie : AppNavItem(0, Icons.Filled.List, "addmovie")
    object Home : AppNavItem(R.string.menu_item_home, Icons.Filled.Home, "home")
    object BrowserMovies : AppNavItem(0, Icons.Filled.List, "home_browsermovies")
    object Lists : AppNavItem(R.string.menu_item_lists, Icons.Filled.List, "lists")
}