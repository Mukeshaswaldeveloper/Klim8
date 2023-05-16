package klim8.fragment.challenge.waste

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentTransaction
import com.inmortal.klim8.R
import com.inmortal.klim8.databinding.FragmentWasteQuestion9KotlinBinding
import klim8.activities.QuesAnsActivity


class WasteFragmentQuestion9Kotlin : Fragment() {
    lateinit var binding: FragmentWasteQuestion9KotlinBinding
    lateinit var ft: FragmentTransaction


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        binding = FragmentWasteQuestion9KotlinBinding.inflate(inflater, container, false)
        onclick()
        manageVisiblity()
        return binding.root

    }

    private fun manageVisiblity() {
        binding.wasteQ9Option1.setOnClickListener {
            binding.imgWasteQ9SelectedOption1.visibility = View.VISIBLE
            binding.imgWasteQ9SelectedOption2.visibility = View.INVISIBLE
            binding.imgWasteQ9SelectedOption3.visibility = View.INVISIBLE

        }
        binding.wasteQ9Option2.setOnClickListener {
            binding.imgWasteQ9SelectedOption2.visibility = View.VISIBLE
            binding.imgWasteQ9SelectedOption1.visibility = View.INVISIBLE
            binding.imgWasteQ9SelectedOption3.visibility = View.INVISIBLE

        }
        binding.wasteQ9Option3.setOnClickListener {
            binding.imgWasteQ9SelectedOption3.visibility = View.VISIBLE
            binding.imgWasteQ9SelectedOption2.visibility = View.INVISIBLE
            binding.imgWasteQ9SelectedOption1.visibility = View.INVISIBLE

        }


    }


    private fun onclick() {
        binding.btnWasteQuestion9.setOnClickListener {
            startActivity(Intent(context, QuesAnsActivity::class.java))
        }


    }
}