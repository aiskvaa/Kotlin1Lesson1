package com.example.kotlin1lesson1.base

import android.os.Bundle
import android.view.View
import androidx.annotation.LayoutRes
import androidx.fragment.app.Fragment
import androidx.viewbinding.ViewBinding

abstract class BaseFragment<Binding : ViewBinding>(
    @LayoutRes layoutid: Int
) : Fragment(
    layoutid
) {
    protected abstract val binding: Binding
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initListeners()
        setupViews()
    }

    open fun setupViews() {

    }

    open fun initListeners() {

    }
}