package com.example.kotlin1lesson1.ui.fragments

import androidx.fragment.app.activityViewModels
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.kotlin1lesson1.R
import com.example.kotlin1lesson1.base.BaseFragment
import com.example.kotlin1lesson1.databinding.FragmentDetailsBinding


class DetailsFragment : BaseFragment<FragmentDetailsBinding>(R.layout.fragment_details) {
    override val binding by viewBinding(FragmentDetailsBinding::bind)
    private val viewModel: SharedViewModel by activityViewModels()


    override fun setupViews() {
        viewModel.description.observe(viewLifecycleOwner) { description ->
            binding.tvDesc.text = description
        }

    }


}