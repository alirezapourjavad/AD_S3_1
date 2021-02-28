package com.example.ad_s3.ui.setting

import com.example.ad_s3.R
import com.example.ad_s3.databinding.ViewpagerImage1Binding
import com.example.ad_s3.db.Photo
import com.xwray.groupie.databinding.BindableItem

class PhotoItem(val photo:Photo):BindableItem<ViewpagerImage1Binding>() {
    override fun bind(dataBinding: ViewpagerImage1Binding, position: Int) {
        dataBinding.photo = photo
        dataBinding.executePendingBindings()
    }

    override fun getLayout(): Int {
        return R.layout.viewpager_image1
    }
}