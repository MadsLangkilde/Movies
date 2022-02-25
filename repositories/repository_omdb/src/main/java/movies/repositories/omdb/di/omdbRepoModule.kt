package movies.repositories.omdb.di

import movies.domain.omdb.OmdbRepository
import movies.repositories.omdb.OmdbRepositoryImpl
import movies.repositories.omdb.R
import movies.repositories.omdb.network.OmdbServerConnector
import org.koin.android.ext.koin.androidContext
import org.koin.dsl.module

val omdbRepoModule = module {
    single { OmdbServerConnector(androidContext().getString(R.string.omdb_api_key)) }
    factory<OmdbRepository> { OmdbRepositoryImpl(get()) }
}