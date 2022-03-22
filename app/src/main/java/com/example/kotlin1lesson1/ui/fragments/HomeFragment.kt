package com.example.kotlin1lesson1.ui.fragments

import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.kotlin1lesson1.R
import com.example.kotlin1lesson1.base.BaseFragment
import com.example.kotlin1lesson1.databinding.FragmentHomeBinding
import com.example.kotlin1lesson1.models.NameModel
import com.example.kotlin1lesson1.ui.adapters.NamesAdapter


class HomeFragment() : BaseFragment<FragmentHomeBinding>(R.layout.fragment_home) {
    val adapter = NamesAdapter({ NameModel -> onClick(NameModel) })
    private val viewModel: SharedViewModel by activityViewModels()

    private fun onClick(nameModel: NameModel) {
        viewModel.putDescription(nameModel.description)
        findNavController().navigate(R.id.detailsFragment)

    }

    override val binding: FragmentHomeBinding by viewBinding(FragmentHomeBinding::bind)


    private fun setupRecyclerView() {
        binding.recyclerviewName.layoutManager = LinearLayoutManager(context)
        adapter.setList(viewModel.getBooks())
        binding.recyclerviewName.adapter = adapter

    }

    override fun setupViews() {
        setupRecyclerView()

    }

}
