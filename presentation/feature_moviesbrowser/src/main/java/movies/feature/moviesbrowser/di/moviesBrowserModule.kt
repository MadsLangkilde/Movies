package movies.feature.moviesbrowser.di

import movies.feature.moviesbrowser.MoviesBrowserViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val moviesBrowserFeatureModule = module {
    viewModel { MoviesBrowserViewModel(get()) }
}