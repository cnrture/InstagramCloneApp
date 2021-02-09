package com.canerture.instagramcloneapp.Adapters

import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.canerture.instagramcloneapp.R
import de.hdodenhof.circleimageview.CircleImageView

class AkisAdapter(private val akisGorselIdList: List<String>, private val akisKullaniciId: List<String>) : RecyclerView.Adapter<AkisAdapter.ViewHolder>() {

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        var akisKullaniciGorselId : CircleImageView? = null
        var akisKullaniciText : TextView? = null
        var akisGorselId : ImageView? = null
        var akisGorselAltiKullanici : TextView? = null
        var akisGorselAltiText : TextView? = null
        var begenButton : ImageView? = null
        var kaydetButton : ImageView? = null
        var begenmeSayisiText : TextView? = null

        init {
            akisKullaniciGorselId = itemView.findViewById(R.id.profilButton)
            akisKullaniciText = itemView.findViewById(R.id.akisKullaniciText)
            akisGorselId = itemView.findViewById(R.id.akisGorselId)
            akisGorselAltiKullanici = itemView.findViewById(R.id.akisGorselAltiKullanici)
            akisGorselAltiText = itemView.findViewById(R.id.akisGorselAltiText)
            begenButton = itemView.findViewById(R.id.begenButton)
            kaydetButton = itemView.findViewById(R.id.kaydetButton)
            begenmeSayisiText = itemView.findViewById(R.id.begenmeSayisiText)
        }
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ViewHolder {

        val view = LayoutInflater.from(viewGroup.context)
            .inflate(R.layout.akis_item_list, viewGroup, false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {

        viewHolder.akisKullaniciGorselId?.load(akisGorselIdList[position])
        viewHolder.akisGorselId?.load(akisGorselIdList[position])
        viewHolder.akisKullaniciText?.setText(akisKullaniciId[position+1])
        viewHolder.akisGorselAltiKullanici?.setText(akisKullaniciId[position+1])
        viewHolder.akisGorselAltiText?.setText("Merhaba")
        viewHolder.begenmeSayisiText?.setText("cnrture ve 65 diğer kişi beğendi")

        viewHolder.begenButton?.setOnClickListener {

            if (viewHolder.begenButton!!.colorFilter == null) {
                viewHolder.begenButton!!.setColorFilter(Color.RED)
            } else {
                viewHolder.begenButton!!.clearColorFilter()
            }
        }

        viewHolder.kaydetButton?.setOnClickListener {
            if (viewHolder.kaydetButton!!.colorFilter == null) {
                viewHolder.kaydetButton!!.setColorFilter(Color.BLACK)
            } else {
                viewHolder.kaydetButton!!.clearColorFilter()
            }
        }

    }

    override fun getItemCount() = akisGorselIdList.size

}