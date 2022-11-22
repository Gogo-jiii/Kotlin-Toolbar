package com.example.toolbar

import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        toolbar.setNavigationOnClickListener {
            Toast.makeText(
                this,
                "back icon clicked.",
                Toast.LENGTH_SHORT
            ).show()
        }

        toolbar.setOnMenuItemClickListener(object : MenuItem.OnMenuItemClickListener,
            Toolbar.OnMenuItemClickListener {
            override fun onMenuItemClick(item: MenuItem): Boolean {
                when (item.itemId) {
                    R.id.one -> {
                        Toast.makeText(this@MainActivity, "one clicked.",
                            Toast.LENGTH_SHORT).show()
                        return true
                    }
                    R.id.bluetooth -> {
                        Toast.makeText(
                            this@MainActivity, "bluetooth clicked.",
                            Toast.LENGTH_SHORT
                        ).show()
                        return true
                    }
                }
                return false
            }
        })
    }
}