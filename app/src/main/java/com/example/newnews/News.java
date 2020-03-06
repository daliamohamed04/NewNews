package com.example.newnews;


public class News {

    private String mNewsArticleSectionName;
    private String mNewsArticleTitle;
    private String mNewsArticleAuthor;
    private String mNewsArticlePublicationDate;
    private String mNewsArticleUrl;


    public News(String NewsArticleSectionName, String NewsArticleTitle, String NewsArticleAuthor,

                String NewsArticlePublicationDate, String NewsArticleUrl) {



        mNewsArticleSectionName = NewsArticleSectionName;
        mNewsArticleTitle = NewsArticleTitle;
        mNewsArticleAuthor = NewsArticleAuthor;
        mNewsArticlePublicationDate = NewsArticlePublicationDate;
        mNewsArticleUrl = NewsArticleUrl;
    }

    public String getNewsArticleSectionName() {

        return mNewsArticleSectionName;

    }



    public String getNewsArticleTitle() {

        return mNewsArticleTitle;

    }



    /**

     * Returns the title of the author of the entertainment news article.

     */

    public String getNewsArticleAuthor() {

        return mNewsArticleAuthor;

    }



    /**

     * Returns the news_article_publication_date the entertainment news article was published.

     */

    public String getNewsArticlePublicationDate() {

        return mNewsArticlePublicationDate;

    }



    /**

     * Returns the website URL for the entertainment news article.

     */

    public String getNewsArticleUrl() {

        return mNewsArticleUrl;

    }

}