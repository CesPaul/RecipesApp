package com.cespaul.recipes.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.cespaul.recipes.R
import com.cespaul.recipes.ui.RecipesAdapter
import com.cespaul.recipes.ui.RecipesListViewModel
import io.reactivex.disposables.Disposable

class RecipesListFragment : Fragment() {

    companion object {
        fun newInstance() = RecipesListFragment()
    }

    private lateinit var subscription: Disposable

    private val viewModel: RecipesListViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.recipes_list_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        val recipesAdapter = RecipesAdapter(requireContext(), viewModel.recipesList.value)
        val layoutManager = LinearLayoutManager(requireContext())
        val dividerItemDecoration = DividerItemDecoration(
            requireContext(),
            layoutManager.orientation
        )
        val rv = view?.findViewById<RecyclerView>(R.id.recipesRecycler)
        rv?.adapter = recipesAdapter
        rv?.layoutManager = layoutManager
        rv?.addItemDecoration(dividerItemDecoration)

        viewModel.recipesList.observe(viewLifecycleOwner, Observer {
            recipesAdapter.notifyDataSetChanged()
        })

        subscription = viewModel.getRecipesList()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        subscription.dispose()
    }
}