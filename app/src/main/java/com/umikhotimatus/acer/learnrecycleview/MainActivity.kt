package com.umikhotimatus.acer.learnrecycleview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import com.umikhotimatus.acer.learnrecycleview.adapter.PostItemAdapter
import com.umikhotimatus.acer.learnrecycleview.rest.ApiClient
import com.umikhotimatus.acer.learnrecycleview.rest.ApiService
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rv_list_posts.layoutManager = LinearLayoutManager(this)
        val service:ApiService = ApiClient.client()
        service.getAllPosts().subscribeOn(Schedulers.newThread())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe{
                rv_list_posts.adapter = PostItemAdapter(it, this)
            }
    }
}
