package com.example.time

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.FileUtils
import android.webkit.WebViewClient

import com.example.time.utils.FileUtils.getPdfUrl
import kotlinx.android.synthetic.main.activity_view.*

class WebViewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web_view)
        webView.webViewClient = WebViewClient()
        webView.settings.setSupportZoom(true)
        webView.settings.javaScriptEnabled = false
        val url = getPdfUrl()


        webView.loadUrl("https://docs.google.com/gview?embedded=true&url=$url")
    }
    private fun getPdfUrl(): String {
        return "https://mindorks.s3.ap-south-1.amazonaws.com/courses/MindOrks_Android_Online_Professional_Course-Syllabus.pdf"
    }
}