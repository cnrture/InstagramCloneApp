package com.canerture.instagramcloneapp.Fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.canerture.instagramcloneapp.Adapters.AkisAdapter
import com.canerture.instagramcloneapp.Adapters.HikayeAdapter
import com.canerture.instagramcloneapp.R

class AnaSayfaFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.fragment_ana_sayfa, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val recycler_hikaye : RecyclerView = view.findViewById(R.id.recycler_hikaye)
        val recycler_akis : RecyclerView = view.findViewById(R.id.recycler_akis)

        val hikayeListe : List<String> = listOf("https://i.hizliresim.com/akDsfS.jpg","https://i.picsum.photos/id/1/5616/3744.jpg?hmac=kKHwwU8s46oNettHKwJ24qOlIAsWN9d2TtsXDoCWWsQ", "https://i.picsum.photos/id/413/2666/1500.jpg?hmac=8RzTnqTaeObfKSBbRGVgeEFv2LwFRO0RwiEyOwXeTj0", "https://i.picsum.photos/id/1011/5472/3648.jpg?hmac=Koo9845x2akkVzVFX3xxAc9BCkeGYA9VRVfLE4f0Zzk", "https://i.picsum.photos/id/1012/3973/2639.jpg?hmac=s2eybz51lnKy2ZHkE2wsgc6S81fVD1W2NKYOSh8bzDc", "https://i.picsum.photos/id/102/4320/3240.jpg?hmac=ico2KysoswVG8E8r550V_afIWN963F6ygTVrqHeHeRc")
        val akisListe : List<String> = listOf("https://i.picsum.photos/id/1/5616/3744.jpg?hmac=kKHwwU8s46oNettHKwJ24qOlIAsWN9d2TtsXDoCWWsQ", "https://i.picsum.photos/id/413/2666/1500.jpg?hmac=8RzTnqTaeObfKSBbRGVgeEFv2LwFRO0RwiEyOwXeTj0", "https://i.picsum.photos/id/1011/5472/3648.jpg?hmac=Koo9845x2akkVzVFX3xxAc9BCkeGYA9VRVfLE4f0Zzk", "https://i.picsum.photos/id/1012/3973/2639.jpg?hmac=s2eybz51lnKy2ZHkE2wsgc6S81fVD1W2NKYOSh8bzDc", "https://i.picsum.photos/id/102/4320/3240.jpg?hmac=ico2KysoswVG8E8r550V_afIWN963F6ygTVrqHeHeRc")
        val kullaniciIdListe : List<String> = listOf("Hikayen", "ahmetcaner", "beyza", "buse", "yunus", "didem")

        val hikayeAdapter = HikayeAdapter(hikayeListe, kullaniciIdListe)
        val akisAdapter = AkisAdapter(akisListe, kullaniciIdListe)

        recycler_hikaye.layoutManager = LinearLayoutManager(
            activity,
            LinearLayoutManager.HORIZONTAL,
            false
        )

        recycler_hikaye.adapter = hikayeAdapter

        recycler_akis.layoutManager = LinearLayoutManager(
            activity,
            LinearLayoutManager.VERTICAL,
            false
        )

        recycler_akis.adapter = akisAdapter
    }
}