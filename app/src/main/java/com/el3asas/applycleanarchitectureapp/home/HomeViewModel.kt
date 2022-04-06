package com.el3asas.applycleanarchitectureapp.home

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.el3asas.entities.Note
import com.el3asas.utils.base.BaseViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(private val allCases: AllCases) : BaseViewModel() {
    val data = MutableLiveData<List<Note>?>()
    fun getNotes() {
        viewModelScope.launch {
            data.postValue(allCases.getNotes.getASCNotes())
            allCases.insertNote.insert(Note(1, "", ""), 1)
        }
    }
}