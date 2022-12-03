package com.confidenceb.beesmartwordassistant

import android.os.Bundle
import android.view.MenuItem
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import com.confidenceb.beesmartwordassistant.databinding.ActivityHomeBinding
import com.google.android.material.navigation.NavigationView

class HomeActivity : AppCompatActivity() {
    lateinit var binding:ActivityHomeBinding
    lateinit var toggle: ActionBarDrawerToggle
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val toolbar = findViewById<View>(R.id.toolbar) as Toolbar
        setSupportActionBar(toolbar)
        toolbar.setNavigationIcon(R.drawable.ic_hamburg)

            toggle= ActionBarDrawerToggle(this,binding.drawerLayout,toolbar,R.string.open,R.string.close)
            binding.drawerLayout.addDrawerListener(toggle)
            toggle.syncState()

            supportActionBar?.setDisplayHomeAsUpEnabled(true)


            binding.NavDrawer.setNavigationItemSelectedListener {
                when(it.itemId){
                    R.id.dmenu_participate->{Toast.makeText(this,"participate",Toast.LENGTH_SHORT).show()}
                    R.id.dmenu_statistics->{Toast.makeText(this,"statistics",Toast.LENGTH_SHORT).show()}
                    R.id.dmenu_leaderboard->{Toast.makeText(this,"dmenu_leaderboard",Toast.LENGTH_SHORT).show()}


                    }
                true
                }

        }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        if(toggle.onOptionsItemSelected(item)){
            true
        }

        return super.onOptionsItemSelected(item)
    }
    }


