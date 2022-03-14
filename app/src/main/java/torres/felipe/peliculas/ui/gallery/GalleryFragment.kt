package torres.felipe.peliculas.ui.gallery

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ListView
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import torres.felipe.peliculas.*
import torres.felipe.peliculas.databinding.FragmentGalleryBinding

class GalleryFragment : Fragment() {

    var series: ArrayList<Series> = ArrayList()

    private var _binding: FragmentGalleryBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val galleryViewModel =
            ViewModelProvider(this).get(GalleryViewModel::class.java)

        _binding = FragmentGalleryBinding.inflate(inflater, container, false)
        val root: View = binding.root

        //val textView: TextView = binding.textGallery
        //galleryViewModel.text.observe(viewLifecycleOwner) {
        //    textView.text = it
        //}

        llenar_series()

        val adaptadorSeries = AdaptadorSeries(root.context, series)

        val listview: ListView = binding.listviewSeries

        listview.adapter = adaptadorSeries

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    fun llenar_series(){
        val serie1 = Series(1,getString(R.string.serie1),getString(R.string.serie1_sinop),4, R.drawable.trollhunter)
        series.add(serie1)
        val serie2 = Series(1,getString(R.string.serie2),getString(R.string.serie2_sinop),3, R.drawable.midnight_mass)
        series.add(serie2)
        val serie3 = Series(1,getString(R.string.serie3),getString(R.string.serie3_sinop),3, R.drawable.titans)
        series.add(serie3)
        val serie4 = Series(1,getString(R.string.serie4),getString(R.string.serie4_sinop),2, R.drawable.dogs_in_space)
        series.add(serie4)
        val serie5 = Series(1,getString(R.string.serie5),getString(R.string.serie5_sinop),7, R.drawable.breaking_bad)
        series.add(serie5)
    }
}