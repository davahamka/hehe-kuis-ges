package com.example.kuispsi

import android.media.Image
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import org.w3c.dom.Text

class DetailFragment(
    private val hero: Hero
) : Fragment() {
    // TODO: Rename and change types of parameters
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_detail, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val title = view.findViewById<TextView>(R.id.title_detail)
        val detail = view.findViewById<TextView>(R.id.desc_detail)
        val image = view.findViewById<ImageView>(R.id.image)
        image.setImageResource(hero.photo)
        detail.text = hero.description
        title.text = hero.name
    }
}