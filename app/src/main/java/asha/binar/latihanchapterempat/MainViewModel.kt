package asha.binar.latihanchapterempat

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel: ViewModel() {
    private val _textAlphabet: MutableLiveData<ArrayList<String>> = MutableLiveData()
    val textAlphabet: LiveData<ArrayList<String>> get() = _textAlphabet

    fun alphabetList(textAlphabet: ArrayList<String>) {
        _textAlphabet.value = textAlphabet

    }
}


