package com.san22.conduit.ui.feed

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.san22.api.model.Article
import com.san22.api.model.ArticlePojo
import com.san22.conduit.data.ArticlesRepo
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch


class FeedViewModel:ViewModel() {
    private val _feed = MutableLiveData<List<ArticlePojo>>()
    val feed: LiveData<List<ArticlePojo>> = _feed

    fun fetchGlobalFeed() = viewModelScope.launch {
        ArticlesRepo.getGlobalFeed()?.let {
            _feed.postValue(it)
        }

    }
//
//    fun fetchMyFeed() = viewModelScope.launch {
//        ArticlesRepo.getMyFeed()?.let {
//            _feed.postValue(it)
//        }
//    }

}