package net.larntech.recyclerviews

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviews.R
import kotlinx.android.synthetic.main.item_row.view.*
import net.larntech.recyclerviews.ltemsAdpter1.ltemAdapterVH
class ltemsAdpter1: RecyclerView.Adapter<ltemAdapterVH>(){

    var itemModalist = ArrayList<ltemsModal>();

    fun setData(ltemModalist: ArrayList<ltemsModal>) {
        this.itemModalist = itemModalist;

    }



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ltemAdapterVH {
        return ltemAdapterVH(LayoutInflater.from(parent.context).inflate(R.layout.item_row,parent,false))
    }
    override fun getItemCount(): Int {
        return itemModalist.size
    }

    override fun onBindViewHolder(holder: ltemAdapterVH, position: Int) {
        val ltemsModal = itemModalist[position];
        holder.name.text = ltemsModal.name
        holder.desc.text = ltemsModal.desc
        holder.image.setImageResource(ltemsModal.image)


    }
    class ltemAdapterVH(itemView: View) : RecyclerView.ViewHolder(itemView) {
val name = itemView.tvName
   val desc = itemView.tvDexc
   val image = itemView.imageView
    }
}


