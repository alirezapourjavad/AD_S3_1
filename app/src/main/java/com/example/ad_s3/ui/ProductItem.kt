package com.example.ad_s3.ui

import com.example.ad_s3.R
import com.example.ad_s3.databinding.HomeViewpagerItemBinding
import com.example.ad_s3.db.Product
import com.xwray.groupie.databinding.BindableItem

class ProductItem(val product: Product):BindableItem<HomeViewpagerItemBinding>() {
    override fun bind(viewBinding: HomeViewpagerItemBinding, position: Int) {
        viewBinding.product = product
        viewBinding.executePendingBindings()
    }

    override fun getLayout(): Int {
        return R.layout.home_viewpager_item
    }
}