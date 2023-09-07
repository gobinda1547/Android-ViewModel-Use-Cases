package com.gobinda.viewmodel.sampleproject1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

import androidx.activity.viewModels

class MainActivity2 : AppCompatActivity() {

    private lateinit var nextButton: Button
    private lateinit var numberTextView: TextView

    private val viewModel: MainActivity2ViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        nextButton = findViewById(R.id.next_button)
        numberTextView = findViewById(R.id.number_textview)

        nextButton.setOnClickListener { handleNextButtonClicked() }

        // this function call won't have any effect when the activity starts for the
        // first time, cause the actualNumber will be null then, but when the activity
        // will restart then we have to display the previous number on the textview (cause
        // initially the textview will be newly created since the activity restarts), that's
        // why we have to call this function.
        //
        // Here we are expecting that it will show the last random number. And it will actually
        // display the number. cause the activity restarts but the viewmodel doesn't, and we have
        // stored the actualNumber variable in the viewmodel, so it will be the same previous
        // actualNumber variable which contains the last random number.
        displayTheNumber()
    }

    /**
     * Since user clicked on the next button, so according to our requirement,
     * 1. We will first generate a new number,
     * 2. then we will show it to the user.
     */
    private fun handleNextButtonClicked() {
        viewModel.generateNewNumber()
        displayTheNumber()
    }

    private fun displayTheNumber() {
        viewModel.actualNumber?.let { numberTextView.text = it.toString() }
    }
}