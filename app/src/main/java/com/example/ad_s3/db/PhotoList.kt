package com.example.ad_s3.db

import com.example.ad_s3.R

fun getPhotoList(): List<Photo> {
    return listOf(
        Photo(R.drawable.flower1),
        Photo(R.drawable.flower2),
        Photo(R.drawable.flower3),
        Photo(R.drawable.flower4),
        Photo(R.drawable.flower5),
        Photo(R.drawable.mobile1),
        Photo(R.drawable.mobile2),
        Photo(R.drawable.mobile3),
        Photo(R.drawable.mobile5),
        Photo(R.drawable.mobile6)
        )
}