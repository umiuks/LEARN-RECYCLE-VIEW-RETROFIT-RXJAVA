package com.umikhotimatus.acer.learnrecycleview.rest

import com.umikhotimatus.acer.learnrecycleview.model.Post
import io.reactivex.Observable
import retrofit2.http.GET

interface ApiService {
    @GET("posts/")
    fun getAllPosts(): Observable<List<Post>>
}