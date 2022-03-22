package com.example.kotlin1lesson1.ui.fragments

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.kotlin1lesson1.bookClient.BookClient
import com.example.kotlin1lesson1.models.NameModel

class SharedViewModel : ViewModel() {
    val description = MutableLiveData<String>()
    fun getBooks(): ArrayList<NameModel> {
        return BookClient().getBooks()

    }

    fun putDescription(text: String) {
        description.value = text
    }

}