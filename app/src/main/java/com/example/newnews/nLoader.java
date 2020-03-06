package com.example.newnews;


import androidx.loader.content.AsyncTaskLoader;
import android.content.Context;
import java.util.List;


public class nLoader extends AsyncTaskLoader<List<News>> {



    /** Tag for log messages */

    private static final String LOG_TAG = nLoader.class.getName();



    /** Query URL */

    private String mUrl;



    public nLoader(Context context, String url) {

        super(context);

        mUrl = url;

    }



    @Override

    protected void onStartLoading() {

        forceLoad();

    }


    @Override

    public List<News> loadInBackground() {

        if (mUrl == null) {

            return null;

        }


        List<News> news = QueryUtils.fetchNewsArticleData(mUrl);

        return news;

    }

}