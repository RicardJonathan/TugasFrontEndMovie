package com.example.movieapp.data

import com.example.movieapp.R
import com.example.movieapp.model.About
import com.example.movieapp.model.Movie
import com.example.movieapp.model.Populer
import com.example.movieapp.model.Series

object DummyData {
    val listMovies = listOf(
        Movie(
            id = 1,
            name = "The Marvel",
            description = "THE MARVELS menceritakan tentang Carol Danvers atau Captain Marvel yang sedang melakukan misi untuk menyelidiki lubang cacing yang berkaitan dengan ras alien Kree. Dalam perjalanan tersebut, baru diketahui ternyata kekuatan yang dimiliki oleh Captain Marvel terhubung dengan kekuatan yang dimiliki oleh Ms. Marvel dan Monica Rambeau. Hal tersebut membuat mereka terus menerus bertukar tempat sehingga membuat mereka sepakat untuk bertemu dan bersatu untuk mengetahui alasan mengapa kekuatan mereka terhubung. ",
            genre = "Action,Science Fiction,Fantasy ",
            photo = R.drawable.themarvel
        ),
        Movie(
            id = 2,
            name = "Batman",
            description = "The Dark Knight Rises adalah sebuah film pahlawan super Amerika Serikat tahun 2012 yang disutradarai oleh Christopher Nolan yang juga ikut menulis skenario bersama Jonathan Nolan dan cerita bersama David S. Goyer. Berdasarkan karakter Batman, film ini merupakan yang ketiga dan terakhir dalam trilogi film Batman besutan Nolan, dan merupakan sekuel dari Batman Begins (2005) dan The Dark Knight (2008). Christian Bale, Michael Caine, Gary Oldman, dan Morgan Freeman kembali memerankan tokoh yang mereka bawakan dalam dua film sebelumnya. Film ini memperkenalkan dua tokoh baru; Selina Kyle (Anne Hathaway) ",
            genre = "Action",
            photo = R.drawable.batman
        ),
        Movie(
            id = 3,
            name = "Pirates Of Caribbean",
            description = "Pirates of the Caribbean: The Curse of the Black Pearl mengisahkan tentang petualangan seorang bajak laut bernama Jack Sparrow, yang harus jatuh bangun untuk bertahan hidup dengan segala masalah yang menghampirinya. Kisah berawal dari seorang gubernur bernama Weatherby Swann dan putrinya yang berusia 12 tahun, Elizabeth, berlayar menuju Port Royal, Jamaica. Kapal mereka kemudian bertabrakan dengan reruntuhan kapal, di mana Will Turner muda, terlihat masih hidup dan diselamatkan. Elizabeth kemudian menemukan dan langsung menyembunyikan sebuah medali emas yang dikenakan oleh Will, karena takut Will akan dituduh sebagai seorang bajak laut.",
            genre = "Action",
            photo = R.drawable.piratesofthecaribbea
        ),
        Movie(
            id = 4,
            name = "Civil War",
            description = "Film bergenre aksi ini bercerita tentang perang dengan sudut pandang perjalanan tim jurnalis ketika bertugas. Jalan cerita berfokus pada misi tiga jurnalis yang terdiri dari Lee Smith (Kirsten Dunst), Joel (Wagner Moura), dan Sammy (Stephen Mckinley) yang berpacu dengan waktu untuk menuju ibukota Washington DC untuk melakukan wawancara dengan Presiden Amerika yang semakin terpojok dalam situasi perang saudara di seluruh negara bagian. Tetapi, perjalanan mereka ternyata diikuti oleh Jessie Cullen (Cailee Spaeny), seorang fotografer amatir yang memiliki ambisi menjadi jurnalis.Konflik yang hadir tidak hanya sekedar mengabadikan momen dalam jepretan kamera, tapi juga pertaruhan nyawa dan menghadapi fakta-fakta memilukan yang tak pernah usai akibat perang. Serta kehadiran Jessie yang cukup digambarkan menyebalkan dan menganggu tugas-tugas para jurnalis.",
            genre = "Action,War",
            photo = R.drawable.civilwar
        ),
        Movie(
            id = 5,
            name = "Avengers Infinity War",
            description = "Ketika Avengers dan sekutunya terus melindungi dunia dari ancaman yang terlalu besar untuk ditangani oleh pahlawan mana pun, bahaya baru muncul dari bayang-bayang kosmik: Thanos. Seorang lalim dari keburukan antargalaksi, tujuannya adalah untuk mengumpulkan keenam Batu Keabadian, artefak dengan kekuatan yang tak terbayangkan, dan menggunakannya untuk memaksakan kehendaknya yang menyimpang pada semua kenyataan. Segala sesuatu yang telah diperjuangkan para Avengers telah mengarah pada momen ini, nasib bumi dan keberadaannya semakin tidak menentu.",
            genre = "Science fiction, action, adventure",
            photo = R.drawable.avenger
        ),
        Movie(
            id = 6,
            name = "Star Wars",
            description = "Kisah dimulai dengan \"Episode I: The Phantom Menace,\" di mana Anakin Skywalker, seorang anak muda dengan bakat Jedi yang besar, memulai perjalanannya menuju takdir sebagai Darth Vader yang terkenal. Seri ini menggambarkan kisah cinta, pengkhianatan, dan pertempuran antara Kekaisaran dan Pemberontak, dengan adegan luar angkasa yang spektakuler dan duel lightsaber yang legendaris.\n" +
                    "\n" +
                    "\"Episode IV: A New Hope\" membawa kita ke dunia yang dikuasai Kekaisaran, di mana sekelompok pemberontak yang dipimpin oleh Princess Leia, Luke Skywalker, dan Han Solo memulai misi berbahaya untuk menghancurkan Death Star, senjata super Kekaisaran yang mematikan.\n" +
                    "\n" +
                    "Pada \"Episode V: The Empire Strikes Back,\" Kekaisaran membalas dendam dengan serangan yang mematikan, memaksa pemberontak untuk melarikan diri dan menghadapi kekalahan yang pahit. Di tengah-tengah keputusasaan, rahasia keluarga Skywalker terungkap, mengubah dinamika kekuasaan di antara Jedi dan Sith.\n" +
                    "\n" +
                    "\"Episode VI: Return of the Jedi\" melihat puncak konflik antara Luke Skywalker dan Darth Vader, dengan kejutan yang mengejutkan dan akhir yang penuh harapan untuk galaksi yang terbebaskan dari cengkeraman Kekaisaran.\n" +
                    "\n" +
                    "Trilogi prekuel, \"Episode I-III,\" menjelaskan asal-usul Darth Vader dan transisi Anakin Skywalker dari seorang anak muda yang berbakat menjadi Sith yang paling ditakuti dalam sejarah.\n" +
                    "\n" +
                    "Seri \"Star Wars\" terus berkembang dengan trilogi baru dan spin-off yang mengeksplorasi cerita-cerita baru dalam galaksi yang luas dan menarik, tetapi inti dari saga ini tetap tentang perjuangan antara kebaikan dan kejahatan, pertempuran antara kekuatan gelap dan terang, dan perjalanan pahlawan yang mencari arti sejati dari keberanian dan keadilan.",
            genre = "Science Fiction,Action-Adventure",
            photo = R.drawable.starwars
        ),
        Movie(
            id = 7,
            name = "TOMORROWLAND",
            description = "Tomorrowland\" adalah sebuah film petualangan fiksi ilmiah yang dirilis pada tahun 2015. Film ini disutradarai oleh Brad Bird dan diproduksi oleh Walt Disney Pictures. Berikut adalah deskripsi singkat tentang \"Tomorrowland\":\n" +
                    "\n" +
                    "\"Tomorrowland\" mengikuti perjalanan seorang gadis muda bernama Casey Newton, yang diperankan oleh Britt Robertson. Dia adalah seorang pemimpi dan optimis yang tertarik pada ilmu pengetahuan dan teknologi. Suatu hari, Casey menemukan sebuah pin misterius yang memberinya akses ke dunia paralel yang indah dan futuristik yang dikenal sebagai Tomorrowland.\n" +
                    "\n" +
                    "Tomorrowland adalah tempat di mana penemuan-penemuan canggih terjadi, ide-ide inovatif berkembang, dan potensi manusia sepenuhnya diwujudkan. Namun, Casey juga menyadari bahwa dunia nyata sedang menghadapi krisis besar, termasuk masalah lingkungan, kekacauan sosial",
            genre = "Science Fiction,Mystery",
            photo = R.drawable.tommorow
        ),
        Movie(
            id = 8,
            name = "Planet of the Apes",
            description = "Seri film Planet of the Apes menggambarkan dunia yang mengalami pasca-apokaliptik di mana kera-kera telah mengalami evolusi kecerdasan. Dimulai dari film asli tahun 1968 yang mengikuti petualangan astronot George Taylor, hingga trilogi terbaru yang dimulai dengan \"Rise of the Planet of the Apes\" pada tahun 2011, kisah ini menggabungkan elemen-elemen fiksi ilmiah, aksi, dan drama. Pusat cerita sering kali berfokus pada konflik antara manusia yang selamat dengan masyarakat kera yang berkembang, menyentuh tema-tema seperti rasisme, kepemimpinan, keadilan, dan akhirnya perdamaian di antara kedua spesies. Dengan visualisasi yang memukau dan narasi yang mendalam, seri \"Planet of the Apes\" menawarkan pengalaman sinematik yang memikat dan reflektif tentang masa depan dan evolusi manusia serta kera.",
            genre = "Post-Apocalyptic,Science Fiction",
            photo = R.drawable.planet_apes
        ),
        Movie(
            id = 9,
            name = "Agak Laen",
            description = "Film Agak Laen yg bergenre komedi yg diproduksi oleh imajinasi siap mengocok perut pencinta film komedi. Film yg dibintangi oleh para komika kenamaan seperti  Boris Bokir, Indra Jegel, Oki Rengga, Bene Dion, Arie Kriting dan sejumlah artis lainnya. Film itu berdurasi 119 menit.\n" +
                    "Film agak laen ini bercerita tentang empat orng sahabat yang mengelola rumah hantu di pasar malam,sayangnya wahana tersebut sepi pengunjung. Empat sekawan mencari cara baru menakuti para pengunjung agar selamat dari kebangkrutan.Sial mereka berempat malah memakan korban jiwa salah satu pengunjungnya karena panik korban tersebut mereka kubur dalam  rumah hantu.\n" +
                    "\n" +
                    "Diluar dugaan, arwah si korban malah gentayangan,membuat rumah  hantu jadi  seram dan rame pengunjung.ketika polisi mulai menyelidiki, mereka pun terpaksa melakukan berbagai persengkongkolan konyol untuk menutupi kejadian sebenarnya.",
            genre = "Comedy,Horor",
            photo = R.drawable.agak_laen
        ),
        Movie(
            id = 10,
            name = "Pixels",
            description = "Film komedi sci-fi 3D barat berjudul “Pixels” ini merupakan film yang bercerita tentang alien yang salah melakukan tafsir video game Arcade klasik sebagai deklarasi perang terhadap bumi. Para alien pun melakukan penyerangan terhadap bumi dengan menggunakan video game. Presiden Will Cooper ( Kevin James ) meminta bantuan dari sang sahabat kecilnya bernama Sam Brenner ( Adam Sandler ). Sam adalah juara video game pada tahun 1980. Sam pun harus memimpin sebuah tim video game klasik untuk melawan dan mengalahkan para alien dan menyelamatkan bumi.",
            genre = "Comedy,Fantasy",
            photo = R.drawable.pixel
        ),
    )
    val tvSeries = listOf(
        Series(
            id = 1,
            name = "Last Of Us",
            eps = "14 episodes",
            genre = "Action",
            photo = R.drawable.lastofus
        ),
        Series(
            id = 2,
            name = "Stranger Things",
            eps = "8 episodes",
            genre = "Science Fiction, Horror",
            photo = R.drawable.stranger_things_poster
        ),
        Series(
            id = 3,
            name = "The Walking Dead",
            eps = "16 episodes",
            genre = "Seri, Fiksi, Horor",
            photo = R.drawable.thewalkingdeadn
        ),
        Series(
            id = 4,
            name = "Stranger Things",
            eps = "8 episodes",
            genre = "Science Fiction, Horror",
            photo = R.drawable.stranger_things_poster
        ),
        Series(
            id = 5,
            name = "Game Of Throne",
            eps = "10 episodes",
            genre = "Action,Fantasy,Adventure",
            photo = R.drawable.gameofthrone
        ),
        Series(
            id = 6,
            name = "Fallout",
            eps = "8 episodes",
            genre = "Science Fiction, Horror",
            photo = R.drawable.fallout
        ),
        Series(
            id = 7,
            name = "House of the dragon",
            eps = "10 episodes",
            genre = "Science Fiction,Adventure",
            photo = R.drawable.houseofthedragon
        ),
        Series(
            id = 8,
            name = "Loki",
            eps = "12 episodes",
            genre = "Science Fiction, Action",
            photo = R.drawable.loki
        ),
        Series(
            id = 9,
            name = "The Walking Dead",
            eps = "177 episodes",
            genre = "Science Fiction,Zombie Apocalypse",
            photo = R.drawable.thewalkingdeadn
        ),
        Series(
            id = 10,
            name = "The Witcher",
            eps = "24 episodes",
            genre = "Action,Horror,Adventure",
            photo = R.drawable.the_witcher
        ),
    )
    val listPopuler = listOf(
        Populer(
            id = 1,
            name = "Jumanji",
            photo = R.drawable.jumanji
        ),
        Populer(
            id = 2,
            name = "Jurassic Park",
            photo = R.drawable.jurassicpark
        ),
        Populer(
            id = 3,
            name = "One Piece",
            photo = R.drawable.onepiece
        ),
        Populer(
            id = 4,
            name = "TransFormer",
            photo = R.drawable.transformer
        ),
        Populer(
            id = 5,
            name = "Fast And Farius",
            photo = R.drawable.fastand
        ),
        Populer(
            id = 6,
            name = "Fallout",
            photo = R.drawable.fallout
        ),
        Populer(
            id = 7,
            name = "Agak Laen",
            photo = R.drawable.agak_laen
        ),
        Populer(
            id = 8,
            name = "Avanger",
            photo = R.drawable.avenger
        ),
        Populer(
            id = 9,
            name = "Star Wars",
            photo = R.drawable.starwars
        ),
        Populer(
            id = 10,
            name = "TOMORROWLAND",
            photo = R.drawable.tommorow
        ),

        )
    val profilAbout = listOf(
        About(
            id = 1,
            name = "Ricard Jonathan",
            email = "ricardjonathan36@gmail.com",
            univ = "Universitas Palangkaraya",
            jurusan = "Teknik Informatika",
            photo = R.drawable.fotoprofile
        )
    )
}