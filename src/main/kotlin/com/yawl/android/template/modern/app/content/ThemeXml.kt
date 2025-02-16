package com.yawl.android.template.modern.app.content

fun themeXml(themeName: String): String {
    return """
    <?xml version="1.0" encoding="utf-8"?>
    <resources>
        <style name="$themeName" parent="android:Theme.Material.Light.NoActionBar" />
    </resources>
    """
}