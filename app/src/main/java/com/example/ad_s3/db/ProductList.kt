package com.example.ad_s3.db

import com.example.ad_s3.R

fun getProductList():List<*>{
    return listOf<Any>(
        Product("Iphon1", R.drawable.mobile1,7000),
        Product("Iphon2", R.drawable.mobile2,2000),
        Discount("تخفیف ویژه",20),
        Product("Iphon3", R.drawable.mobile3,8000),
        Product("Iphon4", R.drawable.mobile5,9000),
        Product("Iphon5", R.drawable.mobile6,3000),
        Discount("تخفیف ویژه",40)
    )
}