package com.yawl.android.template.activity

import com.android.tools.idea.wizard.template.escapeKotlinIdentifier

fun mainActivity(
    packageName: String
): String {
    return """
        package ${escapeKotlinIdentifier((packageName))}

        import android.os.Bundle
        import androidx.activity.ComponentActivity
        import androidx.activity.compose.setContent
        import androidx.activity.enableEdgeToEdge

        class MainActivity : ComponentActivity() {
            override fun onCreate(savedInstanceState: Bundle?) {
                super.onCreate(savedInstanceState)
                enableEdgeToEdge()
                setContent {
                    
                }
            }
        }
    """.trimIndent()
}