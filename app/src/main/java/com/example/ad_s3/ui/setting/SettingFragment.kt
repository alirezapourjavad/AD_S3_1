package com.example.ad_s3.ui.setting

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.ad_s3.R
import com.example.ad_s3.databinding.SettingFragmentBinding
import com.example.ad_s3.db.getPhotoList
import com.xwray.groupie.GroupieAdapter

class SettingFragment : Fragment() {
    lateinit var binding: SettingFragmentBinding

    companion object {
        fun newInstance() = SettingFragment()
    }

    private lateinit var viewModel: SettingViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = SettingFragmentBinding.inflate(inflater)
        viewModel = ViewModelProvider(this).get(SettingViewModel::class.java)
        binding.lifecycleOwner = viewLifecycleOwner
        return (binding.root)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val photo = getPhotoList()
        val photoItem = photo.map {
            PhotoItem(it)
        }
        val adapter = GroupieAdapter()
        adapter.addAll(photoItem)
        binding.vpSettings.adapter = adapter
        binding.vpSettings.apply {
            offscreenPageLimit = 5
            setPageTransformer(SliderTransformer(5))
        }
    }


}