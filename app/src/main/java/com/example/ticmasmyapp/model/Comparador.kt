package com.example.ticmasmyapp.model

import android.widget.TextView

//class Comparador : AppCompatActivity() {
/*
    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: ActivityComparadorBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        WindowCompat.setDecorFitsSystemWindows(window, false)
        super.onCreate(savedInstanceState)

        binding = ActivityComparadorBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.toolbar)

        val navController = findNavController(R.id.nav_host_fragment_content_comparador)
        appBarConfiguration = AppBarConfiguration(navController.graph)
        setupActionBarWithNavController(navController, appBarConfiguration)

        binding.fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                .setAnchorView(R.id.fab)
                .setAction("Action", null).show()
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        val navController = findNavController(R.id.nav_host_fragment_content_comparador)
        return navController.navigateUp(appBarConfiguration)
                || super.onSupportNavigateUp()
    }*/
//}

//data class Comparador(val editText: String)

data class Comparador(val text1: String, val text2: String)