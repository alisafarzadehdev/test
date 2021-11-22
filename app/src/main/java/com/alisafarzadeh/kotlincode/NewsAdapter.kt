package com.alisafarzadeh.kotlincode

import android.content.Context
import android.widget.ArrayAdapter
import android.view.ViewGroup
import android.view.View
import android.view.LayoutInflater
import android.widget.TextView
import android.widget.Button
import com.alisafarzadeh.kotlincode.model.model.Result


class NewsAdapter(val mContext: Context, val newsList: List<Result>, var clickItem: ClickItem)
    : ArrayAdapter<Result?>(mContext, 0, newsList)
    {

    // This variable holds whether the card is extended or not

    interface ClickItem {
        fun click(url : String , title:String , timeDate :String)
    }

    var currentNews: Result? = null
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var listItem = convertView
        if (listItem == null) {
            listItem = LayoutInflater.from(mContext).inflate(R.layout.list_item, parent, false)
        }

        // Set the current news item in the list
        currentNews = newsList[position]

        // Find reference to the views in the list item
        val name = listItem!!.findViewById<TextView>(R.id.list_item_header)
        val category = listItem.findViewById<TextView>(R.id.list_item_category)
        val body = listItem.findViewById<TextView>(R.id.list_item_body)
        val learnMoreButton = listItem.findViewById<Button>(R.id.list_item_btn)

        // Parse the body text of the current news item
        val currentNewsBodyElements = currentNews!!.blocks.body
        val currentNewsBody = currentNewsBodyElements[0]
        val sentenceNews =
            currentNewsBody.bodyTextSummary!!.substring(0,
                Math.min(currentNewsBody.bodyTextSummary!!.length,
                    CatalogActivity.BODY_SUMMARY_TEXT_LENGTH_SHORT))+"..."

        name.text = currentNews!!.webTitle
        category.text = currentNews!!.sectionName
        body.text = sentenceNews
        learnMoreButton.setOnClickListener{ clickItem.click(currentNews!!.webUrl, currentNews!!.webTitle,currentNews!!.webPublicationDate) }
        return listItem
    }
}