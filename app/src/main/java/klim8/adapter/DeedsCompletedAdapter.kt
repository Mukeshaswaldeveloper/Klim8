package klim8.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.inmortal.klim8.R

class DeedsCompletedAdapter(var context:Context): RecyclerView.Adapter<DeedsCompletedAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(context).inflate(R.layout.recycler_item_deeds_completed,parent,false))
    }

    override fun getItemCount(): Int {
       return 2
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

    }

    class ViewHolder(itemView: View):RecyclerView.ViewHolder(itemView) {

    }

}