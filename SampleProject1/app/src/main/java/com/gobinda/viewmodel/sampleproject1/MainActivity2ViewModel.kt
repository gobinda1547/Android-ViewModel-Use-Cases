package com.gobinda.viewmodel.sampleproject1

import androidx.lifecycle.ViewModel
import java.util.Random

class MainActivity2ViewModel : ViewModel() {

    var actualNumber: Int? = null
        private set

    fun generateNewNumber() {
        actualNumber = Random().nextInt(1000)
    }
}