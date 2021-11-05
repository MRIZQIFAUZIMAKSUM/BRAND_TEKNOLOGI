package com.example.sebelumuts
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.example.sebelumuts.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var data: ArrayList<DataModel>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Inisialisasi Array
        data = ArrayList()

        //Simpan data

        data?.add(DataModel(R.drawable.xiaomi,"XIAOMI","Lei Jun", "Xiaomi adalah Teknologi merek global yang dibuat untuk kemudahan akses bagi semua orang. Dapatkan Ponsel Xiaomi yang Luar Biasa, Ponsel Redmi, dan Perangkat Cerdas di " +
                "situs resmi sekarang!"))

        data?.add(DataModel(R.drawable.asus,"ASUS"," Jonney Shih","Salah satu prestasi dari pendiri asus ini yaitu membuat kemitraan dengan pendiri Asus lainnya yaitu Jonney Shih pada tahun 2006, pada proyek Eee PC. Proyek EeePC yaitu usaha menghadirkan perangkat notebook game-changing yang ringan, hemat biaya, dan serta efisien ke tangan konsumen, dan mahasiswa, " +
                "untuk pertama kalinya."))
        data?.add(DataModel(R.drawable.huawei,"HUAWEI","Ren Zhengfei", "Perusahaan ini didirikan pada tahun 1987 oleh Ren Zhengfei, mantan Deputi Komandan Resimen di Tentara Pembebasan Rakyat.[5] Awalnya fokus memproduksi switch telepon, Huawei kemudian berekpansi dengan memproduksi jaringan telekomunikasi, menyediakan jasa konsultansi dan operasional dan peralatan untuk perusahaan di Tiongkok maupun di luar Tiongkok, serta memproduksi perangkat komunikasi untuk pasar ritel.[6][7] Huawei mempekerjakan lebih dari 194.000 orang hingga Desember 2019.[8]\n" +
                "Huawei menyediakan produk dan jasanya di lebih dari 170 negara.[9] Pada tahun 2012, perusahaan ini menyalip Ericsson sebagai produsen peralatan telekomunikasi terbesar di dunia,[10] dan menyalip Apple pada tahun 2018 sebagai produsen ponsel cerdas terbesar kedua di dunia, di bawah Samsung Electronics.[11] Pada tahun 2018, Huawei mencatatkan pendapatan sebesar US $108,5 milyar.[12] Pada bulan Juli 2020, Huawei menyalip Samsung dan Apple sebagai merek ponsel cerdas teratas (dalam hal jumlah ponsel yang" +
                " terjual) di dunia untuk pertama kalinya.[13] Hal tersebut terutama disebabkan oleh menurunnya penjualan Samsung pada triwulan kedua tahun 2020, " +
                "akibat pandemi COVID-19."))

        data?.add(DataModel(R.drawable.iphone,"IOS","STEVE JOB", " jajaran telepon pintar yang dirancang dan dipasarkan oleh Apple Inc. iPhone menggunakan sistem operasi telepon genggam iOS Apple yang dikenal dengan nama 'iPhone OS' sampai pertengahan 2010, sesaat setelah peluncuran iPad. iPhone pertama diluncurkan tanggal 29 Juni 2007;[14] iPhone terbaru, yaitu iPhone 7 dan iPhone 7 plus generasi kesepuluh, diluncurkan pada tanggal " +
                "16 September 2016.[15] Antarmuka penggunanya dikembangkan secara menyeluruh di layar multisentuhnya, termasuk sebuah papan ketik virtual. iPhone memiliki konektivitas " +
                "Wi-Fi dan seluler (2G, 3G dan 4G)."))
        data?.add(DataModel(R.drawable.realmi,"REALME"," Sky Li,", "Realme pertama kali muncul di Tiongkok pada tahun 2010 sebagai Oppo Real.[4] Realme awalnya merupakan sub-merek dari OPPO Electronics Corporation, salah satu anak perusahaan BBK Electronics dan mulai menjadi perusahaan independen pada tahun 2018\n" +
                "\n" + "Pada 30 Juli 2018, mantan Wakil Presiden Oppo dan Presiden Oppo divisi bisnis luar negeri Bingzhong Li (Sky Li) mengumumkan pengunduran dirinya dari Oppo dan niatnya untuk mendirikan realme sebagai merek yang independen pada laman Weibo. Ia fokus menciptakan telepon genggam yang menggabungkan antara performa yang " +
                "cepat dan desain yang modis"))

        data?.add(DataModel(R.drawable.samsung,"SAMSUNG","Lee Byung-chul", "Samsung didirikan oleh Lee Byung-chul pada tahun 1938 sebagai sebuah perusahaan perdagangan. Dalam tiga dekade berikutnya, perusahaan ini berekspansi ke sejumlah sektor, seperti pemrosesan makanan, tekstil, asuransi, sekuritas, dan ritel. Samsung kemudian juga berekspansi ke industri elektronik pada akhir dekade 1960-an, serta ke industri konstruksi dan pembuatan kapal pada pertengahan dekade 1970-an, yang mana ketiga sektor ini kemudian menjadi tumpuan pertumbuhan perusahaan ini. Pasca kematian Lee pada tahun 1987, Samsung dipisah menjadi empat grup bisnis, yakni Samsung Group, Shinsegae Group, CJ Group, dan Hansol Group. Sejak tahun 1990, Samsung meningkatkan penjualan produknya di luar Korea Selatan, terutama produk ponsel dan semikonduktornya yang kemudian menjadi sumber pendapatan paling penting. Hingga tahun 2020, Samsung memiliki nilai merek tertinggi kedelapan di dunia.[4]"))

        //Set data to Adapter
        recyclerview.adapter = DataAdapter(data, object : DataAdapter.OnClickListener{
            override fun detail(item: DataModel?) {
                val intent = Intent(this@MainActivity, DetailActivity::class.java)
                intent.putExtra("gambar", item?.poster)
                intent.putExtra("nama", item?.brand)
                intent.putExtra("harga", item?.pendiri)
                intent.putExtra("keterangan", item?.sejarah)
                startActivity(intent)
            }

        })


    }
}