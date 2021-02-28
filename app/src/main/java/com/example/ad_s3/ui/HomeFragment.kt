package com.example.ad_s3.ui

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager2.widget.ViewPager2
import com.example.ad_s3.R
import com.example.ad_s3.databinding.HomeFragmentBinding
import com.example.ad_s3.db.Discount
import com.example.ad_s3.db.Product
import com.example.ad_s3.db.getProductList
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import com.xwray.groupie.GroupieAdapter

class HomeFragment : Fragment() {

    companion object {
        fun newInstance() = HomeFragment()
    }

    lateinit var binding: HomeFragmentBinding
    private lateinit var viewModel: HomeViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = HomeFragmentBinding.inflate(inflater)
        viewModel = ViewModelProvider(this).get(HomeViewModel::class.java)
        binding.lifecycleOwner = viewLifecycleOwner
        return (binding.root)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val product = getProductList()
        val productItem = product.map {
            if (it is Product){
            ProductItem(it)
            }else {
                DiscountItem(it as Discount)
            }
        }

        val adapter = GroupieAdapter()
        adapter.addAll(productItem)
        binding.viewPager.adapter = adapter
        binding.rcHome.adapter = adapter
        binding.dotsIndicator.setViewPager2(binding.viewPager)
        TabLayoutMediator(binding.tabLayout,binding.viewPager,{ tab: TabLayout.Tab, i: Int ->
//            tab.text = product[i].name
        }).attach()


    }

}