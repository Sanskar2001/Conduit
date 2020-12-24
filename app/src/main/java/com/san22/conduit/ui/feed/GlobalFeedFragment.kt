package com.san22.conduit.ui.feed

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.observe
import androidx.recyclerview.widget.LinearLayoutManager
import com.san22.conduit.R
import com.san22.conduit.databinding.FragmentFeedBinding

class GlobalFeedFragment: Fragment() {

    private lateinit var feedViewModel:FeedViewModel
    private lateinit var ArticleFeedAdapter:ArticleFeedAdapter
    private var _binding:FragmentFeedBinding?=null


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?):
            View? {
        feedViewModel=ViewModelProvider(this).get(FeedViewModel::class.java);
        ArticleFeedAdapter= ArticleFeedAdapter {  }
        _binding = FragmentFeedBinding.inflate(inflater, container, false)
        _binding?.articleRv?.layoutManager = LinearLayoutManager(context)
        _binding?.articleRv?.adapter = ArticleFeedAdapter
        return _binding?.root
      


  
       

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        feedViewModel.fetchGlobalFeed();
        feedViewModel.feed.observe({lifecycle}){
            ArticleFeedAdapter.submitList(it)
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding=null

    }


}