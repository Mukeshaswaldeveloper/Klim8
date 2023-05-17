package klim8.activities.challenges

import android.app.FragmentTransaction
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.inmortal.klim8.R
import com.inmortal.klim8.databinding.ActivityOfyChallengeBinding
import com.inmortal.klim8.databinding.FragmentOfyChallengeQ1Binding
import klim8.fragment.challenge.onlyforyou.OfyChallengeQ1
import klim8.fragment.challenge.waste.WasteFragmentQuestion1Kotlin

class OfyChallengeActivity : AppCompatActivity() {

    lateinit var binding:ActivityOfyChallengeBinding
    lateinit var fragReplace: androidx.fragment.app.FragmentTransaction


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityOfyChallengeBinding.inflate(layoutInflater)
        setContentView(binding.root)


        fragReplace=supportFragmentManager.beginTransaction()
        fragReplace.replace(R.id.frame_challenge_Ofy,OfyChallengeQ1())
        fragReplace.commit()

    }
}