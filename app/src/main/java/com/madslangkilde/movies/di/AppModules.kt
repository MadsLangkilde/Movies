package com.madslangkilde.movies.di

import movies.domain.general.di.generalDomainModule
import movies.domain.omdb.di.omdbDomainModule
import movies.feature.home.di.homeFeatureModule
import movies.feature.lists.di.listsFeatureModule
import movies.feature.moviesbrowser.di.moviesBrowserFeatureModule
import movies.feature.uibase.di.uiBaseFeatureModule
import movies.repositories.omdb.di.omdbRepoModule

val koinModuleList = listOf(
    // Feature modules
    homeFeatureModule,
    listsFeatureModule,
    moviesBrowserFeatureModule,
    uiBaseFeatureModule,

    // Domain modules
    generalDomainModule,
    omdbDomainModule,

    // Repository modules
    omdbRepoModule
)
