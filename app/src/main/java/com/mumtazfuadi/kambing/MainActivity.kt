package com.mumtazfuadi.kambing

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.ActionBar
import androidx.core.view.setPadding
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {

    private lateinit var fab: FloatingActionButton
    private lateinit var rvGoats: RecyclerView
    private var selectMode: Boolean = true
    private var list: ArrayList<Goat> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setActionBarTitle("Kambing Apps")

        rvGoats = findViewById(R.id.rv_goats)
        rvGoats.setHasFixedSize(true)
        rvGoats.setPadding(20, 20, 20, 20)

        list.addAll(GoatsData.listData)

        fab = findViewById(R.id.fab)
        fab.setOnClickListener {
            changeLayout()
        }

        showRecyclerGrid()
        fab.setImageResource(R.drawable.ic_list)

    }

    private fun showRecyclerList() {
        rvGoats.layoutManager = LinearLayoutManager(this)
        val listGoatAdapter = ListGoatAdapter(list)
        rvGoats.adapter = listGoatAdapter

        listGoatAdapter.setOnItemClickCallback(object : ListGoatAdapter.OnItemClickCallback {
            override fun onItemClicked(data: Goat) {
                showSelectedGoat(data)
            }
        })
    }

    private fun showRecyclerGrid() {
        rvGoats.layoutManager = GridLayoutManager(this, 2)
        val gridGoatAdapter = GridGoatAdapter(list)
        rvGoats.adapter = gridGoatAdapter

        gridGoatAdapter.setOnItemClickCallback(object : GridGoatAdapter.OnItemClickCallback {
            override fun onItemClicked(data: Goat) {
                showSelectedGoat(data)
            }
        })
    }

    private fun changeLayout() {
        when (selectMode) {
            true -> {
                showRecyclerList()
                fab.setImageResource(R.drawable.ic_grid)
                rvGoats.setPadding(0, 0, 0, 0)
                selectMode = false
            }
            false -> {
                showRecyclerGrid()
                fab.setImageResource(R.drawable.ic_list)
                rvGoats.setPadding(20, 20, 20, 20)
                selectMode = true
            }
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }

    private fun setMode(selectedMode: Int) {
        when (selectedMode) {
            R.id.btn_about -> {
                startActivity(Intent(this@MainActivity, AboutActivity::class.java))
            }
        }
    }

    private fun showSelectedGoat(goat: Goat) {
        val detailIntent = Intent(this@MainActivity, DetailActivity::class.java).apply {
            putExtra(DetailActivity.EXTRA_IMG, goat.photo)
            putExtra(DetailActivity.EXTRA_NAME, goat.name)
            putExtra(DetailActivity.EXTRA_DETAIL, goat.detail)
        }

        startActivity(detailIntent)
    }

    private fun setActionBarTitle(title: String) {
        if (supportActionBar != null) {
            (supportActionBar as ActionBar).title = title
        }
    }
}