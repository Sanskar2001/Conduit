package com.san22.conduit.ui.feed

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ListAdapter
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.san22.api.model.Article
import com.san22.api.model.ArticlePojo
import com.san22.conduit.R
import com.san22.conduit.databinding.ListItemArticleBinding
import com.san22.conduit.ui.extensions.timeStamp
import com.san22.conduit.ui.extensions.loadImage



class ArticleFeedAdapter(val onArticleClicked: (slug: String) -> Unit): androidx.recyclerview.widget.ListAdapter<ArticlePojo, ArticleFeedAdapter.ArticleViewHolder>(
        object : DiffUtil.ItemCallback<ArticlePojo>() {


            override fun areItemsTheSame(oldItem: ArticlePojo, newItem: ArticlePojo): Boolean {
               return oldItem == newItem
            }

            override fun areContentsTheSame(oldItem: ArticlePojo, newItem: ArticlePojo): Boolean {
                return oldItem.toString() == newItem.toString()
            }
        }
        ) {

    inner class ArticleViewHolder(itemView:View):RecyclerView.ViewHolder(itemView) {

    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ArticleViewHolder {

        return ArticleViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.list_item_article,parent,false))
    }



    override fun onBindViewHolder(holder: ArticleViewHolder, position: Int) {

                         ListItemArticleBinding.bind(holder.itemView).apply {
                             val article=getItem(position);
                             authorTextView.text = article.author.username
                             titleTextView.text = article.title
                             bodySnippetTextView.text = article.body
                             dateTextView.timeStamp = article.createdAt.toString()
                             avatarImageView.loadImage(article.author.image, true)

                             root.setOnClickListener { onArticleClicked(article.slug.toString()) }
                         }
    }


}