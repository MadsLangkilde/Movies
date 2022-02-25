package movies.feature.home.di

import org.koin.androidx.viewmodel.dsl.viewModel
import movies.feature.home.viewmodel.HomeViewModel
import org.koin.dsl.module

val homeFeatureModule = module {
    viewModel { HomeViewModel() }
}