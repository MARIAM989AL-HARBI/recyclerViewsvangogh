package net.larntech.recyclerviews

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviews.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
        val imagesName = arrayOf(
            ltemsModal("Vase With Fifteen Sunflowers","image1",R.drawable.image1),
            ltemsModal("The Starry Night","image2",R.drawable.image2),
            ltemsModal("The Night Café","image3",R.drawable.image3),
            ltemsModal("TCafé Terrace at Night","image3",R.drawable.image3),
            ltemsModal("The Eatato Eaters","image5",R.drawable.image5),

            )

        val itemModallist = ArrayList<ltemsModal>()
    var ltemsAdpter : ltemsAdpter1? = null;

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main)

            for (items in imagesName){
                itemModallist.add(items)
            }
            ltemsAdpter = ltemsAdpter1();
            ltemsAdpter!!.setData(itemModallist);
            recylarview.layoutManager = LinearLayoutManager(this)
            recylarview.setHasFixedSize(true)
            recylarview.adapter = ltemsAdpter
        }

    }
