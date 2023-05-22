package klim8.fragment.challenge.shopping

import android.app.Fragment
import android.app.FragmentTransaction
import android.content.Intent
import android.os.Build
import android.os.Bundle

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.RequiresApi

import com.inmortal.klim8.R
import com.inmortal.klim8.databinding.FragmentShoppingQuestion6Binding
import com.inmortal.klim8.databinding.FragmentShoppingQuestion7Binding
import klim8.activities.QuesAnsActivity

class ShoppingFragmentQuestion7 : androidx.fragment.app.Fragment()  {
    lateinit var binding: FragmentShoppingQuestion7Binding
    lateinit var fragReplace: FragmentTransaction

    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentShoppingQuestion7Binding.inflate(layoutInflater, container, false)
        onClick()
        manageVisiblity()
        return binding.root
    }

    private fun onClick() {
        binding.btnContinueShopQ7.setOnClickListener {
            startActivity(Intent(activity, QuesAnsActivity::class.java))

        }
    }

    private fun manageVisiblity() {
        binding.shoppingQ7Option1.setOnClickListener {
            binding.imgShoppingQ7SelectedOption1.visibility = View.VISIBLE
            binding.imgShoppingQ7SelectedOption2.visibility = View.INVISIBLE
            binding.imgShoppingQ7SelectedOption3.visibility = View.INVISIBLE

        }
        binding.shoppingQ7Option2.setOnClickListener {
            binding.imgShoppingQ7SelectedOption2.visibility = View.VISIBLE
            binding.imgShoppingQ7SelectedOption1.visibility = View.INVISIBLE
            binding.imgShoppingQ7SelectedOption3.visibility = View.INVISIBLE

        }
        binding.shoppingQ7Option3.setOnClickListener {
            binding.imgShoppingQ7SelectedOption3.visibility = View.VISIBLE
            binding.imgShoppingQ7SelectedOption2.visibility = View.INVISIBLE
            binding.imgShoppingQ7SelectedOption1.visibility = View.INVISIBLE

        }


    }
}

