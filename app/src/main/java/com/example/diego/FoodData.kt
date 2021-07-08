package com.example.diego

object FoodData {
    private val foodNames = arrayOf(
        "Gado-Gado",
        "Soto Betawi",
        "Rujak Cingur",
        "Selat Solo",
        "Rujak Aceh",
        "Ikan Mas Pepes",
        "Nasi Gurih",
        "Rawon",
        "Freanch Toast",
        "Mie Ayam"
    )

    private val foodProtein = arrayOf(
        "6,10 g",
        "2,50 g",
        "11,30 g",
        "18.12 g",
        "0.40 g",
        "15.20 g",
        "4.70 g",
        "5.40",
        "8 g",
        "6.20 g"
    )

    private val foodKarbo = arrayOf(
        "21 g",
        "11,50 g",
        "8 g",
        "41.17 g",
        "19.70 g",
        "11.80 g",
        "26 g",
        "4 g",
        "28 g",
        "10.50"
    )

    private val foodFat = arrayOf(
        "3,20 g",
        "8,80 g",
        "8,40 g",
        "12.02",
        "0.30 g",
        "11.30 g",
        "7.50 g",
        "2.50 g",
        "8 g",
        "3.90 g"
    )

    private val foodGizi = arrayOf(
        "35% Besi, 28% Kalsium, 20% Fosfor",
        "21% Kalsium, 14% Lemak Total, 11% Fosfor",
        "24% Kalsium, 21% Fosfor, 20% Besi",
        "",
        "47% Vitamin C, 22% Vitamin B1, 8% Serat Pangan",
        "76% Fosfor, 63% Kalsium, 28% Besi",
        "25% Tembaga, 20% Natrium, 14% Vitamin B3",
        "25% Kalsium, 22% Fosfor, 15% Besi",
        "",
        "85% Vitamin B1, 24% Kalisum, 19% Natrium"
    )

    private val foodDetail = arrayOf(
        "Gado-gado adalah salah satu makanan yang berasal dari Indonesia, berupa sayur-sayuran direbus dan dicampur jadi satu, dengan bumbu kacang atau saus dari kacang tanah dan dihaluskan, disertai irisan telur.",
        "Soto Betawi merupakan salah satu jenis soto khas Nusantara yang paling digemari. Berkuah putih dan cukup kental, soto Betawi ada yang terbuat dari santan kelapa atau susu. Tak ayal, menu ini identik dengan rasa gurih.",
        "Rujak cingur adalah makanan khas Surabaya terbuat dari irisan moncong sapi dengan bumbu kacang dan petis.",
        "Selat Solo adalah makanan unik, kandugan gizinya tinggi dan komplit makanan khas daerah Solo yang mendunia karena sehat dan lezat. Makanan ini terdiri dari daging sapi has dalam, telur ayam, wortel, kentang, selada air, tomat, buncis, mentimun, bawang merah, dan mustard, diberi campuran kuah dan kecap dan berbagai bumbu rempah, bisa dinikmati siapa saja dari anak-anak, remaja hingga lansia.",
        "Rujak aceh merupakan makanan yang menyegarkan dan mudah dibuat.",
        "Selain digoreng, ikan mas juga cocok diolah menjadi pepes. Menu khas Sunda ini memiliki rasa yang sedap penuh dengan bumbu. Selain itu, tekstur dagingnya juga lembut dan bumbu yang meresap. Aroma pepes ikan mas yang kuat berasal dari bumbu-bumbu rempah, diantaranya adalah kemangi, serai, kunyit, jahe, dan lengkuas.",
        "Nasi Guri adalah nasi yang dimasak dengan santan dengan tambahan bumbu dari rempah-rempah sehingga gurih dan beraroma yang berasal dari Aceh, Indonesia.",
        "Rawon adalah masakan Indonesia berupa sup daging berkuah hitam dengan campuran bumbu khas yang menggunakan kluwek. Rawon, meskipun dikenal sebagai masakan khas Jawa Timur, dikenal pula oleh masyarakat Jawa Tengah sebelah timur.",
        "French toast adalah hidangan yang terbuat dari irisan roti yang direndam dalam telur kocok dan biasanya susu, kemudian digoreng.",
        "Mi ayam atau bakmi ayam adalah masakan Indonesia yang terbuat dari mi kuning direbus mendidih kemudian ditaburi saus kecap khusus beserta daging ayam dan sayuran. Mi ayam terkadang ditambahi dengan bakso, pangsit, dan jamur. Mi berasal dari Tiongkok, tetapi mi ayam yang serupa di Indonesia tidak ditemukan di Tiongkok."
    )

    private val foodBahan = arrayOf(
        "1/4 kol iris tipis, rebus\n" +
                "10 helai kacang panjang potong-potong, rebus\n" +
                "1 genggam toge, rebus\n" +
                "1 buah timun potong-potong\n" +
                "1 buah tahu kotak goreng\n" +
                "Tomat\n" +
                "Kentang rebus\n" +
                "Telur rebus\n" +
                "Daun selada\n" +
                "Lontong\n" +
                "Emping melinjo\n" +
                "Bawang goreng untuk taburan",
        "500 gram Daging sapi\n" +
                "100-200 ml santan kental kemasan\n" +
                "200 ml Susu ultra plain\n" +
                "Bumbu halus:\n" +
                "6 siung Bawang merah besar\n" +
                "3 siung Bawang putih besar\n" +
                "1 ruas Jahe\n" +
                "1 butir Kemiri\n" +
                "1 sdt Ketumbar bubuk\n" +
                "1 sdt Lada bubuk\n" +
                "1/2 sdt Jintan bubuk\n" +
                "Bumbu tambahan:\n" +
                "1 batang Serai\n" +
                "3 buah Cengkeh\n" +
                "3 lmbar Daun salam\n" +
                "2 lmbar Daun jeruk\n" +
                "5 cm kayu manis\n" +
                "1-3 sachet Masako sapi\n" +
                "Bumbu penyerta saat masakan dihidangkan:\n" +
                "secukupnya Garam\n" +
                "Tomat\n" +
                "Bawang goreng\n" +
                "Daun bawang\n" +
                "Emping\n" +
                "Cabe rawit\n" +
                "Kecap manis\n" +
                "Jeruk nipis",
        "2 ikat kangkung\n" +
                "1 bungkus kecambah panjang\n" +
                "1 ikat kacang panjang\n" +
                "2 buah mentimun\n" +
                "1 papan tahu\n" +
                "1 papan tempe\n" +
                "250 gr cingur\n" +
                "Bumbu Petis:\n" +
                "1 sdt garam\n" +
                "6 cabe rawit / sesuai selera\n" +
                "3 sdm air asam jawa\n" +
                "4 sdm petis udang\n" +
                "50 gr kacang goreng\n" +
                "50 gr gula merah, iris\n" +
                "2 siung bawang putih\n" +
                "5 iris pisang klutuk muda/ sesuai selera\n" +
                "100 ml Air matang/ secukupnya",
        "4 buah tomat\n" +
                "2 buah bawang bombai cincang\n" +
                "200 mL air\n" +
                "1 sdt lada bubuk\n" +
                "1 sdt pala bubuk\n" +
                "1 sdm kaldu jamur\n" +
                "1 sdt gula merah iris\n" +
                "1/2 sdt garam\n" +
                "5 sdm Kecap manis\n" +
                "Sedikit minyak untuk menumis",
        "1 buah Mangga kweni, kupas lalu potong2\n" +
                "Secukupnya pepaya mengkal, kupas lalu potong2\n" +
                "Secukupnya bengkuang, kupas lalu cuci bersih dan potong2\n" +
                "Secukupnya Nanas, kuoas lalu cuci bersih dan potong2\n" +
                "Secukupnya Jambu air, cuci bersih lalu belah 2\n" +
                "Secukupnya Kedongdong, kupas kulit lalu cuci dan potong2\n" +
                "Secukupnya manisan kolang kaling\n" +
                "1 buah mangga kweni, kyoas lalu potong2\n" +
                "10 buah Cabe merah keriting, rebus sebentar lalu angkat\n" +
                "250 ml air panas\n" +
                "2 sdm gula pasir\n" +
                "1 bulatan gula aren, sisir halus\n" +
                "Secukupnya garam\n" +
                "1 sdm larutan asem jawa (optional)",
        "4 ekor ikan mas kecil\n" +
                "2 ikat kemangi\n" +
                "Segenggam daun singkong rebus (saya pakai daun pepaya Jepang)\n" +
                "3 batang Serai\n" +
                "Beberapa helai daun salam\n" +
                "Secukupnya garam, gula dan kaldu bubuk\n" +
                "Secukupnya daun pisang dan lidi untuk penyemat\n" +
                "15 buah cabe rawit (saya pakai 10 cabe merah)\n" +
                "10 butir bawang merah\n" +
                "4 siung bawang putih\n" +
                "4 butir kemiri\n" +
                "2 ruas kunyit\n" +
                "2 ruas jahe",
        "3 cup beras\n" +
                "5 cup air santan\n" +
                "2 serai, potong dan geprek\n" +
                "4 daun pandan\n" +
                "4 daun salam\n" +
                "1 sdt jinten bubuk (optional)\n" +
                "Garam secukupnya",
        "500 gr daging sapi, potong dadu\n" +
                "250 gr tauge pendek\n" +
                "1 lembar daun salam\n" +
                "2 lembar daun jeruk, buang tulangnya\n" +
                "1 batang serai\n" +
                "1 ruas lengkuas\n" +
                "Secukupnya minyak untuk menumis\n" +
                "Secukupnya garam\n" +
                "Secukupnya gula\n" +
                "Secukupnya kaldu sapi bubuk\n" +
                "1500 ml air\n" +
                "6 buah kluwek, rendam isinya di air hangat\n" +
                "6 siung bawang merah\n" +
                "4 siung bawang putih\n" +
                "2 ruas jahe\n" +
                "2 ruas kunyit\n" +
                "1 ruas kencur\n" +
                "5 butir kemiri\n" +
                "1 sdm ketumbar\n" +
                "1 sdm merica bubuk\n" +
                "6 buah cabe merah keriting",
        "3-4 lembar roti tawar\n" +
                "2 butir telur\n" +
                "20 ml susu cair\n" +
                "Butter\n" +
                "Garam\n" +
                "Bubuk kayu manis (opt)\n" +
                "Gula (opt)\n" +
                "Blueberry/strawberry\n" +
                "Butter\n" +
                "Madu",
        "10 siung besar bawang putih\n" +
                "1/4 liter minyak goreng\n" +
                "soy sauce pearl river bridge\n" +
                "kecap asin ABC\n" +
                "10 siung bawang putih\n" +
                "3 siung bawang merah\n" +
                "1 sachet lada halus\n" +
                "10 sdm saus tomat ABC\n" +
                "1 sdm soy sauce pearl river bridge\n" +
                "10 sdm kecap manis bango sesuai selera\n" +
                "secukupnya penyedap rasa\n" +
                "secukupnya garam halus\n" +
                "1/2 kg dada ayam fillet\n" +
                "secukupnya Tauge\n" +
                "secukupnya Sawi hijau"

    )

    private val foodImage = intArrayOf(
        R.drawable.gado_gado,
        R.drawable.soto_betawi,
        R.drawable.rujak_cingur,
        R.drawable.selat_solo,
        R.drawable.rujak_aceh,
        R.drawable.ikanmas_pepes,
        R.drawable.nasi_gurih,
        R.drawable.rawon,
        R.drawable.french_toast,
        R.drawable.mie_ayam
    )

    val listData: ArrayList<Foods>
        get() {
            val list = arrayListOf<Foods>()
            for (position in foodNames.indices){
                val food = Foods()
                food.nama = foodNames[position]
                food.protein = foodProtein[position]
                food.fat = foodFat[position]
                food.karbo = foodKarbo[position]
                food.gizi = foodGizi[position]
                food.detail = foodDetail[position]
                food.bahan = foodBahan[position]
                food.image = foodImage[position]
                list.add(food)
            }
            return list
        }
}