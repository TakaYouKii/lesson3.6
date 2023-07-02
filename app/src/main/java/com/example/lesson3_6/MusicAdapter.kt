import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.constraintlayout.helper.widget.Carousel.Adapter
import androidx.recyclerview.widget.RecyclerView
import com.example.lesson3_6.Music
import com.example.lesson3_6.databinding.MusicItemBinding

class MusicAdapter(val list: ArrayList<Music>,val onClick:(position:Int)->Unit): RecyclerView.Adapter<MusicAdapter.ViewHolder>() {
    inner class ViewHolder(private val binding: MusicItemBinding): RecyclerView.ViewHolder(binding.root) {
        fun bind(){
            val item = list[adapterPosition]
            binding.tvMusicName.text = item.name
            binding.tvAuthorName.text = item.author
            binding.tvMusicDuration.text = item.duration
            binding.tvPlays.text = item.plays
            itemView.setOnClickListener{
                onClick(adapterPosition)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(MusicItemBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind()
    }
}





