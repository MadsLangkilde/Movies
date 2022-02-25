package movies.domain.omdb.di

import movies.domain.omdb.usecases.SearchAllUseCase
import org.koin.dsl.module

val omdbDomainModule = module {
    factory { SearchAllUseCase(get()) }
}