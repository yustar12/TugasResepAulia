package com.example.aulia.recycleview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.LinkedList;

public class MainActivity extends AppCompatActivity {
    private LinkedList<Resep> resep = new LinkedList<Resep>();
    private LinkedList<String> resep_nama = new LinkedList<String>();
    private LinkedList<String> resep_detail = new LinkedList<String>();
    private LinkedList<String> resep_ingredients = new LinkedList<String>();
    private LinkedList<String> resep_process = new LinkedList<String>();
    private RecyclerView mRecyclerView;
    private WordListAdapter mAdapter;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        resep.add(new Resep("Resep Nasi Kebuli Magiccom PraktisResep Nasi Kebuli Magiccom Praktis",
                "Nasi kebuli adalah makanan khas Timur Tengah yang memiliki ciri khas bumbu masakan yang kuat. Umumnya nasi kebuli dimasak dengan cara yang agak ribet, namun bukan berarti tak bisa dibuat dengan magic com",
                "1.\t3 gelas takar beras\n" +
                        "•\t2. 300 gr daging kambing/sapi, potong dadu\n" +
                        "•\t3. 2 sdm minyak samin\n" +
                        "•\t4. 2 sdm minyak goreng\n" +
                        "•\t5. 5 cm kayu manis\n" +
                        "•\t6. 4 butir cengkeh\n" +
                        "•\t7. 2 buah bunga lawang/pekak\n" +
                        "•\t8. 2 buah kapulaga, ambil bijinya\n" +
                        "•\t9. 1/2 sdt merica bubuk\n" +
                        "•\t10.1-2 sdm bumbu kari instan\n" +
                        "•\tgaram secukupnya\n",
                "1. 1.\tPanaskan minyak dan margarin, tumis bumbu halus hingga harum, masukkan kayu manis, cengkeh, bunga pekak, dan kapulaga. Tumis lagi hingga bumbu matang dan sedap.\n" +
                        "2.\tMasukkan daging dan tumis hingga berubah warna. Masukkan bumbu kari dan aduk rata lagi. Tuang air secukupnya hingga daging terendam dan masak hingga daging empuk dan kuah berkurang. \n" +
                        "3.\tTes rasa. Ambil cengkeh, kayu manis, dan kapulaga. Tambahkan garam secukupnya. Usahakan air asin, karena nanti akan ditambah air lagi.\n" +
                        "4.\tSetelah beras dicuci, tuang bumbu ke dalam panci magic com dan pastikan beras dan daging terendam.\n" +
                        "5.\tMasak nasi dengan magic com hingga nasi matang. Sudah jadi.\n\n"));


        resep.add(new Resep("Resep Tumis Pindang Cabai Hijau Gurih Pedas Mantap",
                "Ikan pindang merupakan bahan masakan yang bisa diolah menjadi berbagai masakan lezat, gurih dan menggugah selera",
                "1. 5 ekor pindang (buang isi perut dan durinya)\n" +
                        "•\t2. 5 buah cabai hijau besar (iris serong)\n" +
                        "•\t3. 7 butir petai (utuhkan atau belah dua)\n" +
                        "•\t4. 7 buah cabai rawit (haluskan)\n" +
                        "•\t5. 5 siung bawang merah (haluskan)\n" +
                        "•\t6. 3 siung bawang putih (haluskan)\n" +
                        "•\t7. Beberapa lembar daun kemangi\n" +
                        "•\t8. 2 lembar daun jeruk\n" +
                        "•\t9. Garam (secukupnya)\n" +
                        "•\t10.Kaldu ayam/sapi bubuk secukupnya\n" +
                        "•\t11.Gula (secukupnya)\n" +
                        "•\t12.Minyak goreng (secukupnya)\n",
                "1.1.\tGoreng sebentar ikan pindang hingga setengah matang, angkat kemudian tiriskan dan sisihkan.\n" +
                        "2.\tPanaskan kembali sedikit minyak, tumis bumbu yakni bawang merah, bawang putih, cabai rawit, cabai dan beri daun jeruk. \n" +
                        "3.\tMasukkan petai ke dalam bumbu. \n" +
                        "4.\tTambahkan sedikit garam dan gula.\n" +
                        "5.\tMasukkan ikan pindang yang telah digoreng setengah matang, aduk rata dan masak pakai api kecil. \n" +
                        "6.\tTambahkan daun kemangi dan kaldu ayam/sapi secukupnya, aduk rata.\n" +
                        "7.\tMasak beberapa menit kemudian koreksi rasa. \n" +
                        "8.\tAngkat pindang cabai hijau yang telah matang, sajikan bersama nasi hangat dan lalapan. \n\n" ));


        resep.add(new Resep("Resep Tongkol Suwir Pedas",
                "Suka banget sama ikan tongkol? Maka ladies harus tahu berbagai macam resep masak atau olahan ikan tongkol agar tidak bosan dengan menu tongkol di rumah, salah satunya tongkol suwir pedas berikut ini. ",
                "1. 2 ekor ikan tongkol atau sekitar 400 gr ikan tongkol\n" +
                        "•\t2. 5 siung bawang putih, iris tipis\n" +
                        "•\t3. 10 siung bawang merah, iris tipis\n" +
                        "•\t4. 4 buah cabai rawit, iris tipis\n" +
                        "•\t5. 3 buah cabai merah, haluskan\n" +
                        "•\t6. 1 buah tomat kecil, haluskan\n" +
                        "•\t7. 3 lembar daun jeruk, iris tipis\n" +
                        "•\t8. garam, gula, dan kaldu bubuk secukupnya\n",

                "1.\tGoreng ikan tongkol dan suwir-suwir. Sisihkan.\n" +
                        "2.\tTumis bawang putih, bawang merah hingga harum, masukkan daun jeruk, cabai rawit dan cabai merah yang sudah dihaluskan dengan tomat. Tumis bumbu hingga matang. \n" +
                        "3.\tMasukkan tongkol suwir dan aduk rata dengan bumbu. Beri garam, gula dan penyedap rasa secukupnya.\n\n"));


        setContentView(R.layout.activity_main);
        // Get a handle to the RecyclerView.
        mRecyclerView = findViewById(R.id.recyclerview);
        for(int i = 0; i < resep.size(); i++){
            resep_nama.add(resep.get(i).nama);
            resep_detail.add(resep.get(i).detail);
            resep_ingredients.add(resep.get(i).ingredients);
            resep_process.add(resep.get(i).proses);
        }
        // Create an adapter and supply the data to be displayed.
        mAdapter = new WordListAdapter(this, resep_nama, resep_detail, resep_ingredients, resep_process);
        // Connect the adapter with the RecyclerView.
        mRecyclerView.setAdapter(mAdapter);
        // Give the RecyclerView a default layout manager.
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
