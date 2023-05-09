package com.mars.mytodolist

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import java.io.Closeable

class TaskViewModel: ViewModel() {

    var name = MutableLiveData<String>()
    var desc = MutableLiveData<String>()

}