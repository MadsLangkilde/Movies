package movies.feature.uibase.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import com.google.accompanist.systemuicontroller.rememberSystemUiController
import movies.feature.uibase.theme.styles.*

private val LightThemeColors = lightColors(
    primary = Blue700,
    primaryVariant = Blue900,
    onPrimary = Color.White,
    secondary = Blue700,
    secondaryVariant = Blue900,
    onSecondary = Color.White,
    error = Blue800,
    onBackground = Color.Black
)

private val DarkThemeColors = darkColors(
    primary = Blue300,
    primaryVariant = Blue700,
    onPrimary = Color.Black,
    secondary = Blue300,
    secondaryVariant = Blue700,
    onSecondary = Color.Black,
    error = Blue200,
    onBackground = Color.White
)


@Composable
fun MoviesTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val systemUiController = rememberSystemUiController()
    if (darkTheme) {
        systemUiController.setSystemBarsColor(
            color = Color.Black
        )
    } else {
        systemUiController.setSystemBarsColor(
            color = Blue800
        )
    }
    MaterialTheme(
        colors = if (darkTheme) DarkThemeColors else LightThemeColors,
        typography = DefaultTypography,
        shapes = DefaultShapes,
        content = content
    )
}

