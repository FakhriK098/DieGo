package com.example.diego

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide

class DetailActivity : AppCompatActivity() {

    companion object{
        const val EXTRA_NAME = "extra_name"
        const val EXTRA_PROTEIN = "protein"
        const val EXTRA_FAT = "fat"
        const val EXTRA_KARB = "karb"
        const val EXTRA_GIZI = "gizi"
        const val EXTRA_BAHAN = "bahan"
        const val EXTRA_img = "gambar"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val name = intent.getStringExtra(EXTRA_NAME)
        val protein = intent.getStringExtra(EXTRA_PROTEIN)
        val fat = intent.getStringExtra(EXTRA_FAT)
        val karbs = intent.getStringExtra(EXTRA_KARB)
        val gizi = intent.getStringExtra(EXTRA_GIZI)
        val bahan = intent.getStringExtra(EXTRA_BAHAN)
        val img = intent.getIntExtra(EXTRA_img, 0)

        val imgFoods: ImageView =findViewById(R.id.img_food_photos)
        val nameFoods: TextView = findViewById(R.id.tv_food_name)
        val proteinFoods: TextView = findViewById(R.id.tv_food_protein)
        val fatFoods: TextView = findViewById(R.id.tv_food_fat)
        val karbFoods: TextView = findViewById(R.id.tv_food_karbo)
        val giziFoods: TextView = findViewById(R.id.tv_food_gizi)
        val bahanFoods: TextView = findViewById(R.id.tv_food_bumbu)

        nameFoods.text = name
        proteinFoods.text = protein
        fatFoods.text =  fat
        karbFoods.text = karbs
        giziFoods.text = gizi
        bahanFoods.text = bahan
        imgFoods.setImageResource(img)


    }
}