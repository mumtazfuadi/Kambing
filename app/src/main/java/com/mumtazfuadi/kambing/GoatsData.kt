package com.mumtazfuadi.kambing

object GoatsData {

    val listData: ArrayList<Goat>
        get() {
            val list = arrayListOf<Goat>()
            for (position in goatNames.indices) {
                val goat = Goat()
                goat.photo = goatImages[position]
                goat.name = goatNames[position]
                goat.detail = goatDetails[position]
                list.add(goat)
            }
            return list
        }

    private val goatImages = intArrayOf(
        R.drawable.boer,
        R.drawable.saanen,
        R.drawable.etawa,
        R.drawable.angora,
        R.drawable.anglo_nubian,
        R.drawable.pygmy,
        R.drawable.beetal,
        R.drawable.valais_blackneck,
        R.drawable.pashmina,
        R.drawable.alpen
    )

    private val goatNames = arrayOf(
        "Kambing Boer",
        "Kambing Saanen",
        "Kambing Etawa",
        "Kambing Angora",
        "Kambing Anglo Nubian",
        "Kambing Pygmy",
        "Kambing Beetal",
        "Kambing Valais Blackneck",
        "Kambing Pashmina",
        "Kambing Alpen"
    )

    private val goatDetails = arrayOf(
        "Kambing boer dapat dikenali dengan mudah dari tubuhnya yang lebar, panjang, dalam, berbulu putih, berkaki pendek, berhidung cembung, bertelinga panjang menggantung, berkepala warna coklat kemerahan atau coklat muda hingga coklat tua. Beberapa kambing boer memiliki garis putih ke bawah di wajahnya. Kulitnya berwarna coklat yang melindungi dirinya dari kanker kulit akibat sengatan sinar matahari langsung. Kambing ini sangat suka berjemur di siang hari.\n" +
                "\n" +
                "Kambing boer dapat hidup pada suhu lingkungan yang ekstrem, mulai dari suhu sangat dingin (-25 derajat celcius) hingga sangat panas (43 derajat celcius) dan mudah beradaptasi terhadap perubahan suhu lingkungan. Tahan terhadap penyakit. Mereka dapat hidup di kawasan semak belukar, lereng gunung yang berbatu atau di padang rumput. Secara alamiah mereka adalah hewan yang suka meramban sehingga lebih menyukai daun-daunan, tanaman semak daripada rumput.\n" +
                "\n" +
                "Boer jantan bertubuh kokoh dan kuat sekali. Pundaknya luas dan ke belakang dipenuhi dengan pantat yang berotot. Boer jantan dapat kawin di bulan apa saja sepanjang tahun. Mereka berbau tajam karena hal ini untuk memikat betina. Seekor pejantan dapat aktif kawin pada umur 7-8 bulan, tetapi disarankan agar satu pejantan tidak melayani lebih dari 8 – 10 betina sampai pejantan itu berumur sekitar satu tahun. Boer jantan dewasa (2 – 3 tahun) dapat melayani 30 – 40 betina. Disarankan agar semua pejantan dipisahkan dari betina pada umur 3 bulan agar tidak terjadi perkawinan yang tidak direncanakan. Seekor pejantan dapat mengawini hingga selama 7 – 8 tahun.\n" +
                "\n" +
                "Boer betina tumbuh seperti jantan, tetapi tampak sangat feminin dengan kepala dan leher ramping. Ia sangat jinak dan pada dasarnya tidak banyak berulah. Ia dapat dikawinkan pada umur 10 – 12 bulan, tergantung besar tubuhnya. Kebuntingan untuk kambing adalah 5 bulan. Ia mampu melahirkan anak-anak tiga kali dalam dua tahun. Betina umur satu tahunan dapat menghasilkan 1 – 2 anak. Setelah beranak pertama, ia biasanya akan beranak kembar dua, tiga, bahkan empat Boer induk menghasilkan susu dengan kandungan lemak sangat tinggi yang cukup untuk disusu anak-anaknya. Ketika anaknya berumur 2½ – 3½ bulan induk mulai kering. Boer betina mempunyai dua hingga empat puting, tetapi kadang kala tidak semuanya menghasilkan susu. Sebagai ternak yang kawinnya tidak musiman, ia dapat dikawinkan lagi tiga bulan setelah melahirkan. Birahinya dapat dideteksi dari ekor yang bergerak-gerak cepat disebut “flagging”. Boer betina mampu menjadi induk hingga selama 5 – 8 tahun.",
        "Kambing saanen adalah kambing yang berasal dari lembah Saanen, Swiss bagian barat. Merupakan salah satu jenis kambing terbesar di Swiss dan penghasil susu kambing yang terkenal.\n" +
                "\n" +
                "Kambing ini sulit berkembang di wilayah tropis karena kepekaannya terhadap matahari. Oleh karena itu di Indonesia jenis kambing ini disilangkan lagi dengan jenis kambing lain yang lebih resisten terhadap cuaca tropis dan tetap diberi nama kambing saanen, antara lain dengan kambing peranakan etawa.",
        "Kambing etawa adalah kambing didatangkan dari India yang juga disebut kambing Jamnapari. Tinggi kambing jantan berkisar antara 90 sentimeter hingga 127 sentimeter dan yang betina hanya mencapai 92 sentimeter. Bobot yang jantan bisa mencapai 91 kilogram, sedangkan betina hanya mencapai 63 kilogram. Telinganya panjang dan terkulai ke bawah. Dahi dan hidungnya cembung. Baik jantan maupun betina bertanduk pendek. Kambing jenis ini mampu menghasilkan susu hingga tiga liter per hari. Keturunan silangan (hibrida) kambing etawa dengan kambing lokal dikenal sebagai kambing “Peranakan etawa” atau “PE”. Kambing PE berukuran hampir sama dengan etawa namun lebih adaptif terhadap lingkungan lokal Indonesia.",
        "Kambing jenis ini berasal dari distrik angora di sekitaran Asia, kambing jenis ini sudah dikenal sejak zaman nabi musa sebelum sejarah alkitab yaitu sekitar 1571–1451 Sebelum masehi. Perdagangan bulu kambing ini pun sudah dimulai sejak awal abad ke 19 dan menjadi komoditas yg berharga pada saat itu.\n" +
                "\n" +
                "Pada 1765 diimpor oleh Pemerintah Spanyol dan 20 tahun setelah itu banyak yang mulai membawanya ke Perancis. Namun, tak satupun yang berhasil dalam mengembang kan usaha impor kambing jenis ini. Yang pertama berhasil dalam mengembangkan usaha impor adalah Afrika Selatan pada 1838, dan menjadi pengimpor bulu kambing terbesar dibawah Amerika Serikat dan Turki.\n" +
                "\n" +
                "Ada variasi dalam ukuran kambing, tapi ukuran matang biasanya akan jatuh dalam berbagai berat 180–225 pon, tapi tidak mencapai berat maksimum mereka sampai setelah lima tahun. Apakah akan jatuh dalam berbagai berat 70–110 pon ketika dewasa.\n" +
                "\n" +
                "Karakteristik yang paling berharga dari Angora dibandingkan dengan kambing lainnya adalah nilai mohair/bulu yang digunting. Di Amerika Serikat, rata-rata berat bulu yang digunting dari tiap ekornya adalah sekitar 5,3 pon yang dapat menghasilkan serat dengan panjang pokok antara 12–15 cm. Mohair ini sangat mirip dengan wol dalam komposisi kimia tetapi berbeda dari wol yang memiliki permukaan yang lebih halus dan sangat tipis. Akibatnya, mohair tidak memiliki sifat felting wol. Mohair sangat mirip dengan wol kasar dalam ukuran serat. Ini adalah serat kuat yang elastis, memiliki kilau yang cukup, dan mengambil pewarna sangat baik. Mohair telah dianggap sangat berharga sebagai bahan untuk pembuatan plushes dan bahan meliputi lain di mana kekuatan, keindahan, dan daya tahan yang diinginkan.",
        "Anglo-nubia dikembangkan di Inggris oleh British persilangan kambing dengan kambing dari asal Afrika dan India.\n" +
                "\n" +
                "Anglo Nubian merupakan kambing serba guna, berguna untuk daging, susu . Jenis Ini bukan produsen susu yang baik namun memiliki rata-rata yang tinggi kandungan lemak mentega (antara empat dan lima persen. Kambing Anglo Nubian musim kawin nya lebih lama daripada kambing keturunan Swiss sehingga memungkinkan untuk menghasilkan susu sepanjang tahun.\n" +
                "\n" +
                "Seperti ada yang paling cocok dari susu kambing bibit untuk kondisi cuaca panas, jenis kambing Nubia Anglo telah digunakan dalam program grading-up di banyak negara-negara tropis untuk meningkatkan produksi susu dan daging keturunan lokal.\n" +
                "\n" +
                "Kambing jenis Anglo-Nubian adalah kambing jenis penghasil susu yan membanggakan Janis kambing ini  dinamai Nubia, karena pada awalnya ditemukan di timur laut Afrika. Kambing yang awalnya diimpor dari Afrika, Arab dan India berkaki panjang, kambing yang memiliki beberapa karakteristik yang diinginkan oleh peternak kambing di Inggris. English breeders crossed these imported bucks on the common short-haired does of England prior to 1895 to develop the Anglo-Nubian goat. Peternak Inggris yang mengimpor jenis ini sebelum tahun 1895 untuk mengembangkan Anglo-Nubian kambing. Yang berkembang biak Di Amerika Serikat biasanya disebut sebagai Nubia.",
        "Kambing Pygmy merupakan kambing yang berasal dari Lembah Kamerun, Afrika Barat. Kambing ini dimpot masuk ke benua Amerika dan Eropa oleh penternak haiwan di Eropah pada tahun 1950an.\n" +
                "Kambing ini banyak dipelihara sebagai haiwan kesayangan kerana terkenal akan sifatnya yang ramah, tenang, dan lucu.\n" +
                "\n" +
                "Tidak ramai orang yang memeliharanya untuk daging atau susunya walaupun daging dan susunya boleh dimakan/minum oleh manusia.\n" +
                "\n" +
                "Ciri-Ciri Umum Kambing Pygmy adalah:\n" +
                "Warna dominannya adalah terdiri dari beragam warna yang saling bercampur warna coklat caramel putih, coklat caramel sedang, coklat caramel gelap, kelabu tua (kehitaman), sedang & muda. Tubuhnya ditutupi oleh rambut lurus yang panjangnya bervariasi.\n" +
                "\n" + "Memiliki tanduk baik jantan dan betina. Kambing ini kecil dan comel dengan berat purata kambing pygmy jantan mencapai 39 kg dan berat purata kambing betina dewasa mencapai 34 kg.\n" +
                "\n" + "Kambing Pygmy lebih kuat dan tahan terhadap cuaca jika dibandingkan kambing jenis lain yang ukurannya lebih besar, mereka dapat berkembang biak secara normal hampir sepanjang tahun.",
        "Kambing hitam atau kambing beetal ini berasal dari Punjab, Pakistan, dan India. Kambing jenis ini memang kebanyakan memiliki warna hitam atau agak kemerahan dengan telinganya yang berjumbai. Sedangkan pada bagian tandung kambing beetal hantan memutar ke arah belakang. Kambing betal memiliki ciri fisik yang sangat mirip dengan kambing etawa, hanya saja warnanya di dominasi oleh warna hitam.\n" +
                "\n" +
                "Jenis kambing betal atau kambing hitam ini konon lebih unggul daripada kambing etawa sebab memiliki produktifitas yang lebih tinggi dan memiliki kemampuan adaptasi yang lebih baik dengan kondisi agro-ekologi. Adapun jenis kambing ini kebanyakan memiliki bulu yang berwarna hitam, coklat, atau terdapat bercak-bercak putih. Kambing betal juga memiliki wajah yang cembung namun tidak lonjong seperti kambing etawa.\n" +
                "\n" +
                "Adapun bagian telinganya panjang, terkulai, dan datar. Kambing beetal jantan maupun betina sama-sama memiliki tanduk dengan ekornya yang kecil dan tipis. Kambing beetal memiliki kantong susu yang besar yang membuatnya dapat berkembang biak dengan baik. Sedangkan bagian dotnya berbentuk kerucut besar. Nah kambing beetal juga sering disebut sebagai kambing perah karena mampu menghasilkan susu dengan kapasitas yang banyak dan kualitasnya yang baik.",
        "Kambing Valais Blackneck adalah jenis kambing domestik yang sangat indah. Ini adalah breed kambing multi guna, dan terutama ditujukan untuk pengelolaan daging, susu dan vegetasi. Jenisnya sebenarnya berasal dari kanton Valais, di Swiss selatan, dan daerah sekitarnya di utara Italia. Jumlah terbesar kambing Valais Blackneck tersedia di wilayah Visp (Viège). Dan juga hadir dalam jumlah kecil di Austria dan Jerman. Kambing Valais Blackneck dibesarkan di provinsi Verbania dan Vercelli di Italia. Dan ini adalah salah satu dari empat puluh tiga breed kambing asli buatan Italia yang distribusinya terbatas, yang oleh seorang herdbook disimpan oleh Associazione Nazionale della Pastorizia, asosiasi peternak domba dan kambing di Italia.\n" +
                "\n" +
                "Jumlah total kambing Valais Blackneck adalah 3000-3400 pada akhir tahun 2013 di Swiss dan 191 atau 446 di Italia. Jerman melaporkan 429 kambing dan Austria 100-300 pada tahun 2012. Sekarang berkembang biak digunakan untuk produksi daging dan susu. Kambing Valais Blackneck juga dikenal dengan banyak nama lain seperti Prancis: Chèvre des Glaciers, Col Noir du Valais atau Race de Viège; Jerman: Gletschergeiss atau Walliser Schwarzhalsziege; dan Italia: Vallesana atau Vallese. ",
        "Changthangi atau Ladakh Pashmina adalah jenis kambing kasmir asli dari dataran tinggi Ladakh, di Jammu dan Kashmir, India. Suhu dingin di wilayah tersebut merupakan faktor utama dalam pertumbuhan pashmina grade wol kasmir yang bagus untuk dipelihara. Itu juga digunakan sebagai hewan paket dan untuk daging.\n" +
                "\n" +
                "Jenis kambing kasmir ini menumbuhkan lapisan bawah yang tebal dan hangat yang merupakan sumber wol Kashmir pashmina - kasmir terbaik dunia dengan ketebalan serat antara 12-15 mikron. Kambing ini umumnya dijinakkan dan dipelihara oleh komunitas nomaden yang disebut Changpa di wilayah Changthang, Ladakh Besar. Komunitas Changpa adalah sub-bagian dari komunitas Drokpa Buddhis yang lebih besar di negara bagian Jammu & Kashmir di India utara.\n" +
                "\n" +
                "Mereka bertahan hidup di atas rumput di Ladakh, di mana suhu turun hingga -20 ° C (-4,00 ° F). Kambing ini menyediakan wol untuk syal pashmina Kashmir yang terkenal. Selendang yang terbuat dari wol Pashmina dianggap sangat baik, dan diekspor ke seluruh dunia.",
        "Ibex Alpen (Capra ibex) adalah spesies kambing liar yang hidup di Pegunungan Alpen di Eropa. Ibex Alpen jantan mempunyai ukuran tubuh dan tanduk yang lebih besar daripada betina. Ibex Alpen hidup di perbukitan-perbukitan tinggi dengan berkelompok.\n" +
                "\n" +
                "Ibex Alpen jantan mempunyai tinggi 90–101 sentimeter (35–40 in) dan berat 67–117 kilogram (148–258 pon). Sementara betina lebih kecil dengan tinggi 73–84 sentimeter (29–33 in) dan berat 69–98 kilogram (152–216 pon)."
    )
}