package com.confidenceb.beesmartwordassistant

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import com.confidenceb.beesmartwordassistant.databinding.ActivityHomeBinding

class HomeActivity : AppCompatActivity() {
    lateinit var binding:ActivityHomeBinding
    lateinit var toggle: ActionBarDrawerToggle
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)


            toggle= ActionBarDrawerToggle(this@HomeActivity,binding.drawerLayout,R.string.open,R.string.close)
            binding.drawerLayout.addDrawerListener(toggle)
            toggle.syncState()

            supportActionBar?.setDisplayHomeAsUpEnabled(true)
            binding.NavDrawer.setNavigationItemSelectedListener {
                when(it.itemId){
                    R.id.dmenu_participate->{Toast.makeText(this@HomeActivity,"participate",Toast.LENGTH_SHORT).show()}
                    R.id.dmenu_statistics->{Toast.makeText(this@HomeActivity,"statistics",Toast.LENGTH_SHORT).show()}
                    R.id.dmenu_leaderboard->{Toast.makeText(this@HomeActivity,"dmenu_leaderboard",Toast.LENGTH_SHORT).show()}


                    }
                true
                }

        }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        if(toggle.onOptionsItemSelected(item)){
//            when(item.itemId) {
//                R.id.dmenu_participate -> {
//                    Toast.makeText(this@HomeActivity, "participate", Toast.LENGTH_SHORT).show()
//                }
//                R.id.dmenu_statistics -> {
//                    Toast.makeText(this@HomeActivity, "statistics", Toast.LENGTH_SHORT)
//                }
//                R.id.dmenu_leaderboard -> {
//                    Toast.makeText(this@HomeActivity, "dmenu_leaderboard", Toast.LENGTH_SHORT)
//                }
//
//            }

            true
        }


        return super.onOptionsItemSelected(item)
    }
    }


