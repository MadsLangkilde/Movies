package movies.feature.home.ui

import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.LiveTv
import androidx.compose.material.icons.rounded.Search
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import movies.feature.home.R
import movies.feature.home.viewmodel.HomeViewModel
import movies.feature.uibase.navigation.AppNavItem
import movies.feature.uibase.theme.MoviesTheme
import org.koin.androidx.compose.getViewModel

@Composable
fun HomeScreen(navController: NavHostController) {
    val viewModel = getViewModel<HomeViewModel>()
    val context = LocalContext.current
    MoviesTheme {
        Scaffold(topBar = {
            TopAppBar(
                navigationIcon = {
                    Icon(
                        imageVector = Icons.Rounded.LiveTv,
                        contentDescription = null,
                        Modifier.size(34.dp)
                    )
                },
                title = {
                    Text(text = context.getString(R.string.app_name))
                },
                actions = {
                    IconButton(onClick = {
                        navController.navigate(AppNavItem.BrowserMovies.screen_route)
                    }) {
                        Icon(
                            imageVector = Icons.Rounded.Search,
                            contentDescription = null
                        )
                    }
                }
            )
        }) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .wrapContentSize(Alignment.Center)
            ) {
                Text(
                    text = "Home Screen",
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.align(Alignment.CenterHorizontally),
                    textAlign = TextAlign.Center,
                )
            }
        }
    }
}