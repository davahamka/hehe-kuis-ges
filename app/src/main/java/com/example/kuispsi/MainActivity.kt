package com.example.kuispsi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager.beginTransaction()
            .add(R.id.fragment_cont,ListFragment())
            .addToBackStack("")
            .commit()
    }

    fun navigateWithData(hero: Hero){
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_cont,DetailFragment(hero))
            .addToBackStack("")
            .commit()

//        Navigation.findNavController(view).navigate(R.id.action_fragment1_to_fragment2);
    }
}