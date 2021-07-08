package com.example.diego

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var rvFoods: RecyclerView
    private var list: ArrayList<Foods> = arrayListOf()
    private var title: String = "Food List"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvFoods = findViewById(R.id.rv_food)
        rvFoods.setHasFixedSize(true)
        rvFoods.apply {
            addItemDecoration(DividerItemDecoration(this.context, DividerItemDecoration.VERTICAL))
        }

        list.addAll(FoodData.listData)
        showRecyclerlist()
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }

    private fun setMode(itemId: Int) {
        when (itemId){
            R.id.action_about -> {
                val aboutme = Intent(this, AboutMeActivity::class.java)
                startActivity(aboutme)
            }
        }
    }

    private fun showRecyclerlist() {
        rvFoods.layoutManager = LinearLayoutManager(this)
        val listFoodAdapter = FoodAdapter(list)
        rvFoods.adapter = listFoodAdapter

        listFoodAdapter.setOnItemClickCallBack(object : FoodAdapter.OnItemClickCallBack{
            override fun onItemClicked(data: Foods) {
                SelectedFoods(data)
            }
        })
    }

    private fun SelectedFoods(data: Foods) {
        val FoodDetail = Intent(this, DetailActivity::class.java)
        FoodDetail.putExtra(DetailActivity.EXTRA_NAME, data.nama)
        FoodDetail.putExtra(DetailActivity.EXTRA_PROTEIN, data.protein)
        FoodDetail.putExtra(DetailActivity.EXTRA_KARB, data.karbo)
        FoodDetail.putExtra(DetailActivity.EXTRA_FAT, data.fat)
        FoodDetail.putExtra(DetailActivity.EXTRA_GIZI, data.gizi)
        FoodDetail.putExtra(DetailActivity.EXTRA_BAHAN, data.bahan)
        FoodDetail.putExtra(DetailActivity.EXTRA_img, data.image)
        startActivity(FoodDetail)
    }

}