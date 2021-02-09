package com.canerture.instagramcloneapp.Activities

import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.canerture.instagramcloneapp.Fragments.*
import com.canerture.instagramcloneapp.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonArray : ArrayList<ImageView> = arrayListOf()

        val anaSayfaButton : ImageView = findViewById(R.id.anaSayfaButton)
        val aramaButton : ImageView = findViewById(R.id.aramaButton)
        val reelsButton : ImageView = findViewById(R.id.reelsButton)
        val magazaButton : ImageView = findViewById(R.id.magazaButton)
        val profilButton : ImageView = findViewById(R.id.profilButton)

        buttonArray.add(anaSayfaButton)
        buttonArray.add(aramaButton)
        buttonArray.add(reelsButton)
        buttonArray.add(magazaButton)
        buttonArray.add(profilButton)

        openFragment(AnaSayfaFragment())

        for (i in 0 until buttonArray.size) {
            buttonArray.get(i).setOnClickListener {
                when(i) {
                    0 -> openFragment(AnaSayfaFragment())
                    1 -> openFragment(AramaFragment())
                    2 -> openFragment(ReelsFragment())
                    3 -> openFragment(MagazaFragment())
                    4 -> openFragment(ProfilFragment())
                }
            }
        }

    }

    private fun openFragment(fragment: Fragment) {
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.fragment, fragment)
        transaction.addToBackStack(null)
        transaction.commit()
    }

}