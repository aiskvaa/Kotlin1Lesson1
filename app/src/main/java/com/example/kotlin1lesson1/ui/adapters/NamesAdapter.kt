package com.example.kotlin1lesson1.ui.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.kotlin1lesson1.databinding.ItemNameBinding
import com.example.kotlin1lesson1.models.NameModel

class NamesAdapter(
    val onClick: (NameModel) -> Unit
) :
    RecyclerView.Adapter<NamesAdapter.NamesViewHolder>() {
    private var list = ArrayList<NameModel>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NamesViewHolder =
        NamesViewHolder(
            ItemNameBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )


    override fun onBindViewHolder(holder: NamesViewHolder, position: Int) {
        holder.onBind(list[position])
    }

    fun setList(list: ArrayList<NameModel>) {
        this.list = list
    }

    override fun getItemCount(): Int = list.size


    inner class NamesViewHolder(private val viewBinding: ItemNameBinding) :
        RecyclerView.ViewHolder(viewBinding.root) {
        fun onBind(nameModel: NameModel) {
            viewBinding.nameTxt.text = nameModel.title
            viewBinding.image.setImageResource(nameModel.image)
            viewBinding.root.setOnClickListener {
                onClick(nameModel)
            }
        }


    }
}
