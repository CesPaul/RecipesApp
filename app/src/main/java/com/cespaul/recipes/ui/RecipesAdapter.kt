package com.cespaul.recipes.ui

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.cespaul.recipes.R
import com.cespaul.recipes.data.model.api.RecipeList
import com.facebook.drawee.view.SimpleDraweeView

class RecipesAdapter(val context: Context, val recipesList: ArrayList<RecipeList>?) :
    RecyclerView.Adapter<RecipesAdapter.RecipesVH>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecipesVH {
        return RecipesVH(
            LayoutInflater.from(context).inflate(
                R.layout.recipe_list_item,
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(vh: RecipesVH, position: Int) {
        val recipeItem = recipesList?.get(position)
        vh.title.text = recipeItem?.name ?: ""
        vh.image.setImageURI(recipeItem?.images?.get(0))
        vh.description.text = recipeItem?.description ?: ""
        vh.instructions.text = recipeItem?.instructions ?: ""
        if (recipeItem != null) {
            vh.lastUpdated.text = recipeItem.lastUpdated.toString()
        }
        if (recipeItem != null) {
            vh.difficulty.text = recipeItem.difficulty.toString()
        }
    }

    override fun getItemCount(): Int = recipesList?.size ?: 0

    class RecipesVH(itemView: View) : RecyclerView.ViewHolder(itemView) {

        var title: TextView = itemView.findViewById(R.id.recipeItemListTitle)
        var image: SimpleDraweeView = itemView.findViewById(R.id.recipeListImage)
        var description: TextView = itemView.findViewById(R.id.recipeItemListDescription)
        var instructions: TextView = itemView.findViewById(R.id.recipeItemListInstruction)
        var lastUpdated: TextView = itemView.findViewById(R.id.recipeListLastUpdated)
        var difficulty: TextView = itemView.findViewById(R.id.recipeListLastUpdated)

        init {

        }

    }
}