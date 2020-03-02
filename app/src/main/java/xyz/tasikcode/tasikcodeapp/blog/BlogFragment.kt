package xyz.tasikcode.tasikcodeapp.blog

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.layout_blog_content.view.*
import xyz.tasikcode.tasikcodeapp.R
import xyz.tasikcode.tasikcodeapp.databinding.FragmentBlogBinding


class BlogFragment : Fragment() {

    private lateinit var binding: FragmentBlogBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(
            inflater,
            R.layout.fragment_blog, container, false
        )

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setupToolbar()
    }

    private fun setupToolbar() {
        binding.icBlogContent.tbBlog.setNavigationIcon(R.drawable.ic_menu_white_24dp)
        val toggle =
            ActionBarDrawerToggle(
                requireActivity(),
                binding.dlBlog,
                binding.icBlogContent.tbBlog,
                R.string.open,
                R.string.close
            )
        toggle.syncState()
        binding.dlBlog.addDrawerListener(toggle)
    }
}
