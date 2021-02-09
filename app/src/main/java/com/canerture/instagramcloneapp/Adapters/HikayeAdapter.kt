package com.canerture.instagramcloneapp.Adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.canerture.instagramcloneapp.R
import de.hdodenhof.circleimageview.CircleImageView

class HikayeAdapter(private val hikayeGorselIdList: List<String>, private val hikayeKullaniciId: List<String>) : RecyclerView.Adapter<HikayeAdapter.ViewHolder>() {

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        var hikayeView : CircleImageView? = null
        var kullaniciText : TextView? = null

        init {
            hikayeView = itemView.findViewById(R.id.profilButton)
            kullaniciText = itemView.findViewById(R.id.akisKullaniciText)
        }

    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ViewHolder {

        val view = LayoutInflater.from(viewGroup.context)
            .inflate(R.layout.hikaye_item_list, viewGroup, false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {

        viewHolder.hikayeView?.load(hikayeGorselIdList[position])
        viewHolder.kullaniciText?.setText(hikayeKullaniciId[position])

    }

    override fun getItemCount() = hikayeGorselIdList.size

}