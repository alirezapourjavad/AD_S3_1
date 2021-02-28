package com.example.ad_s3.ui

import com.example.ad_s3.R
import com.example.ad_s3.databinding.BannerDiscountBinding
import com.example.ad_s3.db.Discount
import com.xwray.groupie.databinding.BindableItem

class DiscountItem(val discount: Discount) : BindableItem<BannerDiscountBinding>() {
    override fun bind(dataBinding: BannerDiscountBinding, position: Int) {
        dataBinding.discount = discount
        dataBinding.executePendingBindings()
    }

    override fun getLayout(): Int {
        return R.layout.banner_discount
    }
}