package klim8.fragment.deeds

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.inmortal.klim8.R
import com.inmortal.klim8.databinding.FragmentCompletedDeedsBinding
import klim8.adapter.DeedsCompletedAdapter


class CompletedDeeds : Fragment() {
    lateinit var binding: FragmentCompletedDeedsBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentCompletedDeedsBinding.inflate(layoutInflater, container, false)
        binding.rvDeedsCompleted.adapter = DeedsCompletedAdapter(requireContext())
        return binding.root
    }

}