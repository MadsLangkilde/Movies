package movies.feature.moviesbrowser.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.ArrowBack
import androidx.compose.runtime.*
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import coil.compose.rememberImagePainter
import movies.feature.moviesbrowser.MoviesBrowserViewModel
import movies.feature.uibase.elements.SearchView
import movies.feature.uibase.theme.MoviesTheme
import movies.feature.uibase.theme.styles.DefaultTypography
import org.koin.androidx.compose.getViewModel

// TODO: Hide keyboard on scroll
@Composable
fun MoviesBrowserScreen(navController: NavHostController) {
    val viewModel = getViewModel<MoviesBrowserViewModel>()
    val items by viewModel.viewData.observeAsState()

    MoviesTheme {
        Scaffold(topBar = {
            TopAppBar(
                navigationIcon = {
                    IconButton(onClick = {
                        navController.popBackStack()
                    }) {
                        Icon(
                            imageVector = Icons.Rounded.ArrowBack,
                            contentDescription = null
                        )
                    }
                },
                title = {
                    Text(text = "")
                },
                actions = {
                    SearchView(viewModel.query, viewModel::onQueryChange)
                }
            )
        }) {
            LazyColumn {
                items?.forEach {
                    item {
                        MovieCard(name = it.title, description = it.type, imageUrl = it.poster)
                    }
                }
                item {
                    Spacer(modifier = Modifier.height(80.dp))
                }
            }
        }
    }
}

@Composable
fun MovieCard(name: String, description: String, imageUrl: String) {
    Card(
        modifier = Modifier
            .padding(8.dp)
            .fillMaxWidth()
            .wrapContentHeight(),
        shape = MaterialTheme.shapes.medium,
        elevation = 5.dp,
        backgroundColor = MaterialTheme.colors.surface
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Image(
                painter = rememberImagePainter(imageUrl),
                contentDescription = null,
                modifier = Modifier
                    .size(130.dp)
                    .padding(8.dp),
                contentScale = ContentScale.Fit,
            )
            Column(Modifier.padding(8.dp)) {
                Text(
                    text = name,
                    style = DefaultTypography.h6,
                )
                Text(
                    text = description,
                    style = DefaultTypography.body2,
                )
            }
        }
    }
}
/*

 */