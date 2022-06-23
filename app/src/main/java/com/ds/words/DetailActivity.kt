package com.ds.words

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.ds.words.databinding.ActivityDetailBinding


class DetailActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        val binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val letterId = intent?.extras?.getString("letter").toString()


        val recyclerView = binding.recyclerView
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = WordAdapter(letterId, this)


        recyclerView.addItemDecoration(
            DividerItemDecoration(this, DividerItemDecoration.VERTICAL)
        )

        title =  letterId

    }
    companion object {
        const val LETTER = "letter"
        const val SEARCH_PREFIX = "https://ead.univali.br/blog/as-6-linguagens-de-programacao-mais-usadas-no-mundo"
    }

}
