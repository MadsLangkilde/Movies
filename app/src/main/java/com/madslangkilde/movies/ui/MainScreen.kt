package com.madslangkilde.movies.ui

import android.widget.Toast
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.madslangkilde.movies.navigation.NavigationGraph
import movies.feature.uibase.navigation.AppNavItem

val bottomItems = listOf(
    AppNavItem.Home,
    AppNavItem.Lists
)

@Composable
fun MainScreenView() {
    val navController = rememberNavController()
    val context = LocalContext.current
    Scaffold(
        bottomBar = { BottomNavigation(navController = navController) },
        floatingActionButtonPosition = FabPosition.Center,
        isFloatingActionButtonDocked = true,
        floatingActionButton = {
            FloatingActionButton(
                shape = CircleShape,
                onClick = {
                    Toast.makeText(context, "Coming soon (Add movies to local list)", Toast.LENGTH_SHORT).show()
                },
            ) {
                Icon(imageVector = Icons.Filled.Add, contentDescription = "Add icon")
            }
        }
    ) {
        NavigationGraph(navController = navController)
    }
}

@Composable
fun BottomNavigation(navController: NavController) {
    BottomAppBar(
        cutoutShape = CircleShape,
        elevation = 22.dp
    ) {
        val navBackStackEntry by navController.currentBackStackEntryAsState()
        navBackStackEntry?.id
        val currentRoute = navBackStackEntry?.destination?.route
        bottomItems.forEach { item ->
            val stackAlreadySelected = currentRoute == item.screen_route || item.screen_route == currentRoute?.substringBefore("_")
            BottomNavigationItem(
                icon = { Icon(item.icon, contentDescription = stringResource(item.title)) },
                label = {
                    Text(
                        text = if (item.title > 0) stringResource(item.title) else "",
                    )
                },
                unselectedContentColor = LocalContentColor.current.copy(alpha = 0.4f),
                alwaysShowLabel = true,
                selected = stackAlreadySelected,
                onClick = {
                    if (stackAlreadySelected) {
                        navController.popBackStack(item.screen_route,false)
                    } else {
                        navController.navigate(item.screen_route) {
                            navController.graph.startDestinationRoute?.let { screen_route ->
                                popUpTo(screen_route) {
                                    saveState = true
                                }
                            }
                            launchSingleTop = true
                            restoreState = true
                        }
                    }
                }
            )
        }
    }
}