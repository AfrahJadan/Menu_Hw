    package com.example.menu_hw

    import android.content.Intent
    import androidx.appcompat.app.AppCompatActivity
    import android.os.Bundle
    import android.util.Log
    import android.view.Menu
    import android.view.MenuItem
    import androidx.recyclerview.widget.GridLayoutManager
    import androidx.recyclerview.widget.LinearLayoutManager

    class MainActivity : AppCompatActivity() {
        private var islogin = true
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main)

        }
        override fun onCreateOptionsMenu(menu: Menu?): Boolean {
            menuInflater.inflate(R.menu.menu, menu)
            return true
        }

        override fun onOptionsItemSelected(item: MenuItem): Boolean {
            when(item.itemId){
                R.id.Contact_us->{
                    return true
                }
                R.id.Log->{
                    return true
                }
                R.id.sign_out->{
                    return true
                }
    R.id.Set -> {
        val intent = Intent(this, Setting::class.java)
        startActivity(intent)
    }
                else ->
                super.onOptionsItemSelected(item) }
    return true }


        override fun onPrepareOptionsMenu(menu: Menu?): Boolean {
           val login =menu?.findItem(R.id.Log)
            val signout = menu?.findItem(R.id.sign_out)
    if(islogin) {
        islogin =!islogin
        login?.setVisible(true)
        signout?.setVisible(false)
    } else {
        islogin =!islogin
        login?.setVisible(false)
        signout?.setVisible(true)
    }
            return true
    }

    }


