package com.example.newnews;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class nAdapter extends ArrayAdapter<News> {

    public nAdapter(Context context, List<News> news) {

        super(context, 0, news);

    }


    @Override

    public View getView(int position, View convertView, ViewGroup parent) {

        // Check if there is an existing list item view (called convertView) that we can reuse,

        // otherwise, if convertView is null, then inflate a new list item layout.

        View listItemView = convertView;

        if (listItemView == null) {

            listItemView = LayoutInflater.from(getContext()).inflate(

                    R.layout.activity_list_item, parent, false);

        }



        // Find the entertainment news article at the given position in the list of articles

        News currentNews = getItem(position);



        // Find the TextView with view ID news_article_section_name

        TextView NewsArticleSectionNameView = (TextView) listItemView.findViewById(R.id.news_article_section_name);

        String ArticleSectionName = currentNews.getNewsArticleSectionName();

        // Display the section name of the current entertainment news article in that TextView

        NewsArticleSectionNameView.setText(ArticleSectionName);



        // Find the TextView with view ID news_article_title

        TextView NewsArticleTitleView = (TextView) listItemView.findViewById(R.id.news_article_title);

        String ArticleTitle = currentNews.getNewsArticleTitle();

        // Display the title of the current entertainment news article in that TextView

        NewsArticleTitleView.setText(ArticleTitle);



        // Find the TextView with view ID news_article_author

        TextView NewsArticleAuthorView = (TextView) listItemView.findViewById(R.id.news_article_author);

        String ArticleAuthor = currentNews.getNewsArticleAuthor();

        // Display the author of the current entertainment news article in that TextView

        NewsArticleAuthorView.setText(ArticleAuthor);



        // Find the TextView with view ID news_article_publication_date

        TextView NewsArticlePublicationDateView = (TextView) listItemView.findViewById(R.id.news_article_publication_date);

        // Format the news_article_publication_date string (i.e. "Mar 3, 2019")

        String formattedArticlePublicationDate = (currentNews.getNewsArticlePublicationDate());



        // Display the publication date of the current entertainment news article in that TextView

        NewsArticlePublicationDateView.setText(formattedArticlePublicationDate);



        // Return the list item view that is now showing the appropriate data

        return listItemView;

    }



}
