package com.example.recyclerviewkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Parcel
import android.os.Parcelable
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity() : AppCompatActivity() {

    companion object {
        val INTENT_PARCELABLE = "OBJECT_INTENT"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val superheroList = listOf<Superhero>(
            Superhero(
                R.drawable.blackwidow,
                "Black Widow",
                "loren lipsum loren lipsum loren lipsum loren lipsum"
            ),
            Superhero(
                R.drawable.gamora,
                "Gamora",
                "loren lipsum loren lipsum loren lipsum loren lipsum"
            ),
            Superhero(
                R.drawable.blackwidow,
                "Black Widow",
                "loren lipsum loren lipsum loren lipsum loren lipsum"
            ),
            Superhero(
                R.drawable.antman,
                "Ant Mant",
                "loren lipsum loren lipsum loren lipsum loren lipsum"
            ),
            Superhero(
                R.drawable.antman,
                "Ant Mant",
                "loren lipsum loren lipsum loren lipsum loren lipsum"
            ),
            Superhero(
                R.drawable.antman,
                "Ant Mant",
                "loren lipsum loren lipsum loren lipsum loren lipsum"
            ),
            Superhero(
                R.drawable.antman,
                "Ant Mant",
                "loren lipsum loren lipsum loren lipsum loren lipsum"
            ),
            Superhero(
                R.drawable.antman,
                "Ant Mant",
                "loren lipsum loren lipsum loren lipsum loren lipsum"
            ),
            Superhero(
                R.drawable.antman,
                "Ant Mant",
                "loren lipsum loren lipsum loren lipsum loren lipsum"
            ),
            Superhero(
                R.drawable.antman,
                "Ant Mant",
                "loren lipsum loren lipsum loren lipsum loren lipsum"
            ),
            Superhero(
                R.drawable.antman,
                "Ant Mant",
                "loren lipsum loren lipsum loren lipsum loren lipsum"
            )
        )
        val recyclerView = findViewById<RecyclerView>(R.id.rv_hero)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = SuperheroAdapter(this, superheroList){
            val intent = Intent (this, DetailSuperheroActivity::class.java)
            intent.putExtra(INTENT_PARCELABLE, it)
            startActivity(intent)

        }
    }

    private fun String.Superhero(
        antman: Int,
        namesuperhero: Any,
    ) {
        fun String.Superhero(
            antman: Int,
            descsuperhero: Any,
        ) {

    }


}

    fun writeToParcel(parcel: Parcel, flags: Int) {

    }

    fun describeContents(): Int {
        return 0
    }

    }