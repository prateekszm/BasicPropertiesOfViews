package com.example.basicpropertiesofviews

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.core.view.isVisible
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tvTextView1.isVisible=true
        tvTextView1.visibility= View.VISIBLE
//        tvTextView1.visibility= View.INVISIBLE
//        tvTextView1.visibility= View.GONE

        editTextTextPersonName.isEnabled=true
//        editTextTextPersonName.isEnabled=false
        editTextTextPersonName.requestFocus()

        checkBox.setOnCheckedChangeListener { buttonView, isChecked ->
            Toast.makeText(this, "There is item $isChecked", Toast.LENGTH_SHORT).show()
            buttonView.text = "Hello world"
            //buttonView will do more than i expect
        }

        radioButtonGroup.setOnCheckedChangeListener { group, checkedId ->
            when(checkedId){
                R.id.radioButton->{
                    Toast.makeText(this, "There is item button1", Toast.LENGTH_SHORT).show()

                }
                R.id.radioButton2->{
                    Toast.makeText(this, "There is item button2", Toast.LENGTH_SHORT).show()

                }

            }
        }
    }
}