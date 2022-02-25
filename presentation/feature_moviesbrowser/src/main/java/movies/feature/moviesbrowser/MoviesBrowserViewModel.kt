package movies.feature.moviesbrowser

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import movies.domain.omdb.entities.MovieEntity
import movies.domain.omdb.usecases.SearchAllUseCase
import org.koin.core.component.KoinComponent

class MoviesBrowserViewModel(private val searchAllUseCase: SearchAllUseCase) : ViewModel(), KoinComponent {
    var query: String by mutableStateOf("")
        private set


    // TODO Create BaseViewModel for livedata handling like this (generic arguments):
    private val viewDataM by lazy { MutableLiveData<List<MovieEntity>>() }
    val viewData: LiveData<List<MovieEntity>>
        get() = viewDataM

    fun onQueryChange(query: String) {
        this.query = query
        if (query.length < 2) return
        // TODO Implement Debounce
        viewModelScope.launch {
            try {
                val searchResults = searchAllUseCase.execute(query) // TODO Implement pagination
                viewDataM.value = searchResults.searchResults
            } catch (e: Exception) {
                e.printStackTrace()
            }
        }
    }
}